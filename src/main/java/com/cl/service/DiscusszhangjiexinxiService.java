package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusszhangjiexinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusszhangjiexinxiView;


/**
 * 章节信息评论表
 *
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
public interface DiscusszhangjiexinxiService extends IService<DiscusszhangjiexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhangjiexinxiView> selectListView(Wrapper<DiscusszhangjiexinxiEntity> wrapper);
   	
   	DiscusszhangjiexinxiView selectView(@Param("ew") Wrapper<DiscusszhangjiexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhangjiexinxiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<DiscusszhangjiexinxiEntity> wrapper);

}

