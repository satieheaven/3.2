package lab;

public class Warrior extends PierreWoodman implements character, Object {
    public Warrior(String s) {
        super(s);
    }

    public void voice() {
        System.out.println("кричит по-варварски!");
    }
}

