/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maintanance;

/**
 *
 * @author lethe
 */
public class lowPriorityConcrete extends requestProduct{
        private String priority;
        private String exipreDate;
        private String status;

    
    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void setExpire() {
        this.status = "18/11/2024"; 
    }

    @Override
    public void processRequest() {
        System.out.println("Request Denied!");
    }

    @Override
    public String toString() {
        return "lowPriorityConcrete{" + "priority=" + this.priority + ", exipreDate=" + this.exipreDate + ", status=" + this.status + '}';
    }
    
    
    
}
