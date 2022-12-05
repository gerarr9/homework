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
       Car lada = new Car("Lada","Granta",2015,"Russia","Yellow",1.7);
       lada.setting();
       Car audio = new Car("Audi","A8 50 L TDI quattro",2020,"Германии","черный",3.0);
       audio.setting();
       Car bmw = new Car("BMW","Z8",2021,"Германии","черный",3.0);
       bmw.setting();
       Car kia = new Car("Kia","Sportage",2018,"Южной Корее","красный",2.4);
       kia.setting();
       Car hundai = new Car("Hyundai","Avante",2016,"Южной Корее","оранжевый",1.6);
       hundai.setting();




    }
}