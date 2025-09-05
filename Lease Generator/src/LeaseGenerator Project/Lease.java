/**
 * https://github.com/TunaChef/Lease-Generator-Java-II
 * Programmer name: Ryon Edwards
 * Class: Java II CMSY-167-300
 * Purpose: This is the lease class that creates and prints the lease
 */

public class Lease {
    // Private fields
    private String tenantName;
    private String apartmentNumber;
    private int numberOfBedrooms;
    private double sizeInSquareFeet;
    private double numberOfBathrooms;
    private StringBuilder leaseBuilder;

    // Default constructor for lease class, with tenant, apartment #, # bedrooms, bathrooms, and size
    public Lease() {
    	this.tenantName = "Tenant"; //Default information inputs since not provided by user
    	this.apartmentNumber = "0";
    	this.numberOfBedrooms = 0;
    	this.sizeInSquareFeet = 0.0;
    	this.numberOfBathrooms = 0.0;
    	this.leaseBuilder = new StringBuilder();
    }

    // Getters and setters for all fields
    public String getTenantName() {
    	return tenantName;
    }
    
    public void setTenantName(String tenantName) {
    	this.tenantName = tenantName;
    }
    
    public String getApartmentNumber() {
    	return apartmentNumber;
    }
    
    public void setApartmentNumber(String apartmentNumber) {
    	this.apartmentNumber = apartmentNumber;
    }
    
    public int getBedrooms() {
    	return numberOfBedrooms;
    }
    
    public void setBedrooms(int bedrooms) {
    	this.numberOfBedrooms = bedrooms;
    }
    
    public double getSize() {
    	return sizeInSquareFeet;
    }
    
    public void setSize(double size) {
    	this.sizeInSquareFeet = size;
    }
    
    public double getBathrooms() {
    	return numberOfBathrooms;
    }
    
    public void setBathrooms(double bathrooms) {
    	this.numberOfBathrooms = bathrooms;
    }
    // Calculate rent
    private double calculateRent() {
    	double baseRent = sizeInSquareFeet * 1.5;		//calculate rent payment for size * 1.5
    	double bedroomCost = numberOfBedrooms * 300;	//calculate cost of bedrooms
    	double bathroomCost = numberOfBathrooms * 150;	//calculate cost of bathrooms
    	
    	return baseRent + bedroomCost + bathroomCost;	//each calculated cost is summed into the final rent value and returned
    }

    // Generate lease
    public String getLease() {
        double rent = calculateRent();
        leaseBuilder.setLength(0); // Clear previous content
        
        //String builder begins by adding the apartment details to the lease and then calculating and displaying the rent
        leaseBuilder.append("We are happy to have you join the Edwards Apartment complex!\n");
        leaseBuilder.append("Your lease is now ready for you to review and sign.\n");
        leaseBuilder.append("Please reach out to our office with any questions or concerns \n \n");
        leaseBuilder.append("Apartment: ").append(apartmentNumber).append("\n");
        leaseBuilder.append("Size: ").append(sizeInSquareFeet).append("\n");
        leaseBuilder.append("Bedrooms: ").append(numberOfBedrooms).append("\n");
        leaseBuilder.append("Bathrooms: ").append(numberOfBathrooms).append("\n");
        leaseBuilder.append("\nRent is due at the 1st of each month, parties are not allowed, etcetera.\n");
        leaseBuilder.append("\nMonthly cost: $").append(rent).append("\n");
        leaseBuilder.append("Sign here: _______________ \n");
        leaseBuilder.append("Fictional Apartments");
        
        //returns the string builder for the lease
        return leaseBuilder.toString();
    }
}