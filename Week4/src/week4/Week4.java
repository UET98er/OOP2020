/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 *
 * @author QTV
 */
public class Week4 {
    public static int max2Int(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    
    public static void min(int arr[]){
        if(arr.length > 100 || arr.length == 0){
            System.out.println("Again");
        }
        else{
        int min = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Phan tu be nhat la " +min);
    }
    }
    class calculateBMI{
    public String calculateBMI(double w ,double h){
        double BMI = 0 ;
        NumberFormat numf = NumberFormat.getNumberInstance();
        numf.setMaximumFractionDigits(1);
        if (w <= 0 || h <=0){
            System.out.println("Again!");
        } else {
            BMI = (w / ( h * h ));
            System.out.println(BMI);
            if(BMI < 18.5){
                System.out.println("Thieu can");
            }
            if(BMI >= 18.5 || BMI <= 22.9){
                System.out.println("Binh thuong");
            }
            if(BMI >= 23 || BMI <= 24.9){
                System.out.println("Thua can");
            }
            if(BMI >= 25){
                System.out.println("Beo phi");
            }
        }
        return numf.format(BMI);
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int compare ;
        compare = max2Int(a,b);
        System.out.println("So lon hon la " + compare);
        int c[] = { 35, 23, 47, 51 };
        min(c);
        
        Week4 obj = new Week4();
        Week4.calculateBMI x = obj.new calculateBMI();
        double w = 48;
        double h = 1.65;
        x.calculateBMI(w, h);
        
        // TODO code application logic here
    }
    
}
