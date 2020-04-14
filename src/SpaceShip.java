//Interface with methods
public interface SpaceShip {
    boolean launch(); // launch made without crash
    boolean land(); // land made without crash
    boolean canCarry(Item actCargo); //Assigned rocket can carry the cargo or not
    void carry(Item actCargo);// Updating current weight of cargo
}
