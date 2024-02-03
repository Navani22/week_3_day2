//In Practice set Que. 3 told us to make methods for area and volume in que. 1
//I have combined both of them.


class Circle {
  public int radii;

  Circle(int radii) {
      this.radii = radii;
  }

  public double area() {
      return this.radii * this.radii * Math.PI;
  }
}

class Cylinder extends Circle {
  public int height;

  Cylinder(int radii, int height) {
      super(radii);
      this.height = height;
  }

  public double volume() {
      return this.radii * this.radii * Math.PI * this.height;
  }
}

public class Practice1 {
  public static void main(String[] args) {
      Circle c1 = new Circle(5);
      System.out.println("Area of circle is : " + c1.area());

      Cylinder c2 = new Cylinder(5, 10);
      System.out.println("Volume of cylinder is : " + c2.volume());
  }
}
