package com.jatinderaujla.techniques.arrays.reverserorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseTraversalTechnique {

    public Integer[] leaderElementsBruteForce(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                leaders.add(arr[i]);
            }
        }

        return leaders.toArray(new Integer[0]);
    }

    /**
     * Given an array arr
     * and found all the leader elements from the given array
     * Leader elements is an elements whose all the right side elements are smaller than it.
     * e.g. arr = [3, 11, 5 ,9, 6, 8]
     * leaders = [11, 9, 8]
     */
    public Integer[] leaderElements(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxEl = arr[arr.length - 1];
        leaders.add(maxEl);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxEl) {
                maxEl = arr[i];
                leaders.add(maxEl);
            }
        }
        Collections.reverse(leaders);
        return leaders.toArray(new Integer[0]);
    }
}
