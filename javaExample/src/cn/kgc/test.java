package cn.kgc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	String interceptStr;
	int interceptByte;

	public test(String str, int bytes) {
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
			test ss = new test(s, 4);
			ss.interceptIt();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}