/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4tugasminmax;
    import java.util.Scanner;


/**
 *
 * @author User
 */
public class Minggu4Tugasminmax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int banyak_data, avg;
        int number, sum = 0;
        
        
        System.out.print("Masukkan banyaknya data nilai = ");
        banyak_data = input.nextInt();
      
        
        int[] angka = new int[banyak_data];
        
        
        for(int i = 0; i < banyak_data; i++){ 
            number = i + 1;
            System.out.print("Masukkan nilai ke-"+ number + " = ");
            angka[i] = input.nextInt();
        }
        
        System.out.println("");
        
        int max = angka[0];
        int min = angka[0];
        for(int i = 0 ;i < angka.length ; i++){
            
            sum += angka[i];  
            
            if(angka[i] > max) {
                max = angka[i];
            } else if(angka[i] < min) {
                min = angka[i];
            }
        }
       
        avg = sum/angka.length;
        
        
        System.out.println("Nilai minimum = "+ min);
        System.out.println("Nilai maximum = "+ max);
        System.out.println("Nilai rata ratanya adalah = "+ avg);
    }  
}
      
   
   
