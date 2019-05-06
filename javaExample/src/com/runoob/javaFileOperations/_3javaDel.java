package com.runoob.javaFileOperations;

import java.io.File;

public class _3javaDel {

	public static void main(String[] args) {
		File file = new File("D:/HelloWord/java/javaExample/noobs.txt");
		if(file.delete()){
			System.out.println(file.getName()+"删除成功！");
		}else{
			System.out.println("删除失败！");
		}
	}

}
