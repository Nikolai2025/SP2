import java.util.ArrayList;

public class Main {
    public static void main(String[] args)

    {
        FleetOfCars fleet = new FleetOfCars();
        Car tesla = new ElectricCar("52fg26","tesla","model3",4,150,500);
        Car Audi = new GasolineCar("49FG25","Audi","A7",4,10);
        Car Mercedes = new DieselCar("34JH43","Mercedes","Amg Gt 63",4,5,true);
        fleet.addCar(tesla);
        fleet.addCar(Audi);
        fleet.addCar(Mercedes);
        float resualt=fleet.getTotalRegistrationFeeForFleet();
        System.out.println(""+tesla + " " + Audi+"" + " "+Mercedes);
        System.out.println(resualt);
    }


}