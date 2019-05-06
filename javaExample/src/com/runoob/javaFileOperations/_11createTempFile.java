package com.runoob.javaFileOperations;

import java.io.File;
import java.io.IOException;

public class _11createTempFile {
	/** 使用 File 类的 file.createTempFile() 方法在指定目录中创建文件： */
	public static void main(String[] args) throws IOException {
		File file = null;
		File url = new File("D:/HelloWord/java/javaExample");
		file = File.createTempFile("Copes", ".txt", url);
		System.out.println(file.getPath());
	}

}
