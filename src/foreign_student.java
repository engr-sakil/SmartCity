/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class foreign_student extends Student{
    
    private String country;
    
    String getcountry()
    {
        return country;
    }
    foreign_student(String name,String phoneNo,String institute,String gender,String id,String country)
    {
        super(name,phoneNo,institute,gender,id);
        this.country=country;
    }
    String busineaamaninfo(foreign_businessman ob)
    {
        if(ob.getcountry().equals("usa"))
        {
             return "ID: "+ob.getid()+" "+"Name: "+ob.getname()+" Company Name : "+ob.getcompanyName();
        }
        return null;
    }
}
