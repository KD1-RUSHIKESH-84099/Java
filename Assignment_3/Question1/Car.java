
public class Car {
	
	int milesDriven;
	double gasolinePrice;
	double avgMiles;
	int parkingFees;
	int tolls;
	
	

	public Car(int milesDriven, double gasolinePrice, double avgMiles, int parkingFees, int tolls) {
		
		this.milesDriven = milesDriven;
		this.gasolinePrice = gasolinePrice;
		this.avgMiles = avgMiles;
		this.parkingFees = parkingFees;
		this.tolls = tolls;
	}
	
	public double costPerDay() {
		 double gallonsUsedPerDay = milesDriven / avgMiles;
	        return (gallonsUsedPerDay * gasolinePrice) + parkingFees + tolls;
	
		
		
	}
	

}
