package Student;

public class StudentAddress {
    private int Pin;
    private String City;
    private String State;

    StudentAddress(int pin, String City, String State){
        this.Pin=Pin;
        this.City=City;
        this.State=State;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        Pin = pin;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
