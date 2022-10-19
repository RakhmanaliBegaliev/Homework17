import Animal.Cow;
import Animal.Horse;
import Animal.Sheep;
import farm.Farm;

public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow(240, 12,"female", "zita");
        Cow cow2 = new Cow(360, 17,"female", "gita");
        Cow cow3 = new Cow(420, 13,"female", "poni");
        Cow cow4 = new Cow(150, 19,"female", "toni");
        Cow cow5 = new Cow(120, 22,"female", "sony");

        Horse horse1 = new Horse(350, 15,"male", "Tulpar");
        Horse horse2 = new Horse(450, 10,"male", "Jorgo");

        Sheep sheep1 = new Sheep(32, 4,"male", "Kochkor");
        Sheep sheep2 = new Sheep(25, 3,"male", "Kozu");
        Sheep sheep3 = new Sheep(47, 5,"male", "Barashek");

        Farm farm1 = new Farm("Nejinskaya 25", new Cow[]{cow1,cow2,cow3,cow4,cow4,cow5}, new Horse[]{horse1, horse2},
                new Sheep[]{sheep1, sheep2, sheep3}, "Ali");
        System.out.println(farm1);
        System.out.println();
        Farm farm2 = new Farm("Moskva 22", new Cow[]{cow1}, new Horse[]{horse1},
                new Sheep[]{sheep1}, "Putin");
        System.out.println(farm2);
    }
}