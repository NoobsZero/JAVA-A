package com.runoob.javaArray;

import java.util.ArrayList;
import java.util.Collections;

public class _3collectionsReverse {

	public static void main(String[] args) {
		/** 4、使用 Collections.reverse(ArrayList) 将集合进行反转 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println("反转前：" + list);
		Collections.reverse(list);
		System.out.println("反转后：" + list);
	}

}
