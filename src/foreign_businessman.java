/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class foreign_businessman extends businessman{
    private String country;
    
    String getcountry()
    {
        return country;
    }
    foreign_businessman(String name,String phoneNo,String companyName,String address,String country,String gender,String id)
    {
        super(name,phoneNo,companyName,address,gender,id);
        this.country=country;
    }
    
}
