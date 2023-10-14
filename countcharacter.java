/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitora;


public class Mitora {
    public static void main(String[] args) {    
        String string = "The best of both worlds";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
    }    
}     
    
    

