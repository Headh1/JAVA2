package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        publicMethod();

        // 상속 관계 or 같은 패키지
        protectedValue = 2;
        protectedMethod();

        //다른 패키지 접근 불가 , 컴파일 오류
        // defaultValue = 3;
        // defaultMethod();

        // 접근 불가, 컴파일 오류
        // privateValue = 4;
        // privateMethod();

        printParent();
    }
}
