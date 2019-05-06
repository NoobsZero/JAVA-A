package com.runoob.javaMethod;

public class _1OutputArrayElement {
	/** 常用的控制变量有:%d控制整型数据输出、%f控制浮点型数据输出、%c控制单一字符数据输出、%s控制字符串(字符数组)输出. */
	public static void main(String[] args) {
		Integer intArray[] = { 1, 2, 3 };
		String strArray[] = { "输出", "数组", "元素" };
		double douArray[] = {1.1,1.2,1.3};
		System.out.println("输出正整数：");
		printArray(intArray);
		System.out.println("输出字符串：");
		printArray(strArray);
		System.out.println();
		System.out.println("输出浮点数：");
		printArray(douArray);
	}

	public static void printArray(Integer[] inputArray) {
		for (Integer str : inputArray) {
			System.out.printf("%d", str);
			System.out.println();
		}
	}

	public static void printArray(String[] inputArray) {
		for (String str : inputArray) {
			System.out.printf("%s", str);
		}
	}

	public static void printArray(double[] inputArray) {
		for (double str : inputArray) {
			System.out.printf("%f", str);
			System.out.println();
		}
	}

}
