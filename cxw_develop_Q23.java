package cn.kgc;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class cxw_develop_Q23 {
	//遍历某文件夹下的所有文件目录即文件（文件夹从命令行输入）
	public static void main(String[] args) {
		String s = "";
		InputStreamReader ir=new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(ir);
	    try {
			s =in.readLine();
			showDir(1, new File(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void showDir(int indent, File file) {
		for (int i = 0; i < indent; i++) {
			System.out.print("-");
		}
		if(file.isFile()){
		System.out.println("文件："+file.getName());
		}else{
			System.out.println("目录："+file.getName());
		}
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				showDir(indent + 4, files[i]);
			}
		}
	}
}
