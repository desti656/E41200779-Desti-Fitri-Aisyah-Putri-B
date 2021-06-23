/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2minggu7;

/**
 *
 * @author desti fitri
 */
public class Tugas2minggu7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        
        ref = b;
        ref.callthis();
        
        ref = c;
        ref.callthis();
        
        ref = a;
        ref.callthis();
    }
    
}
        // TODO code application logic here
   
    
