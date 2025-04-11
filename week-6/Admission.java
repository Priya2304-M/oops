class Student{

  String name;
  double percentage;
  
  Student(String name, double percentage){
    this.name = name;
    this.percentage = percentage;
  }
  
  public void Eligibility(){
    System.out.println(name + " must meet the general admission criteria");
  }
}

class UG extends Student{
  UG(String name, double percentage){
    super(name, percentage);
  }
  
    public void Eligibility(){
      if (percentage>59){
        System.out.println(name + " is elligible for UG admission");
      }
      else {
        System.out.println(name + " is Not elligible for UG admission");
      }
    }
}

class PG extends Student{
  PG(String name, double percentage){
    super(name, percentage);
  }
  
    public void Eligibility (){
      if (percentage>69){
        System.out.println(name + " is elligible for PG admission");
      }
      else {
        System.out.println(name + " is Not elligible for PG admission");
        System.out.println("priya");
      }
    }
}

public class Admission { 
  public static void main (String[] args){ 
    
    UG ug = new UG("riya", 69);
    PG pg = new PG("Santhi", 59);
    
    ug.Eligibility();
    pg.Eligibility();
  }
}
    
 