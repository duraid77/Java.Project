package day52_inheritance.discord_users;

public class User {
    private String name;
    int userLevel;
    private int id;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userLevel=" + userLevel +
                ", id=" + id +
                ", role='" + role + '\'' +
                '}';
    }

    //constructor
    public User(){
        System.out.println("constructor is running");
    }
    public User(String role, String name, int id){
        System.out.println(role + name + "" + id);
        this.name= name;
        this.id = id;
        this.role = role;
    }
}
