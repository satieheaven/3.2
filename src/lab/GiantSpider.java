package lab;

public class GiantSpider extends Spider implements character, Object {
    public GiantSpider(String nn) {
        super(nn);
        // вызываем конструктор супер-класса
    }

    public void voice() {
        System.out.println(" дряхло крякает по-паучьему"); //реализация абстрактного метода
    }
}
