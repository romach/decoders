package com.roamch007;

import org.apache.commons.codec.binary.Hex;

public class EncodeHex {
    public static void main(String[] args) {
        System.out.println(new String(Hex.encodeHex(new byte[]{-3,69,14,5,118,51,-93,-1,4})).toUpperCase());
    }
}
