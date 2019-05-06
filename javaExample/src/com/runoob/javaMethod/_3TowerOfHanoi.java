package com.runoob.javaMethod;

public class _3TowerOfHanoi {

	/**
	 * 汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。
	 * 
	 * 后来，这个传说就演变为汉诺塔游戏，玩法如下:
	 * 
	 * 1.有三根杆子A,B,C。A杆上有若干碟子 2.每次移动一块碟子,小的只能叠在大的上面 3.把所有碟子从A杆全部移到C杆上
	 * 以下实例演示了汉诺塔算法的实现：
	 */
	public static void main(String[] args) {
		int nDisks = 3;
		doTowers(nDisks, 'A', 'B', 'C');
	}

	public static void doTowers(int topN, char from, char inter, char to) {
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter);
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);
		}
	}

}
