package com.runoob.javaArray;

import java.util.ArrayList;

public class _12containsAndcontainsAll {

	public static void main(String[] args) {
		/** 使用 contains () 方法来查找数组中的指定元素 */
		ArrayList<String> objArray1 = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		objArray1.add(0, "0");
		objArray1.add(1, "1");
		objArray1.add(2, "2");
		System.out.println("objArray1数组元素：" + objArray1);
		objArray2.add(0, "0");
		objArray2.add(1, "1");
		objArray2.add(2, "2");
		objArray2.add(3, "3");
		objArray2.add(4, "4");
		System.out.println("objArray2数组元素：" + objArray2);
		// 此集合包含指定元素
		System.out.println("objArray1数组中是否包含元素" + objArray1.get(0) + ":" + objArray1.contains("0"));
		//此集合包含指定集合中的所有元素
		System.out.println("objArray2数组是否包含objArray1数组：" + objArray2.containsAll(objArray1));
	}

}
