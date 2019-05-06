package com.runoob.javaArray;

import java.util.HashSet;
import java.util.Set;

public class _14unionSet {
	/** 计算两个数组的并集 */
	public static void main(String[] args) {
		String str1[] = { "1", "2", "3", "4" };
		String str2[] = { "4", "5", "6", "7" };
		String[] union = union(str1, str2);
		System.out.println("并集的结果：");
		for (String str : union) {

			System.out.println(str);
		}
	}

	public static String[] union(String[] str1, String[] str2) {
		Set<String> set = new HashSet<String>();
		for (String str : str1) {
			set.add(str);
		}
		for (String str : str2) {
			set.add(str);
		}
		String[] result = {};
		return set.toArray(result);
	}

}
