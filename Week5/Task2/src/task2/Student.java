/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author QTV
 */
public class Student extends Person {
    private String program ;
    private int year;
    private double fee ;

    public Student(String name,String address,String program,int year,double fee){
            super(name ,address);
            this.program = program;
            this.year = year ;
            this.fee = fee ;
    }
    public String gerProgram(){
            return program;
    }
    public int getYear(){
            return year;
    }
    public double getFee(){
            return fee;
    }
    public void setProgram(String program){
            this.program = program ;
    }
    public void setYear(int year){
            this.year = year ;
    }
    public void setFee(double fee){
            this.fee = fee ;
    }

    @Override
    public String toString(){
            return "Student[" + "Person[" 
                    + super.toString()
                    + "program" + program
                    + ",year="  + year
                    + ",fee"    + fee ;
    }
}
