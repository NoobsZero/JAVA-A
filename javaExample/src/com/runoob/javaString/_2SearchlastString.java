package com.runoob.javaString;

import java.util.Scanner;

public class _2SearchlastString {

	public static void main(String[] args) {
		/**
		 * 2、通过字符串函数 从后往前查 lastIndexOf()和 从前往后查 IndexOf() 来查找子字符串在 str 出现的位置：
		 */

		String str = "Hello World";
		Scanner input = new Scanner(System.in);
		System.out.println("请输入查询的子字符：");
		String strName = input.next();
		int index = str.lastIndexOf(strName);
		int index1 = str.indexOf(strName);
		if (index == -1) {
			System.out.println("没有找到字符串：" + strName);
		} else {
			System.out.println("第一个子字符串所在的位置：" + (index1 + 1) + "\n最后一个子字符串所在的位置：" + (index + 1));
		}

	}

}
