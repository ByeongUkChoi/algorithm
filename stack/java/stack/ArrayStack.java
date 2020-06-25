package stack;

import java.util.ArrayList;

/**
 * 배열로 스택 구현
 */
class ArrayStack implements Stack{
    private int top;
    private int maxSize;
    private Object[] stackArray;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxSize == top + 1;
    }

    @Override
    public Object pop() {
        Object item = peek();
        top--;
        return item;
    }

    @Override
    public void push(Object item) {
        if(isFull()) {
            System.out.println("stack is full");
            return;
        }
        stackArray[++top] = item;
    }

    @Override
    public Object peek() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        return stackArray[top];
    }
}
