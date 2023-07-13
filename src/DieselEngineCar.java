import java.awt.*;

public class DieselEngineCar extends Car implements FillingStation{

    /*
    *Автомобиль с дизельным двигателем
    */

    public DieselEngineCar(String brand, String model) {
        super(brand, model);
        super.setFuelType("Diesel oil");
    }

    @Override
    public void filling() {//метод заправки дизельным топливом
        System.out.println("Diesel oil fuel fills up");
    }
}
