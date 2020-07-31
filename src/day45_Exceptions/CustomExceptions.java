package day45_Exceptions;

class BreakTimeException extends RuntimeException{
    public BreakTimeException(){
        super("it's a time");
    }
    public BreakTimeException(String str){
        super(str);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        boolean breakTime=false;
        if(breakTime){
         throw new BreakTimeException();
        }else{
            System.out.println("Continue the class");
        }
        throw new RuntimeException("It's break time, we should tske break");
    }
}
