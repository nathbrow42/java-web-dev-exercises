package exercises.Lesson1;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string you want to search for:");
        String search = input.nextLine();
//        System.out.println(sentence.toLowerCase().contains(search.toLowerCase()));
        int index = sentence.toLowerCase().indexOf(search.toLowerCase());
        int length = search.length();
        System.out.println( index + ", " + length);
        System.out.println(sentence.substring(0, index) + sentence.substring(index + length));
    }
}
