package com.runoob.javaMethod;

public class _12JavaForAndForeach {

	/**
	 * for 语句比较简单，用于循环数据。
	 * 
	 * for循环执行的次数是在执行前就确定的。语法格式如下：
	 * 
	 * for(初始化; 布尔表达式; 更新) { //代码语句 }
	 * foreach语句是java5的新特征之一，在遍历数组、集合方面，foreach为开发人员提供了极大的方便。
	 * 
	 * foreach 语法格式如下：
	 * 
	 * for(元素类型t 元素变量x : 遍历对象obj){ 引用了x的java语句; } 以下实例演示了 for 和 foreach循环使用：
	 */
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		For(numbers);
		System.out.println();
		Foreach(numbers);
	}

	public static void Foreach(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	public static void For(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(nums[i]);
		}
	}
}
