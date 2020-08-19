package com.company;
import java.net.*;
import java.io.*;
public class Main {
   static int port = 5000;
   static DataInputStream in;
   static DataOutputStream out;
   static ServerSocket server;
   static Socket socket;

    public static void main(String[] args) throws IOException {
        System.out.println("Server started");
        double userinput = in.readDouble();
        double facit = userinput *2;

        server = new ServerSocket(port);
        socket = server.accept();
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        System.out.println(facit);
        out.writeDouble(facit);
    }
}
