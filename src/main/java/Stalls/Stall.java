package Stalls;

public abstract class Stall {

    private String name;
    private String ownerName;
    private int parkingSpace;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpace, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpace = parkingSpace;
        this.rating = rating;
    }
}
