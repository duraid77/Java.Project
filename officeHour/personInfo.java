package officeHour;

public class personInfo {
    public static void main(String[] args){
/*
Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information
 */
String name = "Duraid";
byte age = 43;
char gender = 'M';
boolean student = true;
short siblings = 5;
long favNumber = 32165825;
int numberOfSeasons = 4;
double birthDate = 02.01;
int year = 1978;


String fullBirthDate;
fullBirthDate = "" + birthDate + "." + year;
System.out.println(fullBirthDate);
System.out.println("Name: " + name);


}
}

