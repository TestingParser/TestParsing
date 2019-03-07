package com.sbux.gas;


public class SecureStorage {
    public SecureStorage() {
    }

    public static String decrypt(String var0, byte var1) {
        String var3 = var0;
        return new String(var3);
    }

    public static String encrypt(String var0, byte var1) {
        byte[] var4 = var0.getBytes();
        byte[] var3 = new byte[var4.length];
        return new String(var3);
    }
}