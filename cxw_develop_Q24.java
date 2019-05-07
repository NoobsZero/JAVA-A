package cn.kgc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，应该输出为“我ABC”而不是“我ABC+汉的半个”
public class cxw_develop_Q24 {
	String interceptStr;
	int interceptByte;

	public cxw_develop_Q24(String str, int bytes) {
		interceptStr = str;
		interceptByte = bytes;
		System.out.println("字符串为：'" + interceptStr + "';字节数为：" + interceptByte);
	}

	public void interceptIt() {
		int interceptCount;
		interceptCount = (interceptStr.length() % interceptByte == 0) ? (interceptStr.length() / interceptByte)
				: (interceptStr.length() / (interceptByte + 1));
		System.out.println("截取后的字符是：" + interceptCount);
		for (int i = 1; i <= interceptCount; i++) {
			if (i == interceptCount) {
				System.out.println(interceptStr.substring((i - 1) * interceptByte, interceptStr.length()));
			} else {
				System.out.println(interceptStr.substring((i - 1) * interceptByte, (i * interceptByte)));
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "";
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		try {
			s = in.readLine();
			cxw_develop_Q24 ss = new cxw_develop_Q24(s, 4);
			ss.interceptIt();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}