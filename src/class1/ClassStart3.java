package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.Name = "name1";
        student1.Age = 15;
        student1.Grade = 80;

        Student student2 = new Student();
        student2.Name = "name2";
        student2.Age = 14;
        student2.Grade = 70;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:"+student1.Name+"나이:"+student1.Age+"성적:"+student1.Grade);
        System.out.println("이름:"+student2.Name+"나이:"+student2.Age+"성적:"+student2.Grade);

        for(int i = 0; i<students.length; i++) {
            System.out.println("이름:"+students[i].Name+"나이:"+students[i].Age+"성적:"+students[i].Grade);
        }
    }
}
