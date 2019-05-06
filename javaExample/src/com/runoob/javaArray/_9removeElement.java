package com.runoob.javaArray;

import java.util.ArrayList;

public class _9removeElement {

	public static void main(String[] args) {
		/** 使用 remove () 方法来删除数组元素 */
		ArrayList<String> list = new ArrayList<String>();
		list.clear();
		list.add(0, "第0个元素");
		list.add(1, "第1个元素");
		list.add(2, "第2个元素");
		list.add(3, "第3个元素");
		System.out.println("数组删除前：" + list);
		list.remove(0);
		list.remove("第1个元素");
		System.out.println("数组删除后：" + list);
	}

}
