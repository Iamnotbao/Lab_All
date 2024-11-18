/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RequestCreator;

import Maintanance.lowPriorityConcrete;
import Maintanance.requestProduct;

/**
 *
 * @author lethe
 */
public class lowPriorityConcreteCreator implements RequestCreator{

    @Override
    public requestProduct createRequest() {
        requestProduct lowPriority = new lowPriorityConcrete();
        lowPriority.setPriority();
        lowPriority.setStatus();
        lowPriority.setExpire();
        lowPriority.processRequest();
        return lowPriority;
    }
    
}
