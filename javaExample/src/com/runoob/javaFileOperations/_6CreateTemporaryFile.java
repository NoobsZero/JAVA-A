package com.runoob.javaFileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _6CreateTemporaryFile {
	/**
	 * 使用 File 类的 createTempFile(String prefix, String suffix);
	 * 方法在默认临时目录来创建临时文件，参数 prefix 为前缀，suffix 为后缀：
	 */
	public static void main(String[] args) {
		try {
			File temp = File.createTempFile("TempFile", ".txt", new File("D:/HelloWord/java/javaExample"));
			System.out.println(temp.getAbsolutePath());
			temp.deleteOnExit();
			BufferedWriter in1 = new BufferedWriter(new FileWriter(temp));
			in1.write("TempFile");
			in1.close();
			BufferedReader out1 = new BufferedReader(new FileReader(temp));
			String str;
			while ((str = out1.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * try {
		 * 
		 * // 创建临时文件 f = File.createTempFile("tmp", ".txt", new File("C:/"));
		 * 
		 * // 输出绝对路径 System.out.println("File path: "+f.getAbsolutePath());
		 * 
		 * // 终止后删除临时文件 f.deleteOnExit();
		 * 
		 * // 创建临时文件 f = File.createTempFile("tmp", null, new File("D:/"));
		 * 
		 * // 输出绝对路径 System.out.print("File path: "+f.getAbsolutePath());
		 * 
		 * // 终止后删除临时文件 f.deleteOnExit();
		 * 
		 * } catch(Exception e) {
		 * 
		 * // 如果有错误输出内容 e.printStackTrace(); }
		 */
	}

}
