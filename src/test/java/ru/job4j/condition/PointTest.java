package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        double expected = 2;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to67then2Dot23() {
        Point point1 = new Point(5, 5);
        Point point2 = new Point(6, 7);
        double expected = 2.23;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then2Dot82() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        double expected = 2.82;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to55then1Dot41() {
        Point point1 = new Point(4, 4);
        Point point2 = new Point(5, 5);
        double expected = 1.41;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when444to555then1Dot73() {
        Point point1 = new Point(4, 4, 4);
        Point point2 = new Point(5, 5, 5);
        double expected = 1.73;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}