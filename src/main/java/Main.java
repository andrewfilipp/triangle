import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random rand = new Random();


        // hundred triangles
        int i=100;
        Triangle[] trianglesArray= new Triangle[i];


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
