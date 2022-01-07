package exercises.Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static Integer findSumOfEvens(ArrayList<Integer> arr) {
        Integer sum = 0;
        for (Integer num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printWords(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of letters:");
        Integer numOfLetters = input.nextInt();
        for (String word : words) {
            if (word.length() == numOfLetters) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        System.out.println(findSumOfEvens(nums));

        ArrayList<String> words = new ArrayList<>();
        words.add("Nathalie");
        words.add("Hello");
        words.add("Luck");

        printWords(words);

    }
}
