package com.cl.entity.view;

import com.cl.entity.JiaoxueshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 教学视频
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-30 17:01:47
 */
@TableName("jiaoxueshipin")
public class JiaoxueshipinView  extends JiaoxueshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoxueshipinView(){
	}
 
 	public JiaoxueshipinView(JiaoxueshipinEntity jiaoxueshipinEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoxueshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
