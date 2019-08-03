package Bird;

public class Sparrow extends FlyingBird {
    @Override
    public void eat() {

    }

    @Override
    public void voice() {
        System.out.print("Chik? Chirik!");
        System.out.println(" My weight is: " + weight + " gramms");
    }
}
