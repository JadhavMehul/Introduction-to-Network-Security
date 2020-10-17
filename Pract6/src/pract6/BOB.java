package pract6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BOB {
    public static void main(String[] args) throws IOException {
        ServerSocket ss  = new ServerSocket(3000);
        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());
        int n = in.readInt();
        int g = in.readInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        System.out.println("n=" +n);
        System.out.println("g=" +g);
        int d =(int)Math.pow(g, y);
        int B =d%n;
        System.out.println("The calculated value of B is " +B);
        System.out.println("bob sends the value of B " +B+ " to alice");
        int A = in.readInt();
        int b = (int)Math.pow(A,y);
        double K2 = b%n;
        System.out.println("the calculated value of k2 is " +K2);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeInt(B);
        System.out.println("performed 719 Mehul Sanjay Jadhav");
    }
}
