package com.runoob.javaDired;

import java.io.File;

public class _6AllFilesDirectory {
	/** 使用 File 类的 dir.list() 方法在指定目录中查找所有文件列表： */
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir") + "\\lib");
		String[] children = file.list();
		if (children.length == 0) {
			System.out.println("该目录不存在！");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}

}
