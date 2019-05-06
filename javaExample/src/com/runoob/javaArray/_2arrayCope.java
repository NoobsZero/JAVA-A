package com.runoob.javaArray;

import java.util.Arrays;
import java.util.Scanner;

public class _2arrayCope {

	public static void main(String[] args) {
		/** 3、向数组插入元素,使用System.arraycope()数组复制,使用数组的属性 length 来获取数组的长度 */

		Scanner input = new Scanner(System.in);
		int array[] = { 5, 6, 7, -5, -6, -7, 9, 6 };
		Arrays.sort(array);
		printArray("数组排序后结果为", array);
		System.out.println("输入插入的元素：");
		int num = input.nextInt();
		int index = Arrays.binarySearch(array, num);
		if (index >= 0) {
			System.out.println("元素" + num + "存在，所在位置：" + (index + 1));
		} else {
			int newIndex = -index - 1;
			array = insertElement(array, num, newIndex);
			printArray("添加元素" + num + "成功！", array);
			System.out.println("元素" + num + "所在位置：" + (-index));
		}

	}

	// printArray()静态方法，遍历输出数组
	public static void printArray(String message, int array[]) {
		System.out.println(message + ":[length:" + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

	// insertElement()静态方法，添加新元素
	public static int[] insertElement(int original[], int element, int index) {
		int length = original.length;
		int destination[] = new int[(length + 1)];
		System.arraycopy(original, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(original, index, destination, index + 1, (length - index));
		return destination;

	}

}
