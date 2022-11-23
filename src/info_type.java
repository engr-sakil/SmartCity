/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class info_type {
    
    private String infoType;
    private String id;
    private String name;
    private String phoneNo;
    private String location;
    
    String getinfoType()
    {
        return infoType;
    }
    String getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    String getphoneNo()
    {
        return phoneNo;
    }
    String getlocation()
    {
        return location;
    }
    
    info_type(String infoType,String id,String name,String phoneNo,String location)
    {
        this.infoType=infoType;
        this.id=id;
        this.name=name;
        this.phoneNo=phoneNo;
        this.location=location;
    }
    private String sql;
    
}
