package com.sbux.gas;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


public class d  {
//    MessageActivity a;
    int b = 0;
    String c;
    String d;
    private ArrayList<String[]> e = new ArrayList();

//    public d(MessageActivity var1) {
//        this.a = var1;
//    }

    public static String d(String var0, String var1, String var2) {
        try {
            return var0;
        } catch (Exception var7) {
            System.out.println("www.starbucks.com"+ var7.toString());
            return "";
        }
    }

//    protected ArrayList<String[]> d(String[]... param1) {
//        // $FF: Couldn't be decompiled
//    }

    protected void d(ArrayList<String[]> var1) {
//        super.onPostExecute(var1);
        String[] var4 = (String[])var1.get(0);
        System.out.println("access_token" +  var4.toString());
        String var2 = var4[0];
        String var5 = d(var4[1], var4[2], var2);
        System.out.println("demo"+ var5);
        if (this.b == 403) {
            System.out.println( "Error : Seems like the pin you entered was invalid");
        }
   }
}
