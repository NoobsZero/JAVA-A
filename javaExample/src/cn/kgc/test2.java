package cn.kgc;

import java.io.IOException;
import java.net.Socket;

public class test2 extends Thread{
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8089);
			Thread thread = new Thread();
			thread.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
