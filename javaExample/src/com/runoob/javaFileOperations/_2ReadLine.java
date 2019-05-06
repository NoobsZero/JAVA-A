package com.runoob.javaFileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _2ReadLine {
	/** 使用 readLine() 方法来读取文件 test.log 内容，其中 test.log 文件内容为： */
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("noobs.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println(str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
