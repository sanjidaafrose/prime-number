/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber1;

/**
 *
 * @author USER
 */
public class PrimeNumber1 {

    /**
     * @param args the command line arguments
     */
    /*static int number = 15;
    static int flag = 0;*/
    public static void main(String[] args) {
        int number = 13, flag = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                flag++;
            }
        }
        if (flag == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
