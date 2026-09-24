
package org.rp.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * crea la clase SecurityUtil que nos da la seguridad y constraseñas
 * @author Ronald pico
 * @see org.rp.util.SecurityUtil
 * @version 1.0.0
  */
public class SecurityUtil {
    public static String hashDHA256(String password){
       /**
     * Encripta una contraseña en texto plano  SHA-256.
     * @param password La contraseña .
     * @return El string resultante del hash SHA-256  .
     * @throws  si no esta disponible nos na una exception .
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