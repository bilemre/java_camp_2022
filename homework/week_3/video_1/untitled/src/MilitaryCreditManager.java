public class MilitaryCreditManager extends Customer implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı");
    }

    @Override
    public void save() {
        System.out.println("Asker kredisi kaydedildi");
    }
}
