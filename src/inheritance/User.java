package inheritance;
class Location{
   String country;
   String city;
   int buildid;

    public Location(String country, String city, int buildid) {
        this.country = country;
        this.city = city;
        this.buildid = buildid;
    }
}


public class User {
    String name;
    int age;
    Location location;
 void show(){
     System.out.println(location.buildid);
 }
    public User(String name, int age,Location location) {
        this.name = name;
        this.age = age;
        this.location=location;
    }

    public static void main(String[] args) {
        Location location1=new Location("Myanmar","Ygn",989);
        User user=new User("Ye Min Naing", 34,location1);
      user.show();
    }
}
