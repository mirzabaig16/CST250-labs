package edu.ru.lab02a;

public class MainClass {

    public static int mySearch(int[] inputArray, int n){
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,10,50,34};
        System.out.println(mySearch(array, 3));
        System.out.println(mySearch(array, 30));
        System.out.println(mySearch(array, 34));
    }
}