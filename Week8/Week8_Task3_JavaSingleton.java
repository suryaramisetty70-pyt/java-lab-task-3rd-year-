public class Week8_Task3_JavaSingleton {
    static class Singleton {
        private static Singleton instance;
        public String str;

        private Singleton() {}

        public static Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        s1.str = "Hello I am a singleton! Let me say hello world to you";
        Singleton s2 = Singleton.getSingleInstance();
        System.out.println(s2.str);
        System.out.println("Are s1 and s2 same instance? " + (s1 == s2));
    }
}

/*
OUTPUT:
Hello I am a singleton! Let me say hello world to you
Are s1 and s2 same instance? true
*/
