public class Student {
    private int rno;
    private String name;
    private int age;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Student(int rno, String name, int age) {
        this.rno = rno;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Rno: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
