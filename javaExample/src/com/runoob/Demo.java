package com.runoob;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Demo {

	public static void main(String[] args) {
		// Java 字符串
		/**
		 * 1、compareTo()
		 * 方法的实现思路：两个字符数组依次从前开始比较，如果对象位置出现字符不同则返回两个字符的编码之差，后面的字符不再比较；如果两个字符数组的长度不一样，并且较短的数组和较长数组所有对应位置的字符都相同，则返回两个数组的长度之差。
		 */
		/*
		 * String str = "Hello World"; String anotherString = "hello world";
		 * Object objStr = str;
		 * 
		 * System.out.println(str.compareTo(anotherString));
		 * System.out.println(str.compareToIgnoreCase(anotherString));
		 * System.out.println(str.compareTo(objStr.toString()));
		 */

		/**
		 * 2、通过字符串函数 从后往前查 lastIndexOf()和 从前往后查 IndexOf() 来查找子字符串在 str 出现的位置：
		 */
		/*
		 * String str = "Hello World"; Scanner input = new Scanner(System.in);
		 * System.out.println("请输入查询的子字符："); String strName = input.next(); int
		 * index = str.lastIndexOf(strName); int index1 = str.indexOf(strName);
		 * if(index==-1){ System.out.println("没有找到字符串："+strName); }else {
		 * System.out.println("第一个子字符串所在的位置："+(index1+1)+"\n最后一个子字符串所在的位置："+(
		 * index+1)); }
		 */

		/** 3、通过字符串函数 substring() 函数来截取字符串中的一个字符 */
		/*
		 * String str = "this is Java"; String s=str; int pos=5;
		 * System.out.println(s.substring(0,pos)+s.substring(pos+1));
		 */

		/** 4、使用 java String 类的 replace 方法来替换字符串中的字符 */
		/*
		 * String str = "Hello Hello"; System.out.println(str.replace('H',
		 * 'W')); System.out.println(str.replaceFirst("He", "Wa"));
		 * System.out.println(str.replaceAll("He", "Ha"));
		 */

		/** 5、使用 Java 的反转函数 reverse() 将字符串反转 */
		/*
		 * String string = "小程序"; String reverse = new
		 * StringBuffer(string).reverse().toString();
		 * System.out.println("字符串反转前："+string);
		 * System.out.println("字符串反转后："+reverse);
		 */

		/**
		 * 6、使用了 split(string) 或 调用StringTokenizer 方法通过指定分隔符将字符串分割为数组
		 * StringTokenizer分割原理是：只要有字符e和l的地方都进行切割，而split是只在字符串el的地方切割。
		 */
		/*
		 * String str = "www.runoob.com"; String[] temp; String delimeter =
		 * "\\."; temp = str.split(delimeter); for(String x : temp){
		 * System.out.println(x); }
		 */

		/*
		 * String str = "www.runoob.con"; StringTokenizer str2 = new
		 * StringTokenizer(str,"."); while(str2.hasMoreTokens()){
		 * System.out.println(str2.nextToken()); }
		 */

		/** 7、使用了 String toUpperCase()和 toLowerCase() 方法将字符串进行大小写转换 */
		/*
		 * String str = "toUpperCase"; String strUpper = str.toUpperCase();
		 * String strLower = str.toLowerCase();
		 * System.out.println("原始字符串："+str);
		 * System.out.println("转换为大写："+strUpper);
		 * System.out.println("转换为小写："+strLower);
		 */

		/** 8、使用了 regionMatches() 方法测试两个字符串区域是否相等 */
		/*
		 * String first_str = "regionMatches"; String second_str = "matches";
		 * boolean match1 = first_str.regionMatches(6, second_str, 0, 6);
		 * boolean match2 = first_str.regionMatches(true, 6, second_str, 0,
		 * 6);//true忽略大小写 System.out.println(match1);
		 * System.out.println(match2);
		 */

		/** 9、两种方式创建字符串，并通过System.currentTimeMillis()方法测试其性能 */
		/*
		 * long startTime = System.currentTimeMillis(); for(int
		 * i=0;i<500000000;i++){ String s1 = "hello"; String s2 = "hello";
		 * String s3 = "hello"; } long endTime = System.currentTimeMillis();
		 * long startTime1 = System.currentTimeMillis(); for(int
		 * i=0;i<500000000;i++){ String s4 = new String("hello"); String s5 =
		 * new String("hello"); String s6 = new String("hello"); } long endTime1
		 * = System.currentTimeMillis(); SimpleDateFormat formatter = new
		 * SimpleDateFormat("yyyy年-MM月-dd日-HH小时mm分ss秒SSS毫秒");//日期格式化类 Date
		 * startDate = new Date(startTime); Date endDate = new Date(endTime1);
		 * System.out.println("字符串性能比较测试开始时间："+formatter.format(startDate));
		 * System.out.println("通过String关键词创建字符串："+(endTime - startTime)+"毫秒");
		 * System.out.println("通过String关键词创建字符串："+(endTime1 - startTime1)+"毫秒");
		 * System.out.println("字符串性能比较测试结束时间："+formatter.format(endDate));
		 */

		/** 10、通过两种方式创建字符串（intern()方法优化，但效率低），并测试其性能 */
		/*
		 * String variables[] = new String[50000]; for( int i=0;i <50000;i++){
		 * variables[i] = "s"+i; } long startTime0 = System.currentTimeMillis();
		 * for(int i=0;i<50000;i++){ variables[i] = "hello"; } long endTime0 =
		 * System.currentTimeMillis(); System.out.println("直接使用字符串： "+ (endTime0
		 * - startTime0) + " ms" ); long startTime1 =
		 * System.currentTimeMillis(); for(int i=0;i<50000;i++){ variables[i] =
		 * new String("hello"); } long endTime1 = System.currentTimeMillis();
		 * System.out.println("使用 new 关键字：" + (endTime1 - startTime1) + " ms");
		 * long startTime2 = System.currentTimeMillis(); for(int
		 * i=0;i<50000;i++){ variables[i] = new String("hello").intern(); } long
		 * endTime2 = System.currentTimeMillis();
		 * System.out.println("使用字符串对象的 intern() 方法: " + (endTime2 - startTime2)
		 * + " ms");
		 */

		/** 11、通过 format() 方法来格式化字符串，还可以指定地区来格式化 */
		/*
		 * double e = Math.E; System.out.format("%f%n", e);
		 * System.out.format(Locale.CHINA, "%-100.4f%n", e);
		 * System.out.format("%s%n", e);
		 */

		/** 12、通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能 */
		/*
		 * long startTime = System.currentTimeMillis(); for (int i = 0; i <
		 * 5000; i++) { String result = "this is" + "testing the" + "difference"
		 * + "between" + "String" + "and" + "StringBuffer"; } long endTime =
		 * System.currentTimeMillis(); System.out.println("字符串连接" + "-使用+操作符：" +
		 * (endTime - startTime) + "ms");
		 * 
		 * long startTime1 = System.currentTimeMillis(); for(int i = 0; i <
		 * 5000; i++){ StringBuffer result = new StringBuffer();
		 * result.append("this is"); result.append("testing the");
		 * result.append("difference"); result.append("between");
		 * result.append("String"); result.append("and");
		 * result.append("StringBuffer");
		 * 
		 * } long endTime1 = System.currentTimeMillis();
		 * System.out.println("字符串连接"+"使用StringBuffer():"+(endTime1-startTime1)+
		 * "ms");
		 */
		// Java 数组
		/** 1、使用sort()方法对Java数组进行排序，及如何使用 binarySearch() 方法来查找数组中的元素 */
		/*
		 * int array[] = new int[7]; Scanner input = new Scanner(System.in); for
		 * (int i = 0; i < array.length; i++) {
		 * System.out.println("请输入第"+(i+1)+"个正整数："); array[i] = input.nextInt();
		 * } Arrays.sort(array); System.out.print("数组排序结果为[" + array.length +
		 * "]:"); for (int i = 0; i < array.length; i++) { if (i != 0) {
		 * System.out.print(", "); } System.out.print(array[i]); } int index =
		 * Arrays.binarySearch(array, 5);// 二分查找 System.out.println("\n元素5在第" +
		 * (index + 1) + "个位置");
		 */
		/** 2、定义了 printArray() 方法通过循环输出数组来打印数组 */
		/*
		 * private static void printArray(String message, int array[]) {
		 * System.out.println(message + ": [length: " + array.length + "]"); for
		 * (int i = 0; i < array.length; i++) { if (i != 0) {
		 * System.out.print(", "); } System.out.print(array[i]); }
		 * System.out.println();
		 */

		/** 3、向数组插入元素,使用System.arraycope()数组复制,使用数组的属性 length 来获取数组的长度 */
		/*
		 * Scanner input = new Scanner(System.in); int array[] = { 5, 6, 7, -5,
		 * -6, -7, 9, 6 }; Arrays.sort(array); printArray("数组排序后结果为", array);
		 * System.out.println("输入插入的元素："); int num = input.nextInt(); int index
		 * = Arrays.binarySearch(array, num); if (index >= 0) {
		 * System.out.println("元素" + num + "存在，所在位置：" + (index + 1)); } else {
		 * int newIndex = -index - 1; array = insertElement(array, num,
		 * newIndex); printArray("添加元素"+num+"成功！", array);
		 * System.out.println("元素"+num+"所在位置："+(-index)); }
		 * 
		 * } //printArray()静态方法，遍历输出数组 public static void printArray(String
		 * message, int array[]) { System.out.println(message + ":[length:" +
		 * array.length + "]"); for (int i = 0; i < array.length; i++) { if (i
		 * != 0) { System.out.print(", "); } System.out.print(array[i]); }
		 * System.out.println(); } //insertElement()静态方法，添加新元素 public static int
		 * [] insertElement(int original[], int element, int index) { int length
		 * = original.length; int destination[] = new int[(length + 1)];
		 * System.arraycopy(original, 0, destination, 0, index);
		 * destination[index] = element; System.arraycopy(original, index,
		 * destination, index+1, (length - index)); return destination;
		 */

		/** 4、使用 Collections.reverse(ArrayList) 将集合进行反转 */
		/*
		 * ArrayList<String> list = new ArrayList<String>(); list.add("A");
		 * list.add("B"); list.add("C"); list.add("D"); list.add("E");
		 * System.out.println("反转前："+list); Collections.reverse(list);
		 * System.out.println("反转后："+list);
		 */

		/**
		 * 5、通过 Collections 类的 Collections.max() 和 Collections.min()
		 * 方法来查找数组中的最大和最小值
		 */
		/*
		 * Integer[] numbers = {8,2,7,1,3,4,6,9}; int min =
		 * Collections.min(Arrays.asList(numbers)); int max =
		 * Collections.max(Arrays.asList(numbers));
		 * System.out.println("最小值："+min); System.out.println("最大值："+max);
		 */

		/**
		 * 6、通过 List 类的 Arrays.toString () 方法和 List 类的
		 * list.Addall(array1.asList(array2) 方法将两个数组合并为一个数组
		 */
		/*
		 * String a[] = {"A","B","C","D"}; String b[] = {"E","F","G"};
		 * List<String> list = new ArrayList<String>(Arrays.asList(a));
		 * list.addAll(Arrays.asList(b)); Object c[] = list.toArray();
		 * System.out.println(Arrays.toString(c));
		 */

		/**
		 * 7、通过 Java Util 类的 Arrays.fill(arrayname,value)
		 * 方法和Arrays.fill(arrayname ,starting index ,ending index ,value)
		 * 方法向数组中填充元素
		 */
		/*
		 * int a[] = new int[6]; Arrays.fill(a, 100); for (int i = 0; i <
		 * a.length; i++) { System.out.println(a[i]); } System.out.println();
		 * Arrays.fill(a, 2, 6, 50); for (int i = 0; i < a.length; i++) {
		 * System.out.println(a[i]); }
		 */

		/** 8、如何在数组初始化后对数组进行扩容 */
		/*
		 * int a[] = { 5, 6, 7, 8 }; int b[] = new int[7]; b[4] = 9; b[5] = 10;
		 * b[6] = 11; System.arraycopy(a, 0, b, 0, a.length); for (int i = 0; i
		 * < b.length; i++) { System.out.println(b[i]); }
		 */

		/** 9、查找数组中的重复元素 */
		/*
		 * int numbers[] = { 1, 2, 1, 5, 5, 10, 2 }; duplicate(numbers); }
		 * 
		 * public static void duplicate(int[] s) { for (int i = 0; i < s.length;
		 * i++) { for (int k = i + 1; k < s.length; k++) { if (s[i] == s[k]) {
		 * System.out.println("数组内元素:" + s[i] + "重复！"); } } }
		 */

		/** 10、使用 remove () 方法来删除数组元素 */
		/*
		 * ArrayList<String> list = new ArrayList<String>(); list.clear();
		 * list.add(0, "第0个元素"); list.add(1, "第1个元素"); list.add(2, "第2个元素");
		 * list.add(3, "第3个元素"); System.out.println("数组删除前："+list);
		 * list.remove(0); list.remove("第1个元素");
		 * System.out.println("数组删除后："+list);
		 */

		/** 11、使用 removeAll () 方法来计算两个数组的差集 */
		/*
		 * ArrayList<String> objArray1 = new ArrayList<String>();
		 * ArrayList<String> objArray2 = new ArrayList<String>();
		 * objArray1.add(0, "0"); objArray1.add(1, "1"); objArray1.add(2, "2");
		 * objArray1.add(3, "6");
		 * System.out.println("objArray1数组元素："+objArray1); objArray2.add(0,
		 * "0"); objArray2.add(1, "1"); objArray2.add(2, "2"); objArray2.add(3,
		 * "3"); objArray2.add(4, "4");
		 * System.out.println("objArray2数组元素："+objArray2);
		 * objArray1.removeAll(objArray2);//移除所有
		 * System.out.println("objArray1和objArray2数组差集为："+objArray1);
		 */

		/** 12、使用 retainAll () 方法来计算两个数组的交集 */
		/*
		 * ArrayList<String> objArray1 = new ArrayList<String>();
		 * ArrayList<String> objArray2 = new ArrayList<String>();
		 * objArray1.add(0, "0"); objArray1.add(1, "1"); objArray1.add(2, "2");
		 * objArray1.add(3, "6");
		 * System.out.println("objArray1数组元素："+objArray1); objArray2.add(0,
		 * "0"); objArray2.add(1, "1"); objArray2.add(2, "2"); objArray2.add(3,
		 * "3"); objArray2.add(4, "4");
		 * System.out.println("objArray2数组元素："+objArray2);
		 * objArray1.retainAll(objArray2);//取交集
		 * System.out.println("objArray1&objArray2数组差集为："+objArray1);
		 */

		/** 13、使用 contains () 方法来查找数组中的指定元素 */
		/*
		 * ArrayList<String> objArray1 = new ArrayList<String>();
		 * ArrayList<String> objArray2 = new ArrayList<String>();
		 * objArray1.add(0, "0"); objArray1.add(1, "1"); objArray1.add(2, "2");
		 * System.out.println("objArray1数组元素：" + objArray1); objArray2.add(0,
		 * "0"); objArray2.add(1, "1"); objArray2.add(2, "2"); objArray2.add(3,
		 * "3"); objArray2.add(4, "4"); System.out.println("objArray2数组元素：" +
		 * objArray2);
		 * System.out.println("objArray1数组中是否包含元素"+objArray1.get(0)+":"+
		 * objArray1.contains("0"));//此集合包含指定元素
		 * System.out.println("objArray2数组是否包含objArray1数组：" +
		 * objArray2.containsAll(objArray1));//此集合包含指定 集合中的所有元素
		 */

		/** 14、使用 equals ()方法来判断数组是否相等 */
		/*
		 * int[] ary = { 1, 2, 3, 4, 5, 6 }; int[] ary1 = { 1, 2, 3, 4, 5, 6 };
		 * int[] ary2 = { 1, 2, 3, 4 };
		 * System.out.println("数组 ary 是否与数组 ary1相等? ：" + Arrays.equals(ary,
		 * ary1)); System.out.println("数组 ary 是否与数组 ary2相等? ：" +
		 * Arrays.equals(ary, ary2)); System.out.println(ary == ary1);
		 * System.out.println(ary == ary2);
		 */

		/** 15、计算两个数组的并集 */
		/*
		 * String str1[] = { "1", "2", "3", "4" }; String str2[] = { "4", "5",
		 * "6", "7" }; String[] union = union(str1, str2);
		 * System.out.println("并集的结果："); for (String str : union) {
		 * 
		 * System.out.println(str); } }
		 * 
		 * public static String[] union(String[] str1, String[] str2) {
		 * Set<String> set = new HashSet<String>(); for (String str : str1) {
		 * set.add(str); } for (String str : str2) { set.add(str); } String[]
		 * result = {}; return set.toArray(result);
		 */

		// Java时间处理
		/** 1、使用 SimpleDateFormat 类的 format(date) 方法来格式化时间,并且输出当前时间 */
		/*
		 * Date date = new Date(); SimpleDateFormat formater = new
		 * SimpleDateFormat("yyyy年-MM月-dd日-HH小时mm分ss秒SSS毫秒");
		 * System.out.println(formater.format(date));
		 */

		/** 使用 Calendar 类来输出年份、月份等 */
		/*
		 * Calendar cal = Calendar.getInstance(); int day =
		 * cal.get(Calendar.DATE); int month = cal.get(Calendar.MONTH) + 1; int
		 * year = cal.get(Calendar.YEAR); int mon =
		 * cal.get(Calendar.DAY_OF_MONTH); int week =
		 * cal.get(Calendar.DAY_OF_WEEK); int yea =
		 * cal.get(Calendar.DAY_OF_YEAR); System.out.println(year + "年" + month
		 * + "月" + day + "日"); System.out.println("今天是这周中的第" + week + "天");
		 * System.out.println("今天是这月中的第" + mon + "天");
		 * System.out.println("今天是这年中的第" + yea + "天");
		 */

		/**
		 * 使用 SimpleDateFormat 类的 format() 方法将时间戳转换成时间。
		 * 
		 * 日期和时间模式(注意大小写，代表的含义是不同的)：
		 * 
		 * yyyy：年 MM：月 dd：日 hh：1~12小时制(1-12) HH：24小时制(0-23) mm：分 ss：秒 S：毫秒 E：星期几
		 * D：一年中的第几天 F：一月中的第几个星期(会把这个月总共过的天数除以7) w：一年中的第几个星期
		 * W：一月中的第几星期(会根据实际情况来算) a：上下午标识 k：和HH差不多，表示一天24小时制(1-24)
		 * K：和hh差不多，表示一天12小时制(0-11) z：表示时区
		 */
		/*long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat formater = new SimpleDateFormat("yyyy年-MM月-dd日HH时mm分ss秒");
		String date = formater.format(new Date(time));
		String date2 = formater.format(Long.valueOf(time));
		String date1 = formater.format(new Date(Long.parseLong(String.valueOf(time))));
		System.out.println(date);
		System.out.println(date1);
		System.out.println(date2);*/
		
		 
	}
}
