import com.sun.security.jgss.GSSUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
	public static void main(String[] args) {
		try {
			// Create a socket to connect to the server
			Socket socket = new Socket(InetAddress.getLocalHost(), 1212);
			System.out.println("Connected to server at " + socket.getInetAddress() + ":" + socket.getPort());

			// Create output stream to send data to the server
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			// Create input stream to receive data from the server
			DataInputStream input = new DataInputStream(socket.getInputStream());

			// Send a message to the server
			Scanner sc = new Scanner(System.in);

			String message ;
			message= sc.nextLine();
			output.writeUTF(message);
			output.flush();
			System.out.println("Sent to server: " + message);

			// Read the response from the server
			String response = input.readUTF();
			System.out.println("Received from server: " + response);

			// Close the streams and socket
			output.close();
			input.close();
			socket.close();
			System.out.println("Connection closed.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}