package lib_talbot3.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

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
}