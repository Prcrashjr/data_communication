package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class Server {

	static private final int PORT = 9999;
	
	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket socket = null;
		DataInputStream  input;
		DataOutputStream output;
		
		try {
			server = new ServerSocket(PORT);
			System.out.println("Initializing server...");
			
			while(true) {
				
				socket = server.accept();
				
				System.out.println("Cliente conectado...");
				input = new DataInputStream(socket.getInputStream());
				output = new DataOutputStream(socket.getOutputStream());
				
				String user = input.readUTF();
				
				System.out.println(user);
				
				Set<String> usernames = new HashSet<String>();
				usernames.add(user);
				
				output.writeUTF("You succesfully connected...!");
				
				socket.close();
				System.out.println("Client disconnected...");
			}
		} catch (IOException e) {
			
			
			
			e.printStackTrace();
		}
		
		

	}

}
