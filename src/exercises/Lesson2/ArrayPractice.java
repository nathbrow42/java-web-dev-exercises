package exercises.Lesson2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8};
        String words = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a " +
                "house. I will not eat them with a mouse.";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }
        }

        String[] wordArr = words.split(" ");
        System.out.println(Arrays.toString(wordArr));

        String[] wordArr2 = words.split("\\.");
        System.out.println(Arrays.toString(wordArr2));
    }
}
