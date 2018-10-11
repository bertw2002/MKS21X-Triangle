public class driver {
    public static void main(String[] args) {
    Triangle abc = new Triangle(0, 0, 3, 0, 0, 4); //3,4,5 triangle

    System.out.println(abc); // prints triangle
    System.out.println("\nPerimeter: " + abc.getPerimeter()); //12.0

    System.out.println("\nVertices: " + abc.getVertex(0) + ", " + abc.getVertex(1) + ", " + abc.getVertex(1)); //should print individual vertices

    abc.setVertex(0, new Point(1, 1));

    System.out.println("\nVertex A moved to " + abc.getVertex(0)); //convert to (1,1)

    System.out.println("New Perimeter: " + abc.getPerimeter()); //10.39
  }
}
