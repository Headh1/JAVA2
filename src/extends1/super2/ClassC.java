package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        super(10); // 기본 생성자가 아닐 때는 해줘야한다.
        System.out.println("ClassC 생성자");

    }
}
