public class AmphibiousBoat extends Vehicle{
    boolean isInWater;
    // Yes it's a boat, what about it?
    public AmphibiousBoat(String name, int wheels, boolean isInWater){
        super(name, wheels);
        this.isInWater = isInWater;
    }

    public boolean isInWater() {
        return isInWater;
    }

    public void rideWaves(){
        System.out.println("~~~~~Riding~dam~waves~~~~~");
    }
}
