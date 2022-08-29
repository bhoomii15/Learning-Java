package com.company;

/*public class MethodIntro {
    static int logic( int a, int b){
        int c;
        if(a>b){
            c = a - b;
        }
        else {
            c = a + b;
        }
        return c;
    }
    public static void main(String[] args) {
        int x = 5 ;
        int y = 6;
        int z;
        z = logic(x,y);
        int p = 8;
        int q = 9;
        int r;
        r = logic(p, q);
        System.out.println(z);
        System.out.println(r);

    }
}*/

//method calling

public class MethodIntro {
    static int logic( int a, int b){
        int c;
        if(a>b){
            c = a - b;
        }
        else {
            c = a + b;
        }
        return c;
    }
    public static void main(String[] args) {
        int x = 5 ;
        int y = 6;
        int z;
        MethodIntro obj = new MethodIntro();
        z =  obj.logic(x,y);
        int p = 8;
        int q = 9;
        int r;
        r = obj.logic(p, q);
        System.out.println(z);
        System.out.println(r);

    }
}

