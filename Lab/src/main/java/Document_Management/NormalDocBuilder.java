/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document_Management;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;


public class NormalDocBuilder implements DocBuilder {
    private String name;
    private String type;
    private String content;
    private String extension;
    private boolean encryption;

   
    @Override
    public DocBuilder setDocumentName(String name) {
        this.name = name;
        return this;
    }
    
       public static String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cyptoBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(cyptoBytes);
    }

 
    @Override
    public DocBuilder setDocumentType(String type) {
        this.type = type;
        return this;
    }

   
    @Override
    public DocBuilder setContent(String content) {
        this.content = content;
        return this;
    }

 
    @Override
    public DocBuilder setExtension(String extension) {
        this.extension = extension;
        return this;
    }

  @Override
    public DocBuilder setEncryption(boolean encryption) {
        this.encryption = encryption;
        return this;
    }

    
    @Override
    public Document BuildDoc() {
        return new Document(name, type, content, extension, encryption);
    }

   
}


