/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc451finalassignment;

/**
 *
 * @author Hector Felix
 */
public class CSC451FinalAssignment {

    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
            result.append(ch);
        }
        return result;
    }

//        public static StringBuffer decrypt(String text, int s) { 
//        StringBuffer result = new StringBuffer();
//
//        for (int i = 0; i < text.length(); i++) {
//            char ch = (char) (((int) text.charAt(i) - s - 65) % 26 + 65);
//            result.append(ch);
//        }
//        return result;
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "CLYFZLJBYL";
        
        //Code used to Brute Force decrypt message until VERYSECURE
        //was revealed
        
//        for (int i = 0; i < 26; i++) {
//            System.out.println("Encrypted Message: " + text);
//            System.out.println("Decrypted Message: " + encrypt(text, i));
//            System.out.println("Shift : " + i);
//            System.out.println("Key is : " + (26 - i)+'\n');
//        }
        int s = 19;
        System.out.println("Encrypted Message: " + text);
        System.out.println("Decrypted Message: " + encrypt(text, s));
        System.out.println("Shift : " + s);
        System.out.println("Key is : " + (26 - s));
    }
}
