package com.jatinderaujla.datastructures.stack;

import java.util.Arrays;

public class StackWithArray<T> implements Stack<T> {

    private Object[] elementData;
    private int elementCount;

    public StackWithArray() {
        this(DEFAULT_SIZE);
    }

    public StackWithArray(Integer size){
        if(size == null || size <= 0){
            size = DEFAULT_SIZE;
        }

        elementData  =  new Object[size];
    }

    @Override
    public void push(T element) {
        if(size() == elementData.length){
            elementData = Arrays.copyOf(elementData, elementData.length + DEFAULT_SIZE);
        }
        elementData[size()] = element;
        elementCount++;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        T el = (T) elementData[size()-1];
        elementCount = elementCount - 1;
        return el;
    }

    @Override

    public T peek() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return (T) elementData[size() - 1];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * No of element stored inside the stack will be the size of stack
     * @return no of element in stack
     */
    private int size(){
        return this.elementCount;
    }
}
