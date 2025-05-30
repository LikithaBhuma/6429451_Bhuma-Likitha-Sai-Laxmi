package Projects;
import java.io.*;
import java.net.*;
public class TCPChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server is listening on port 1234...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;
            while ((message = input.readLine()) != null) {
                System.out.println("Client: " + message);
                System.out.print("Reply: ");
                output.println(userInput.readLine());
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
