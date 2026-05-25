package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int lengthCapacity;
    private int quantityWheels;

    public Truck(int lengthCapacity, int quantityWheels) {
        this.lengthCapacity = lengthCapacity;
        this.quantityWheels = quantityWheels;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
