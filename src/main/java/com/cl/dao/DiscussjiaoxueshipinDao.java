package com.cl.dao;

import com.cl.entity.DiscussjiaoxueshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussjiaoxueshipinView;


/**
 * 教学视频评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
public interface DiscussjiaoxueshipinDao extends BaseMapper<DiscussjiaoxueshipinEntity> {
	
	List<DiscussjiaoxueshipinView> selectListView(@Param("ew") Wrapper<DiscussjiaoxueshipinEntity> wrapper);

	List<DiscussjiaoxueshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaoxueshipinEntity> wrapper);
	
	DiscussjiaoxueshipinView selectView(@Param("ew") Wrapper<DiscussjiaoxueshipinEntity> wrapper);
	
	List<DiscussjiaoxueshipinView> selectGroupBy(Pagination page,@Param("ew") Wrapper<DiscussjiaoxueshipinEntity> wrapper);

}
