/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab;

import RequestCreator.RequestCreator;
import RequestCreator.highPriorityConcreteCreator;
import RequestCreator.lowPriorityConcreteCreator;
import RequestCreator.midPriorityConcreteCreator;
import java.util.*;

/**
 *
 * @author lethe
 */
public class Lab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose request :");
        String in = sc.next();
        
        RequestCreator req;
        switch(in) {
            case "low":
                req = new lowPriorityConcreteCreator();
                break;
                case "mid":
                req = new midPriorityConcreteCreator();
                break;
                case "high":
                req = new highPriorityConcreteCreator();
                break;
                
            default:
                throw new AssertionError();
        }
        req.createRequest();
       
    }
        
}
