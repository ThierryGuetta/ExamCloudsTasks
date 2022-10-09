package ClassesAndMethods.Task9;

import java.awt.*;
import java.util.Objects;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {
        this.color = new Color(0, 0, 0);
    }

    public void draw() {
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null && this.getClass() != obj.getClass()) return false;
        Shape shape = (Shape) obj;
        return this.color == shape.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

class Circle extends Shape {
    private int x, y;

    public Circle(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Circle(Color color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Rectangle extends Shape {
    private int x, y;

    public Rectangle(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Rectangle(Color color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return x == rectangle.x && y == rectangle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Color(255, 0, 0), 10, 10);
        Rectangle rectangle = new Rectangle(new Color(0, 255, 0), 15, 15);
        Shape[] shapes = {circle, rectangle};

        for (Shape e : shapes) {
            e.draw();
        }
    }
}
