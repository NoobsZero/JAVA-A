package com.runoob.javaDired;

import java.io.File;

public class _7getFileParent {
	/** 使用 File 类的 file.getParent() 方法来获取文件的上级目录： */
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir"));
		System.out.println(file + "的上级目录是：" + file.getParent());
	}

}
