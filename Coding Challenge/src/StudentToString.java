public class StudentToString {
    String name;
    int rollNum;
    int age;

    StudentToString(String name, int rollNum, int age){
        this.name = name;
        this.rollNum = rollNum;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Details : {" +
                "name " + name +
                ", age " + age +
                ". rollNum " + rollNum +
                "}";
    }
    public static void main(String[] args){
        StudentToString stu = new StudentToString("udai", 007, 24);
        System.out.println(stu.toString());
        System.out.println(stu);
    }
}
