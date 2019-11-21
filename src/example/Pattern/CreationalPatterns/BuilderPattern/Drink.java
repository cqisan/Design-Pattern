package example.Pattern.CreationalPatterns.BuilderPattern;

public abstract class Drink implements Item {

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append("My Name:");
        sb.append(name() + "\n");
        sb.append("My Packing:");
        sb.append(packing().pack() + "\n");
        sb.append("My Price:");
        sb.append(price() + "\n");
        return sb.toString();
    }
}
