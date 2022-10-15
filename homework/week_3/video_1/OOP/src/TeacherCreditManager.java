public class TeacherCreditManager extends Customer implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı");
    }

    @Override
    public void save() {
        System.out.println("Öğretmen kredisi kaydedildi");
    }
}
