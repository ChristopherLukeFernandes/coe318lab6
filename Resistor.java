package coe318.lab6;

public class Resistor {

    public double resistance;
    private Node node1;
    private Node node2;
    private int id;
    private static int counter = 1;

    public Resistor(double resistance, Node node1, Node node2) {
        if (resistance <= 0) {
            throw new IllegalArgumentException("Resistor can't be negative");
        }
        if (node1 == null || node2 == null) {
            throw new IllegalArgumentException("Resistor must connect to 2 nodes");
        }
        this.resistance = resistance; // Resistance value in ohms
        this.node1 = node1;
        this.node2 = node2;
        this.id = counter;
        counter++;
    }

    public Node[] getNodes() {
        Node[] nodes = new Node[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }

    public String toString() {
        String result;
        result = "R" + this.id + " " + (this.node1) + " " + (this.node2) + " " + this.resistance + ".";
        return result;
    }
}
