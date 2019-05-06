package com.runoob.javaPrintGraphics;

import java.util.Scanner;

public class _1PrintDiamond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入菱形大小：");
		int size = input.nextInt();
		print(size);
	}

	static void print(int size) {
		if (size % 2 == 0) {
			size++;
		}
		for (int i = 0; i < size / 2 + 1; i++) {
			for (int k = size / 2 + 1; k > i + 1; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
	}
}
