package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();

        re.width = 3;
        re.height =5;

        re.calculateArea();
        re.calculatePerimeter();
        re.isSquare();
    }
}
