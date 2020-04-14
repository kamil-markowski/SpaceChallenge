import java.util.Random;

public class Rocket implements SpaceShip{
    int rocketCost;
    int rocketWeight;
    int rocketMaxWeight;
    int currCargoWeight;
    int currRocketWeight;
    int cargoLimit;

    double rateExplosion;
    double rateCrash;
    double chanceExplosion;
    double chanceCrash;
    double random;

    String rocketStatus;// not loaded, loaded, exploded, launched, crashed, landed

    //Constructor
    Rocket() {
        currRocketWeight = 0;
        currCargoWeight = 0;
        chanceExplosion =0.0;
        chanceCrash = 0.0;
        cargoLimit = 0;
        rocketStatus = "not loaded";
        random = new Random().nextDouble();// random number( 0-0.99(9) )
    }
    // Instruction launch and land true, U1 and U2 will modify
    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }
    //Check if not exceed limits
    public boolean canCarry(Item Cargo) {
        return (this.currRocketWeight + Cargo.weight <= rocketMaxWeight);
    }
    //Update current cargo weight and rocket weight
    public void carry(Item Cargo) {
        this.currRocketWeight = this.currRocketWeight + Cargo.weight;
        this.currCargoWeight = this.currRocketWeight - rocketWeight;
    }
}
