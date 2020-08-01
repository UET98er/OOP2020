/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;


/**
 *
 * @author QTV
 */
public class StudentManagement {
    
    //Cau 5
    public static void sameGroup(Student s1, Student s2){
        boolean value ;
        if (s1.getGroup()==s2.getGroup())
            value = true ;
        else
            value = false;
        if (value = true)
            System.out.println("cung lop");
        else
            System.out.println("khac lop");
    }
public Student st[] = new Student[100];

}
