package com;

import java.util.Scanner;

public class UserService {
        public String idCard(int num){
           String b=num%2==0?"男":"女";
            System.out.println(b);
        return b;
    }
    public static void main(String[] args) {
            UserService us=new UserService();
            Scanner sc=new Scanner(System.in);
            us.idCard(sc.nextInt());
    }
}
