public class Stove {
    enum lamp {on, off};
    enum door {open, close};
    enum power {on, off};

    private lamp currentLamp;
    private door currentDoor;
    private power currentPower;

    public Stove(lamp currentLamp, door currentDoor, power currentPower) {
        this.currentLamp = lamp.on;
        this.currentDoor = door.open;
        this.currentPower = power.off;
    }

    private void takeButton() {
        if (currentDoor == door.open)
            System.out.println("Pressing the button when the door is open is meaningless.");

    }
}
