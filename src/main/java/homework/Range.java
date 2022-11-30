package homework;

import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private final int start;
    private final int end;

    Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }


    private class RangeIterator implements Iterator<Integer> {
        int index = start;

        @Override
        public boolean hasNext() {
            return index <= end;
        }

        @Override
        public Integer next() {
            return index++;
        }
    }

}
