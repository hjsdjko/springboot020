package com.cl.dao;

import com.cl.entity.DiscusszhangjiexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusszhangjiexinxiView;


/**
 * 章节信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
public interface DiscusszhangjiexinxiDao extends BaseMapper<DiscusszhangjiexinxiEntity> {
	
	List<DiscusszhangjiexinxiView> selectListView(@Param("ew") Wrapper<DiscusszhangjiexinxiEntity> wrapper);

	List<DiscusszhangjiexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhangjiexinxiEntity> wrapper);
	
	DiscusszhangjiexinxiView selectView(@Param("ew") Wrapper<DiscusszhangjiexinxiEntity> wrapper);
	
	List<DiscusszhangjiexinxiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<DiscusszhangjiexinxiEntity> wrapper);

}
