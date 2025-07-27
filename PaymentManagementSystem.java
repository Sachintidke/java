import java.util.*; 
class Customer { 
int id; 
String name; 
String email; 
 
Customer(int id, String name, String email) { 
this.id = id; 
this.name = name; 
this.email = email; 
} 
} 
 
class Payment { 
int paymentId; 
int customerId; 
double amount; 
Date date; 
 
Payment(int paymentId, int customerId, double amount, Date date) { 
this.paymentId = paymentId; 
this.customerId = customerId; 
this.amount = amount; 
this.date = date; 
}  
} 
 
public class PaymentManagementSystem { 
static Scanner sc = new Scanner(System.in); 
static List<Customer> customers = new ArrayList<>(); 
static List<Payment> payments = new ArrayList<>(); 
static int customerIdCounter = 1; 
static int paymentIdCounter = 1; 
 
public static void main(String[] args) { 
int choice; 
do { 
System.out.println("\n--- Payment Management System ---"); 
System.out.println("1. Add Customer"); 
System.out.println("2. Make Payment"); 
System.out.println("3. View Payment History"); 
System.out.println("4. Exit"); 
System.out.print("Enter your choice: "); 
choice = sc.nextInt(); 
 
switch (choice) { 
case 1: 
addCustomer(); 
break; 
case 2: 
makePayment(); 
break; 
case 3: 
viewPayments(); 
break; 
case 4: 
System.out.println("Exiting... Goodbye!"); 
break; 
default: 
System.out.println("Invalid choice. Try again."); 
} 
} while (choice != 4); 
} 
 
static void addCustomer() { 
sc.nextLine(); // consume newline 
System.out.print("Enter customer name: "); 
String name = sc.nextLine(); 
System.out.print("Enter customer email: "); 
String email = sc.nextLine(); 
 
Customer customer = new Customer(customerIdCounter++, name, email); 
customers.add(customer); 
System.out.println("Customer added successfully! ID: " + customer.id); 
} 
 
static void makePayment() { 
System.out.print("Enter customer ID: "); 
int id = sc.nextInt(); 
Customer customer = findCustomerById(id); 
if (customer == null) { 
System.out.println("Customer not found!"); 
return; 
} 
 
System.out.print("Enter amount: "); 
double amount = sc.nextDouble(); 
 
Payment payment = new Payment(paymentIdCounter++, id, amount, new  
Date()); 
payments.add(payment); 
System.out.println("Payment successful!"); 
} 
 
static void viewPayments() { 
if (payments.isEmpty()) { 
System.out.println("No payments found."); 
return; 
} 
 
System.out.println("\n--- Payment History ---"); 
for (Payment p : payments) { 
Customer c = findCustomerById(p.customerId); 
String name = (c != null) ? c.name : "Unknown"; 
System.out.println("Payment ID: " + p.paymentId); 
System.out.println("Customer Name: " + name); 
System.out.println("Amount: ₹" + p.amount); 
System.out.println("Date: " + p.date); 
System.out.println(" ------------------------ "); 
} 
} 
 
static Customer findCustomerById(int id) { 
for (Customer c : customers) { 
if (c.id == id) return c; 
} 
return null; 
} 
} 
