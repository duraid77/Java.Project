package day52_inheritance.discord_users;

public class Admin extends User{

public Admin(){
    System.out.println("admin class constructor");
}

    public String toString() {
        return "User{" +
                "name='" + getName() + '\'' +
                ", userLevel=" + userLevel +
                ", id=" + getId() +
                ", role='" + getRole() + '\'' +
                '}';
    }
    public Admin(int id, String name){
    super("admin" , name, id);
    }
}
