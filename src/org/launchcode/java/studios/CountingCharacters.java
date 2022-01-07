package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = input.nextLine();

        str = str.toLowerCase();

        char[] charArr = str.toCharArray();
        HashMap<Character, Integer> charHash = new HashMap<>();

        for (int i = 0; i < charArr.length; i++) {
            if (!charHash.containsKey(charArr[i])) {
                charHash.put(charArr[i], 1);
            } else {
                charHash.put(charArr[i], charHash.get(charArr[i]) + 1);
            }
        }
        for (Map.Entry<Character, Integer> x : charHash.entrySet()) {
            System.out.println(x.getKey() + ": " + x.getValue());
        }
    }
}
