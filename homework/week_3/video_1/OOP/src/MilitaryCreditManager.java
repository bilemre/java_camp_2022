public class MilitaryCreditManager extends Customer implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesapland─▒");
    }

    @Override
    public void save() {
        System.out.println("Asker kredisi kaydedildi");
    }
}
