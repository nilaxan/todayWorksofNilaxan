package com;

/**
 * Created with IntelliJ IDEA.
 * User: tharanga
 * Date: 6/7/13
 * Time: 6:18 PM
 * To change this template use File | Settings | File Templates.
 */
  /* Comets are not persistent */
public class Comet {
    int id;
    String name;
    String address;
    int age;
    String email;
    String mobileNo;

    public Comet(int id, String name,String address,int age,String email,String mobileNo ) {
        this.id = id;
        this.name = name;
        this.address=address;
        this.age=age;
        this.email=email;
        this.mobileNo=mobileNo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
         this.age=age;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getMobileNo()
    {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo)
    {
        this.mobileNo=mobileNo;
    }
}
