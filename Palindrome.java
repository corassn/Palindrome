import java.util.*;
import java.io.*;

public class Palindrome {
    public static String PalindromeTwo(String str) {
        int l=0;
        int r=str.length()-1;

        str = str.toLowerCase();

        do{
            char CharL = str.charAt(l);
            char CharR = str.charAt(r);

            if(CharL <= 'a' || CharL >= 'z')
                l++;
            else if(CharR <= 'a' || CharR >= 'z')
                r--;
            else if(CharL==CharR){
                l++;
                r--;
            } else
                return "false";



        }while(l<r);


        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeTwo(s.nextLine()));
    }
}
