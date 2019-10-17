/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan35programtunjangan;

import java.util.Scanner;


/**
 *
 * @author user
 */
class User {
    private String status;
    private double gajiPokok;
    double tunjangan,totalGaji;  
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
   public double input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Berapa Gaji Pokok Perbulan : Rp. ");
        gajiPokok = input.nextDouble();
        
        System.out.println("Status Anda ? (Menikah/Belum) : ");
         status = input.next();
            
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok : "+gajiPokok);
        if(status.equalsIgnoreCase("menikah")){
            tunjangan = (Double) (0.35*gajiPokok);                        
        } else{
          tunjangan = 0.0;             
        }
 
        return tunjangan ;
    }
    
    public double totalGaji(){
        totalGaji= gajiPokok + tunjangan;
    return totalGaji;
    }
}
