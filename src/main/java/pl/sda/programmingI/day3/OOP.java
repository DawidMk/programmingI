package pl.sda.programmingI.day3;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class OOP {
    public static void main(String[] args) {
/*        CustomList<Integer> tab = new CustomList<>(10);
        tab.addAll(1);
//        tab.add(5);
//        tab.add(2);

        System.out.println(tab.get(0));
        System.out.println(tab.get(5));
//        tab.clearAll();
        for (int i = 0; i < tab.size(); i++) {
            System.out.print(tab.get(i) + " ");
        }
        System.out.println();
        System.out.println("size "+tab.size());
        System.out.println(tab.isEmpty());
        tab.removeElement(5);

//        for (int i = 0; i < tab.size(); i++) {
//            System.out.print(tab.get(i) + " ");
//        }
        tab.toStringMine();
        System.out.println();
        System.out.println("size "+tab.size());*/

        int[] tab = createTab(10);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
//        System.out.println(isSorted(tab));
        System.out.println("sorted");
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
//        System.out.println(isSorted(tab));

        System.out.println("test isSorted");
        int[] tab2 = new int[]{1,2,5,3};
//        int[] tab2 = new int[]{1, 2, 3, 5};
        System.out.println(isSorted(tab2));
    }

    public static int[] createTab(int length) {
        int[] tab = new int[length];
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(50);
        }
        return tab;
    }

    public static boolean isSorted(int[] tab) {
        boolean flag = true;
        int prev = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < prev) {
                flag = false;
                break;
            }
            prev = tab[i];
        }
        return flag;
    }


}
