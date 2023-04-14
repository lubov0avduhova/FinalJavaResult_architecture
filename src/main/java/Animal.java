import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {

    private String name;
    private List<String> commands = new ArrayList<>();

    public Animal(String name, String[] command){
        this.name = name;
        commands.addAll(Arrays.asList(command));
    }

    public String getName() {
        return name;
    }

    public List<String> getCommands() {
        return commands;
    }
}
