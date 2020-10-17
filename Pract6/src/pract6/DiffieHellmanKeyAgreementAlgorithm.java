package pract6;

import java.util.*;

public class DiffieHellmanKeyAgreementAlgorithm {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter modulo(p)");
        int p=sc.nextInt();
        System.out.println("Enter primitive root of "+p);
        int g=sc.nextInt();
        System.out.println("Choose 1st key secret");
        int a=sc.nextInt();
        System.out.println("Choose 2nd key secret");
        int b=sc.nextInt();
        sc.close();
        int A = (int)Math.pow(g,a)%p;
        int B = (int)Math.pow(g,b)%p;

        int S_A = (int)Math.pow(B,a)%p;
        int S_B =(int)Math.pow(A,b)%p; 

        if(S_A==S_B)
        {
        System.out.println("key1 and key2 matches they can communicate with each other!!!");
        System.out.println("They share a secret no = "+S_A); 
        System.out.println("Performed by 719 Mehul Sanjay Jadhav");
        }

        else
        {
        System.out.println("key1 and key2 matches they cannot communicate with each other!!!");
        System.out.println("Performed by 719 Mehul Sanjay Jadhav");
        }

    }
    
}
