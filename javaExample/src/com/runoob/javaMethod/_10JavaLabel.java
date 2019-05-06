package com.runoob.javaMethod;

public class _10JavaLabel {

	public static void main(String[] args) {
		/**
		 * Java 中的标签是为循环设计的，是为了在多重循环中方便的使用break 和coutinue 。
		 * 
		 * 以下实例当在循环中使用 break 或 continue 循环时跳到指定的标签处：
		 */
		String strSearch = "this is the string in which you have for a substring.";
		String substring = "substring";
		boolean found = false;
		int max = strSearch.length() - substring.length();
		testlb1: for (int i = 0; i < max; i++) {
			int length = substring.length();
			int j = i;
			int k = 0;
			while (length-- != 0) {
				if (strSearch.charAt(j++) != substring.charAt(k++)) {
					continue testlb1;
				}
			}
			found = true;
			break testlb1;
		}
		if (found) {
			System.out.println("发现子字符串。");
		} else {
			System.out.println("字符串中没有发现子字符串。");

		}
	}

}
