package com.runoob.javaString;

public class _3removeCharAt {

	public static void main(String[] args) {
		/** 3、通过字符串函数 substring() 函数来截取字符串中的一个字符 */
		
		 String str = "this is Java"; 
		 System.out.println(removeCharAt(str, 5));
		 
	}
	public static String removeCharAt(String s,int pos){
		return s.substring(0,pos)+s.substring(pos+1);
	}
}
