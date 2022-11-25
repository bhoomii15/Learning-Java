package com.company;

//q1
class Employe{
    int income;
    String Name;

    public int getIncome(){
        return income;
    }

    public String getName(){
        return Name;
    }

    public void setName(String n){
        Name = n;
        //nothing to be returned here
    }
}
public class PSch8 {
    public static void main(String[] args) {
        // q1
        Employe bhoomi = new Employe();
        bhoomi.income = 500000;
        bhoomi.setName("Bhoomii");
        System.out.println(bhoomi.getName());
        System.out.println(bhoomi.getIncome());
    }
}
