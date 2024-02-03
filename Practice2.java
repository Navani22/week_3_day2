//In Practice set Que. 4 told us to make methods for area and volume also to get getters and setters in que. 2
//I have combined both of them.


class Rectangle {
  private int width;
  private int height;

  Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
  }

  public double area() {
      return width * height;
  }

  public int getHeight() {
      return height;
  }

  public int getWidth() {
      return width;
  }

  public void setHeight(int height) {
      this.height = height;
  }

  public void setWidth(int width) {
      this.width = width;
  }
}

class Cuboid extends Rectangle {
  private int length;

  Cuboid(int width, int height, int length) {
      super(width, height);
      this.length = length;
  }

  public double volume() {
      return length * getHeight() * getWidth();
  }

  public int getLength() {
      return length;
  }

  public void setLength(int length) {
      this.length = length;
  }
}

public class Practice2 {
  public static void main(String[] args) {
      Rectangle r = new Rectangle(5, 4);
      System.out.println("Area of rectangle is : " + r.area());

      Cuboid c = new Cuboid(5, 4, 3);
      System.out.println("Volume of cuboid is : " + c.volume());
  }
}
