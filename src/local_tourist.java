/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class local_tourist extends Tourist implements Iinfo{
    
    local_tourist(String name,String phoneNo,String address,String gender,String id)
    {
        super(name,phoneNo,address,gender,id);
    }
    
    public String studentinfo(foreign_student ob)
    {
        return ob.getid()+ob.getinstitute()+ob.getcountry();
    }
}
