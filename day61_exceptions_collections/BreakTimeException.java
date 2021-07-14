package day61_exceptions_collections;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(){

    }
    public BreakTimeException(String str){
        System.out.println(str);
    }
}
