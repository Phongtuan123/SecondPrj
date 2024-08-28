package iuh.fit.ktpm;

/*
 * @description:  This class represent a rectangle
 * @author:  Tuấn, Nguyễn Phong Tuấn
 * @version: 1.0
 * @created: 8/28/2024
 */


public class Rectangle {
    private double width;
    private double length;
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        if(width <= 0 || length <= 0) {
            System.out.println("Width and length must be greater than 0");
            return;
        }
        this.width = width;
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than 0");
        }
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0");
        }
    }
    public double getArea(double width, double length) {
        return width * length;
    }
    public double getPerimeter(double width, double length) {
        return 2 * (width + length);
    }
}
