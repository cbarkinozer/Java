import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientConnection {
    public static void main(String[] args){
    	
        //Most of the code is same as ServerConnection
    	//Check comments on there
    	
    	final Socket clientSocket; // socket used by client to send and recieve data from server
        final BufferedReader in;   // For reading data from socket
        final PrintWriter out;     // For writing data into socket
        final Scanner scanner = new Scanner(System.in);
        
        
        try {
        	String host="127.0.0.1";
        	int port=5000;
        	try {
        		System.out.println("Enter IP address[default:127.0.0.1]:");
            	host=scanner.nextLine();
            	System.out.println("Enter port number[default:5000]:");
            	port=scanner.nextInt();
        		
        	}catch(Exception exception) {
        		exception.printStackTrace();
        	}
        	
        	
        	//Parameters are host(IP address[local host because we are using on the same pc])
        	//And port (port number is defined by the ServerConnection)
            clientSocket = new Socket(host,port);
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            Thread sender = new Thread(new Runnable() {
                String message;
                @Override
                public void run() {
                    while(true){
                        message = scanner.nextLine();
                        out.println(message);
                        out.flush();
                    }
                }
            });
            
            sender.start();
            
            Thread receiver = new Thread(new Runnable() {
                String message;
                @Override
                public void run() {
                    try {
                        message = in.readLine();
                        while(message!=null){
                            log("Server : "+message);
                            message = in.readLine();
                        }
                        log("Server out of service");
                        out.close();
                        clientSocket.close();
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
            });
            receiver.start();
    }catch (IOException exception){
        exception.printStackTrace();
        }
    scanner.close();
    }
    
    private static void log(String message) {
		System.out.println(message);
	}
    
}