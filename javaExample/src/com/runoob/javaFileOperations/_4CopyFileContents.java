package com.runoob.javaFileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** 使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件： */
public class _4CopyFileContents {

	public static void main(String[] args) {
		BufferedWriter out1;
		InputStream in;
		OutputStream out;
		BufferedReader in1;
		try {
			out1 = new BufferedWriter(new FileWriter("Cope"));
			out1.write("Cod");
			out1.close();
			in = new FileInputStream(new File("Cope"));
			out = new FileOutputStream(new File("Cope1"));
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
			in1 = new BufferedReader(new FileReader("Cope1"));
			String str;
			while ((str = in1.readLine()) != null) {
				System.out.println(str);
			}
			in1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
