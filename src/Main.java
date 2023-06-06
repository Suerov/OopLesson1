
public class Main {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        donkey.Name = "Shrek";
        donkey.color = "Green";
        donkey.age = 20;
        donkey.weight = 480;
        donkey.iq = 250;

        Donkey donkey1 = new Donkey();
        donkey1.Name = "Fiona";
        donkey1.color = "red";
        donkey1.age = 18;
        donkey1.weight = 574;
        donkey1.iq = 249;

        Donkey donkey2 = new Donkey();
        donkey2.Name = "Morgana";
        donkey2.color = "Black";
        donkey2.age = 99;
        donkey2.weight = 100;
        donkey2.iq = 1000;
        System.out.println(donkey.Name + "," + donkey.color + "," + donkey.age + "," + donkey.weight + "," + donkey.iq);
        System.out.println(donkey1.Name + "," + donkey1.color + "," + donkey1.age + "," + donkey1.weight + "," + donkey1.iq);
        System.out.println(donkey2.Name + "," + donkey2.color + "," + donkey2.age + "," + donkey2.weight + "," + donkey2.iq);
    }
}