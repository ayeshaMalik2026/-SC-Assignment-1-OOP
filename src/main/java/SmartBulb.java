public class SmartBulb implements SmartDevice {
    private boolean isOn;
    private int brightness; // Unique field for SmartBulb

    public SmartBulb() {
        this.isOn = false;
        this.brightness = 100;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public String getStatus() {
        return "SmartBulb is " + (isOn ? "ON" : "OFF") + " | Brightness: " + brightness + "%";
    }

    // Unique method required by Task 3
    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightness = level;
        } else {
            System.out.println("Invalid brightness level (0-100 only).");
        }
    }
}
