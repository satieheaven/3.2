package lab;

public class AgileSpider extends Spider implements character, Object {

    public AgileSpider(String nn) {
        super(nn);
    }// вызываем конструктор супер-класса

    public void voice() {
        System.out.println("быстро шипит по-паучьему"); //реализация абстрактного метода
    }
}
