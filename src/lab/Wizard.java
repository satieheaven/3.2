package lab;

public class Wizard extends PierreWoodman implements character, Object {
    public Wizard(String s) {
        super(s);
    }

    public void voice() {
        System.out.println("с умным видом бормочет");
    }
}

