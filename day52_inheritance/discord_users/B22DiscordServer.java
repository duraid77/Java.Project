package day52_inheritance.discord_users;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1235);
        user1.setName("Duraid");
        user1.setRole("student");

        Admin admin = new Admin();
        admin.setName("Burak");
        admin.setId(22354);
        admin.setRole("Admin");
        System.out.println("admin = " + admin);
        System.out.println("user1 = " + user1);

        Admin admin2 = new Admin(3232, "Gullia");

    }
}
