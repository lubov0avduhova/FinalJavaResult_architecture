public class Main {
    public static void main(String[] args) {
        Pets PetsList = new Pets();
        Pack_animal PackList = new Pack_animal();
        for (Cats cat : PetsList.getListCats()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimalClass());
        }

        for (Cats cat : PetsList.getListCats()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimal_name() + " ");
        }
        System.out.println();

        for (Horses cat : PackList.getListHorses()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimal_name() + " ");
        }

        System.out.println();

        String standartPetsComands[] = { "sit", "voice", "come" };

        Cats testCat1 = new Cats("666", "01.01.2020", "Кошка", standartPetsComands, "Satan");
        Cats testCat2 = new Cats("02", "02.11.2022", "Кошка", standartPetsComands, "Tom");
        Cats testCat3 = new Cats("03", "12.03.2021", "Кошка", standartPetsComands, "Artem");
        Dogs testDog1 = new Dogs("04", "06.01.2019", "Собака", standartPetsComands, "Rex");
        Dogs testDog2 = new Dogs("05", "01.01.2017", "Собака", standartPetsComands, "Lucky");

        PetsList.getListCats().add(testCat1);
        PetsList.getListCats().add(testCat2);
        PetsList.getListCats().add(testCat3);

        PetsList.getListDogs().add(testDog1);
        PetsList.getListDogs().add(testDog2);

        App getApp = new App();
        getApp.start(PetsList, PackList);
    }
}
