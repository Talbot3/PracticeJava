package lib_talbot3.utils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

public class StringHelper {
    static public String encode2Base64(String str) throws UnsupportedEncodingException {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] textByte = str.getBytes("UTF-8");
        String base64Str =  encoder.encodeToString(textByte);
        return base64Str;
    }

    static public String decoderBase64(String str) throws UnsupportedEncodingException {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encodeByte =  decoder.decode(str);
        return new String(encodeByte);
    }

    static public String[] sort(String... list) {
       List<String> toSortList =  Arrays.asList(list);
       Collections.sort(toSortList, (String strA, String strB)-> strB.compareTo(strA));
       return toSortList.toArray(new String[toSortList.size()]);
    }
}