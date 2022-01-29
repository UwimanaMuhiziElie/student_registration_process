
import java.util.Scanner;


public class StudentHallTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("specify the number of students (size) to be registered in a Student Hall :");
        int size = sc.nextInt();
        StudentHall hall = new StudentHall(size);
        while (true) {            
           System.out.println("Type your Fullname :");
            String name = sc.next();
            System.out.println("Type your Floor and room format (12.4)  :");
            Double roomLocation = sc.nextDouble();
            System.out.println("Specify if your are in onPremises");
            Boolean onPremises = sc.nextBoolean();
            boolean isfull =hall.registerStudent(name, roomLocation, onPremises);
            if(isfull){
                break;
            }
        }
        
        System.out.println(hall.toString());
        System.out.println("Type your Fullname :");
        String name1 = sc.next();
        System.out.println("Type your new Premises");
        Boolean onPremises = sc.nextBoolean();
        hall.update(name1, onPremises);
        System.out.println(hall.toString());
        System.out.println("Number of Student in the Hall");
        System.out.println(hall.studentsInHall());
        
        System.out.println("Students on the Floor");
        System.out.println("Enter Floor Number");
        int floor = sc.nextInt();
        System.out.println(hall.studentsOnFloor(floor));
        
        System.out.println(hall.toString());
        
        System.out.println("Change room");
        
        System.out.println("Type your Fullname :");
        String name2 = sc.next();
        
        System.out.println("Enter new room Location");
        Double room = sc.nextDouble();
        hall.changeRoom(name2, room);
        
        System.out.println(hall.toString());
        System.out.println("Fire alarm ");
        hall.fireAlarm();
        System.out.println(hall.toString());
    }
}
