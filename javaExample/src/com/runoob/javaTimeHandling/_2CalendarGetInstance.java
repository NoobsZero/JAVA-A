package com.runoob.javaTimeHandling;

import java.util.Calendar;

public class _2CalendarGetInstance {

	public static void main(String[] args) {
		/** 使用 Calendar 类来输出年份、月份等 */
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int yea = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(year + "年" + month + "月" + day + "日");
		System.out.println("今天是这周中的第" + week + "天");
		System.out.println("今天是这月中的第" + mon + "天");
		System.out.println("今天是这年中的第" + yea + "天");
	}

}
