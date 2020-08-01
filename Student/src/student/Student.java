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
public class Student {
    //Cau 1
    private String name = "Nguyen Van An" ;
    private String id = "17020001";
    private String group = "K62CC" ;
    private String email = "17020001@vnu.edu.vn";

//Cau 2
public void setName(String name){
    this.name = name ;
}   
public String getName(){
    return name ;
}
public void setID(String id){
    this.id = id ;
}   
public String getID(){
    return id ;
}    
public void setGroup(String group){
    this.group = group ;
}   
public String getGroup(){
    return group ;
}
public void setEmail(String email){
    this.email = email ;
}   
public String getEmail(){
    return email ;
}

//Cau 3
public String getInfo(){
    return this.name + "-" + this.id + "-" + this.group + "-" + "-" + this.email ;
}

//Cau 4a
public Student(){
    name = "Student";
    id = "000";
    group = "K62CB";
    email = "uet@vnu.edu.vn";
}

//4b
public Student(String name,String id,String email){
    name = name;
    id = id;
    email = email;
    group = "K62CB";
}

//4c
public Student(Student s){
    name = s.getName();
    id = s.getID();
    email = s.getEmail();
    group = s.getGroup();
}
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
    }
    
}
