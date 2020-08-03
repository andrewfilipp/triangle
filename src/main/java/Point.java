import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Point {

    int x;
    int y;


    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }


    public double calculateDistance(Point p){

        double distance = Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
        return distance;
        };


}
