package com.runoob.javaArray;

import java.util.ArrayList;

public class _11retainAll {
	public static void main(String[] args) {
		/** 使用 retainAll () 方法来计算两个数组的交集 */
		ArrayList<String> objArray1 = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		objArray1.add(0, "0");
		objArray1.add(1, "1");
		objArray1.add(2, "2");
		objArray1.add(3, "6");
		System.out.println("objArray1数组元素：" + objArray1);
		objArray2.add(0, "0");
		objArray2.add(1, "1");
		objArray2.add(2, "2");
		objArray2.add(3, "3");
		objArray2.add(4, "4");
		System.out.println("objArray2数组元素：" + objArray2);
		objArray1.retainAll(objArray2);// 取交集
		System.out.println("objArray1&objArray2数组差集为：" + objArray1);

	}
}
