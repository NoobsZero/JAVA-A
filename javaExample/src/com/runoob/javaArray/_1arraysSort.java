package com.runoob.javaArray;

import java.util.Arrays;
import java.util.Scanner;

public class _1arraysSort {
	public static void main(String[] args) {
		/** 1、使用sort()方法对Java数组进行排序，及如何使用 binarySearch() 方法来查找数组中的元素 */
		int array[] = new int[7];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个正整数：");
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		printArray("数组排序结果为：", array);
	/*	System.out.print("数组排序结果为[" + array.length + "]:");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}*/

	int index = Arrays.binarySearch(array, 5);// 二分查找 
	System.out.println("\n元素5在第"+(index+1)+"个位置");
	}

	/** 2、定义了 printArray() 方法通过循环输出数组来打印数组 */

	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length: " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();

	}
}
