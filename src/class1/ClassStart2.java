package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames ={"학생1","학생2"};
        int[] studentAges = {15,16};
        int[] studentGrades = {90,30};

        System.out.println("이름:"+studentNames[0]+"나이:"+studentAges[0]+"성적:"+studentGrades[0]);
        System.out.println("이름:"+studentNames[1]+"나이:"+studentAges[1]+"성적:"+studentGrades[1]);

        for(int i = 0; i<studentNames.length; i++) {
            System.out.println("이름:"+studentNames[i]+"나이:"+studentAges[i]+"성적:"+studentGrades[i]);
        }
    }
}
