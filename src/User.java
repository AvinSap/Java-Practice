
public class User {

    //ATTRIBUTES
    String fullName;
    String email;
    String race;
    String address;
    String nationality;
    int age ;

    //CONSTRUCTOR:
    public User (String fullName, String email, String race, String address, String nationality ) {
        this.fullName = fullName;
        this.email = email;
        this.race = race;
        this.address = address;
        this.nationality = nationality;
        this.age = 0;
        System.out.println("The User is Created");

    }
    //METHOD IN ACTION:
    public void talk() {
        System.out.println("My Name is "+this.fullName);

    }
    public void eat(){
        System.out.println(this.fullName +" is eating. ");
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", race='" + race + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }

    public void getUserDetails(){
        System.out.println("Name: "+ this.fullName + " Email: "+ this.email+ " Race: " + this.race + " Address: "+ this.address + " Nationality: "+ this.nationality);

    }
}
