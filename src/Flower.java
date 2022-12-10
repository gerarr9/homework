public class Flower {
   private  String flowerName;
    private String  country ;
   private final double  cost ;
    int lifeSpan =3;

    public Flower(String flowerName,String country,double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty()){
            this.flowerName = "Тип цвета не указан ";
        }
        else {
            this.flowerName = flowerName;
        }

        if (country == null || country.isEmpty() || country.isBlank()){
            country = "Россия";
        }
        this.country = country;
        if (cost <0){
            this.cost = 1;
        }
        else {
            this.cost = cost;
        }



        this.lifeSpan = lifeSpan;
    }
    public  void stats(){
        System.out.println(flowerName +" из "+ country+" цена за штуку "+ cost +" Срок храненияы "+ lifeSpan+" день");
    }
    public String getFlowerName() {
        if (flowerName == null || flowerName.isEmpty()){
            this.flowerName = "Тип цвета не указан ";
        }
        this.flowerName = flowerName;
        return  flowerName;
    }

    public String getCountry() {
        return  country;
    }
    public void  setCountry(String country){
        if (country == null || country.isEmpty() || country.isBlank()){
            country = "Россия";
        }
        this.country = country;

    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
