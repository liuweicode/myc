package com.myc;

import com.wy.AppContext;
import com.wy.exception.AppError;

/** 
 * 描述：全局上下文
 *
 * 作者: Liu wei
 * 
 * 邮箱：i@liuwei.co
 * 
 * 创建时间: 2013-5-31
 */
public class MycAppContext extends AppContext{

	private static MycAppContext instance;
	
	public static MycAppContext getInstance(){
		return instance;
	}
	
	@Override
	public void onCreate(){
		instance = this;
		super.onCreate();
		
		
		
	}
}
