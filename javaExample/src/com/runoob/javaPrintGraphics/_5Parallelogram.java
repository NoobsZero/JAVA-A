package com.runoob.javaPrintGraphics;

public class _5Parallelogram {
	/** 输出平行四边形 */
	public static void main(String[] args) {
		// 外层循环5次
		for (int i = 1; i <= 5; i++) {
			// 内层循环根据i值得变化每次递减一次
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			// 内层循环5次
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
