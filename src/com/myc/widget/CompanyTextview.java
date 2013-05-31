package com.myc.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/** 
 * 描述：显示公司名称的TextView
 *
 * 作者: Liu wei
 * 
 * 邮箱：i@liuwei.co
 * 
 * 创建时间: 2013-5-31
 */
public class CompanyTextview extends TextView{
	
	public CompanyTextview(Context context) {
        super(context);

	}

	public CompanyTextview(Context context, AttributeSet attrs) {
	        super(context, attrs);
	
	}
	
	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {
		    //设置外发光
	        BlurMaskFilter filter = new BlurMaskFilter(15, Blur.OUTER);
	        getPaint().setMaskFilter(filter);
	        super.onDraw(canvas);
	}
}
