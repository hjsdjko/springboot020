package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhangjiexinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhangjiexinxiView;


/**
 * 章节信息
 *
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
public interface ZhangjiexinxiService extends IService<ZhangjiexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhangjiexinxiView> selectListView(Wrapper<ZhangjiexinxiEntity> wrapper);
   	
   	ZhangjiexinxiView selectView(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhangjiexinxiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<ZhangjiexinxiEntity> wrapper);

}

