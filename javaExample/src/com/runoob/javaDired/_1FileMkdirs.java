package com.runoob.javaDired;

import java.io.File;

public class _1FileMkdirs {
	/** 使用 File 类的 mkdirs() 实现递归创建目录 ： */
	public static void main(String[] args) {
		String str = "D:\\HelloWord\\java\\javaExample\\FileMkdirs";
		File file = new File(str);
		//创建一个目录
		boolean bl = file.mkdir();
		System.out.println(bl);
	}

}
