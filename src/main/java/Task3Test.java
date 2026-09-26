import java.util.ArrayList;
import java.util.List;

public class Task3Test {
    public static void main(String[] args) {
        SmartBulb bulb = new SmartBulb();
        SmartThermostat thermostat = new SmartThermostat();

        bulb.turnOn();
        bulb.setBrightness(75);

        thermostat.turnOn();
        thermostat.setTemperature(24.5);

        // Store via interface contract reference
        List<SmartDevice> devices = new ArrayList<>();
        devices.add(bulb);
        devices.add(thermostat);

        System.out.println("--- Smart Home Status Report ---");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }
}