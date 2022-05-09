package edu.handong.csee.java.hw2;

import edu.handong.csee.java.hw2.math.MathCalculator;

//author: Junhyung Lee
//last day of edit 10 MAY 22

/**
 * This is a class for executing the MathCalculator class.
 */
public class MathDriver {
    /**
     * This is the main method which is the starting point of this program.
     */
    public static void main(String[] args){
        MathDriver myDriver = new MathDriver();
        myDriver.run(args);
    }
    
    /**
     * This is the run method that configures how each cases should be run depending on commandline arguments.
     */
    public void run(String[] args){

        MathCalculator mathCalculator = new MathCalculator();

        mathCalculator.setName(args[0]);

        switch(args[1]){
            case "Max":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +                    
                                    mathCalculator.getMax(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

                break;
            // TO DO: Fill the rest of cases below. Do not modify other parts of this file
            case "Min":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +                    
                                    mathCalculator.getMin(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

                break;

    
            case "Abs":
            System.out.println("Driver Name: " + mathCalculator.getName() +
                                ", Answer: " +                    
                                mathCalculator.getAbs(Integer.parseInt(args[2])));

            break;

            case "Sum":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +                    
                                    mathCalculator.getSum(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

                break;

            case "Diff":
            System.out.println("Driver Name: " + mathCalculator.getName() +
                                ", Answer: " +                    
                                mathCalculator.getDiff(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

            break;

            case "Product":
            System.out.println("Driver Name: " + mathCalculator.getName() +
                                ", Answer: " +                    
                                mathCalculator.getProduct(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

            break;

            case "Quotient":
            if(Integer.parseInt(args[3])==0) System.out.println("Wrong input");
            else{
                    System.out.println("Driver Name: " + mathCalculator.getName() +
                                        ", Answer: " +                    
                                        mathCalculator.getQuotient(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
            }
            break;

            case "Remainder":
            if(Integer.parseInt(args[3])==0) System.out.println("Wrong input");
            else{
            System.out.println("Driver Name: " + mathCalculator.getName() +
                                ", Answer: " +                    
                                mathCalculator.getRemainder(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
            }
            break;

            case "Power":
            if(Integer.parseInt(args[3])<0) System.out.println("Wrong input"); //the func doesn't allow neg powers/
            else{
                    System.out.println("Driver Name: " + mathCalculator.getName() +
                                        ", Answer: " +                    
                                        mathCalculator.getPower(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
            }
            break;

            case "Factorial":
            if(Integer.parseInt(args[2])<0) System.out.println("Wrong Input"); // by def of factorial, no negative inputs allowed.
            else{
                    System.out.println("Driver Name: " + mathCalculator.getName() +
                                ", Answer: " +                    
                                mathCalculator.getFactorial(Integer.parseInt(args[2])));
            }
            break;

            case "Gcd":
            System.out.println("Driver Name: " + mathCalculator.getName() +
                                ", Answer: " +                    
                                mathCalculator.getGcd(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

            break;

            case "Lcm":
            System.out.println("Driver Name: " + mathCalculator.getName() +
                                ", Answer: " +                    
                                mathCalculator.getLcm(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

            break;

            case "Square":
            System.out.println("Driver Name: " + mathCalculator.getName() +
                                ", Answer: " +                    
                                mathCalculator.getSquare(Integer.parseInt(args[2])));

            break;


            default:
                System.out.println("Invalid command");
        }

    }
}
