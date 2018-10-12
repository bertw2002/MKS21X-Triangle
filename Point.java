public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distanceTo(Point p){
    return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(p.getY() - this.getY(), 2));
  }
  public static double distanceTo(Point x, Point y){
    return Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + Math.pow(x.getY() - y.getY(), 2));
  }
}
