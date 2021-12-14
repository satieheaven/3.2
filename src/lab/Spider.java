package lab;

public abstract class Spider implements character, Object { // класс абстрактный, т. к. только один абстрактный метод реализован
    String name;
    int claws, legs, fangs;

    public abstract void voice(); // нереализованный абстрактный метод

    public void print() {
        System.out.println("Паук");
        System.out.println("Имя: " + getName() + " когти?: " + getClaws() + "Ноги?: " + getLegs() + "клыки?: " +getFangs());
        System.out.println(" хуярим?: " + angry);
    } // реализованный абстрактный метод

    public String getName() {
        return name;
    }

    public int getClaws() {
        return claws;
    }
    public int getLegs() {
        return legs;
    }

    public int getFangs() {
        return fangs;
    }

    public Spider(String nn) {
        this.name = nn;
        this.claws = 8;
        this.legs = 8;
        this.fangs = 4;

    }
}
