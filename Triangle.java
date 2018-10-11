public class Triangle {
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = new Point(a);
    v2 = new Point(b);
    v3 = new Point(c);
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }
  public Point getVertex(int index) {
    if (index == 0) {
      return v1.copy();
    }
    else if (index == 1) {
      return v2.copy();
    }
    else if (index == 2) {
      return v3.copy();
    }
    else {
      return v1;
    }
  }
  public void setVertex(int index, Point newP) {
    if (index == 0) {
      this.v1 = new Point (newP);
    }
    if (index == 1) {
      this.v2 = new Point (newP);
    }
    if (index == 2) {
      this.v3 = new Point (newP);
    }
  }
  public String toString() {
    return "Triangle:\nV1" + getVertex(0) + "\nV2" + getVertex(1) + "\nV3" + getVertex(2);
  }
}
