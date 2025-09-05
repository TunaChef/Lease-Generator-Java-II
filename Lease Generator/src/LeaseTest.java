import java.util.Scanner;

public class LeaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a lease object
        Lease lease = new Lease();
        
        // Get tenant details from user
        System.out.print("Enter tenant name: ");
        String name = scanner.nextLine();
        lease.setTenantName(name);
        
        System.out.println("Enter apartment size in square feet: ");
        double size = scanner.nextDouble();
        lease.setSize(size);
        
        System.out.println("Enter number of bedrooms: ");
        int bedrooms = scanner.nextInt();
        lease.setBedrooms(bedrooms);
        
        System.out.println("Enter number of bathrooms: ");
        double bathrooms = scanner.nextDouble();
        lease.setBathrooms(bathrooms);
        
        // Generate and display lease
        System.out.println("\n" + lease.getLease());

        scanner.close(); //close the scanner
    }
}