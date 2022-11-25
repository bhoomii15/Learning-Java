package com.company;



class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}

public class AccessModi {

    public static void main(String[] args) {

        MyEmployee bhoomi  = new MyEmployee();

        /*bhoomi.id = 44;  will throw error because of private access modifier above
        bhoomi.name = "sharma";*/

        bhoomi.setName("Sharma");
        bhoomi.setId(44);

        System.out.println(bhoomi.getId());
        System.out.println(bhoomi.getName());


    }
}
