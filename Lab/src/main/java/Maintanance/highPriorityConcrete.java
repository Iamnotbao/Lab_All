/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maintanance;

/**
 *
 * @author lethe
 */
public class highPriorityConcrete extends requestProduct{
        public String priority;
        public String exipreDate;
        public String status;
    
    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void setExpire() {
        this.status = "19/11/2024"; 
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our \n" +
"Administer will contact you immediately !");
    }

    @Override
    public String toString() {
        return "highPriorityConcrete{" + "priority=" + priority + ", exipreDate=" + exipreDate + ", status=" + status + '}';
    }

    
    
    
    
}
