import java.util.AbstractList;
import java.util.List;

public class OwnArrayList<E> extends AbstractList<E> {
    private static final int INITIAL_LENGTH = 10;

    private Object[] array;

    public OwnArrayList() {
        this(INITIAL_LENGTH);
    }

    public OwnArrayList(int length) {
        this.array = new Object[length];
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public boolean add(Object object) {
        if (this.array.length <= size()) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            this.array = newArray;
        }
        int key = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                key = i;
                break;
            }
        }
        this.array[key] = object;
        return true;
    }

    public void addAll(List<Object> list) {
        for (Object element : list) {
            add(element);
        }
    }

    @Override
    public E remove(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return null;
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
