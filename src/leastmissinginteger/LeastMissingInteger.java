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
        Radix_Sort c1 = new Radix_Sort();
        int [] arr = {170,45,75,90,802,24,2,66};
        int[] sorted = c1.Sort(arr);
        for(int i = 0; i < sorted.length; ++i){
            System.out.print(sorted[i] + " ");
        }
        System.out.println("");
    }
    
}
