package com.runoob.javaDired;

import java.io.File;

public class _2DeleteDirectory {
	/**使用 File 类的 ofdir.isDirectory(), dir.list() 和 deleteDir() 方法在一个个删除文件后删除目录 */
	public static void main(String[] args) {
		deleteDir(new File("D:\\HelloWord\\java\\javaExample\\FileMkdirs"));
	}

	public static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]));
				if (!success) {
					return false;
				}
			}
		}
		if (dir.isDirectory()&&dir.delete()) {
			System.out.println("目录已被删除！");
			return true;
		} else {
			System.out.println("目录删除失败！");
			return false;
		}
	}
}
