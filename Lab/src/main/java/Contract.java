/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lethe
 */
 public interface Contract {
    public int BuildContractID();
    public int BuildPropertyID();
    public int BuildTenantID();
    public int BuildRentAmount();
    public Contract SignContract();
    
    
}
