package cxw.develop.Q25;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(5000);
			while(true){
				Socket socket = serverSocket.accept();
				LoginThread lt = new LoginThread(socket);
				lt.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
