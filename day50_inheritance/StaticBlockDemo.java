package day50_inheritance;

public class StaticBlockDemo {
    static int num;

        static {
            num = 10;
            System.out.println("static initializer block");
        }
        public StaticBlockDemo(){
            num +=5;
            System.out.println("Constructor method");
        }
        public StaticBlockDemo(int num){
            this.num += num;
        }

}
