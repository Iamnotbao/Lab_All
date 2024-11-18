/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lethe
 */
public class LongTerm implements Contract{
    private int ContractID;
    private int PropertyID;
    private int TenantID;
    private int RentAmount;

    public LongTerm(int ContractID, int PropertyID, int TenantID, int RentAmount) {
        this.ContractID = ContractID;
        this.PropertyID = PropertyID;
        this.TenantID = TenantID;
        this.RentAmount = RentAmount;
    }
    
    public int getContractID() {
        return ContractID;
    }

    public void setContractID(int ContractID) {
        this.ContractID = ContractID;
    }

    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int PropertyID) {
        this.PropertyID = PropertyID;
    }

    public int getTenantID() {
        return TenantID;
    }

    public void setTenantID(int TenantID) {
        this.TenantID = TenantID;
    }

    public int getRentAmount() {
        return RentAmount;
    }

    public void setRentAmount(int RentAmount) {
        this.RentAmount = RentAmount;
    }
    @Override
    public int BuildContractID() {
        return this.ContractID;
    }

    @Override
    public int BuildPropertyID() {
         return this.PropertyID;
    }

    @Override
    public int BuildTenantID() {
        return this.TenantID;
    }

    @Override
    public int BuildRentAmount() {
        return this.RentAmount;
    }

   @Override
     public Contract SignContract() {
        System.out.println("Signing a long-term contract.");
        return this;
    }

    @Override
    public String toString() {
        return "LongTerm{" + "ContractID=" + ContractID + ", PropertyID=" + PropertyID + ", TenantID=" + TenantID + ", RentAmount=" + RentAmount + '}';
    }
    
    
}
