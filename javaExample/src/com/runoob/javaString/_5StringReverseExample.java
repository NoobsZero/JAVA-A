package com.runoob.javaString;

public class _5StringReverseExample {

	public static void main(String[] args) {
		/** 5、使用 Java 的反转函数 reverse() 将字符串反转 */

		String string = "小程序";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("字符串反转前：" + string);
		System.out.println("字符串反转后：" + reverse);

	}

}
