package com.runoob.javaArray;

import java.util.Arrays;

public class _6arraysFill {
	public static void main(String[] args) {
		/**
		 * 通过 Java Util 类的 Arrays.fill(arrayname,value) 方法和Arrays.fill(arrayname
		 * ,starting index ,ending index ,value) 方法向数组中填充元素
		 */
		int a[] = new int[6];
		Arrays.fill(a, 100);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		Arrays.fill(a, 2, 6, 50);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
