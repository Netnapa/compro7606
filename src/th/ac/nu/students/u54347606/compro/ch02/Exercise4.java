package th.ac.nu.students.u54347606.compro.ch02;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double pi = 3.14;
        

        System.out.print("Please Enter Radius : "); 
        
        double r = in.nextDouble(); 
        double circleArea = pi*r*r;
        double RoundCircle = 2*pi*r;
        double SurfaceCircle = 4*pi*r;
        double VolumeCircle = 1.33*pi*r*r*r;
        System.out.println("circleArea : " +circleArea);
        System.out.println("RoundCircle : " +RoundCircle);
        System.out.println("SurfaceCircle : " +SurfaceCircle);
        System.out.println("VolumeCircle : " +VolumeCircle);
    }
}

    

