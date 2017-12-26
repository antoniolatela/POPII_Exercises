package seven.stack;

import java.util.EmptyStackException;

public interface Stack<T> {
    void push(T item);
    T pop() throws EmptyStackException;
    T peek() throws EmptyStackException;
    boolean isEmpty();
}
