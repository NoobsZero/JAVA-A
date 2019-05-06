package com.runoob.javaFileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _5AppendsDataToFile {
	/** 实例演示了使用 filewriter 方法向文件中追加数据： */
	public static void main(String[] args) {
		try {
			BufferedWriter out1 = new BufferedWriter(new FileWriter("Cope", true));
			out1.write("Appends date to a File");
			out1.close();
			BufferedReader in1 = new BufferedReader(new FileReader("Cope"));
			String str;
			while ((str = in1.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
