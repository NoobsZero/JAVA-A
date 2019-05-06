package com.runoob.javaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5arraysAsListAndListAddAll {

	public static void main(String[] args) {
		/**通过 List 类的 Arrays.toString () 方法和 List 类的 list.Addall(array1.asList(array2) 方法将两个数组合并为一个数组*/
		String a[] = {"A","B","C","D"};
		String b[] = {"E","F","G"};
		List<String> list = new ArrayList<String>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object c[] = list.toArray();
		System.out.println(Arrays.toString(c));
	}

}
