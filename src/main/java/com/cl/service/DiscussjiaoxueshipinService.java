package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussjiaoxueshipinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussjiaoxueshipinView;


/**
 * 教学视频评论表
 *
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
public interface DiscussjiaoxueshipinService extends IService<DiscussjiaoxueshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoxueshipinView> selectListView(Wrapper<DiscussjiaoxueshipinEntity> wrapper);
   	
   	DiscussjiaoxueshipinView selectView(@Param("ew") Wrapper<DiscussjiaoxueshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoxueshipinEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<DiscussjiaoxueshipinEntity> wrapper);

}

