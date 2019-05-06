package com.runoob.javaDired;

import java.io.File;
import java.io.FilenameFilter;

public class _10AllDirectories2 {

	/** 以下实例演示了在 D 盘中查找以字母 '8' 开头的所有文件 */
	public static void main(String[] args) {
		File dir = new File("D:\\");
		FilenameFilter filter = new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return name.startsWith("8");
			}
		};
		File[] files = dir.listFiles(filter);
		if(files.length == 0){
			System.out.println("目录不存在或不是目录！");
		}else{
			for(int i = 0; i<files.length; i++){
			File file = files[i];
			System.out.println(file);
			}
		}
	}
}
