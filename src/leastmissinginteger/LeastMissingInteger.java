/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leastmissinginteger;

/**
 *
 * @author abdallahmahmoud
 */
public class LeastMissingInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {99,100,2};
        System.out.println(getLeastInt(arr));
    }
    
    static public int getLeastInt(int arr[]){
        Radix_Sort.Sort(arr);
        if(arr.length == 1 && arr[0] == 0){
            return 1;
        }
        if (arr[0] > 0 && arr[arr.length - 1] > 0) {
            if (arr[0] != 1) {
                return 1;
            }
            int i;
            for (i = 1; i < arr.length; ++i) {
                if(arr[i] == arr[i-1]){
                    continue;
                }
                if (arr[i] != arr[i - 1] + 1) {
                    return arr[i - 1] + 1;
                }
            }
            return arr[arr.length - 1] + 1;
        } else if (arr[0] < 0 && arr[arr.length - 1] < 0) {
            return 1;
        } else {
            int i;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    break;
                }
            }
            if (arr[i] > 1) {
                return 1;
            }
            i++;
            for (; i < arr.length; ++i) {
                if (arr[i] == arr[i - 1]) {
                    continue;
                }
                if (arr[i] != arr[i - 1] + 1) {
                    return arr[i - 1] + 1;
                }
            }
            return arr[arr.length - 1] + 1;

        }
    }
    
}
