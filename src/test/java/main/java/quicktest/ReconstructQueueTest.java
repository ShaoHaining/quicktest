package main.java.quicktest;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReconstructQueueTest {

    @Test
    public void reconstructQueue() {
        ReconstructQueue reconstructQueue = new ReconstructQueue();
        int[][] in = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] out = new int[][]{{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}};
        assertTrue(Arrays.deepToString(reconstructQueue.reconstructQueue(in)).equals(Arrays.deepToString(out)));
    }
}