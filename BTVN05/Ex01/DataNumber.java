package BTVN05.Ex01;

import java.io.Serializable;

public class DataNumber implements Serializable {
    private int number;

    public DataNumber() {
    }

    public DataNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
