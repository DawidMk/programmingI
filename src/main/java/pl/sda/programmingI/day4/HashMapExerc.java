package pl.sda.programmingI.day4;

import java.util.*;

public class HashMapExerc {
    private static Object object = new Object();
    private static Map<Object, Object> map = new HashMap<>();
    private static List<Object> keys = new ArrayList<>();

    public static void main(String[] args) {
//        putHashCodeConst();
//        putEqRand();
        putHashRand();
        check();

    }

    private static void putHashRand() {
        for (int i = 0; i < 1000; i++) {
            HashCodeRandom test = new HashCodeRandom("fm" + i, "fm" + i, "fm" + i);
            map.put(test, object);
            keys.add(test);
        }
    }

    private static void putEqRand() {
        for (int i = 0; i < 100; i++) {
            EqualsRandom test = new EqualsRandom("fm" + i, "fm" + i, "fm" + i);
            map.put(test, object);
            keys.add(test);
        }
    }

    private static void putHashCodeConst() {
        for (int i = 0; i < 100; i++) {
            HashCodeConstant hashCodeConstant = new HashCodeConstant("fm" + i, "fm" + i, "fm" + i);
            map.put(hashCodeConstant, object);
            keys.add(hashCodeConstant);
        }
    }

    private static void checkStream(){

    }

    private static void check() {
        int found = 0;
        int notFound = 0;
        for (int i = 0; i < keys.size(); i++) {
            if (map.get(keys.get(i)) == null) {
                notFound++;
            } else {
                found++;
            }
        }
        System.out.println(String.format("Found %d, not found %d", found, notFound));
    }
}