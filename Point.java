public class Point {
  private double x, y;
  public Point(double x1, double y1) {
    x = x1;
    y = y1;
  }
  public Point(Point p) {
    x = p.x;
    y = p.y;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public double distanceTo(Point p) {
    return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
  }
  public double distance(Point k, Point p) {
    return Math.sqrt(Math.pow((k.x - p.x), 2) + Math.pow((k.y - p.y), 2));
  }
  public String toString() {
    return "(" + x + "," + y + ")";
  }
}
