public abstract class AFuelCar extends ACar {
    int kmPrLitre;

    public AFuelCar(String regstrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(regstrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    String getFuelType(){
        return getFuelType();
    }
    int getKmPrLitre(){
        return getKmPrLitre();
    }

    @Override
    public String toString() {
        return "AFuelCar{" +
                "regstrationNumber='" + regstrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
