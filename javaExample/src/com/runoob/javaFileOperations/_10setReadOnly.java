package com.runoob.javaFileOperations;

import java.io.File;

public class _10setReadOnly {
	/** 使用 File 类的 file.setReadOnly() 和 file.canWrite() 方法来设置文件只读： */
	public static void main(String[] args) {
		File file = new File("Cope");
		System.out.println(file.canWrite());
		if (file.setReadOnly()) {
			System.out.println("设置只能读取成功！");
		}
		System.out.println(file.canWrite());
	}

}
