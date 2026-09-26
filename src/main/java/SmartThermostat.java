public class SmartThermostat implements SmartDevice {
    private boolean isOn;
    private double temperature; // Unique field for SmartThermostat

    public SmartThermostat() {
        this.isOn = false;
        this.temperature = 22.0;
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
        return "SmartThermostat is " + (isOn ? "ON" : "OFF") + " | Temperature: " + temperature + "°C";
    }

    // Unique method required by Task 3
    public void setTemperature(double temp) {
        this.temperature = temp;
    }
}