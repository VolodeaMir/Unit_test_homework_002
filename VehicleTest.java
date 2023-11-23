import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    void testCarIsInstanceOfVehicle() {
        Vehicle car = new Car();
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Vehicle car = new Car();
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        Vehicle motorcycle = new Motorcycle();
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testCarTestDriveSpeed() {
        Vehicle car = new Car();
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testMotorcycleTestDriveSpeed() {
        Vehicle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testCarPark() {
        Vehicle car = new Car();
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void testMotorcyclePark() {
        Vehicle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
