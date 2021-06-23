/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3deretacak;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Minggu3deretacak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        int deret = 0;
        System.out.print("Masukkan jumlah deret = ");
        deret = nilai.nextInt();
        int[] deretanacak = new int[deret];

        for (int a = 0; a < deret; a++) {
            deretanacak[a] = (int) (Math.random() * 26);

        }
        for (int b = 0; b < deret; b++) {
            System.out.print(deretanacak[b] + " ");
        }
    }
}
        // TODO code application logic here
    
   
