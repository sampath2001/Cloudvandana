//Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

package Assignment.Java;

import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        String input = "Hi my name is ram.";
        int flag=0;

        input = input.toLowerCase();
        Set<Character> letters = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            if (!letters.contains(c)) {
                flag=1;
                break;
            }
        }

        if(flag==1){
            System.out.println("Not Pangram.");
        }
        else{
            System.out.println("Pangram.");
        }
        
    }
}