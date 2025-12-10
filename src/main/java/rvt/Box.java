package rvt;

public class Box {

    private double width;
    private double height;
    private double length;


    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public Box(double side) {
        
    }

    public double volume() {
        return length * width * height;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double faceArea(){
        return height * length;
    }

    public double topArea(){
        return width * length;
    }

    public double sideArea(){
        return width * height;
    }


    // private double area() {
    //     return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    // }
}
