package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{5, 15, 3};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas22Then4() {
        int[] data = new int[]{123, 4213, 341, 212, 22, 34, 4543, 2268};
        int el = 22;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas123Then0() {
        int[] data = new int[]{123, 4213, 341, 212, 22, 34, 4543, 2268};
        int el = 123;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}