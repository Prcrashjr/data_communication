package client;

import java.awt.Button;
import java.io.*;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	static private final int PORT = 9999;
	
	//Main
	public static void main(String[] args) {
		
		//SetUp Loggin Page
		LogginWin loggin = new LogginWin();
		loggin.start();
		
		//If user hits enter, we initialize SERVER_IP
		//final String SERVER_IP = loggin.getTxtIp();
		/////////////////////////////////////////////
		
		System.out.println("Flag");
		loggin.setBtnEnterListener();
		
		System.out.println("Flag2");
	}
}
