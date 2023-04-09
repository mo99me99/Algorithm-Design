import java.math.BigInteger;
import java.util.*;

/**
 * Chapter 1 is an introduction to the design and analysis of algorithms. It
 * includes both an intuitive and formal introduction to the concept of
 * order.
 * In this class we will check methods and their algorithms of first chapter of the book*/
/**@author Mohammad Mehdi Hosseini GitHub -> @mo99me99 */
public class CHPTER1_Algorithms<KeyType> {
        Scanner scanner = new Scanner(System.in);


    /**algorithm 1_1
     * This method runs in theta(n)
     * @return location (int) : index of x in S - Will be '0' for not found.
    **@param n indicates the size of S array . We get the size as a parameter to clearly know and use that.
     *          returns -1 if didn't find.
    **@param S Is an array which we search to find x .
    **@param location An int which will be return and shows the index of x in the S KeyType array.
    **@param x Is an int which we want to find that .*/
    private int sequentialSearch(int n, KeyType[] S, KeyType x, int location) {
        for (int i = 0; i < n; i++) {
            if (S[i].equals(x))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        CHPTER1_Algorithms obj = new CHPTER1_Algorithms();
        obj.menu();

    }
    public void menu(){
        System.out.println("Welcome to Chapter 1 (Algorithms: Efficiency, Analysis, and Order)" +
                "\nwhich one do you like to test ?" +
                " \n1 - Sequential Search ");
        int command = scanner.nextInt();
        switch (command){
            case 1 : callSeqSearch();break;
        }
    }



    private void callSeqSearch(){
        CHPTER1_Algorithms<KeyType> obj = new CHPTER1_Algorithms<KeyType>();
        System.out.println("Enter the size of array");
        int n = scanner.nextInt();
        System.out.println("Default KeyType will be int so insert integer numbers : ");
        KeyType[] S = (KeyType[]) new Object[n];
        for (int i = 0; i < n; i++) {
            S[i] = (KeyType) scanner.next();
        }
        System.out.println("Enter element you want to find in the array : ");
        KeyType x = (KeyType) scanner.next();
        long startTime = System.nanoTime();
        int result = sequentialSearch(n , S ,  x , -1);
        long endTime = System.nanoTime();
        long time = endTime-startTime;
        if (result > -1) {
            System.out.println(x + " is in " + result  + " indies");
        } else {
            System.out.println(x + " not found in array .");
        }
        System.out.println("Searching time in nano seconds : " + time);
        System.out.println("__________________________________");
    }

}