package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static int port = 5000;
    static String host = "localhost";
    static DataInputStream in;
    static DataOutputStream out;
    static Socket socket;

    public static void main(String[] args) throws IOException {

        System.out.println("Client started");
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        double num;
        num = input.nextDouble();
       socket = new Socket(host,port);
       in = new DataInputStream(socket.getInputStream());
       out = new DataOutputStream(socket.getOutputStream());
       out.writeDouble(num);
        System.out.println(in.readDouble());
    }
}
