package com.runoob.javaSingleton;

public class Singleton {
	public static void main(String[] args) {
		Singleton.getInstance();
	}
	// 1、饿汉模式
	private Singleton() { 
		System.out.println("单例模式：饿汉式单例"); 
	}

	private static Singleton single = new Singleton();

	public static Singleton getInstance() {
		return single;
	}

	// 2、使用synchronized同步锁
	/*
	 * private Singleton1() { System.out.println("单例模式：使用synchronized同步锁"); }
	 * 
	 * private static Singleton1 single = null;
	 * 
	 * public static Singleton1 getInstance() { if (single == null) {
	 * synchronized (Singleton1.class) { if (single == null) { single = new
	 * Singleton1(); } } } return single; }
	 */

	// 3、静态内部类实现
	/*
	 * private Singleton1(){ System.out.println("静态内部类实现"); }
	 * 
	 * private static class InnerObject{ private static Singleton1 single = new
	 * Singleton1(); }
	 * 
	 * public static Singleton1 getInstance(){ return InnerObject.single; }
	 */

	// 4、内部枚举类实现
	/*
	 * public Singleton(){ System.out.println("内部枚举类实现"); } public enum
	 * EnumSingleton{ Singleton; private Singleton singleton;
	 * 
	 * //5、枚举类的构造方法在类加载时被实例化 private EnumSingleton(){ singleton = new Singleton();
	 * } public Singleton getInstance(){ return singleton; } } public static
	 * Singleton getInstance(){ return EnumSingleton.Singleton.getInstance(); }
	 */
}
