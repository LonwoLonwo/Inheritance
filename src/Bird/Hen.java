package Bird;

public class Hen extends NotAFlyingBird

{
    public void dabGrains(){}
    public void eat(){
        dabGrains();
        ingest();
        digest();
    }

    @Override
    public void voice() {
        System.out.print("Ko-ko-ko.");
        System.out.println(" My weight is: " + weight + " gramms");
    }
}
