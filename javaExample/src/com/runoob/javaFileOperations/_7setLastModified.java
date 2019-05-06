package com.runoob.javaFileOperations;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class _7setLastModified {
	/**
	 * 使用 File 类的 fileToChange.lastModified() 和 fileToChange setLastModified()
	 * 方法来修改文件最后的修改日期：
	 */
	public static void main(String[] args) {
		File fileChange = new File("D:/HelloWord/java/javaExample/Cope");
		try {
			fileChange.createNewFile();
			Date fileTime = new Date(fileChange.lastModified());
			System.out.println("修改前的时间：" + fileTime.toString());
			fileChange.setLastModified(System.currentTimeMillis());
			Date setFileTime = new Date(fileChange.lastModified());
			System.out.println("修改后的时间：" + setFileTime);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
