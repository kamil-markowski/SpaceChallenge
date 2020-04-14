public class U2 extends Rocket{
    //Constructor add and modify fields
    U2() {
        rocketCost = 120;
        rocketWeight = 18;
        rocketMaxWeight = 29;
        rateExplosion= 0.45;
        rateCrash = 0.55;
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