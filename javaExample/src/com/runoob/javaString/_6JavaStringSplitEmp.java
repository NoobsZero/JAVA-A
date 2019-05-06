package com.runoob.javaString;

import java.util.StringTokenizer;

public class _6JavaStringSplitEmp {

	public static void main(String[] args) {
		/**
		 * 6、使用了 split(string) 或 调用StringTokenizer 方法通过指定分隔符将字符串分割为数组
		 * StringTokenizer分割原理是：只要有字符e和l的地方都进行切割，而split是只在字符串el的地方切割。
		 */

		String str = "www.runoob.com";
		String[] temp;
		String delimeter = "\\.";
		temp = str.split(delimeter);
		for (String x : temp) {
			System.out.println(x);
		}

		String str1 = "www.runoob.con";
		StringTokenizer str2 = new StringTokenizer(str, ".");
		while (str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
		}

	}

}
