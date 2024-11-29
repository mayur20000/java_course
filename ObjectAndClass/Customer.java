package BasicsOfJava.ObjectAndClass;

public class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;

    public void displaytCustomerDetails() {
        System.out.println("Display Customer Detail \n");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Contact number : " + contactNumber);
        System.out.println("Address :" + address);
        System.out.println();

    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerId = "C101";
        customer.customerName = "John Doe";
        customer.contactNumber = 7987660323L;
        customer.address = "D089, St. Louis Street, Springfield, 62729";
        customer.displaytCustomerDetails();


    }

}
