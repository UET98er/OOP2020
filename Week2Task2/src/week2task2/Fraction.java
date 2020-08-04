/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2task2;

/**
 *
 * @author QTV
 */
public class Fraction {
    private int numerator ;
    private int denominator;
    

    public Fraction()
    {
        numerator = denominator = 0;
    }
    
    
    
    //Tim mau so chung nho nhat
    private int lcd(int denom1,int denom2){
        int factor = denom1;
        while ((denom1 % denom2) !=0 )
            denom1 += factor;
        return denom1;
    }
    
    //Tim UCLN
    private int gcd(int denom1, int denom2){
        int factor = denom2;
        while (denom2 != 0){
            factor = denom2;
            denom2 = denom1 % denom2;
            denom1 = factor;
        }
        return denom1;
    }
    
    //Chuyen 2 phan so ve cung mau so dua tren lcd
    private Fraction convert(int common){
        Fraction result = new Fraction() ;
        int factor = common / denominator;
        result.numerator = numerator * factor ;
        result.denominator = common;
        return result ;
    }
    //Rut gon phan so
    private Fraction reduce(){
        Fraction result = new Fraction();
        int common = 0;
        //Lay gia tri tuyet doi cua tu va mau
        int num = Math.abs(numerator);
        int den = Math.abs(denominator);
        if (num > den)
            common = gcd(num,den);
        else if (num < den)
            common = gcd(den,num);
        else 
            common = num;
        result.numerator = numerator / common ;
        result.denominator = denominator / common ;
        return result;
    }
    //Cong hai phan so
    public Fraction add(Fraction b){
        //Ktra
        if ((denominator == 0)||(b.denominator == 0))
            throw new IllegalArgumentException("Ko hop le");
        //Tim mau so chung
        int common = lcd(denominator, b.denominator);
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        //Tao phan so moi
        commonA = convert(common);
        commonB = b.convert(common);
        Fraction sum = new Fraction();
        sum.numerator = commonA.numerator + commonB.numerator;
        sum.denominator = common;
        return sum;
    }
    
    //Tru hai phan so
    public Fraction subtract(Fraction b){
        if((denominator ==0)||(b.denominator==0))
            throw new IllegalArgumentException("Ko hop le");
        int common = lcd(denominator,b.denominator);
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = b.convert(common);
        Fraction diff = new Fraction();
        diff.numerator = commonA.numerator - commonB.numerator;
        diff.denominator = common;
        return diff;
    }
    
    //Nhan phan so
    public Fraction multiply(Fraction b){
        if ((denominator == 0) || (b.denominator == 0))
            throw new IllegalArgumentException("Ko hop le");
        Fraction product = new Fraction();
        product.numerator = numerator * b.numerator;
        product.denominator = denominator * b.denominator;
        product = product.reduce();
        return product;
    }

    //Chia phan so
    public Fraction divide(Fraction b){
        if ((denominator == 0) || (b.numerator == 0))
        throw new IllegalArgumentException("invalid denominator");
        Fraction result = new Fraction();
        result.numerator = numerator * b.denominator;
        result.denominator = denominator * b.numerator;
        result = result.reduce();
        return result;
    }
    
    //So sanh
    public boolean equals(Object obj){
        if (obj instanceof Fraction){
            Fraction other = (Fraction) obj;
            if(other.getDenominator()== other.getDenominator()){
                return true ;
            } else return false;
        }
        
        return false;
    }
    
    
    public String toString(){
        String buffer = numerator + "/" + denominator;
        return buffer;
    }
    
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int num){
        numerator = num ;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int den){
        denominator = den ;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        
        f1.setNumerator(1);
        f1.setDenominator(3);
        f2.setNumerator(1);
        f2.setDenominator(6);
        
        Fraction result = new Fraction();
        result = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + result);

        result = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + result);
        
        result = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + result);
        
        result = f1.divide(f2);
        System.out.println(f1 + " / " + f2 + " = " + result);
        
        
        // TODO code application logic here
    }
    
}
