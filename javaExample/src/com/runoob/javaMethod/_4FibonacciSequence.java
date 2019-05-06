package com.runoob.javaMethod;

public class _4FibonacciSequence {

	/**
	 * 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
	 * 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……
	 * 
	 * 特别指出：第0项是0，第1项是第一个1。
	 * 
	 * 这个数列从第三项开始，每一项都等于前两项之和。
	 * 
	 * 以下实例演示了 Java 斐波那契数列的实现：
	 */
	public static void main(String[] args) {
		for (int counter = 0; counter <= 10; counter++) {
			System.out.printf("Fibonacci of %d is:%d\n", counter, fibonacci(counter));
		}
	}

	public static int fibonacci(int counter) {
		if (counter == 0 || counter == 1) {
			return counter;
		} else {
			return fibonacci(counter - 1) + fibonacci(counter - 2);
		}
	}
}
