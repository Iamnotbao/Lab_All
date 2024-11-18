/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RequestCreator;


import Maintanance.midPriorityConcrete;
import Maintanance.requestProduct;

/**
 *
 * @author lethe
 */
public class midPriorityConcreteCreator implements RequestCreator{

    @Override
    public requestProduct createRequest() {
        midPriorityConcrete midPriority = new midPriorityConcrete();
        midPriority.setPriority();
        midPriority.setStatus();
        midPriority.setExpire();
        midPriority.processRequest();
        return midPriority;
    }
    
}
