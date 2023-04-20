import javax.swing.*;

public class DieselCar extends AFuelCar {
    boolean isParticleFliter;

    public DieselCar(String regstrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean isParticleFliter) {
        super(regstrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.isParticleFliter = isParticleFliter;
        calculateRegistrationFee();
        getRegistrationFee();
    }

    boolean particleFliter = true;
    int fee = 0;

    private int calculateRegistrationFee() {

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return fee += 460;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return fee += 2440;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            return fee += 4200;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return fee += 8270;
        } else
            return fee += 25730;
    }

    public double getRegistrationFee() {
        int totalFee = calculateRegistrationFee();
        if (particleFliter = true) {
            return totalFee + 1000;
        } else {
            return totalFee;
        }
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "isParticleFliter=" + isParticleFliter +
                ", particleFliter=" + particleFliter +
                ", fee=" + fee +
                ", kmPrLitre=" + kmPrLitre +
                ", regstrationNumber='" + regstrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}




