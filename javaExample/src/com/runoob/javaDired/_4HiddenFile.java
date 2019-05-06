package com.runoob.javaDired;

import java.io.File;

public class _4HiddenFile {
	/**使用 File 类的 file.isHidden() 方法来判断文件是否隐藏：*/
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir")+"\\Cope1.txt");
		boolean bl = file.isHidden();
		System.out.println(bl);
	}

}
