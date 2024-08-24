package com.cl.dao;

import com.cl.entity.ZhangjiexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhangjiexinxiView;


/**
 * 章节信息
 * 
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
public interface ZhangjiexinxiDao extends BaseMapper<ZhangjiexinxiEntity> {
	
	List<ZhangjiexinxiView> selectListView(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);

	List<ZhangjiexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
	
	ZhangjiexinxiView selectView(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
	
	List<ZhangjiexinxiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);

}
