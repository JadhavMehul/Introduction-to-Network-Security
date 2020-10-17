package pract6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) throws IOException {
        
        Socket cs = new Socket("localhost" ,3000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and g ");
        int n = sc.nextInt();
        int g = sc.nextInt();
        System.out.println("n=" +n);
        System.out.println("g=" +g);
        DataOutputStream out = new DataOutputStream(cs.getOutputStream());
        out.writeInt(n);
        out.writeInt(g);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        int c =(int)Math.pow(g,x);
        int A = c%n;
        System.out.println("the calculated value of A is " +A);
        out.writeInt(A);
        System.out.println("Alice sends the value of a " +A + "to bob");
        DataInputStream in = new DataInputStream(cs.getInputStream());
        int B = in.readInt();
        int a = (int)Math.pow(B, x);
        double K1 = a % n;
        System.out.println("the calculated value for k1 is " +K1);
        System.out.println("performed 719 Mehul Sanjay Jadhav");
    }
}