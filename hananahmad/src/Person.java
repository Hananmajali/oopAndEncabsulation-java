import java.util.Date;

public class Person {
    public static int counter;
    public static String firstname = "Sonia";
    public static String lastname = "Kaboor";
    public static String Address = "Bollywood";
    public static int dateOfBirth=1980;
    public static String nationality = "indian";
    public static String city = "Mombi";
    public static int weight=50;
    public static int hight=165 ;
    public static boolean isMale = false;



    public Person(){
        counter++;
        System.out.println(counter);
    };

    public Person(String firstname,String lastname,String Address,int dateOfBirth,String nationality,String city,int weight,int hight,boolean isMale){
        this.firstname=firstname;
        this.lastname=lastname;
        this.Address=Address;
        this.dateOfBirth=dateOfBirth;
        this.nationality=nationality;
        this.city=city;
        this.weight=weight;
        this.hight=hight;
        this.isMale=isMale;

    };
    public void getFullname(){
        System.out.println(Person.firstname + Person.lastname);
    };
     public void getHeightInFeet (){
        System.out.println(Person.hight* 0.0328);
     };
    public void getAge (){
        System.out.println(2017-Person.dateOfBirth);
    };
    public void eating(){
       Person.weight++;
     System.out.println("am eating");
     System.out.println(Person.weight);
    };
    public void getInfo() {
         System.out.println(Person.firstname +" "+ Person.lastname);
         System.out.println(Person.Address +" "+ Person.city);
    };
    public static void increase(){
          counter++;
          System.out.println(counter);

    };
      public static void main(String []args) {
          // Following statement would create an object myPuppy
          Person myPuppy = new Person();
          // ahmed turn
          Person ahmad = new Person("ahmad","hariri","amman",1983,"syrian","daraa",65,180,true);

          // we try below initializing for those mypuppy's to try the counter
          Person myPuppy2 = new Person();
           Person myPuppy3 = new Person();

          myPuppy.getFullname();
          myPuppy.getAge();
          myPuppy.eating();
          myPuppy.getInfo();
          myPuppy.eating();

//        Per  myPuppy.increase();
//          myPuppy2.increase();
          ahmad.getHeightInFeet();
          ahmad.getInfo();
          ahmad.eating();
          ahmad.getFullname();
          ahmad.getAge();
          Person [] persons= new Person[4];
          persons[0] = myPuppy;
          persons[1]=myPuppy2;
          persons[3]=myPuppy3;
          persons[2]=ahmad;




      }
}
