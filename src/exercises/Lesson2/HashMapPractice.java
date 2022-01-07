package exercises.Lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Double, String> studentIDs = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Double newID;

        System.out.println("Enter the new student ID (or 0 to finish):");

        do {
            System.out.println("Student ID: ");
            newID = input.nextDouble();

            if (!newID.equals(0)) {
                System.out.println("Student name: ");
                String newName = input.nextLine();
                studentIDs.put(newID, newName);
            }
        } while (!newID.equals(0));

        System.out.println("Class Roster:");

        for (Map.Entry<Double, String> student : studentIDs.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }

    }
}
