public final class Singleton {

    private static final Singleton singletone = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingletone() {
        return singletone;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingletone();
        Singleton second = Singleton.getSingletone();
        System.out.println(second.equals(singleton));
    }
}
