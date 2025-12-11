package rvt;

public class Box {

    private double width;
    private double height;
    private double length;

    // Konstruktors taisnstūra kastei
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Konstruktors kubam
    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    // Kopējo konstruktoru
    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    // Tilpums
    public double volume() {
        return length * width * height;
    }

    // Virsmas laukums
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    // Privātās palīgmetodes
    private double faceArea() {
        return height * length;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return width * height;
    }

    //
    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    //metode kas parbauda vai šī kaste ietilpst citā kastē
    public boolean nests(Box outsideBox) {
        return this.length < outsideBox.length() &&
               this.height < outsideBox.height() &&
               this.width < outsideBox.width();
    }
}
