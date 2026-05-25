package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int loadCapacity;
    private int diggingDepth;

    public Excavator(int loadCapacity, int radiusWheels) {
        this.loadCapacity = loadCapacity;
        this.diggingDepth = diggingDepth;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
