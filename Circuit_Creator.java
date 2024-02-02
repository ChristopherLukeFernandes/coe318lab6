package coe318.lab6;

public class Circuit_Creator {

    public static void main(String[] args) {
        Circuit cir = Circuit.getInstance();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Resistor res1 = new Resistor(12.0, node1, node2);
        Resistor res2 = new Resistor(15.0, node2, node3);
        Resistor res3 = new Resistor(25, node3, node4);
        Resistor res4 = new Resistor(22,node4,node1);
        cir.add(res1);
        cir.add(res2);
        cir.add(res3);
        cir.add(res4);
        System.out.println(cir);
    }

}
