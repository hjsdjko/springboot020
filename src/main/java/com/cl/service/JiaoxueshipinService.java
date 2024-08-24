package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiaoxueshipinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiaoxueshipinView;


/**
 * 教学视频
 *
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
public interface JiaoxueshipinService extends IService<JiaoxueshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxueshipinView> selectListView(Wrapper<JiaoxueshipinEntity> wrapper);
   	
   	JiaoxueshipinView selectView(@Param("ew") Wrapper<JiaoxueshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxueshipinEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<JiaoxueshipinEntity> wrapper);

}

