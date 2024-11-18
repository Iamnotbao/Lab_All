/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maintanance;

/**
 *
 * @author lethe
 */
public class midPriorityConcrete extends requestProduct{
        private String priority;
        private String exipreDate;
        private String status;
    
    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void setExpire() {
        this.status = "18/11/2024"; 
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated \n" +
"completion date is [expireDay]");
    }

    @Override
    public String toString() {
        return "midPriorityConcrete{" + "priority=" + priority + ", exipreDate=" + exipreDate + ", status=" + status + '}';
    }

 
    
    
    
}
