package com.cl.entity.view;

import com.cl.entity.ZhangjiexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 章节信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
@TableName("zhangjiexinxi")
public class ZhangjiexinxiView  extends ZhangjiexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhangjiexinxiView(){
	}
 
 	public ZhangjiexinxiView(ZhangjiexinxiEntity zhangjiexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhangjiexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
