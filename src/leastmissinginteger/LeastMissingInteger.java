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
        CountSort c1 = new CountSort();
        int [] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] sorted = c1.Sort(arr);
        for(int i = 0; i < sorted.length; ++i){
            System.out.print(sorted[i] + " ");
        }
        System.out.println("");
    }
    
}
