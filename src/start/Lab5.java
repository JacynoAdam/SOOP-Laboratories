package start;

import java.util.ArrayList;

public class Lab5 {

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("{");
            }
            System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(", ");
            } else {
                System.out.print("}\n");
            }
        }
    }

    static int[] arrayListToPrimitive(ArrayList<Integer> arr) {
        int[] resultArr = new int[arr.size()];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = arr.get(i);
        }
        return resultArr;
    }

    static int[] toNumberArray(int value) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (value > 0) {
            while (value > 0) {
                arr.add(0, value%10);
                value = (value - value%10) / 10;
            }
        } else if (value < 0) {
            value *= -1;
            while (value > 0) {
                arr.add(0, value%10);
                value = (value - value%10) / 10;
            }
            arr.set(0, arr.get(0) * -1);
        } else {
            arr.add(0);
        }
        return arrayListToPrimitive(arr);
    }

    /*
    static int[] toNumberArray(String value) {

    }

    static int[] addNumberArrays(int[] arr1, int[] arr2) {

    }

    static int[] multiplyNumberArrays(int[] arr1, int[] arr2) {

    } */

    public static void main(String[] args) {
        printArr(toNumberArray(-31415));
        printArr(toNumberArray(27182));
        printArr(toNumberArray(0));
    }
}
