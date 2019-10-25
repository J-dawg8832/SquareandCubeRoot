package squarerootandcuberoot;

import java.util.Scanner;

public class SquareRootandCubeRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double number = scanner.nextDouble();
        
        double result = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + result);
        System.out.println("-----------------------------------");
        
        System.out.print("Please enter a number to cube: ");
        double cube = scanner.nextDouble();
        
        double cubeResult = Math.cbrt(cube);
        System.out.println("The cube root of " + cube + " is: " + cubeResult);
        
    }
    
}
