public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point first, Point second, Point third){
    v1 = first;
    v2 = second;
    v3 = third;
  }
  public Triangle(double x1, double x2, double x3, double y1, double y2, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  public double getPerimeter(){
    double one = Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2) + Math.pow(v1.getY() - v2.getY(), 2));
    double two = Math.sqrt(Math.pow(v2.getX() - v3.getX(), 2) + Math.pow(v2.getY() - v3.getY(), 2));
    double three = Math.sqrt(Math.pow(v1.getX() - v3.getX(), 2) + Math.pow(v1.getY() - v3.getY(), 2));
    return one + two + three;
  }

  public Point getVertex(int index){
     Point val;
     if (index == 0){
       val = new Point(v1.getX(), v1.getY());
     }else if (index == 1){
       val = new Point(v2.getX(), v2.getY());
     }else{
       val = new Point(v3.getX(), v3.getY());
     }
     return val;
   }
  public String toString(){
    return "Triangle: A("+v1.getX()+","+v1.getY()+") " +"B("+v2.getX()+","+v2.getY()+") " + "C("+v3.getX()+","+ v3.getY()+")";
  }
  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }if (index == 1){
      v2 = newP;
    }else{
      v3 = newP;
    }
    }
}
