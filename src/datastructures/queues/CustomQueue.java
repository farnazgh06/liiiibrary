package datastructures.queues;

import datastructures.interfaces.Queue;
import datastructures.lists.CustomLinkedList;

import java.util.NoSuchElementException;

public class CustomQueue<T> implements Queue<T> {
    private CustomLinkedList<T> list;

    public CustomQueue() {
        list = new CustomLinkedList<>();
    }

    @Override
    public boolean add(Object t) {
        if (!offer(t)) throw new IllegalStateException("Stack is full");
        return true;
    }

    @Override
    public boolean offer(Object t) {
        if (t == null){
            return false;
        }
        list.add(t);
        return true;
    }

    @Override
    public T remove() {
        if (list == null) throw new NoSuchElementException();
        return list.removeFirst();
    }

    @Override
    public T poll() {
        if(list == null){
            return null;
        }
        return list.removeFirst();
    }

    @Override
    public T element() {
        if (list == null) throw new NoSuchElementException();
        return list.getFirst();
    }

    @Override
    public T peek() {
        if(list == null){
            return null;
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

}