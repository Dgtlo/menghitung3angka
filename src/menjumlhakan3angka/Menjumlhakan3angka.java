/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menjumlhakan3angka;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Menjumlhakan3angka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka,total,x=0,y=0,z=0;
        Scanner input = new Scanner (System.in);
        System.out.print ("masukan angka (0-1000)= ");
        angka = input.nextInt();
        if (angka < 0 || angka > 1000)
        {
        System.out.println ("inputan salah");
        }
        else if (angka == 1000)
        {
        System.out.println ("Total = "+angka/1000);
        }
        else 
        {
        if (angka >=100)
        {
        x = angka/100;
        angka = angka%100;
        }
        if (angka >=10)
        {
        y = angka/10;
        angka = angka%10;
        {
        if (angka >=0)
        {
        z = angka; 
        {
        total = x+y+z;
        }
        System.out.println ("Total ="+total);
        }
        }
        }
        }
    }
    
}
