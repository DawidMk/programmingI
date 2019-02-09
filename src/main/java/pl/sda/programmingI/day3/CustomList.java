package pl.sda.programmingI.day3;

import java.util.Arrays;

public class CustomList<T> {
    private int pool = 10;
    private Object[] handler;
    private int position = 0;

    public CustomList(int initSize) {
        handler = new Object[initSize];
    }

    public T get(int index) {
        T result;
        if (index < handler.length) {
            result = (T) handler[index];
        } else {
            throw new RuntimeException();
        }
        return result;
    }

    public int add(T t) {
        handler[position] = t;
        int p = position++;
        if (handler.length - 1 < position) {
            Object[] customHandler = new Object[handler.length + pool];
            for (int i = 0; i < handler.length; i++) {
                customHandler[i] = handler[i];
            }
            handler = customHandler;
        }
        return p;
    }

    public void add2(int number) {
        handler = Arrays.copyOf(handler, handler.length + number);
    }

    public int size() {
        int c = 0;
        for (int i = 0; i < handler.length; i++) {
            if (handler[i] != null) {
                c++;
            }
        }
        return c;
    }

    public boolean isEmpty() {
        return position == 0;
//        return size() == 0;
    }

    public void clearAll() {
//        for (int i = 0; i < handler.length; i++) {
//            handler[i] = null;
//
//        }
        handler = new Object[pool];
        position = 0;
    }

    public void addAll(T t) {
        for (int i = 0; i < handler.length; i++) {
            handler[i] = t;
            position++;
//            if (handler.length - 1 < position) {
//                Object[] customHandler = new Object[handler.length + pool];
//                for (int j = 0; j < handler.length; j++) {
//                    customHandler[j] = handler[j];
//                }
//                handler = customHandler;
//            }
        }
    }

    public void removeElement(int index) {
        if (index > position) {
            throw new RuntimeException();
        }
        handler[index] = null;
        Object[] customHandler = new Object[handler.length];
        int j = 0;
        for (int i = 0; i < handler.length; i++) {
            if (handler[i] != null) {
                customHandler[j] = handler[i];
                j++;
            }
        }
        position--;
        handler = customHandler;
    }


    public String toStringMine() {
        String result = "";
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + " ");
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + " ");
        }
        return result;
    }
}

