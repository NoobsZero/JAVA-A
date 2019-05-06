package com.runoob.javaFileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _1BufferedWriter {
	/** 演示了使用 write() 方法向文件写入内容 */
	public static void main(String[] args) {
		try {
			BufferedWriter Writer = new BufferedWriter(new FileWriter("noobs.txt"));
			Writer.write("hello");
			Writer.close();
			System.out.println("文件写入成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
