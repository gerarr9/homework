public class human {
    String  jobTitle;
    int yearOfBirth;
    String name;
    String town;

  human(String name, String town,int yearOfBirth , String jobTitle){
      if (name == null || name.isEmpty()){
            this.name = "Информация не указана";
      }
      else {
          this.name = name;
      }

      if (yearOfBirth >=0){
          this.yearOfBirth = yearOfBirth;
      }
      else {
          this.yearOfBirth =0;
      }
      if (town == null || town.isEmpty()){
          this.town = "Информация не указана";
      }
      else {
          this.town = town;
      }
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
