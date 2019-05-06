package com.runoob.javaTimeHandling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _3Date {
	public static void main(String[] args){
		/**
		 * 使用 SimpleDateFormat 类的 format() 方法将时间戳转换成时间。
		 * 
		 * 日期和时间模式(注意大小写，代表的含义是不同的)：
		 * 
		 * yyyy：年 MM：月 dd：日 hh：1~12小时制(1-12) HH：24小时制(0-23) mm：分 ss：秒 S：毫秒 E：星期几
		 * D：一年中的第几天 F：一月中的第几个星期(会把这个月总共过的天数除以7) w：一年中的第几个星期
		 * W：一月中的第几星期(会根据实际情况来算) a：上下午标识 k：和HH差不多，表示一天24小时制(1-24)
		 * K：和hh差不多，表示一天12小时制(0-11) z：表示时区
		 */
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat formater = new SimpleDateFormat("yyyy年-MM月-dd日HH时mm分ss秒");
		String date = formater.format(new Date(time));
		String date2 = formater.format(Long.valueOf(time));
		String date1 = formater.format(new Date(Long.parseLong(String.valueOf(time))));
		System.out.println(date);
		System.out.println(date1);
		System.out.println(date2);
	}
}
