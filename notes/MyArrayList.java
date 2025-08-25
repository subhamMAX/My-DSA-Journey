package com.subham.inheritence;

public class MyArrayList<T> {
        private Object[] data;
        private int size;        // Number of elements in the list
        private int capacity;    // Total allocated capacity

        // Constructor
        public MyArrayList() {
            capacity = 10;       // initial capacity
            data = new Object[capacity];
            size = 0;
        }

        // Add element to the list
        public void add(T element) {
            if (size == capacity) {
                // Resize array if full
                increaseCapacity();
            }
            data[size] = element;
            size++;
        }

        // Get element at index
        @SuppressWarnings("unchecked")
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            return (T) data[index];
        }

        // Remove element at index
        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            data[size - 1] = null; // optional
            size--;
        }

        // Get current size
        public int size() {
            return size;
        }

        // Increase internal array capacity
        private void increaseCapacity() {
            capacity = capacity * 2;
            Object[] newData = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }


