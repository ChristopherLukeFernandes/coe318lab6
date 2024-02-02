package coe318.lab6;

import java.util.ArrayList;

public class Circuit {

    public ArrayList<Resistor> resistors = new ArrayList<Resistor>();

    public void add(Resistor r) {
        resistors.add(r);
    }

    public String toString() {
        String result = "";
        for (int k = 0; k < resistors.size(); k++) {
            result += " " + resistors.get(k) + "\n";
        }
        return result;
    }

    private static Circuit instance = null;

    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    private Circuit() {
    }

}
