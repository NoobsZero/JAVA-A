package cxw.develop.Q25;

import java.io.*;
import java.net.*;

public class LoginClient2 {
	// 客户端2
	public static void main(String[] args) throws IOException{
			Socket socket = new Socket("localhost", 5000);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			BufferedReader out = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter input = new PrintWriter(socket.getOutputStream());

			while (true) {
				String str = out.readLine();
				input.println(str);
				input.flush();
				if (str.equals("exit")) {
					break;
				}
				System.out.println("服务器说：" + in.readLine());
			}
			socket.close();
	}
}
