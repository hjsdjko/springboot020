package com.cl.entity.view;

import com.cl.entity.DiscussjiaoxueshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 教学视频评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
@TableName("discussjiaoxueshipin")
public class DiscussjiaoxueshipinView  extends DiscussjiaoxueshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiaoxueshipinView(){
	}
 
 	public DiscussjiaoxueshipinView(DiscussjiaoxueshipinEntity discussjiaoxueshipinEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiaoxueshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
