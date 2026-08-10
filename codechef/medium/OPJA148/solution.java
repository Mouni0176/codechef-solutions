class Shape {
    protected int area;

    public Shape() {
        area = 0;
    }

    public void printArea() {
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int l, int w) {
        length = l;
        width = w;
        area = length * width;
    }

    @Override
    public void printArea() {
        System.out.println("Rectangle Area: " + area);
    }
}

class Codechef {
    public static void main(String[] args) {
        Shape s;
        Rectangle r = new Rectangle(4, 6);

        s = r;
        s.printArea();
    }
}
