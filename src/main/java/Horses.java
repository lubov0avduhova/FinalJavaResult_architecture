public class Horses extends Pack_animal{
    String personal_name;
    String height;
    String weight;
    public Horses(String id, String birth, String animalName, String comand[], String personal_name) {
        super(id, birth, animalName, comand);
        this.personal_name = personal_name;
    }
    public String getPersonal_name() {
        return personal_name;
    }
    @Override
    public String getAnimalClass() {
        return super.getAnimalClass();
    }
}
