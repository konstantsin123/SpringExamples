package singletons;
/*
+ Ленивая инициализация
+ Высокая производительность
- Поддерживается только с JDK 1.5
 */

public class BestSingleton {
    private static volatile BestSingleton instance;

    public static BestSingleton getInstance() {
        BestSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (BestSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new BestSingleton();
                }
            }
        }
        return localInstance;
    }
}