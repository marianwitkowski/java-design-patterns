package pl.marianwitkowski;

import pl.marianwitkowski.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

