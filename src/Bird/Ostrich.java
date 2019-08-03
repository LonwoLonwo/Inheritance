package Bird;

public class Ostrich extends NotAFlyingBird {
    @Override
    public void eat() {

    }

    @Override
    public void voice() {
        System.out.print("Where is my sand?");
        System.out.println(" My weight is: " + weight + " gramms");
    }
}
