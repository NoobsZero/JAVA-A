package com.runoob.javaString;

public class _4StringReplaceEmp {
	public static void main(String[] args) {
		/** 4、使用 java String 类的 replace 方法来替换字符串中的字符 */
		String str = "Hello Hello";
		System.out.println(str.replace('H', 'W'));
		System.out.println(str.replaceFirst("He", "Wa"));
		System.out.println(str.replaceAll("He", "Ha"));
	}
}
