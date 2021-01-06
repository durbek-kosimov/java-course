public class Stove {
    enum lamp {on, off};
    enum door {open, close};
    enum power {on, off};

    private lamp currentLamp;
    private door currentDoor;
    private power currentPower;
    private int time;

    public Stove(lamp currentLamp, door currentDoor, power currentPower) {
        this.currentLamp = lamp.on;
        this.currentDoor = door.open;
        this.currentPower = power.off;
    }

    public void takeButton() {
        if (currentDoor == door.open)
            System.out.println("Pressing the button when the door is open is meaningless.");
        else if (currentPower == power.on) {
            time += 60;
            System.out.println("One minute is added.");
        }
        else {
            currentPower = power.on;
            currentLamp = lamp.on;
            time = 60;
            System.out.println("Cooking started.");
        }
    }
    public void takeDoor() {
        if (currentDoor == door.open) {
            currentDoor = door.close;
            currentLamp = lamp.off;
            System.out.println("Door is closed.");
        }
        else {
            currentDoor = door.open;
            currentLamp = lamp.on;
            time = -1;
            System.out.println("Door is open");
            if (currentPower == power.on) {
                System.out.println("Cooking interrupted.");
                currentPower = power.off;
            }
        }
    }
    public void foddReady() {
        currentPower = power.off;
        currentLamp = lamp.on;
        time = -1;
        System.out.println("Food is ready!");
    }
}
