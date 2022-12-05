public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand,String model,int year,String country,String color,double engineVolume){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }
    void setting(){
        System.out.println(brand +" "+model+" "+engineVolume+" "+color+" "+year+" "+country);
    }
}
