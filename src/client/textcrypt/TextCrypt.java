package client.textcrypt;

import java.io.IOException;  
import java.io.UnsupportedEncodingException;  
import java.security.InvalidKeyException;  
import java.security.NoSuchAlgorithmException;  
import java.security.SecureRandom;  
  
import javax.crypto.BadPaddingException;  
import javax.crypto.Cipher;  
import javax.crypto.IllegalBlockSizeException;  
import javax.crypto.KeyGenerator;  
import javax.crypto.NoSuchPaddingException;  
import javax.crypto.SecretKey;  
import javax.crypto.spec.SecretKeySpec;  

import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
  
//import org.apache.commons.lang3.StringUtils;  
  
import sun.misc.BASE64Decoder;  
import sun.misc.BASE64Encoder;  

/**
 *
 * @author TG
 */

public class TextCrypt {

  public TextCrypt() {
    System.out.print("Crypt ready");
  }

  public static SecretKey getKey(String keySeed) {    
        if (keySeed == null) {    
            keySeed = System.getenv("AES_SYS_KEY");    
        }    
        if (keySeed == null) {    
            keySeed = System.getProperty("AES_SYS_KEY");    
        }    
        if (keySeed == null || keySeed.trim().length() == 0) {    
            keySeed = "DTJ^#@"; //default seed      
        }    
        try {    
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");    
            secureRandom.setSeed(keySeed.getBytes());    
            KeyGenerator generator = KeyGenerator.getInstance("AES");    
            generator.init(secureRandom);    
            return generator.generateKey();    
        } catch (Exception e) {    
            throw new RuntimeException(e);    
        }    
  }
   /**
     * Encrypt the specified plain text plainText according to the key.
     *
     * @param plainText clear text
     * @return encrypted ciphertext.
     */
  public static final String encrypt(String plainText, SecretKey secretKey) {  
    //Key secretKey = getKey(seed);  
    try {  
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);  
        byte[] p = plainText.getBytes("UTF-8");  
        byte[] result = cipher.doFinal(p);  
        BASE64Encoder encoder = new BASE64Encoder();  
        String encoded = encoder.encode(result);  
        return encoded;  
    } catch (Exception e) {  
        throw new RuntimeException(e);  
    }   
  }  

  /**
    * Decrypt the specified ciphertext cipherText according to the key.
    *
    * @param cipherText ciphertext
    * @return decrypted plaintext.
    */ 
  public static final String decrypt(String cipherText, SecretKey secretKey) {  
    //Key secretKey = getKey(seed);  
    try {  
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.DECRYPT_MODE, secretKey);  
        BASE64Decoder decoder = new BASE64Decoder();  
        byte[] c = decoder.decodeBuffer(cipherText);  
        byte[] result = cipher.doFinal(c);  
        String plainText = new String(result, "UTF-8");  
        return plainText;  
    } catch (Exception e) {  
        throw new RuntimeException(e);  
    }  
  }  

}  
