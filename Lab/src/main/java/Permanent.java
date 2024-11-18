
public class Permanent implements Contract {

    private int ContractID;
    private int RentAmount;
    private int TenantID;
    private int PropertyID;

    public Permanent(int ContractID, int RentAmount, int TenantID, int PropertyID) {
        this.ContractID = ContractID;
        this.RentAmount = RentAmount;
        this.TenantID = TenantID;
        this.PropertyID = PropertyID;
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
        System.out.println("Signing a permanent contract.");
        return this;
    }

    public int getContractID() {
        return ContractID;
    }

    public void setContractID(int ContractID) {
        this.ContractID = ContractID;
    }

    public int getRentalAmount() {
        return RentAmount;
    }

    public void setRentalAmount(int RentAmount) {
        this.RentAmount = RentAmount;
    }

    public int getTenantID() {
        return TenantID;
    }

    public void setTenantID(int TenantID) {
        this.TenantID = TenantID;
    }

    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int PropertyID) {
        this.PropertyID = PropertyID;
    }

    public String toString() {
        return "LongTerm{" + "ContractID=" + ContractID + ", PropertyID=" + PropertyID + ", TenantID=" + TenantID + ", RentAmount=" + RentAmount + '}';
    }

}
