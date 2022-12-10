public class human {
    private String  jobTitle;
   private  int yearOfBirth;
   private  String name;
   private String town;



   human(String name){
       this(name,"Олеголенд",1999,"Иждевенец");
   }
   human(String name, String town, int yearOfBirth , String jobTitle){
          this.name = name;
          this.yearOfBirth =yearOfBirth;
          this.town = town;
          this.jobTitle = jobTitle;

  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            this.name = "Информация не указана";
        }
        else {
            this.name = name;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >=0){
            this.yearOfBirth = yearOfBirth;
        }
        else {
            this.yearOfBirth =0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()){
            this.town = "Информация не указана";
        }
        else {
            this.town = town;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty()){
            this.jobTitle = "Информация не указана";
        }
        else {
            this.jobTitle = jobTitle;
        }
    }

    void  say(){
        System.out.println("Привет меня зовут  "+name+", Я из города  "+town+", Я родился в "+yearOfBirth+" году. Я работаю на должности "+jobTitle);
    }
}
