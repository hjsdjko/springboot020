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

import com.cl.entity.JiaoxueshipinEntity;
import com.cl.entity.view.JiaoxueshipinView;

import com.cl.service.JiaoxueshipinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 教学视频
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
@RestController
@RequestMapping("/jiaoxueshipin")
public class JiaoxueshipinController {
    @Autowired
    private JiaoxueshipinService jiaoxueshipinService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoxueshipinEntity jiaoxueshipin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jiaoxueshipin.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoxueshipinEntity> ew = new EntityWrapper<JiaoxueshipinEntity>();

		PageUtils page = jiaoxueshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueshipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoxueshipinEntity jiaoxueshipin, 
		HttpServletRequest request){
        EntityWrapper<JiaoxueshipinEntity> ew = new EntityWrapper<JiaoxueshipinEntity>();

		PageUtils page = jiaoxueshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueshipin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoxueshipinEntity jiaoxueshipin){
       	EntityWrapper<JiaoxueshipinEntity> ew = new EntityWrapper<JiaoxueshipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoxueshipin, "jiaoxueshipin")); 
        return R.ok().put("data", jiaoxueshipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoxueshipinEntity jiaoxueshipin){
        EntityWrapper< JiaoxueshipinEntity> ew = new EntityWrapper< JiaoxueshipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoxueshipin, "jiaoxueshipin")); 
		JiaoxueshipinView jiaoxueshipinView =  jiaoxueshipinService.selectView(ew);
		return R.ok("查询教学视频成功").put("data", jiaoxueshipinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoxueshipinEntity jiaoxueshipin = jiaoxueshipinService.selectById(id);
		jiaoxueshipin = jiaoxueshipinService.selectView(new EntityWrapper<JiaoxueshipinEntity>().eq("id", id));
        return R.ok().put("data", jiaoxueshipin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoxueshipinEntity jiaoxueshipin = jiaoxueshipinService.selectById(id);
		jiaoxueshipin = jiaoxueshipinService.selectView(new EntityWrapper<JiaoxueshipinEntity>().eq("id", id));
        return R.ok().put("data", jiaoxueshipin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoxueshipinEntity jiaoxueshipin, HttpServletRequest request){
    	jiaoxueshipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoxueshipin);
        jiaoxueshipinService.insert(jiaoxueshipin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoxueshipinEntity jiaoxueshipin, HttpServletRequest request){
    	jiaoxueshipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoxueshipin);
        jiaoxueshipinService.insert(jiaoxueshipin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoxueshipinEntity jiaoxueshipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoxueshipin);
        jiaoxueshipinService.updateById(jiaoxueshipin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoxueshipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
