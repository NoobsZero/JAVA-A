package com.runoob.javaDired;

import java.io.File;

public class _11ListRoots {
	/** 使用 File 类的 listRoots() 方法来输出系统所有根目录： */
	public static void main(String[] args) {
		File[] file = File.listRoots();
		for (int i = 0; i < file.length; i++) {
			File file1 = file[i];
			System.out.println(file1);
		}
	}

}
