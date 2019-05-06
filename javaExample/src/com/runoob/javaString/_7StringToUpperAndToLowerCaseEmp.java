package com.runoob.javaString;

public class _7StringToUpperAndToLowerCaseEmp {

	public static void main(String[] args) {
		/** 7、使用了 String toUpperCase()和 toLowerCase() 方法将字符串进行大小写转换 */

		String str = "toUpperCase";
		String strUpper = str.toUpperCase();
		String strLower = str.toLowerCase();
		System.out.println("原始字符串：" + str);
		System.out.println("转换为大写：" + strUpper);
		System.out.println("转换为小写：" + strLower);

	}

}
