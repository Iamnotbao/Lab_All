/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Document_Management;

/**
 *
 * @author Duy
 */


public class Document {
    private String name;
    private String type;
    private String content;
    private String extension;
    private boolean encryption;

    public Document(String name, String type, String content, String extension, boolean encryption) {
        this.name = name;
        this.type = type;
        this.content = content;
        this.extension = extension;
        this.encryption = encryption;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getExtension() {
        return extension;
    }

    public boolean isEncrypted() {
        return encryption;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setEncryption(boolean encryption) {
        this.encryption = encryption;
    }

    @Override
    public String toString() {
        return "Document [name=" + name + ", type=" + type + ", content=" + content + 
                ", extension=" + extension + ", encryption=" + encryption + "]";
    }

    Object setDocumentName(String pC1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
