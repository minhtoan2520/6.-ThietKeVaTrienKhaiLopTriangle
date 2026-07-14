import src.Triangle;

public class AppTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle(2, 5, 4, "black", false);
        System.out.println(t);

        System.out.println("Chu vi tam giac la: " + t.getPerimeter());
        System.out.println("Dien tich tam giac la: " + t.getArea());
    }
}
