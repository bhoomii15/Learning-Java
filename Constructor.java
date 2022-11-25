package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 44;
        name = "bhoomi";
    }

    public String getName(){ return name; }
    public void setName(String n){ name = n; }

    public int getId(){ return id; }
    public void setId(int i){ id = i; }
}


public class Constructor {

    public static void main(String[] args) {

        MyMainEmployee bhoomi =  new MyMainEmployee();

       /* bhoomi.setId(44);
        bhoomi.setName("Sharma");*/

        System.out.println(bhoomi.getId());
        System.out.println(bhoomi.getName());



    }
}
