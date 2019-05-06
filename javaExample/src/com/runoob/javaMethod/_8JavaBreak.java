package com.runoob.javaMethod;

public class _8JavaBreak {

	public static void main(String[] args) {
		int[] ary = { 1, 3, 2, 5, 6, 5678 };
		int s = 5678;
		found(s, ary);
//		boolean found = false;
//		int i = 0;
		//for (; i < ary.length; i++) {
			/* if (s == ary[i]) {
			 System.out.println("找到元素" + s + "，下标在：" + (i + 1));
			 break;
			 } else if (i == ary.length - 1) {
			 System.out.println("数组中不存在元素:" + s);
			 }*/
//			if (ary[i] == s) {
//				found = true;
//				break;
//			}
//		}
//		if (found) {
//			System.out.println("找到元素" + s + "，下标在：" + (i + 1));
//		} else {
//			System.out.println("数组中不存在元素:" + s);
//		}
	}
	public static void found(int s , int[] ary){
		boolean judge = false;
		int i = 0;
		for(; i<ary.length; i++){
			if(ary[i] == s){
				judge = true;
				break;
			}
		}
		if(judge){
			System.out.println("找到元素" + s + "，下标在：" + (i + 1));
		}else{
			System.out.println("数组中不存在元素:" + s);
		}
	}
}
