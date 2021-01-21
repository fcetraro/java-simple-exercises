package controller;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        exerciseFive();
    }
    public static void evenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number:");
        int nInput = scanner.nextInt();
        for (int i = 0; i < nInput; i++) {
            if((i % 2 == 0)) System.out.println(i);
        }
    }
    public static void firstMultiplesNumbers(){
        int printedValues = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number:");
        int nInput = scanner.nextInt();
        System.out.println("Enter m number:");
        int mInput = scanner.nextInt();
        for (int i = 1; i < mInput+1; i++) {
            if((printedValues<nInput) && (mInput % i == 0)){
                printedValues++;
                System.out.println(i);
            }
        }
    }
    public static void primeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number:");
        int nInput = scanner.nextInt();
        if(isPrime(nInput)) {
            System.out.println(nInput+" is a Prime number!");
        } else {
            System.out.println(nInput+" is not a Prime number!");
        }
    }
    public static void fistPrimeNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number:");
        int nInput = scanner.nextInt();
        int primeCount = 0;
        int i = 2;
        while (primeCount<nInput){
            if(isPrime(i)){
                System.out.println(i);
                primeCount++;
            }
            i++;
        }
    }
    public static boolean isPrime(int x){
        if(x<2) return false;
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(x);i++){
            int temp = x%i;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    static int cantOccurrences(int x, char lookingForChar){
        String string = x + "";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == lookingForChar) {
                count++;
            }
        }
        return count;
    }
    public static void exerciseFive(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number:");
        int nInput = scanner.nextInt();
        System.out.println("Enter m number:");
        int mInput = scanner.nextInt();
        System.out.println("Enter d number:");
        int dInput = scanner.nextInt();
        int occurrences = 0;
        int i = 0;
        String c = dInput+"";
        char lookingForChar = c.charAt(0);
        while (occurrences<nInput){
            if(cantOccurrences(i,lookingForChar)>=mInput){
                System.out.println(i);
                occurrences++;
            }
            i++;
        }
    }
}