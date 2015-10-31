/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SCHOLES
 */
public class Palindromes {
    
    public static void palCheck() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.print("Enter a word/phrase to check if it is a palindrome: ");
        line = br.readLine();
        StringBuilder sb = new StringBuilder();
        char[]c = line.toCharArray();
        
        for(int i =0;i<c.length;i++)
        {
            if(c[i] != ' ')
            {
               sb.append(c[i]);
            }
        }
    
        String normal = sb.toString();
        String reversed = sb.reverse().toString();
        //System.out.println(reversed);
       // System.out.println(normal);
        
        if(normal.equalsIgnoreCase(reversed))
        {
            System.out.println("Is a Palindrome");
        }
        else
            System.out.println("Is not a Palindrome");
        
   
        
       
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       palCheck();
    }
    
}
