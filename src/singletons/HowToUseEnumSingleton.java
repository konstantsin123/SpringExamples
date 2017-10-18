package singletons;

public class HowToUseEnumSingleton {
    private static String string = "Hi ";
    public static void main(String[] args){
        System.out.println(string + EnumSingleton.INSTANCE.print());
    }
}
