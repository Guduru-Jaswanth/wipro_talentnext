package Abstarction;import java.util.Scanner;

//Custom Exception for Negative Values
class NegativeValueException extends Exception {
 public NegativeValueException(String message) {
     super(message);
 }
}

//Custom Exception for Out-of-Range Values
class OutOfRangeException extends Exception {
 public OutOfRangeException(String message) {
     super(message);
 }
}

public class StudentMarks {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int numStudents = 2;

     for (int i = 1; i <= numStudents; i++) {
         try {
             System.out.println("Enter name of student " + i);
             String name = sc.nextLine();

             int[] marks = new int[3];
             for (int j = 0; j < 3; j++) {
                 System.out.println("Enter mark for subject " + (j + 1));
                 String input = sc.nextLine();

                 int mark = Integer.parseInt(input); // may throw NumberFormatException

                 if (mark < 0)
                     throw new NegativeValueException("Negative marks not allowed");

                 if (mark > 100)
                     throw new OutOfRangeException("Marks cannot exceed 100");

                 marks[j] = mark;
             }

             int average = (marks[0] + marks[1] + marks[2]) / 3;
             System.out.println("Average marks for " + name + ": " + average);

         } catch (NumberFormatException e) {
             System.out.println("NumberFormatException: Please enter valid integer marks");
             i--; // Retry for the same student
         } catch (NegativeValueException | OutOfRangeException e) {
             System.out.println(e.getMessage());
             i--; // Retry for the same student
         }
     }
 }
}
