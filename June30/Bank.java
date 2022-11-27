public class Bank {
    protected String bank_name;
    protected String address;

    public Bank() {
    }

    public Bank(String bank_name, String address) {
        this.bank_name = bank_name;
        this.address = address;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Branch extends Bank {
    protected String branch_name;

    public Branch() {
    }

    public Branch(String bank_name, String address, String branch_name) {
        super(bank_name, address);
        this.branch_name = branch_name;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Commercial Bank", "Kingston, Jamaica");
        Branch branch = new Branch("NCB Bank", "Morant Bay, St. Thomas", "Morant Bay");
        System.out.println("==================================================");
        System.out.println("From Parent Class Bank");
        System.out.println("Bank Name: " + bank.getBank_name());
        System.out.println("Bank Address: " + bank.getAddress());
        System.out.println("==================================================");
        System.out.println("From Child Class Branch");
        System.out.println("Bank Name: " + branch.getBank_name());
        System.out.println("Bank Address: " + branch.getAddress());
        System.out.println("Bank Branch Name: " + branch.getBranch_name());
        System.out.println("==================================================");
    }
}
