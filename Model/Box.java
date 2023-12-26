package Model;

import Interface.IBox;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Box implements IBox {
    private Toy toy;
    private int id;
    private int weight;
    private Queue<Toy> toys = new PriorityQueue<>();

  
    public boolean addToys(Toy toy) {
        return toys.add(toy);
    }

    public boolean next() {
        return toys.isEmpty();
    }

   

    public Toy get() {
        return toys.poll();
    }

    public Toy delete() {
        return toys.remove();
    }

 
    public int getSize() {
        return toys.size();
    }


    public int getWeight() {
        return toy.getWeight();
    }


    @Override
    public String toString() {
        return "Box{" +
                "toy=" + toy +
                ", id=" + id +
                ", weight=" + weight +
                ", toys=" + toys +
                '}';
    }
}
