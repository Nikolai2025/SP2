public abstract class ACar implements Car {
    public ACar(String regstrationNumber,String make,String model,int numberOfDoors){
        this.regstrationNumber=regstrationNumber;
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
    }

    String regstrationNumber;
    String make;
    String model;
    int numberOfDoors;
    public String getRegstrationNumber() {
        return regstrationNumber;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    @Override
    public String toString() {
        return "ACar{" +
                "regstrationNumber='" + regstrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
