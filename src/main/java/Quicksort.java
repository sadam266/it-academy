import java.util.Arrays;

public class Quicksort {

    private static int[] tab = {1, 2, 10, 7, 5, 3};
//    private static int[] tab = {1, 2, 3, 7, 3, 3};
//    private static int[] tab = {1, 2};
//    {1, 2, 3, 10, 7, 5}

    public static void main(String[] args) {
//        ctrl + alt + m
        int n = tab.length;
        quicksort(0, n - 1);
        System.out.println(Arrays.toString(tab));
    }

//    will only work on an array with unique elements (without duplicates)
    private static void quicksort(int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
//            exit the method invocation without returning any value
            return;
        }
        System.out.println("[DEBUG] LI : " + startIndex + ", RI : " + endIndex);
//        ctrl + d
//        ctrl + /
//        ctrl + w and ctrl + shift + w
//        int pivotIndex = getPivotIndex();
        int pivotIndex = endIndex; // 1
        int pivot = tab[pivotIndex]; // 2

        int leftIndex = startIndex; // 0
        int rightIndex = endIndex; // 1

//        TODO fix main while loop condition
        while (leftIndex < rightIndex) {
            System.out.println("[DEBUG] TAB: " + Arrays.toString(tab));
            while (tab[rightIndex] > pivot) {
                rightIndex--;
            }
            while (tab[leftIndex] < pivot) {
                leftIndex++; // 1
            }
            if (leftIndex < rightIndex) {
                swap(tab, leftIndex, rightIndex);
            }
        }

//        place pivot point in correct position
//        swap(tab, leftIndex, pivotIndex);
//        alt + enter

        System.out.println("[DEBUG] TAB: " + Arrays.toString(tab));
        quicksort(startIndex, leftIndex - 1);
        quicksort(rightIndex + 1, endIndex);
    }

    private static int getPivotIndex(int n) {
        return n - 1;
    }

    private static void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}
