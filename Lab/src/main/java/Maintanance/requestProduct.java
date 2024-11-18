/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maintanance;

/**
 *
 * @author lethe
 */
public abstract class requestProduct {
    public String priority;
    public String exipreDate;
    public String status;
    
   public abstract void setPriority();
   public abstract void setStatus();
   public abstract void setExpire();
   public abstract void processRequest();
}
