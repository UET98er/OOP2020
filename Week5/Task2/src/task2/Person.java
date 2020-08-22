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
public class Person {
    private String name,address ;

    public Person(String name,String address){
            this.name = name ;
            this.address = address ;
    }

    public String getName(){
            return name ;
    }
    public String getAddress(){
            return address ;
    }
    public void setAddress(String address){
            this.address = address ;
    }

    @Override
    public String toString(){
            return "Person[name=" + name + ",address=" + address +"]";
    }
}
