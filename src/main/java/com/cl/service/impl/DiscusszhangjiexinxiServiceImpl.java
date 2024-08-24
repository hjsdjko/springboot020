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


import com.cl.dao.DiscusszhangjiexinxiDao;
import com.cl.entity.DiscusszhangjiexinxiEntity;
import com.cl.service.DiscusszhangjiexinxiService;
import com.cl.entity.view.DiscusszhangjiexinxiView;

@Service("discusszhangjiexinxiService")
public class DiscusszhangjiexinxiServiceImpl extends ServiceImpl<DiscusszhangjiexinxiDao, DiscusszhangjiexinxiEntity> implements DiscusszhangjiexinxiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<DiscusszhangjiexinxiEntity> wrapper) {
		Page<DiscusszhangjiexinxiView> page =new Query<DiscusszhangjiexinxiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhangjiexinxiEntity> page = this.selectPage(
                new Query<DiscusszhangjiexinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhangjiexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhangjiexinxiEntity> wrapper) {
		  Page<DiscusszhangjiexinxiView> page =new Query<DiscusszhangjiexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusszhangjiexinxiView> selectListView(Wrapper<DiscusszhangjiexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhangjiexinxiView selectView(Wrapper<DiscusszhangjiexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
