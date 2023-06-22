import java.util.ArrayList;
import java.util.List;

public class Pack_animal extends Animals{
    String animalClass = "Class: Pack animal";
    String animal_name;

    private List<Horses> listHorses = new ArrayList<>();
    private List<Donkeys> listDonkeys = new ArrayList<>();

    public List<Horses> getListHorses() {
        return listHorses;
    }
    public List<Donkeys> getListDonkeys() {
        return listDonkeys;
    }

    public Pack_animal(String id, String birth, String name, String comand[]) {
        super(id, birth, comand);
        this.animal_name = name;
    }
    public Pack_animal() {
        super();
    }
    public String getAnimal_name() {
        return animal_name;
    }
    public String getAnimalClass() {
        return animalClass;
    }   
}    
