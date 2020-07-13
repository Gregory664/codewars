package codewars.kyu7;

public class CircularList<T> {
    T[] elements;
    private int length;
    private int position = -1;

    public CircularList(final T... elements) throws Exception {
        if(elements == null) {
            throw new Exception();
        }
        this.elements = elements;
        length = elements.length;
    }

    T next() {
        if (position < length - 1) {
            return elements[++position];
        } else {
            position = -1;
            return elements[++position];
        }
    }

    T prev() {
        if (position > 0) {
            return elements[--position];
        } else {
            position = length;
            return elements[--position];
        }
    }
}
