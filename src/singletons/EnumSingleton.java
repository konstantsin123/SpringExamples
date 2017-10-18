package singletons;


public enum EnumSingleton {
    INSTANCE;

    private String string = "mother";

    public String print(){
        return string + " fucker!";
    }
}
