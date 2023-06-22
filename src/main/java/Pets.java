import java.util.ArrayList;
import java.util.List;

public class Pets extends Animals{
    String animal_name;
    String animalClass = "Class: Pet";

    private List<Cats> listCats = new ArrayList<>();
    private List<Dogs> listDogs = new ArrayList<>();
    private List<Hamsters> listHamsters = new ArrayList<>();

    public List<Cats> getListCats() {
        return listCats;
    }
    public List<Dogs> getListDogs() {
        return listDogs;
    }
    public List<Hamsters> getListHamsters() {
        return listHamsters;
    }

    public Pets(String id, String birth, String name, String comand[]) {
        super(id, birth, comand);
        this.animal_name = name;
    }
    public Pets() {
        super();
    }
    public String getAnimal_name() {
        return animal_name;
    }
    public String getAnimalClass() {
        return animalClass;
    }
}
