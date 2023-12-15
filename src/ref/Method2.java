package ref;

public class Method2 {
    public static void main(String[] args) {

        Student student1 = createSt("name1",15,90);

        Student student2 = createSt("name2",14,80);

        printSt(student1);
        printSt(student2);
    }

    static void printSt (Student student) {
        System.out.println("이름:"+student.name+" 나이:"+student.age+" 성적:"+student.grade);
    }

    static Student createSt(String name , int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }
}
