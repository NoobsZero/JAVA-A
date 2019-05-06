package com.runoob.javaDired;

import java.io.File;

public class _8PrintDirectory {
	/** 使用 File 类的 file.getName() 和 file.listFiles() 方法来打印目录结构： */
	public static void main(String[] args) {
		showDir(1, new File("D:\\87062"));
	}

	public static void showDir(int indent, File file) {
		for (int i = 0; i < indent; i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				showDir(indent + 4, files[i]);
			}
		}
	}
}
