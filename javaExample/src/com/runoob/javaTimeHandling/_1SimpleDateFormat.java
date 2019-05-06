package com.runoob.javaTimeHandling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _1SimpleDateFormat {

	public static void main(String[] args) {
		/** 1、使用 SimpleDateFormat 类的 format(date) 方法来格式化时间，并且输出当前时间 */
		Date date = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy年-MM月-dd日-HH小时mm分ss秒SSS毫秒");
		System.out.println("当前时间："+formater.format(date));
	}

}
