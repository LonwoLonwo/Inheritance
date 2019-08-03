package Bird;

public class Duck extends FlyingBird

{

    public void catchFish(){}
    public void swim(){}

    @Override
    public void eat() {
        catchFish();
        ingest();
        digest();

    }

    @Override
    public void voice() {
        System.out.print("Krya. Krya? Krya!");
        System.out.println(" My weight is: " + weight + " gramms");
    }

}
