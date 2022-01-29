


public class StudentHall {

    private Student[] students;

    public StudentHall(int size) {
        this.students = new Student[size];
    }

    public boolean registerStudent(String name, Double roomLocation, Boolean onPremises) {
        boolean isFull = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new Student(name, roomLocation, onPremises);
                isFull = false;
                return isFull;
            }
        }
        return isFull;
    }

    public void update(String name, Boolean onPremises) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                s.setOnPremises(onPremises);
            }
        }
    }

    public Integer studentsInHall() {
        return students.length;
    }

    public Integer studentsOnFloor(Integer floor) {
        int count = 0;
        for (Student s : students) {
            if (s.getRoomLocation().intValue() == floor) {
                count++;
            }

        }
        return count;
    }

    public void closeFloorForCleaning(int floor) {
        Double i = 0.0;
        for (Student s : students) {
            if (s.getRoomLocation().intValue() == floor) {
                s.setRoomLocation(i);
                i += 0.1;
            }
        }
    }

    public void changeRoom(String name, Double roomLocation) {
        boolean isRoomAvailable = true;
        for (Student s : students) {
            if (s.getRoomLocation().equals(roomLocation)) {
                isRoomAvailable = false;
            }
        }
        if (isRoomAvailable) {
            for (Student s : students) {
                if (s.getName().equals(name)) {
                    s.setRoomLocation(roomLocation);
                }
            }
        }else{
            System.out.println("Room not Available");
        }

    }
    public void fireAlarm(){
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null)
                result =result+"\n-STUDENT"+i+"-\n-------------------\n"+students[i].toString();
            
        }
        return result==""?"Hall is Empty":result;
    }
    
    public String toString(int index) {
        String result = "";
        for (int i = 0; i < students.length; i++) {
            if(i==index){
                if(students[i] == null){
                    result = "No Student Found";
                }
                else{
                    result =result+"\n-STUDENT"+i+"-\n-------------------\n"+students[i].toString();
                }
            }
        }
        return result;
    }
    
    public Integer selectFloorForCleaning(){
        int nim=0;
        int[] floor= new int[students.length];
        int i=0;
        for (Student s : students) {
            floor[i] = s.getRoomLocation().intValue();
            i++;
        }
        return nim;
    }
}
