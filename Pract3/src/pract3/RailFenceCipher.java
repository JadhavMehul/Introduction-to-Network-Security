
package pract3;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RailFenceCipher {

    String Encrypytion(String plainText,int depth) throws Exception{
        int r=depth, len = plainText.length();
        int c= len/depth;
        char mat[][] = new char[r][c];
        int k=0;
        
        String cipherText="";
        
        for(int i=0 ; i < c ; i++) {
            for (int j=0; j<r; j++) {
                if(k!=len) {
                    mat[j][i] = plainText.charAt(k++);
                }
            }
        }
        for(int i=0 ;i<r ;i++) {
            for (int j=0; j<c; j++){
                cipherText += mat[i][j];                
            }
        }
        return cipherText ;
    }
    String Decryption(String cipherText,int depth)throws Exception{
        int r=depth,len=cipherText.length();
        int c=len/depth;
        char mat[][]=new char[r][c];
        int k=0;
        String plainText="";
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                mat[i][j] =cipherText.charAt(k++);
            }
        }
        for (int i=0; i<c ;i++){
            for(int j=0;j<r;j++){
                plainText += mat[j][i];
                
            }
        }
        return plainText ;
    }
        
    public static void main(String[] args) {
        try {
        System.out.println("Performed by 719 Mehul Jadhav");
        RailFenceCipher rf = new RailFenceCipher ();
        Scanner scn = new Scanner(System.in);
        int depth;
        String plainText,cipherText,decryptedText;
        System.out.println("Enter Plain Text");
        plainText=scn.nextLine();
        System.out.println("Enter depth for Encryption:");
        depth=scn.nextInt();
        while(plainText.length()%depth!=0){
            plainText+='X';
        }
        cipherText=rf.Encrypytion(plainText, depth);
        System.out.println("Encrypted text is:\n" + cipherText);
        decryptedText=rf.Decryption(cipherText, depth);
        decryptedText=decryptedText.replace("X","");
        System.out.println("Decrypted text is :\n"+decryptedText);
        }
        catch (Exception ex){
            Logger.getLogger(RailFenceCipher.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
}
