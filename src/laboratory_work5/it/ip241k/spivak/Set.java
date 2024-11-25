package laboratory_work5.it.ip241k.spivak;

import java.util.Arrays;

public class Set<T> {
    private T[] setArray;

    public Set() {}

    public Set(T[] setArray) {
        setSetArray(setArray);
    }

    public Set(int[] setArray) {
        this.setArray = (T[]) new Integer[setArray.length];
        for (int i = 0; i < setArray.length; i++) {
            this.setArray[i] = (T) Integer.valueOf(setArray[i]);
        }
    }

    public T[] getSetArray() {
        return setArray;
    }

    public void setSetArray(T[] setArray) {
        if (validateSetArray(setArray)) {
            this.setArray = setArray;
        }
    }

    @Override
    public String toString() {
        return "Set{" +
                "setArray=" + Arrays.toString(setArray) +
                '}';
    }

    public boolean validateSetArray(T[] setArray) {
        for (int i = 0; i < setArray.length; i++) {
            for (int j = i + 1; j < setArray.length; j++) {
                if (setArray[i] == setArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
