package com.runoob.javaFileOperations;

import java.io.File;

public class _9Rename {
	/** 使用 File 类的 oldName.renameTo(newName) 方法来重命名文件： */
	public static void main(String[] args) {
		File oldFile = new File("Cope1");
		File newFile = new File("newCope");
		if (oldFile.renameTo(newFile)) {
			System.out.println("重命名成功！");
		} else {
			System.out.println("失败！");
		}
	}

}
