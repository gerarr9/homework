package transport;

import java.security.SecureRandom;
import java.time.LocalDate;

public class Car {
  private   String brand;
    private final String model;
    private  double engineVolume;
    private  String color;
    private final int year;
    private final String country;
    private  String transmission;
   private final String body;
   private final  String  number;
   private final int seats;
    boolean summerTyres;



    Car(String brand, String model, int year, String country, String color, double engineVolume, String transmission, String body, String  number, int seats,
        boolean summerTyres){

        this.transmission = transmission;
        if (body== null || body.isEmpty()){
            body = "Лада";
        }
        this.body = body;
        if (number == null || number.isEmpty()){
            number = "х000хх000";
        }
        this.number = number;
        this.seats = seats;
        this.summerTyres =summerTyres;
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        if (country== null || country.isEmpty()){
            country = "Россия";
        }
        this.country = country;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBody() {
        return body;
    }

    public String getNumber() {
        return number;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()){
            this.transmission = "Механика";
        }
        this.transmission = transmission;
    }
    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }
    public  void  changeTyres(){
        setSummerTyres(!summerTyres);
    }
    public  boolean isValidNumber(){
        return number.length() ==9
                && Character.isLetter(number.charAt(0))
                && Character.isLetter(number.charAt(4))
                && Character.isLetter(number.charAt(5))

                && Character.isDigit(number.charAt(1))
                && Character.isDigit(number.charAt(2))
                && Character.isDigit(number.charAt(3))
                && Character.isDigit(number.charAt(6))
                && Character.isDigit(number.charAt(7))
                && Character.isDigit(number.charAt(8));
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", body='" + body + '\'' +
                ", number='" + number + '\'' +
                ", seats=" + seats +
                ", summerTyres=" + summerTyres +
                '}';
    }
    public  void  print(){
        System.out.println(this);
    }
    public  static  class key {
        private final boolean remoteRun;
        private  final boolean keyAccess;

        public key(boolean remoteRun, boolean keyAccess) {
            this.remoteRun = remoteRun;
            this.keyAccess = keyAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isKeyAccess() {
            return keyAccess;
        }
        public  static  class  Insuranse{
            private final LocalDate expireDate;
            private final int cost;
            private final String number ;

            public Insuranse(LocalDate expireDate, int cost, String number) {
                if (expireDate == null){
                    expireDate = LocalDate.now().plusDays(365);
                }
                this.expireDate = expireDate;
                if (cost <=0){
                    cost = 5000;
                }
                this.cost = cost;
                if (number == null || number.isEmpty()){
                     number = "XSDWEWDX";
                }
                this.number = number;
            }
            public  void printExpired(){
                boolean isExpired =  expireDate.isAfter(LocalDate.now());
                if (isExpired){
                    System.out.println("Просроченно");
                }
            }
            public void  printNumber(){
                boolean correct = number.length() ==9;
                if (!correct){
                    System.out.println("Номер не верный");
                }
            }

            public LocalDate getExpireDate() {
                return expireDate;
            }

            public int getCost() {
                return cost;
            }

            public String getNumber() {
                return number;
            }
        }
    }
}
