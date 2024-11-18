/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RequestCreator;

import Maintanance.highPriorityConcrete;
import Maintanance.requestProduct;

/**
 *
 * @author lethe
 */
public class highPriorityConcreteCreator implements RequestCreator{

    @Override
    public requestProduct createRequest() {
        requestProduct highPriority = new highPriorityConcrete();
        highPriority.setPriority();
        highPriority.setStatus();
        highPriority.setExpire();
        highPriority.processRequest();
        return highPriority;
    }
    
}
