package cn.kgc;
//13. 题目如下：
//父类
 class Child {
	public Child(){
    System.out.println("FatherClass Create");
    }
}
//子类
public class cxw_develop_Q13 extends Child{
	public cxw_develop_Q13() {
		System.out.println("ChildClass Create");
	}

	public static void main(String[] args) {
		cxw_develop_Q13 fc = new cxw_develop_Q13();
		Child cc = new Child();
		/**运行结果：
		FatherClass Create
		ChildClass Create
		FatherClass Create*/
	}
}