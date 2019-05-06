package com.runoob.javaString;

import java.util.Locale;

public class _11StringFormat {

	public static void main(String[] args) {
		/** 11、通过 format() 方法来格式化字符串，还可以指定地区来格式化 */

		double e = Math.E;
		System.out.format("%f%n", e);
		System.out.format(Locale.CHINA, "%-100.4f%n", e);
		System.out.format("%s%n", e);

	}

}
