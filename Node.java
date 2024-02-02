package coe318.lab6;

public class Node {

    public int id; // Id number of current node
    public static int id_next = 1; // Id value of next node

    public Node() {
        this.id = id_next;
        id_next++;
    }

    public String toString() {
        return " " + this.id;
    }
}
