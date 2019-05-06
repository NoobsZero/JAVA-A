package com.runoob.javaString;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _9StringComparePerformance {

	public static void main(String[] args) {
		/** 9、两种方式创建字符串，并通过System.currentTimeMillis()方法测试其性能 */

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 500000000; i++) {
			String s1 = "hello";
			String s2 = "hello";
			String s3 = "hello";
		}
		long endTime = System.currentTimeMillis();
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 500000000; i++) {
			String s4 = new String("hello");
			String s5 = new String("hello");
			String s6 = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy年-MM月-dd日-HH小时mm分ss秒SSS毫秒");// 日期格式化类
		Date startDate = new Date(startTime);
		Date endDate = new Date(endTime1);
		System.out.println("字符串性能比较测试开始时间：" + formatter.format(startDate));
		System.out.println("通过String关键词创建字符串：" + (endTime - startTime) + "毫秒");
		System.out.println("通过String关键词创建字符串：" + (endTime1 - startTime1) + "毫秒");
		System.out.println("字符串性能比较测试结束时间：" + formatter.format(endDate));

	}

}
