package com.runoob.javaFileOperations;

import java.io.File;
import java.io.IOException;

public class _12compareTo {
	/**
	 * 使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否在同一个目录下：
	 */
	public static void main(String[] args) {
		File file1 = new File("Cope");
		File file2 = new File("newCope");
		if (file1.compareTo(file2) == 0) {
			System.out.println("文件路径一致！");
		} else {
			try {
				System.out.println(file1.getCanonicalPath());
				System.out.println(file2.getCanonicalPath());
				System.out.println(file1.compareTo(file2));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
