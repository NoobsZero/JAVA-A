package com.runoob.javaMethod;

public class _6Overriding {

	public static void main(String[] args) {
		/**
		 * 面章节中我们已经学习了 Java 方法的重写，本文我们来看下 Java 方法覆盖的实现。
		 * 
		 * 方法重载与方法覆盖区别如下：
		 * 
		 * 方法重载(Overloading)：如果有两个方法的方法名相同，但参数不一致，哪么可以说一个方法是另一个方法的重载。
		 * 方法覆盖（Overriding）：如果在子类中定义一个方法，其名称、返回类型及参数签名正好与父类中某个方法的名称、返回类型及参数签名相匹配，那么可以说，子类的方法覆盖了父类的方法。
		 * 以下实例演示了 Java 方法覆盖（Overriding）代码的实现：
		 */
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Figure figref;
		figref = f;
		System.out.println("Area is :" + figref.area());
		figref = r;
		System.out.println("Area is :" + figref.area());

		As a1 = new As(10, 10);
		Bs b1 = new Bs(5, 5);
		As as;
		as = a1;
		System.out.println("arg is :" + as.arg());
		as = b1;
		System.out.println("arg is :" + as.arg());
	}
}

class As {
	int id1;
	int id2;

	As(int a, int b) {
		id1 = a;
		id2 = b;
	}

	int arg() {
		System.out.println("As父类");
		return (id1 * id2);
	}
}

class Bs extends As {

	Bs(int a, int b) {
		super(a, b);
	}

	int arg() {
		System.out.println("Bs子类方法覆盖As父类方法");
		return (id1 * id2);
	}
}

class Figure {
	int dim1;
	int dim2;

	Figure(int a, int b) {
		dim1 = a;
		dim2 = b;
	}

	int area() {
		System.out.println("Inside area for figure.");
		return (dim1 * dim2);
	}
}

class Rectangle extends Figure {
	Rectangle(int a, int b) {
		super(a, b);
	}

	int area() {
		System.out.println("Inside area for rectangle.");
		return (dim1 * dim2);
	}
}