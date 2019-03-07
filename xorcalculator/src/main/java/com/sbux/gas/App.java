package com.sbux.gas;

import java.util.Random;
import java.util.ArrayList;
import java.util.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        String pin = "0000"; //EXercise 8
        String str="";
        Boolean flag = true;
        int counter;

        for(counter=0;counter<=9999;counter++)
        {
            pin = String.format("%04d", counter);
            d d = new d();
            str = d.d("Hello",pin,"starbucks");
            if(!str.isEmpty()) System.out.println(str);
            flag = (str.matches("^[a-zA-Z0-9-]+$"));
            if(flag == true) break;
        }

}
}