import transport.Car;

public class Main {
    public static void main(String[] args) {

       human maxim = new human("Максим","Минск",1988,"Бренд-менеджер");
       maxim.say();
       human anya = new human("Аня","Москва",1993,"Методист оброзовательных программ");
       anya.say();
       human katya = new human("Катя","Калининград",1992,"Продакт-менеджер");
       katya.say();
       human artem = new human("Артем","Москва",1995,"Директор по развитию бизнеса");
       artem.say();
       System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");


      Flower rosa = new Flower("Roza","Голландии",35.59,1);
      rosa.stats();

      Flower hrizontema = new Flower("Hrizontema","",15  ,5);
      hrizontema.stats();

       Flower pion = new Flower("Pion","Angliya",69.9  ,1);
       pion.stats();

       Flower gipsophila = new Flower("Gipsophila","Turkey",19.5  ,10);
       gipsophila.stats();
    }
}