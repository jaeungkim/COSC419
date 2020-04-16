package Assignment1;

import java.util.Arrays;

//JAE UNG KIM - 37007315 COSC 419L
public class A1Q3 {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Example 1 ----------------");
        uniqueArray(new int[]{105, 123, -921, -1, 8, 8, 8, -921});

        System.out.println(" ");
        System.out.println("Example 2 ----------------");
        uniqueArray(new int[]{10, 22, 10, 20, 11, 22, 22});
    }

    public static void uniqueArray(int[] originalArray) {
        System.out.println("Original Array : ");

        //Print out original array
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + "  ");
        }

        //Assuming all elements in input array are unique
        int noneUnique = originalArray.length;

        //Comparing elements for duplicates
        for (int i = 0; i < noneUnique; i++) {
            for (int j = i + 1; j < noneUnique; j++) {
                //If any two elements are found equal
                if (originalArray[i] == originalArray[j]) {
                    //Replace duplicate element with last unique element
                    originalArray[j] = originalArray[noneUnique - 1];
                    noneUnique--;
                    j--;
                }
            }
        }

        //printing out left over elements (unique elements)
        int[] uniqueElements = Arrays.copyOf(originalArray, noneUnique);
        //Printing arrayWithoutDuplicates
        System.out.println();
        System.out.println("Array with unique values : ");
        for (int i = 0; i < uniqueElements.length; i++) {
            System.out.print(uniqueElements[i] + "  ");
        }
        System.out.println();

    }


}
