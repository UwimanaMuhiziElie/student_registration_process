
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your Fullname : ");
        String name = sc.nextLine();
        System.out.println("Type your Floor and room format (12.4)  : ");
        Double roomLocation = sc.nextDouble();
        System.out.println("Specify if your are in onPremises . true/false");
        Boolean onPremises = sc.nextBoolean();
        Student s = new Student(name, roomLocation, onPremises);
        System.out.println(s.toString());
        System.out.println("Exiting Student in the hall\n------------------------------");
        s.exitHall();
        System.out.println(s.toString());
        System.out.println("Student Entering in the hall\n--------------------------------");
        s.enterHall();
        System.out.println(s.toString());
    }
}
