package Stalls;

public abstract class Stall implements IReviewed {

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


        public String getName(){
            return this.name;
        }

        public int getRating(){
            return this.rating();
        }

}
