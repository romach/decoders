package com.roamch007;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.util.Arrays;

public class DecodeHex {
    public static void main(String[] args) throws DecoderException {
        byte[] decoded = Hex.decodeHex("01040000020202EF050400310604002F096500250A71FFE0FFE004100B6700D30B683F00FF016C0C6700D0");
        System.out.println(Arrays.toString(decoded));
    }
}
