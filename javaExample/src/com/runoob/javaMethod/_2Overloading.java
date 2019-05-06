package com.runoob.javaMethod;

public class _2Overloading {
	/**
	 * 方法重载（Overloading）的定义：如果有两个方法的方法名相同，但参数不一致，哪么可以说一个方法是另一个方法的重载。 具体说明如下：
	 * 
	 * 方法名相同 方法的参数类型，参数个不一样 方法的返回类型可以不相同 方法的修饰符可以不相同 main 方法也可以被重载
	 */
	int heigth;

	_2Overloading() {
		System.out.println("Overloading()无参构造函数");
		heigth = 4;
	}

	_2Overloading(int heigth) {
		System.out.println("Overloading(int heigth)房子的高度为：" + heigth + "米");
		this.heigth = heigth;
	}

	void info() {
		System.out.println("info()房子的高度为：" + heigth + "米");
	}

	void info(String s) {
		System.out.println("info(String s)" + s + heigth + "米");
	}

	public static void main(String[] args) {
		_2Overloading old = new _2Overloading();
		new _2Overloading(6);
		old.info();
		old.info("房子的高度为");
	}

}
