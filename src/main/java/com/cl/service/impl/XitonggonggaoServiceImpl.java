package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.XitonggonggaoDao;
import com.cl.entity.XitonggonggaoEntity;
import com.cl.service.XitonggonggaoService;
import com.cl.entity.view.XitonggonggaoView;

@Service("xitonggonggaoService")
public class XitonggonggaoServiceImpl extends ServiceImpl<XitonggonggaoDao, XitonggonggaoEntity> implements XitonggonggaoService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<XitonggonggaoEntity> wrapper) {
		Page<XitonggonggaoView> page =new Query<XitonggonggaoView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XitonggonggaoEntity> page = this.selectPage(
                new Query<XitonggonggaoEntity>(params).getPage(),
                new EntityWrapper<XitonggonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XitonggonggaoEntity> wrapper) {
		  Page<XitonggonggaoView> page =new Query<XitonggonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XitonggonggaoView> selectListView(Wrapper<XitonggonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XitonggonggaoView selectView(Wrapper<XitonggonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
