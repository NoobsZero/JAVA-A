package cn.kgc;

import java.util.*;

public class HelloJava {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("课工场欢迎您！"); System.out.println("请输入当前的华氏温度：");
		 * double f = input.nextDouble(); double c = 5 / 9.0 * (f - 32);
		 * System.out.println("当前的摄氏温度是：" + c+"℃");
		 */
	/*	Scanner input = new Scanner(System.in);
		System.out.println("请输入4位会员卡号：");
		int num = input.nextInt();
		int q = num/1000;
		int b = num%1000/100;
		int s = num%100/10;
		int g = num%10;
		System.out.println("千位数："+q+"\t百位数："+b+"\t十位数："+s+"\t个位数："+g);
		*/
		/*final int NUM = 10;
		final double PI = 3.14;
		int r = 2;
		r++;
		double area = PI*r*r;
		System.out.println(area);*/
		
			  
			      
/*			       System.out.println(multiply("99", "99"));
			       
		    
	}
			    public static String multiply(String num1, String num2) {
		         int l = num1.length();
		         int r = num2.length();
			         // 用来存储结果的数组，可以肯定的是两数相乘的结果的长度，肯定不会大于两个数各自长度的和。
			       int[] num = new int[l + r];
		        //记录内循环num开始的角标
		        int x = num.length - 1;
		         //记录外循环num开始的角标
		         int y = num.length - 1;
			         // 第一个数按位循环
		         for (int i = 0; i < l; i++) {
		             y --;
		             // 得到最低位的数字
			             int n1 = num1.charAt(l - 1 - i) - '0';
		            // 保存进位
			             int tmp = 0;
			          // 第二个数按位循环
			            for (int j = 0; j < r; j++) {
			                int n2 = num2.charAt(r - 1 - j) - '0';
			                // 拿出此时的结果数组里存的数+现在计算的结果数+上一个进位数
			                tmp = tmp + num[x] + n1 * n2;
			                // 得到此时结果位的值
			                num[x] = tmp % 10;
			                // 此时的进位
		                 tmp /= 10;
			                 //角标往前移一位
		               x --;
			           }
		            // 第一轮结束后，如果有进位，将其放入到更高位（在内循环中已经减1，此时的角标即为最高位）
		            num[x] = tmp;
			            x = y;
		         }
			 
			         int i = l + r - 1;
			         // 计算最终结果值开头为零的个数
		         int q = 0;
		         while (i > 0 && q <= i && num[q] == 0) {
			            q ++;
		         }
			         //从不为0的下标开始循环
			       String result = "";
		         for (int j = q; j <= i; j++) {
			             result += num[j];
		         }
		         
			        return result;
			        */
		Scanner input = new Scanner(System.in);
		System.out.println("存入金额：");
		int m = input.nextInt();
		double u = m*(1+0.05);
		System.out.println(u);
		     }
			 
			 
	}

