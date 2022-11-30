package homework;

import java.util.Iterator;

public class RangeWithStep implements Iterable<Integer> {
    private final int start;
    private final int end;

    private final int step;

    RangeWithStep(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeWithStepIterator();
    }


    private class RangeWithStepIterator implements Iterator<Integer> {
        int index = start;

        @Override
        public boolean hasNext() {
            return index <= end - step;
        }

        @Override
        public Integer next() {
            index = index + step;
            return index - step;
        }
    }
}
