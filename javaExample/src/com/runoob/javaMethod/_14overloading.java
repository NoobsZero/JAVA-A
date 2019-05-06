package com.runoob.javaMethod;

public class _14overloading {
	/** 如何在重载方法中使用可变参数： */
	public static void main(String[] args) {
		vatest(new int[] { 5, 6, 7 });
		vatest(true, false, true);
		vatest("测试", 4, 3, 2, 1);
	}

	static void vatest(int... is) {
		System.out.println("vatest(int...is):参数个数:" + is.length + "内容:");
		for (int s : is) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	static void vatest(boolean... bs) {
		System.out.println("vatest(boolean...bs):参数个数:" + bs.length + "内容:");
		for (boolean s : bs) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	static void vatest(String str, int... is) {
		System.out.println("vatest(boolean...bs):" + str + "参数个数:" + is.length + "内容:");
		for (int s : is) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}