public class Driver {
  public static void main(String[] args) {
    Point sad = new Point(0,1);
    Point happy = new Point(0,0);
    Point angry = new Point (1,0);
    System.out.println(sad.distanceTo(happy));
    System.out.println(Point.distance(sad,happy));
    System.out.println(sad);
    System.out.println(happy);
    Triangle emotions = new Triangle(sad, happy, angry);
    Triangle work = new Triangle(0.,2.,2.,1.,1.,1.);
    System.out.println(emotions);
    System.out.println(work);
    System.out.println(emotions.getVertex(0));
    //commented out toString to see if getVertex printed different locations,worked
    //System.out.println(emotions.getVertex(0));
    System.out.println(emotions.getVertex(1));
    System.out.println(emotions.getVertex(2));
    emotions.setVertex(0, work.getVertex(0));
    System.out.println(emotions);
  }
}
