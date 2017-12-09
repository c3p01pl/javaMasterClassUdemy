public class VipCustomer {
    private String vipCustomerName;
    private Double creditLimit;
    private String email;

    public VipCustomer(String vipCustomerName, Double creditLimit, String email) {
        this.vipCustomerName = vipCustomerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("Bob Bob", 144400.0, "aa@tmt.org");
    }

    public VipCustomer(String vipCustomerName, String email) {
        this(vipCustomerName,10000.0, email);

    }

    public String getVipCustomerName() {
        return vipCustomerName;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
