package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;

    void calculateArea() {
        area = width * height;
        System.out.println("넓이 : "+area);
    }

    void calculatePerimeter() {
        perimeter = 2*(width+height);
        System.out.println("둘레 : "+perimeter);
    }

    void isSquare() {
        if(width == height){
            System.out.println("정사각형임");
        }
        else {
            System.out.println("정사각형아님");
        }
    }

}

