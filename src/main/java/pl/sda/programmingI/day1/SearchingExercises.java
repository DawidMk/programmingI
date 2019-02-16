package pl.sda.programmingI.day1;

import java.util.Arrays;

public class SearchingExercises {
    public static void main(String[] args) {
        int[] tab = new int[]{5, 9, 1, 3, 2, 7, 5, 11, 66, 8, 0};
        int[] arr = new int[]{10, 80, 30, 90, 40, 50, 70};
        int[] arr2 = new int[]{3, 1, 2, 5, 4};

//        System.out.println(searchNumb(2, tab));
//        System.out.println(Arrays.toString(bubbleSort(tab)));
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(quickSorter(arr,0,arr.length-1)));
//        System.out.println(Arrays.toString(quickSorter(arr, 0, arr.length - 1)));
        System.out.println(Arrays.toString(quickSorter(tab,0,tab.length-1)));
    }


    private static String searchNumb(int n, int[] tab) {
        for (int i = 0, j = tab.length - 1; i < tab.length; i++, j--) {
            if (tab[i] == n) {
                return "number found at index " + i;
            }
            if (tab[j] == n) {
                return "no of index " + j;
            }
        }
        return "-1";
    }

    private static int[] bubbleSort(int[] inpt) {
        int n = inpt.length;
        int[] tab = inpt;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                if (tab[i] > tab[j]) {
                    temp = tab[j];
                    tab[j] = tab[i];
                    tab[i] = temp;
                }
            }

        }
        return tab;
    }

    private static int partition(int[] tab, int low, int high) {

        int pivot = tab[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            int temp;
            if (tab[j] <= pivot) {
                i++;
                temp = tab[j];
                tab[j] = tab[i];
                tab[i] = temp;
            }
        }
        int temp = tab[high];
        tab[high] = tab[i + 1];
        tab[i + 1] = temp;
        return i + 1;
    }

    private static int[] quickSorter(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSorter(arr, low, pi - 1);
            quickSorter(arr, pi + 1, high);
        }
        return arr;
    }
}