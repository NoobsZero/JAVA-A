package com.runoob.javaString;

public class _10StringOptimization {

	public static void main(String[] args) {
		/** 10、通过两种方式创建字符串（intern()方法优化，但效率低），并测试其性能 */

		String variables[] = new String[50000];
		for (int i = 0; i < 50000; i++) {
			variables[i] = "s" + i;
		}
		long startTime0 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = "hello";
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("直接使用字符串： " + (endTime0 - startTime0) + " ms");
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("使用 new 关键字：" + (endTime1 - startTime1) + " ms");
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = new String("hello").intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("使用字符串对象的 intern() 方法: " + (endTime2 - startTime2) + " ms");

	}

}
