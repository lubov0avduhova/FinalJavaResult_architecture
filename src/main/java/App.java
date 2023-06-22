import java.util.Scanner;

public class App {
    public void start(Pets petList, Pack_animal packList) {
        Count count = new Count();
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println(
                        "\n1: Завести новое животное\n2: Показать список животных\n3: Посмотреть какие команды знает животное\n4: Обучить новой команде\n0: Выход");
                String key = in.next();
                switch (key) {
                    case "0":
                    System.out.println(String.valueOf("Count: " + count.getCount()));
                        return;

                    case "1":
                    boolean check = false;
                    try {
                        System.out.println(
                                "К какому классу относится животное?(выберите нужную цифру)\n1: Домашний питомец\n2: Вьючное животное\n0: предыдущее меню");
                        String key2 = in.next();
                        switch (key2) {
                            case "0":
                                break;

                            case "1":
                                System.out.println(
                                        "Выберите к какому виду относится питомец: \n1:Кошка \n2:Собака \n3:Хомяк \n0:Выход \n");
                                String keyPet = in.next();
                                switch (keyPet) {
                                    case "0":
                                        break;

                                    case "1":
                                        String standartCatComands[] = {};
                                        System.out.println("Присвойте id питомцу: \n");
                                        String idCat = in.next();
                                        System.out.println("Дата рождения: \n");
                                        String birthCat = in.next();
                                        System.out.println("Введите имя питомца: \n");
                                        String nameCat = in.next();
                                        Cats tempCat = new Cats(idCat, birthCat, "Кошка", standartCatComands, nameCat);
                                        petList.getListCats().add(tempCat);
                                        if (!idCat.isEmpty() & !birthCat.isEmpty() & !nameCat.isEmpty()){
                                            check = true;
                                        }
                                        break;

                                    case "2":
                                        String standartDogComands[] = { "Voice", "Sit", "Get paw" };
                                        System.out.println("Присвойте id питомцу: \n");
                                        String idDog = in.next();
                                        System.out.println("Дата рождения: \n");
                                        String birthDog = in.next();
                                        System.out.println("Введите имя питомца: \n");
                                        String nameDog = in.next();
                                        Dogs tempDog = new Dogs(idDog, birthDog, "Собака", standartDogComands, nameDog);
                                        petList.getListDogs().add(tempDog);
                                        if (idDog.isEmpty() & birthDog.isEmpty() & nameDog.isEmpty()){
                                            check = true;
                                        }
                                        break;

                                    case "3":
                                        String standartHamsterComands[] = {};
                                        System.out.println("Присвойте id питомцу: \n");
                                        String idH = in.next();
                                        System.out.println("Дата рождения: \n");
                                        String birthH = in.next();
                                        System.out.println("Введите имя питомца: \n");
                                        String nameH = in.next();
                                        Hamsters tempH = new Hamsters(idH, birthH, "Хомяк", standartHamsterComands, nameH);
                                        petList.getListHamsters().add(tempH);
                                        if (idH.isEmpty() & birthH.isEmpty() & nameH.isEmpty()){
                                            check = true;
                                        }
                                        break;

                                    default:
                                        System.out.println("Введите корректное число: от 0 до 3");
                                        break;
                                }
                                break;

                            case "2":
                                System.out.println(
                                        "Выберите к какому виду относится вьючное животное: \n1:Лошадь \n2:Осёл \n0:Выход \n");
                                String keyPack = in.next();
                                switch (keyPack) {
                                    case "0":
                                        break;

                                    case "1":
                                        String standartHorseComands[] = { "Move", "Gallop", "Trotting", "Stop" };
                                        System.out.println("Присвойте id животному: \n");
                                        String idHorse = in.next();
                                        System.out.println("Дата рождения: \n");
                                        String birthHorse = in.next();
                                        System.out.println("Введите имя животного: \n");
                                        String nameHorse = in.next();
                                        Horses tempHorse = new Horses(idHorse, birthHorse, "Лошадь", standartHorseComands,
                                                nameHorse);
                                        packList.getListHorses().add(tempHorse);
                                        if (idHorse.isEmpty() & birthHorse.isEmpty() & nameHorse.isEmpty()){
                                            check = true;
                                        }
                                        break;

                                    case "2":
                                        String standartDonkeyComands[] = { "Move", "Stop" };
                                        System.out.println("Присвойте id животному: \n");
                                        String idDonkey = in.next();
                                        System.out.println("Дата рождения: \n");
                                        String birthDonkey = in.next();
                                        System.out.println("Введите имя животного: \n");
                                        String nameDonkey = in.next();
                                        Donkeys tempDonkey = new Donkeys(idDonkey, birthDonkey, "Осёл",
                                                standartDonkeyComands,
                                                nameDonkey);
                                        packList.getListDonkeys().add(tempDonkey);
                                        if (idDonkey.isEmpty() & birthDonkey.isEmpty() & nameDonkey.isEmpty()){
                                            check = true;
                                        }
                                        break;

                                    default:
                                        System.out.println("Введите корректную цифру от 0 до 2");
                                        break;
                                }
                                break;

                            default:
                                System.out.println("Введите корректную цифру от 0 до 3");
                                break;
                        }
                    } 
                    
                    finally {if (check){
                        count.add();}
                    }
                    break;
                    
                    case "2":
                        System.out.println("_____________________________________\n");
                        for (Cats cat : petList.getListCats()) {
                            System.out.println("id:" + cat.getId() + " " + cat.getAnimal_name() + " " + cat.getPersonal_name());
                        }
                        for (Dogs dog : petList.getListDogs()) {
                            System.out.println("id:" + dog.getId() + " " + dog.getAnimal_name() + " " + dog.getPersonal_name());
                        }
                        for (Hamsters ham : petList.getListHamsters()) {
                            System.out.println("id:" + ham.getId() + " " + ham.getAnimal_name() + " " + ham.getPersonal_name());
                        }
                        for (Horses horse : packList.getListHorses()) {
                            System.out.println("id:" + horse.getId() + " " + horse.getAnimal_name() + " " + horse.getPersonal_name());
                        }
                        for (Donkeys don : packList.getListDonkeys()) {
                            System.out.println("id:" + don.getId() + " " + don.getAnimal_name() + " " + don.getPersonal_name());
                        }
                        System.out.println("_____________________________________");
                        break;

                    case "3":
                        System.out.println("Животное можно выбрать по егo id: ");
                        String find = in.next();
                        for (Cats cat : petList.getListCats()) {
                            if (cat.getId().equals(find)){
                                if (cat.getComands().isEmpty()) {
                                    System.out.println(cat.getAnimal_name() + " " + cat.getPersonal_name());
                                    System.out.println("Это животное пока не знает никаких команд");
                                } else {
                                    System.out.println(cat.getAnimal_name() + " " + cat.getPersonal_name() + " знает такие команды: \n" + cat.getComands());
                                }
                            }
                        }
                        for (Dogs dog : petList.getListDogs()) {
                            if (dog.getId().equals(find)){
                                if (dog.getComands().isEmpty()) {
                                    System.out.println("Это животное пока не знает никаких команд");
                                } else {
                                    System.out.println(dog.getAnimal_name() + " " + dog.getPersonal_name() + " знает такие команды: \n" + dog.getComands());
                                }
                            }
                        }
                        for (Hamsters ham : petList.getListHamsters()) {
                            if (ham.getId().equals(find)){
                                if (ham.getComands().isEmpty()) {
                                    System.out.println(ham.getAnimal_name() + " " + ham.getPersonal_name());
                                    System.out.println("Это животное пока не знает никаких команд");
                                } else {
                                    System.out.println(ham.animal_name + " " + ham.getPersonal_name() + " знает такие команды: \n" + ham.getComands());
                                }
                            }
                        }
                        for (Horses horse : packList.getListHorses()) {
                            if (horse.getId().equals(find)){
                                if (horse.getComands().isEmpty()) {
                                    System.out.println("Это животное пока не знает никаких команд");
                                } else {
                                    System.out.println(horse.getAnimal_name() + " " + horse.getPersonal_name() + " знает такие команды: \n" + horse.getComands());
                                }
                            }
                        }
                        for (Donkeys don : packList.getListDonkeys()) {
                            if (don.getId().equals(find)){
                                if (don.getComands().isEmpty()) {
                                    System.out.println("Это животное пока не знает никаких команд");
                                } else {
                                    System.out.println(don.getAnimal_name() + " " + don.getPersonal_name() + " знает такие команды: \n" + don.getComands());
                                }
                            }
                        }
                    break;

                    case "4":
                    System.out.println("Животное можно выбрать по егo id: ");
                        String findA = in.next();
                    for (Cats cat : petList.getListCats()) {
                        if (cat.getId().equals(findA)){
                            System.out.println("Будем обучать: " + cat.getAnimal_name() + " " + cat.getPersonal_name());    
                            System.out.println("За раз можно обучить животное одой команде");
                            System.out.println("Введите команду которой хотите научить это животное");
                            String com = in.next();
                            cat.getComands().add(com);
                            System.out.println("Животное обучилось");
                        }
                    }
                    for (Dogs dog : petList.getListDogs()) {
                        if (dog.getId().equals(findA)){
                            System.out.println("Будем обучать: " + dog.getAnimal_name() + " " + dog.getPersonal_name());    
                            System.out.println("За раз можно обучить животное одой команде");
                            System.out.println("Введите команду которой хотите научить это животное");
                            String com = in.next();
                            dog.getComands().add(com);
                            System.out.println("Животное обучилось");
                        }
                    }
                    for (Hamsters ham : petList.getListHamsters()) {
                        if (ham.getId().equals(findA)) {
                            System.out.println("Будем обучать: " + ham.animal_name + " " + ham.getPersonal_name());    
                            System.out.println("За раз можно обучить животное одой команде");
                            System.out.println("Введите команду которой хотите научить это животное");
                            String com = in.next();
                            ham.getComands().add(com);
                            System.out.println("Животное обучилось");
                        }
                    }
                    for (Horses horse : packList.getListHorses()) {
                        if (horse.getId().equals(findA)) {
                            System.out.println("Будем обучать: " + horse.getAnimal_name() + " " + horse.getPersonal_name());    
                            System.out.println("За раз можно обучить животное одой команде");
                            System.out.println("Введите команду которой хотите научить это животное");
                            String com = in.next();
                            horse.getComands().add(com);
                            System.out.println("Животное обучилось");
                        }
                    }
                    for (Donkeys don : packList.getListDonkeys()) {
                        if (don.getId().equals(findA)) {
                            System.out.println("Будем обучать: " + don.getAnimal_name() + " " + don.getPersonal_name());    
                            System.out.println("За раз можно обучить животное одой команде");
                            System.out.println("Введите команду которой хотите научить это животное");
                            String com = in.next();
                            don.getComands().add(com);
                            System.out.println("Животное обучилось");
                        }
                    }
                    break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}