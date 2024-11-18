/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document_Management;

import static Document_Management.ConfidentialDocBuilder.decrypt;
import static Document_Management.ConfidentialDocBuilder.generateKey;
import static Document_Management.NormalDocBuilder.encrypt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;

/**
 *
 * @author Duy
 */
public class Client {

    public static void main(String[] args) {
        try {
            SecretKey key = generateKey();
            DocBuilder normaldoc = new NormalDocBuilder();
            Document normalDocument = normaldoc
                    .setDocumentName("Property inspection report 1")
                    .setDocumentType("Normal")
                    .setContent("")
                    .setExtension(".txt")
                    .setEncryption(false)
                    .BuildDoc();
                String encryptoMessage = encrypt(normalDocument.toString(), key);

            System.out.println(encryptoMessage);

            DocBuilder confinedoc = new ConfidentialDocBuilder();
            Document confineDocument = (Document) confinedoc
                    .setDocumentName("Lease agreements 1")
                    .setDocumentType("Confidential")
                    .setContent("")
                    .setExtension(".zip")
                    .setEncryption(true)
                    .BuildDoc();
                    String decrypteMessage = decrypt(encryptoMessage,key);
                    System.out.println(decrypteMessage);
//
//            System.out.println(confineDocument);
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

}
