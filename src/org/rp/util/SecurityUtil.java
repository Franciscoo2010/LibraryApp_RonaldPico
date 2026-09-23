
package org.rp.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Ronald pico
 * @see org.rp.util.SecurityUtil
 * @version 1.0.0
 * crea la clase SecurityUtil
 * crea la contrseña  */
public class SecurityUtil {
    public static String hashDHA256(String password){
        /**
         * hace la condicion y nos regresa con extiyo
         */
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder(2 * encodedhash.length);
            for (byte b : encodedhash){
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() ==1 ){
                    
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException("Error al encriptar la contraseña", e);
    
        }
        
    }
}