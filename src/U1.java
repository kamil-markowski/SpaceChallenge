public class U1 extends Rocket{
    //Constructor add and modify fields
    U1() {
        rocketCost = 100;
        rocketWeight = 10;
        rocketMaxWeight = 18;
        rateExplosion= 0.49;
        rateCrash = 0.53;
        cargoLimit = rocketMaxWeight - rocketWeight;
        currRocketWeight = rocketWeight;
    }
    public boolean launch() {
        this.chanceExplosion = rateExplosion * ((double) currCargoWeight) / ((double) cargoLimit);
        return !(this.chanceExplosion >= this.random);
    }
    public boolean land() {
        this.chanceCrash = rateCrash * ((double)currCargoWeight) / ((double)cargoLimit);
            return !(this.chanceCrash >= this.random);
    }
}
