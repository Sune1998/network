package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static int port = 8000;
    static String host = "172.20.10.3";
    static DataInputStream in;
    static DataOutputStream out;
    static Socket socket;

    public static void main(String[] args) throws IOException {

        System.out.println("Client started");
        Scanner input = new Scanner(System.in);
        System.out.println("enter text");
        String num;
        num = input.nextLine();
       socket = new Socket(host,port);
       in = new DataInputStream(socket.getInputStream());
       out = new DataOutputStream(socket.getOutputStream());
       out.writeUTF(num);
       out.flush();
       System.out.println(in.readUTF());
    }
}
