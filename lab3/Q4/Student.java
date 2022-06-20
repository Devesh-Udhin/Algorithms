public class Student {
    private int studentID;
    private String surname;
    private String otherNames;
    private int[] marks = new int[4];

    Student() {}

    Student(int studentID, String surname, String otherNames) {
        this.studentID = studentID;
        this.surname = surname;
        this.otherNames = otherNames;
        for(int i = 0; i < 4; i++) {
            this.marks[i] = 0;
        }
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getOtherNames() {
        return this.otherNames;
    }
    //index -1 so that when user inputs module number 1, this will target index 1-1 = 0 !
    public void setMarks(int marks, int moduleNum) {
            this.marks[moduleNum-1] =  marks;
    }

    public String toString() {
        return surname + " " + otherNames + " " + studentID + "\n" + "marks in module 1 is : " + marks[0] + "\n" + "marks in module 2 is : " + marks[1] + "\n"  + "marks in module 3 is : " + marks[2] + "\n" +  "marks in module 4 is : " + marks[3] + "\n";
    }

}
