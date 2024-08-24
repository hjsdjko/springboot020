package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ZhangjiexinxiEntity;
import com.cl.entity.view.ZhangjiexinxiView;

import com.cl.service.ZhangjiexinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 章节信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
@RestController
@RequestMapping("/zhangjiexinxi")
public class ZhangjiexinxiController {
    @Autowired
    private ZhangjiexinxiService zhangjiexinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhangjiexinxiEntity zhangjiexinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			zhangjiexinxi.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhangjiexinxiEntity> ew = new EntityWrapper<ZhangjiexinxiEntity>();

		PageUtils page = zhangjiexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhangjiexinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhangjiexinxiEntity zhangjiexinxi, 
		HttpServletRequest request){
        EntityWrapper<ZhangjiexinxiEntity> ew = new EntityWrapper<ZhangjiexinxiEntity>();

		PageUtils page = zhangjiexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhangjiexinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhangjiexinxiEntity zhangjiexinxi){
       	EntityWrapper<ZhangjiexinxiEntity> ew = new EntityWrapper<ZhangjiexinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhangjiexinxi, "zhangjiexinxi")); 
        return R.ok().put("data", zhangjiexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhangjiexinxiEntity zhangjiexinxi){
        EntityWrapper< ZhangjiexinxiEntity> ew = new EntityWrapper< ZhangjiexinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhangjiexinxi, "zhangjiexinxi")); 
		ZhangjiexinxiView zhangjiexinxiView =  zhangjiexinxiService.selectView(ew);
		return R.ok("查询章节信息成功").put("data", zhangjiexinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhangjiexinxiEntity zhangjiexinxi = zhangjiexinxiService.selectById(id);
		zhangjiexinxi = zhangjiexinxiService.selectView(new EntityWrapper<ZhangjiexinxiEntity>().eq("id", id));
        return R.ok().put("data", zhangjiexinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhangjiexinxiEntity zhangjiexinxi = zhangjiexinxiService.selectById(id);
		zhangjiexinxi = zhangjiexinxiService.selectView(new EntityWrapper<ZhangjiexinxiEntity>().eq("id", id));
        return R.ok().put("data", zhangjiexinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhangjiexinxiEntity zhangjiexinxi, HttpServletRequest request){
    	zhangjiexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhangjiexinxi);
        zhangjiexinxiService.insert(zhangjiexinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhangjiexinxiEntity zhangjiexinxi, HttpServletRequest request){
    	zhangjiexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhangjiexinxi);
        zhangjiexinxiService.insert(zhangjiexinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhangjiexinxiEntity zhangjiexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhangjiexinxi);
        zhangjiexinxiService.updateById(zhangjiexinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhangjiexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
