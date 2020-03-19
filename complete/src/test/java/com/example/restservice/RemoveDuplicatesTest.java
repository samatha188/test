package com.example.restservice;

import com.example.RemoveDuplicates;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
public class RemoveDuplicatesTest {

    @Test
    public void areDuplicatesRemovedValidTest(){
        int[] input={1,1,2,2,3,3};
        Set<Integer> set = IntStream.of(input).boxed().collect(Collectors.toSet());
        TreeSet<Integer> treeSet= new TreeSet<Integer>(set);
        assertEquals(new ArrayList<Integer>(treeSet),RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void areDuplicatesRemovedTestwithSamevalues(){
        int[] input={1,1,1,1,1,1,1,1,1};
        Set<Integer> set = IntStream.of(input).boxed().collect(Collectors.toSet());
        TreeSet<Integer> treeSet= new TreeSet<Integer>(set);
        assertEquals(new ArrayList<Integer>(treeSet),RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void areDuplicatesRemovedTestwithNegativevalues(){
        int[] input={-3,-2,-2,-2,-1,-1,0,1,2,2,2,2};
        Set<Integer> set = IntStream.of(input).boxed().collect(Collectors.toSet());
        TreeSet<Integer> treeSet= new TreeSet<Integer>(set);
        assertEquals(new ArrayList<Integer>(treeSet),RemoveDuplicates.removeDuplicates(input));
    }
    @Test
    public void areDuplicatesRemovedTestWithEmptyList(){
        int[] input={};
        assertEquals(new ArrayList<Integer>(),RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void areDuplicatesRemovedTestWithSingleElement(){
        int[] input={1};
        List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
        assertEquals(list,RemoveDuplicates.removeDuplicates(input));
    }
}
