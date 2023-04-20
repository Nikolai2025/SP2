public class  ElectricCar extends ACar {
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String regstrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(regstrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        getMaxRangeKm();
        getWhPrKm();
    }



    int getBatteryCapacityKWh(){
        return 149;
    }
    int getMaxRangeKm() {
        return 500;
    }
    double getWhPrKm(){
        double sum = 149/91.25;
        sum=100/sum;
        return sum;


    }
   public double getRegistrationFee(){
    double sum = 0.0163 * 491;
        return sum;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                '}';
    }
}

