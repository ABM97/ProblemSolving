/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leastmissinginteger;

import java.util.Arrays;

/**
 *
 * @author abdallahmahmoud
 */

public class CountSort {
    
    public int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public int[] Sort(int[] arr){
        int [] result = new int[arr.length];
        int [] count_arr = new int [getMax(arr)+1];
        Arrays.fill(result, 0);
        
        for(int i = 0; i < arr.length; ++i){
            ++count_arr[arr[i]];
        }
        
        for(int i = 0; i < count_arr.length-1; ++i){
            count_arr[i+1] += count_arr[i];
        }
        
        for(int i = arr.length-1; i >= 0; --i){
            count_arr[arr[i]]--;
            result[count_arr[arr[i]]] = arr[i]; 
        }
        return result;
    }
}
