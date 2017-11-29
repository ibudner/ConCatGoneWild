package com.company;

public class Main {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for(int j=68;j<109;j++){
            sb.append((char)j);
        }
        StringBuffer sb2 = new StringBuffer();
        for(int j=35;j<60;j++){
            sb2.append((char)j);
        }

        String t1 = sb.toString();
        System.out.println(t1);
        String t2 = sb2.toString();
        System.out.println(t2);


    }
}
