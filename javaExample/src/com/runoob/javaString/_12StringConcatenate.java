package com.runoob.javaString;

public class _12StringConcatenate {

	public static void main(String[] args) {
		/** 12、通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能 */

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			String result = "this is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("字符串连接" + "-使用+操作符：" + (endTime - startTime) + "ms");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			StringBuffer result = new StringBuffer();
			result.append("this is");
			result.append("testing the");
			result.append("difference");
			result.append("between");
			result.append("String");
			result.append("and");
			result.append("StringBuffer");

		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("字符串连接" + "使用StringBuffer():" + (endTime1 - startTime1) + "ms");

	}

}
