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

public class Radix_Sort {
    
    public int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public void countSort(int[] arr, int exp){
        int [] result = new int[arr.length];
        int [] count_arr = new int[10];
        Arrays.fill(result, 0);
        
        for(int i = 0; i < arr.length; ++i){
            ++count_arr[(arr[i]/exp)%10];
        }
        
        for(int i = 0; i < count_arr.length-1; ++i){
            count_arr[i+1] += count_arr[i];
        }
        
        for(int i = arr.length-1; i >= 0; --i){
            count_arr[(arr[i]/exp)%10]--;
            result[count_arr[(arr[i]/exp)%10]] = arr[i]; 
        }
        
        for(int i = 0; i < arr.length ;++i){
            arr[i] = result[i];
        }
    }
    
    public int[] Sort(int [] arr){
       int max = getMax(arr);
       for(int i = 1; max % i != max; i*=10){
           countSort(arr,i);
       }
       return arr;
    }
}
