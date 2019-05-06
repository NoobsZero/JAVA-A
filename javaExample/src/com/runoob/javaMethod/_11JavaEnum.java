package com.runoob.javaMethod;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

enum Week {
	Monday("今天星期一"), Tuesday("今天星期二"), Wednesday("今天星期三"), Thursday("今天星期四"), Friday("今天星期五"), Saturday(
			"今天星期六"), Sunday("今天星期日");
	private String i;

	Week(String i) {
		this.i = i;
	}

	public String getI() {
		return i;
	}
}

/**
 * Java 创建枚举类型要使用 enum 关键字，隐含了所创建的类型都是 java.lang.Enum 类的子类
 * 
 * 对enum进行遍历和switch的操作示例代码：
 */
public class _11JavaEnum {

	public static void main(String[] args) {
		System.out.println("输出枚举Week中所有的值：");
		for(Week c : Week.values()){
			System.out.println(c+":"+c.getI());
		}
		SimpleDateFormat formater = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		String date = formater.format(new Date());
		System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		int s = calendar.get(calendar.DAY_OF_WEEK) - 1;
		switch (s) {
		case 1:
			System.out.println(Week.Monday.getI());
			break;
		case 2:
			System.out.println(Week.Tuesday.getI());
			break;
		case 3:
			System.out.println(Week.Wednesday.getI());
			break;
		case 4:
			System.out.println(Week.Thursday.getI());
			break;
		case 5:
			System.out.println(Week.Friday.getI());
			break;
		case 6:
			System.out.println(Week.Saturday.getI());
			break;
		case 7:
			System.out.println(Week.Sunday.getI());
			break;
		default:
			System.out.println("没有该类型！");
			break;
		}
	}
}
