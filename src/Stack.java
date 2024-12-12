public class Stack<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Stack() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void push(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow: Cannot pop from an empty stack.");
        }
        T element = (T) elements[--size];
        elements[size] = null;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int newSize = elements.length * 2;
        Object[] newElements = new Object[newSize];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}
