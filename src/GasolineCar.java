public class GasolineCar extends AFuelCar {
    public GasolineCar(String regstrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(regstrationNumber, make, model, numberOfDoors, kmPrLitre);
        getRegistrationFee();
    }

    public double getRegistrationFee() {
        if (20 < 50) {
            return 330;
        } else if (15 < 20) {
            return 1050;
        } else if (10 < 15) {
            return 2350;
        } else if (5 < 10) {
            return 5500;
        } else
            return 10470;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "kmPrLitre=" + kmPrLitre +
                ", regstrationNumber='" + regstrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}


