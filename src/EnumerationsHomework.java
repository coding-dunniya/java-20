public class EnumerationsHomework {

}


enum TrafficLight {
    RED, YELLOW, GREEN;

    // check if a vehicle can move
    // this is an instance method
    // users can also create static method and take traffic light as parameter
    // but then why to create here, it's best to create in some utility class
    public boolean canMove() {
        return this != RED;
    }
}
