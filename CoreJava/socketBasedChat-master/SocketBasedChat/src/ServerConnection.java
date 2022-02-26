import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerConnection {
	public  static void main(String args[]) {
		
		//Final means constant
		final ServerSocket serverSocket;
		final Socket clientSocket;
		//BufferedReader read data from the clientSocket
		final BufferedReader in;
		//PrinterWrier write data into the clientSocket
		final PrintWriter out;
		final Scanner scanner = new Scanner(System.in);
		
		try {
			
			int port=5000;
		
		//Constructor of ServerSocket take port no
		//Server will listen to client's request
		serverSocket= new ServerSocket(port);
		//accept() wait for a request from client
		clientSocket = serverSocket.accept();
		//clientSocket is responsible for sending data to client
		out= new PrintWriter(clientSocket.getOutputStream());
		//StreamReader reads in Bytes, hence it is passed to
		//BufferedReader to converted into characters
		in= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		
		Thread sender = new Thread(new Runnable() {
			String message;//Data written by the user
			//Override for every different thread, different threads exist
			@Override
			public void run() {
				while(true) {
					message= scanner.nextLine(); //Reads data
					out.println(message); //Write data  to clientSocket
					out.flush(); //Force send the data
				}
			}
		});
		
		
		sender.start(); //Starts the run() method of the thread
		
		Thread receive = new Thread(new Runnable() {
			String message;
			@Override
			public void run() {
				try {
					//Read data from client
					message=in.readLine();
					//While client connected to the server
					while(message!=null) {
						log("Client:"+message);
						message=in.readLine();
					}
					//If message is null, client is not connected
					log("Client deconnected");
					out.close();
					serverSocket.close();
				}catch(IOException exception) {
					exception.printStackTrace();
				}
			}
		});
		
		receive.start();
		
	} catch(IOException exception) {
		exception.printStackTrace();
	}
	scanner.close();
	}
	
	private static void log(String message) {
		System.out.println(message);
	}
	
}
