import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random rand = new Random();


        // hundred triangles
        int i=10;
        Triangle[] trianglesArray= new Triangle[i];

        Triangle triangle=new Triangle(new Point(0,0), new Point(0,5), new Point(3,0));
        System.out.println(triangle.pointA.calculateDistance(triangle.pointB)+" - AB");
        System.out.println(triangle.pointA.calculateDistance(triangle.pointC)+" - AC");
        System.out.println(triangle.pointB.calculateDistance(triangle.pointC)+" - BC");

        System.out.println(triangle.calculatePerimeter() + " - perimeter");
        System.out.println(triangle.calculateSquare() + " - square");
        System.out.println(triangle.triangleType() + " - type");

        for (i=0; i<trianglesArray.length; i++){

            trianglesArray[i] = new Triangle(
                    new Point(rand.nextInt(100),rand.nextInt(100)),
                    new Point(rand.nextInt(100),rand.nextInt(100)),
                    new Point(rand.nextInt(100),rand.nextInt(100))
            );
        System.out.println("\n\n\n"+i);
        System.out.println(trianglesArray[i].pointA.calculateDistance(trianglesArray[i].pointB)+" - AB");
        System.out.println(trianglesArray[i].pointA.calculateDistance(trianglesArray[i].pointC)+" - AC");
        System.out.println(trianglesArray[i].pointB.calculateDistance(trianglesArray[i].pointC)+" - BC");

        System.out.println(trianglesArray[i].calculatePerimeter() + " - perimeter");
        System.out.println(trianglesArray[i].calculateSquare() + " - square");
        System.out.println(trianglesArray[i].triangleType() + " - type");
        }


    }
}
