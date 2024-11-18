
import java.util.*;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your ContractID:");
        int ContractID = sc.nextInt();
        System.out.println("Type your RentAmount:");
        int RentAmount = sc.nextInt();
        System.out.println("Type your TenantID:");
        int TenantID = sc.nextInt();
        System.out.println("Type your PropertyID:");
        int PropertyID = sc.nextInt();
        System.out.println("Type your contract options:");
        String type = sc.next();
        
        Contract contract;
        switch (type) {
            case "long-term":
                contract = new LongTerm(ContractID, PropertyID, TenantID, RentAmount);
                break;
                  case "short-term":
                 contract = new ShortTerm(ContractID, PropertyID, TenantID, RentAmount);
                break;
                  case "permanent":
                 contract = new Permanent(ContractID, PropertyID, TenantID, RentAmount);
                break;
            default:
                System.err.println("Wrong input");
                return;
        }
        contract.SignContract();
        System.out.println(contract);

    }
}
