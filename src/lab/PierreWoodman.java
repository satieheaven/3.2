package lab;

public class PierreWoodman implements character, Object {
    String name;
    int str;
    int dex;

    public void voice() {
        System.out.println("Don't fuck with me");  //реализация абстрактного метода
    }
    public void print() {
        System.out.println("Персонаж");
        System.out.println("Имя: " + getName() + " сила: " + getStr() + " ловкость: " + getDex());
        System.out.println("злой?: " + angry); //
    }
    public String getName() {
        return name;
    }
    public int getStr() {
        return str;
    }
    public int getDex() {
        return dex;
    }
    public PierreWoodman(String s) {   //конструктор класса PierreWoodman
        this.name = s;
        this.str = 47;
        this.dex = 69;
    }
}


