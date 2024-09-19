package Operators_Assignment;

/**
 * @author JALA Academy
 *
 * 2. Write a method for increment and decrement operators(++, --)
 */

public class IncrementDecrement {

    /* Increment Operator :	++	(++a or a++)
    It increments the value of a variable by 1.	*/
    static void preIncrement(int a, int b) {
        int d;                  //First the value of a is incremented to 11
        d = b + (++a);          //Then b is added to 11 to get 16
        System.out.println("Values after Pre-Increment a,b : " + a + "," + d);//a=11,b=16
    }

    static void postIncrement(int a, int b) {
        int d;                  //first the value of a is added to b to get 15
        d = b + (a++);          //Then after execution, a is incremented to 11
        System.out.println("Values after Post-Increment a,b : " + a + "," + d);//a=11,b=15
    }

    /* Decrement Operator :	--	(--a or a--)
        It decrements the value of a variable by 1.	*/
    static void preDecrement(int a, int b) {
        int d;                  //First the value of a is decremented to 9
        d = b + (--a);          //Then b is added to 9 to get 14
        System.out.println("Values after Pre-Decrement a,b : " + a + "," + d);//a=9,b=14
    }

    static void postDecrement(int a, int b) {
        int d;                  //first the value of a is added to b to get 15
        d = b + (a--);          //Then after execution, a is Decremented to 9
        System.out.println("Values after Post-Decrement a,b : " + a + "," + d);//a=9,b=15
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        preIncrement(a, b);
        postIncrement(a, b);
        preDecrement(a, b);
        postDecrement(a, b);
    }
}
