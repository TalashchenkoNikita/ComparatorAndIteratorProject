package homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    @Test
    void shouldIterateRange() {
        List<Integer> nums = new ArrayList<>();
        for (Integer integer: new Range(0,5)) {
            nums.add(integer);
        }
        assertThat(nums.get(3)).isEqualTo(3);
    }

    @Test
    void shouldIterateRangeWithStep() {
        List<Integer> nums = new ArrayList<>();
        for (Integer integer: new RangeWithStep(0,10, 2)) {
            nums.add(integer);
        }
        assertThat(nums.get(3)).isEqualTo(6);
    }

}