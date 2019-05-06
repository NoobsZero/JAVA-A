package com.runoob.javaDired;

import java.io.File;

public class _3isDirectoryNoNull {

	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir")+"\\FileMkdirs");
		if(file.isDirectory()){
			if(file.list().length > 0){
				System.out.println("目录不为空！");
			}else{
				System.out.println("目录是空的！");
			}
		}else{
			System.out.println("不是目录！");
		}
	}

}
