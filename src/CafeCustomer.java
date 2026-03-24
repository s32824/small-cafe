import java.util.Objects;
public class CafeCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getFullName() { return firstName + " " + lastName; }
    @Override
    public String toString() {
        return "Customer: " + getFullName() + " | ID: " + customerId + " | Email: " + email;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CafeCustomer)) return false;
        CafeCustomer that = (CafeCustomer) o;
        return customerId == that.customerId || Objects.equals(email, that.email);
    }
}
