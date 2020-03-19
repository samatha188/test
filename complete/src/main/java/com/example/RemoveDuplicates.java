package com.example;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static List removeDuplicates(int array[]){
        List<Integer> list= new ArrayList<>();
        if (array.length == 0)
            return list;
        if( array.length == 1)
        {
            list.add(array[0]);
            return list;
        }
        int j = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i + 1])
                array[j++] = array[i];
        }
        array[j++] = array[array.length-1];
         for(int i=0;i<j;i++){
             list.add(array[i]);
         }
        return list;
    }
    public static void main(String args[]){
        int input[]= {1,1,1,2,2,2,3,4,4,5,6,9,9};
        removeDuplicates(input);
        int input2[]={1};
        removeDuplicates(input);

    }
}
