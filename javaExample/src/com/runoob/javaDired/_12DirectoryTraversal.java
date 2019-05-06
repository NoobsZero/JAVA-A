package com.runoob.javaDired;

import java.io.File;

public class _12DirectoryTraversal {
	/** 使用 File 类的 dir.isDirectory() 和 dir.list() 方法来遍历目录： */
	public static void main(String[] args) {
		File dir = new File("D:\\87062");
		All(dir);
	}

	public static void All(File file) {
		System.out.println(file);
		if (file.isDirectory()) {
			String[] list = file.list();
			for (int i = 0; i < list.length; i++) {
				All(new File(file, list[i]));
			}
		}
	}
}
