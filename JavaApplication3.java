/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] bil = new int [100];
        bil[0] = 0;
        bil[1] = 1;
        int deret;
        
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan jumlah deret");
        String data = input.nextLine();
        
        deret= Integer.parseInt(data);
        
        for (int i = 0; i < deret; i++) {
            System.out.println(bil[i]+" ");    
            bil[1 + 2] = bil [1] + bil [i+1];
        }
    }
    
}

