package com.runoob.javaArray;

import java.util.ArrayList;

public class _10removeAll {
	public static void main(String[] args) {
		/**使用 removeAll () 方法来计算两个数组的差集*/
		ArrayList<String> objArray1 = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		objArray1.add(0, "0");
		objArray1.add(1, "1");
		objArray1.add(2, "2");
		objArray1.add(3, "6");
		System.out.println("objArray1数组元素："+objArray1);
		objArray2.add(0, "0");
		objArray2.add(1, "1");
		objArray2.add(2, "2");
		objArray2.add(3, "3");
		objArray2.add(4, "4");
		System.out.println("objArray2数组元素："+objArray2);
		objArray1.removeAll(objArray2);//移除所有
		System.out.println("objArray1和objArray2数组差集为："+objArray1);
	}
}
