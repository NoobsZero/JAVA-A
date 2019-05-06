package com.runoob.javaString;

public class _8StringRegionMatch {

	public static void main(String[] args) {
		/** 8、使用了 regionMatches() 方法测试两个字符串区域是否相等 */

		String first_str = "regionMatches";
		String second_str = "matches";
		boolean match1 = first_str.regionMatches(6, second_str, 0, 6);
		boolean match2 = first_str.regionMatches(true, 6, second_str, 0, 6);// true忽略大小写
		System.out.println(match1);
		System.out.println(match2);

	}
}
