package com.runoob.javaMyException;

public class _1ExceptionDemo {
	/** 使用 System 类的 System.err.println() 来展示异常的处理方法： */
	public static void main(String[] args) {
		try {
			throw new Exception("MyException");
		} catch (Exception e) {
			System.err.println("MyException");
			System.err.println("toStirng:" + e);
			e.printStackTrace();
		}
	}

}
