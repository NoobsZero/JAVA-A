package com.runoob.javaDired;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class _5SizeOfDirectory {
	/** 使用 File 类的 FileUtils.sizeofDirectory(File Name) 来获取目录的大小： */
	public static void main(String[] args) {
		long size = FileUtils.sizeOfDirectory(new File(System.getProperty("user.dir") + "\\lib"));
		System.out.println("Size:" + size + "bytes");
	}

}
