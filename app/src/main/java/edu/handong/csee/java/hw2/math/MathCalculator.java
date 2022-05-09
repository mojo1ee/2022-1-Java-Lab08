package edu.handong.csee.java.hw2.math;

//last day of edit 10 MAY 22

/**
 * This is a MathCalculator class that contains various math calculation methods.
 * Following are the types of calculation that this class provides. 
 * 
 * getMax, getMin, getAbs, getSum, getDiff, 
 * getProduct, getQuotient, getRemainder, getPower, 
 * getFactorial, getGGcd, getLcm, getSquare
 */
public class MathCalculator {
    private String name;

    /**
     * This is a setter method for setting the name field.
     */
    public void setName (String name){
        this.name = name;
    }

    /**
     * This is a getter method for getting the name field. 
     */
    public String getName(){
        return name;
    }

    /**
     * This is a method for getting the maximum value from the two integer input values. 
     */
    public int getMax(int num1, int num2){
        if (num1 > num2) return num1;
        else return num2;
    }

    /**
     * This is a method for getting the minimum value from the two integer input values. 
     */
    public int getMin(int num1, int num2){
        if (num1 < num2) return num1;
        else return num2;
    }

    /**
     * This is a method for getting the absolute value of the integer input value.
     */
    public int getAbs(int num){
        if (num <0) num = -num;

        return num;
    }

    /**
     * This is a method for getting the summation of the two integer input values. 
     */
    public int getSum(int num1, int num2){
        int sum = num1 + num2;

        return sum;
    }

    /**
     * This is a method for getting the difference between the two integer input values. 
     */
    public int getDiff(int num1, int num2){

        int diff = num1 - num2;

        return diff;
    }

    /**
     * This is a method for getting the product of the two integer input values. 
     */
    public int getProduct(int num1, int num2){
        int product = num1 * num2;

        return product;
    }
    
    /**
     * This is a method for getting the Quotient of integer input num1 divided by integer input num2
     * Produces an error message when num2 is 0
     */
    public int getQuotient(int num1, int num2){
        int quotient = num1 / num2;

        return quotient;
    }

    /**
     * This is a method for getting the Remainder of integer input num1 divided by integer input num2
     *  Produces an error message when num2 is 0
     */
    public int getRemainder(int num1, int num2){
        int remainder=-1;

        if(num2 ==0) return remainder; //wrong input;
        else remainder = num1 % num2;

        return remainder;
    }

    /**
     * This is a method for getting the result of exponentiating the first integer input num1 to the power of the second integer input num2
     */
    public int getPower(int num1, int num2){
        int power; 
        int i; 

        if(num2 == 0) return 1;
        else if (num2 < 0) return 0; // since it's an int type func => doens't allow negative powers
        else {
            power = num1;
            for(i=1;i<num2;i++){
                power = power * num1;
            }
        }
        return power;
    }

    /**
     * This is a method for getting the factorial result of the integer input num.
     */
    public int getFactorial(int num){
        int fact;
        int temp=num;
        int multiplier =num-1;

        
        if (num<0) return -1; //wrong input
        else if (num ==0) return 1;
        else if(num==1) return 1;

        while(multiplier>=1) {
            
            temp = temp*multiplier;
            multiplier--;
        }
        fact = temp;

        return fact;
    }

    /**
     * This is a method for getting the greatest common denominator of the two integer inputs num1 and num2.
     */
    public int getGcd(int num1, int num2){
        int gcd=1; 
        int temp;
        int i;
        int smaller_num = (num1<num2) ? num1:num2;
        int bigger_num = (num1>num2) ? num1:num2;

        if(num1 == num2) gcd = num1;
        else if (bigger_num % smaller_num == 0)
            gcd = smaller_num;
        else{
            for(i = 1; i < smaller_num; i++){
                if(i > smaller_num/2) break;

                if(smaller_num % i ==0){
                    temp =i;
                    if(bigger_num % temp ==0){
                        gcd = temp;
                    }
                }
            }
        }

        return gcd;
    }

    /**
     * This is a method for getting the least common multiple of the two integer inputs num1 and num2.
     */
    public int getLcm(int num1, int num2){
        int lcm=0;
        int multiplier;
        int temp;
        int smaller_num = (num1<num2) ? num1:num2;
        int bigger_num = (num1>num2) ? num1:num2;

        if(num1 == num2) {
            lcm = num1;
            return num1; 
        }

        multiplier = 1;
        while(true){
            temp = bigger_num * multiplier;
            if(temp % smaller_num ==0) {
                lcm = temp;
                break;
            }
            multiplier++;
        }

        return lcm; 
    }

    /**
     * This is a method for getting the squared value of the integer input num.
     */
    public int getSquare(int num){
        int square;

        square = num*num;

        return square;
    }
}