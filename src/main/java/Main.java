public class Main {
    public static void main(String[] args) {

        HomePets homePets = new HomePets();
        Dog dog = new Dog("Собака","средний", new String[]{"команда 1", "команда 2", "команда 3"});
        homePets.getListDogs().add(dog);


        Cat cat1 = new Cat("Кот1",true, new String[]{"команда 1", "команда 2", "команда 3"});
        Cat cat2 = new Cat("Кот2", false,new String[]{"команда 1", "команда 2", "команда 3"});
        homePets.getListCats().add(cat1);
        homePets.getListCats().add(cat2);


        for(Animal ani: homePets.getListDogs())
            System.out.println(ani.getName() + " " + ani.getCommands());
        System.out.println("____________");

        for(Animal ani: homePets.getListCats())
            System.out.println(ani.getName() + " " + ani.getCommands());
        System.out.println("____________");

        homePets.getListCats().remove(cat1);

        for(Animal ani: homePets.getListCats())
            System.out.println(ani.getName() + " " + ani.getCommands());
        System.out.println("____________");
    }
}
