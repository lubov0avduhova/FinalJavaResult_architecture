import java.util.Collection;

public class Cat extends Animal {
    private boolean isFriendly;
    public Cat(String name, boolean isFriendly, String[] command) {
        super(name, command);
        this.isFriendly = isFriendly;
    }
}
