import java.util.ArrayList;
import java.util.Scanner;

public class Student_main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        ArrayList<Student> studArr = new ArrayList<>();

        Student s0 = new Student(101, "Dave", "johnson");
        s0.setMarks(40, 1);
        s0.setMarks(60, 2);
        s0.setMarks(70, 3);
        s0.setMarks(90, 4);

        Student s2 = new Student(102, "Doven", "dept");
        s2.setMarks(45, 1);
        s2.setMarks(65, 2);
        s2.setMarks(75, 3);
        s2.setMarks(95, 4);


        studArr.add(s0);
        studArr.add(s2);

        System.out.println("Choice 1 : Add a new Student record");
        System.out.println("Choice 2 : Delete a Student record");
        System.out.println("Choice 3 : Display a Student record by he/her ID");
        System.out.println("Choice 4 : Display all Student records");
        System.out.println("Please enter your choice : ");
        choice = input.nextInt();

        switch (choice) {
            case 1 : 
                Student s1 = new Student();
                studArr.add(s1);

                System.out.println("Enter the StudentID");
                s1.setStudentID(input.nextInt());
                input.nextLine();
                System.out.println("Enter Student Surname");
                s1.setSurname(input.nextLine());
                System.out.println("Enter Student othername");
                s1.setOtherNames(input.nextLine());
                for(int i = 0; i < 4; i++) {
                    System.out.println("Enter Student mark for module " + (i+1));
                    s1.setMarks(input.nextInt(), i+1);
                }

                for(int i = 0; i < studArr.size(); i++) {
                    System.out.println(studArr.get(i));
                }

                break;

            case 2 :
                int studID;
                System.out.println("Enter the student ID you want to delete");
                studID = input.nextInt();
                for(int i = 0; i < studArr.size(); i++) {
                    if(studArr.get(i).getStudentID() == studID)
                        studArr.remove(i);
                }

                for(int i = 0; i < studArr.size(); i++) {
                    System.out.println(studArr.get(i));
                }

                break;

            case 3 :
                int studID2;
                System.out.println("Enter the student ID you want to display the details :");
                studID2 = input.nextInt();

                for(int i = 0; i < studArr.size(); i++) {

                    if(studArr.get(i).getStudentID() == studID2) {
                        System.out.println(studArr.get(i));
                    }
                }

                break;

            case 4 :

                for(int i = 0; i < studArr.size(); i++) {
                    System.out.println(studArr.get(i));
                }

                break;
                
        }

        input.close();
    }
}