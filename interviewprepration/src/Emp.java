public class Emp extends Admin{
    String empName;
    void accept1(String empName){
        this.empName = empName;
    }
    void display1(){
        System.out.println(empName);
    }
}
