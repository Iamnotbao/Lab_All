/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document_Management;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author Duy
 */
public class ConfidentialDocBuilder implements DocBuilder {

    private String name;
    private String type;
    private String content;
    private String extension;
    private boolean encryption;

    public static  SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }

 

    ;
    public static String decrypt(String encyptedText, SecretKey key) throws Exception {

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptoBytes = cipher.doFinal(Base64.getDecoder().decode(encyptedText.getBytes()));
        return new String(decryptoBytes);
    }

    @Override
    public DocBuilder setDocumentName(String name) {
        this.name = name;
        return this;
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
