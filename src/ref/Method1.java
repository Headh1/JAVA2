package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initSt(student1,"name1",15,90);

        Student student2 = new Student();
        initSt(student2,"name2",14,80);

        printSt(student1);
        printSt(student2);
    }

    static void printSt (Student student) {
        System.out.println("이름:"+student.name+" 나이:"+student.age+" 성적:"+student.grade);
    }

    static void initSt(Student student, String name , int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
