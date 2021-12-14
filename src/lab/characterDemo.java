package lab;

public class characterDemo {
    public static void main(String[] args) {
        PierreWoodman s = new PierreWoodman("Пьер все-еще-мать-его Вудман");
        s.print();
        s.voice();
        AgileSpider as = new AgileSpider("Sonic");
        as.print();
        as.voice();
        GiantSpider gs = new GiantSpider("WTF");
        gs.print();
        gs.voice();
        Warrior wr = new Warrior("Konan");
        wr.print();
        wr.voice();
        Wizard wz = new Wizard("Harry");
        wz.print();
        wz.voice();
    }
}
