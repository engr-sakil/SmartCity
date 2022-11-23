/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class local_student extends Student{
    
    local_student(String name,String phoneNo,String institute,String gender,String id)
    {
        super(name,phoneNo,institute,gender,id);
    }
    
    String busineaamaninfo(foreign_businessman ob)
    {
        if(ob.getcompanyName().equals("dcl"))
        {
             return "ID: "+ob.getid()+" "+"Name: "+ob.getname();
        }
        return null;
    }
}
