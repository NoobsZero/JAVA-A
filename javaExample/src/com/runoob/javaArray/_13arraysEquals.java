package com.runoob.javaArray;

import java.util.Arrays;

public class _13arraysEquals {

	public static void main(String[] args) {
		/** 使用 equals ()方法来判断数组是否相等 */
		int[] ary = { 1, 2, 3, 4, 5, 6 };
		int[] ary1 = { 1, 2, 3, 4, 5, 6 };
		int[] ary2 = { 1, 2, 3, 4 };
		System.out.println("数组 ary 是否与数组 ary1相等? ：" + Arrays.equals(ary, ary1));
		System.out.println("数组 ary 是否与数组 ary2相等? ：" + Arrays.equals(ary, ary2));
		System.out.println(ary == ary1);
		System.out.println(ary == ary2);
	}

}
