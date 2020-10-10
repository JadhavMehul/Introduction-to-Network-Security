package pract4;

import java.util.logging.Logger;
import  java.util.logging.Level;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AES_Algorithm {
    public static SecretKey getSecretEncryptionKey() throws Exception{
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(128);
        SecretKey secKey= generator.generateKey();
        return secKey;
    }
    public String encrypt(SecretKey key,String Plaintext)throws Exception{
        byte[] utf8= Plaintext.getBytes("UTF8");
        Cipher ecipher= Cipher.getInstance("AES");
        ecipher.init(Cipher.ENCRYPT_MODE,key);
        byte[] enc= ecipher.doFinal(utf8);
        return new sun.misc.BASE64Encoder().encode(enc);
    }
    public String decrypt(SecretKey key,String Ciphertext) throws Exception{
        byte[] dec= new sun.misc.BASE64Decoder().decodeBuffer(Ciphertext);
        Cipher dcipher= Cipher.getInstance("AES");
        dcipher.init(Cipher.DECRYPT_MODE,key);
        byte[] utf8= dcipher.doFinal(dec);
        return new String(utf8, "UTF8");
    }
    public static void main (String[]args) throws Exception
    {
        try{
            System.out.println("Performed by : 719 Mehul Jadhav");
            System.out.println("Encryption using AES");
            String message="NETWORK SECURITY";
            AES_Algorithm d= new AES_Algorithm();
            SecretKey key= getSecretEncryptionKey();
            String Encrypted= d.encrypt(key, message);
            String decrypted = d.decrypt(key,Encrypted);
            System.out.println("Original string is:" +message);
            System.out.println("Encrypted string is:" + Encrypted);
            System.out.println("Decrypted string is:" +decrypted);
        }
         catch(Exception ex){
            Logger.getLogger(AES_Algorithm.class.getName()).log(Level.SEVERE,null,ex) ;
        }
    }  
}


