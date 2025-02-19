public class StudentMain {
    public static void main(String[] args) {
        Student obj = new Student(1001,"Jay kumar",21);


        Student obj1 = new Student(1001,"Jay kumar",21);
        obj.setAge(22);
        obj.display();
        obj1.display();
    }
}
