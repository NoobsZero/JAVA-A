package com.runoob.javaArray;

import java.util.Arrays;
import java.util.Collections;

public class _4collectionMaxAndMin {
	public static void main(String[]args){
		Integer numbers[] = {8,9,6,7,1,3,5,3,2};
		int min = Collections.min(Arrays.asList(numbers));
		int max = Collections.max(Arrays.asList(numbers));
		System.out.println("最小值："+min);
		System.out.println("最大值："+max);
	}
}
