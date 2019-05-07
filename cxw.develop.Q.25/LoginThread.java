package cxw.develop.Q25;

import java.io.*;
import java.net.*;

public class LoginThread extends Thread {
	private Socket socket;

	public LoginThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			PrintWriter out = new PrintWriter(socket.getOutputStream());
			boolean bl = true;
			while (bl) {
				String str = "";
				str = in.readLine();
				System.out.println(str);
				out.write("message:"+str);
				out.println();
				out.flush();
				if (str.equals("exit")) {
					bl = false;
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
