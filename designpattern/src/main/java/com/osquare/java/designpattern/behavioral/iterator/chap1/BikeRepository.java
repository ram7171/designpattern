package com.osquare.java.designpattern.behavioral.iterator.chap1;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    public void add(String value) {
        if(index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0,largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
        bikes[index++] = value;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public Object next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return iterator;
    }
}
