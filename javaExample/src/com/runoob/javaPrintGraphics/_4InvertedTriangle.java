package com.runoob.javaPrintGraphics;

public class _4InvertedTriangle {
	/** 打印倒立的三角形 */
	public static void main(String[] args) {
		int s = 7;
		for (int m = 0; m < s; m++) {
			for (int n = 0; n <= m + 1; n++) {
				System.out.print(" ");
			}
			// 打印*
			for (int x = 1; x <= 2 * s - 1 - 2 * m; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
