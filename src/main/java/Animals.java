import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Animals {
    private String id;
    private String birthDay;
    private List<String> comands = new ArrayList<>();

    public Animals(String id, String birth, String comand[]) {
        this.id = id;
        this.birthDay = birth;
        comands.addAll(Arrays.asList(comand));
    }

    public Animals() {
    }

    public String getId() {
        return id;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public List<String> getComands() {
        return comands;
    }
}
