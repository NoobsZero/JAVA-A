package com.runoob.javaMethod;

import java.util.ArrayList;

public class _7JavaInstanceof {

	public static void main(String[] args) {
		/**
		 * instanceof 是 Java 的一个二元操作符，类似于 ==，>，< 等操作符。
		 * 
		 * instanceof 是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。
		 * 
		 * 以下实例创建了 displayObjectClass() 方法来演示 Java instanceof 关键字用法：
		 */
		Object i = new Info(1, 2);
		lean(i);
		Info f = (Info) i;
		System.out.println(f.sum());
	}

	public static void lean(Object i) {
		if (i instanceof ArrayList) {
			System.out.println("对象是java.util.ArrayList的实例");
		} else if (i instanceof Info) {
			System.out.println("对象是com.runoob.javaMethod的实例");
		} else {
			System.out.println("未知实例");
		}
	}

}

class Info {
	int a;
	int b;

	Info(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int sum() {
		return (a + b);
	}
}