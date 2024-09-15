package Singleton;

public class SingletonApplication {
    public static void main(String[] args) {
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        //OurSingleton object1 = new OurSingleton(); // The constructor OurSingleton() is not visible

        System.out.println(classSingleton1.getInfo()); //Initial class info

        ClassSingleton classSingleton2 = ClassSingleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton1.getInfo()); //New class info
        System.out.println(classSingleton2.getInfo()); //New class info

        //Enum singleton

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        //You can access the instance directly via EnumSingleton.INSTANCE Without needing the getInstance() method.

        System.out.println(enumSingleton1.getCourse1()); //Initial enum info

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setCourse1("Art");

        System.out.println(enumSingleton1.getCourse1()); //New enum info
        System.out.println(enumSingleton2.getCourse1()); //New enum info

    }
}
