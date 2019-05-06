package com.runoob.javaFileOperations;

import java.io.File;

/** 使用 File 类的 file.exists() 和 file.length() 方法来获取文件大小，以字节计算（1KB=1024字节 ）： */
public class _8getFileSize {

	public static void main(String[] args) {
		long size = getFileSize("Cope");
		System.out.println(size);
	}

	public static long getFileSize(String fileName) {
		File file = new File(fileName);
		if (!file.exists() || !file.isFile()) {
			System.out.println("文件不存在！");
			return -1;
		}
		return file.length();
	}
}
