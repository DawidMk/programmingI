package pl.sda.programmingI.day3;

import java.util.EmptyStackException;

public class MeinStack<T> {
    private int pool = 10;
    private Object[] arrayOfStack = new Object[pool];
    private int position = -1;

    public void push(T t) {
        if (t == null) {
            throw new RuntimeException();
        }
        position++;
        if (arrayOfStack.length - 1 < position) {
            Object[] temp = new Object[arrayOfStack.length + pool];
            for (int i = 0; i < arrayOfStack.length; i++) {
                temp[i] = arrayOfStack[i];
            }
            arrayOfStack = temp;
        }
        arrayOfStack[position] = t;
    }

    public T pop() {
        T result;
        if (position < 0) {
            throw new EmptyStackException();
        }
        result = (T) arrayOfStack[position];
        arrayOfStack[position] = null;
        position--;
        return result;
    }

    public T peek() {

        if (position < 0) {
            throw new EmptyStackException();
        }
        return (T) arrayOfStack[position];

    /*    try {
            return (T) arrayOfStack[position];
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }*/

    }

    public boolean isEmpty() {
        return position < 0;
    }

}
