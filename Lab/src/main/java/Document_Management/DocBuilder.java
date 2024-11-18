/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Document_Management;

/**
 *
 * @author Duy
 */
public interface DocBuilder {
    DocBuilder setDocumentName(String name);
    DocBuilder setDocumentType(String type);
    DocBuilder setContent(String content);
    DocBuilder setExtension(String extension);
    DocBuilder setEncryption(boolean encryption);
    Document BuildDoc();

}
