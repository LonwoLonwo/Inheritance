package Bird;

public class Animal
implements Comparable<Animal>
{
    public double weight;

    public Animal()
    {
        weight = 10 + 100*Math.random();
    }

    public void voice(){
    }

    @Override
    public int compareTo(Animal animal) {
        return (int) Math.round(animal.weight - this.weight);
    }
}
