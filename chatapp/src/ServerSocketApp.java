import java.net.*;
import java.io.*;

public class ServerSocketApp {
	public static void main(String[] args) {
		try {
			// Create the server socket
			ServerSocket server = new ServerSocket(1212);
			System.out.println("Server is listening on port 1212...");

			while (true) {
				// Accept a client connection
				Socket socket = server.accept();
				System.out.println("Client connected: " + socket.getInetAddress());

				// Create input and output streams
				DataInputStream input = new DataInputStream(socket.getInputStream());
				DataOutputStream output = new DataOutputStream(socket.getOutputStream());

				// Read data from the client
				String message = input.readUTF();
				System.out.println("Received from client: " + message);

				// Send a response back to the client
				String response = "Server received: " + message;
				output.writeUTF(response);
				output.flush();

				// Close the connection with the client
				socket.close();
				System.out.println("Client disconnected.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}