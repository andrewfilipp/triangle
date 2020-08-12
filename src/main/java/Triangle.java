public class Triangle {
//    Point pointA = new Point(10,2);
//    Point pointB = new Point(13,14);
//    Point pointC = new Point(25,26);
    Point pointA ;
    Point pointB ;
    Point pointC ;

    public Triangle(Point pointA, Point pointB, Point pointC){
        this.pointA=pointA;
        this.pointB=pointB;
        this.pointC=pointC;
    }


   public double calculatePerimeter(){
       double perimeter = pointA.calculateDistance(pointB)+pointB.calculateDistance(pointC)+pointC.calculateDistance(pointA);
       return perimeter;
   }

   public double calculateSquare(){
       //by "Heron's formula"
       double halfPerimeter = (pointA.calculateDistance(pointB) + pointB.calculateDistance(pointC) + pointC.calculateDistance(pointA))/2;
       double square = Math.sqrt(halfPerimeter*(halfPerimeter - pointA.calculateDistance(pointB)) * (halfPerimeter - pointB.calculateDistance(pointC)) * (halfPerimeter - pointC.calculateDistance(pointA)));
       return square;
   }

   public String triangleType(){

            //Equilateral Triangle - all equal sides
       if (pointA.calculateDistance(pointB) == pointB.calculateDistance(pointC) && pointA.calculateDistance(pointB) == pointA.calculateDistance(pointC)){
           String ET = "Equilateral Triangle";
           //System.out.println(ET);
           return ET;
       }
            // Two equal sides
       else if (pointA.calculateDistance(pointB) == pointB.calculateDistance(pointC) || pointA.calculateDistance(pointB) == pointA.calculateDistance(pointC)){
            String IT = "Isosceles Triangle";
           //System.out.println("IT");
           return IT;
       }
            //No equal sides or something went wrong :D
       else {
           String ST = "Scalene Triangle";
           //System.out.println(ST);
           return ST;
       }

   }

}
