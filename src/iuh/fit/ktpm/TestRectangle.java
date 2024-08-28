package iuh.fit.ktpm;

/*
 * @description:  This class represent a rectangle
 * @author:  Tuấn, Nguyễn Phong Tuấn
 * @version: 1.0
 * @created: 8/28/2024
 */


public class TestRectangle {
    public static void main(String[] args) {
        Rectangle re1 = new Rectangle();

        re1.setWidth(2.0);
        re1.setLength(3.0);
        System.out.println("Rectangle 1: "+re1.getWidth()+" "+re1.getLength());
        System.out.println("ARea: "+re1.getArea());
        System.out.println("Perimeter: "+re1.getPerimeter());
    }
}
