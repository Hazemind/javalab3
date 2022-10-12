import java.lang.reflect.*;

public class TheMirror {
    public static void main(String args[])
    {
        System.out.println("----Reflecting Dog Class---");
        System.out.println("----------Methods----------");
        try {
            Class c = Class.forName("Dog");
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString());
        }
        catch (Throwable e) {
            System.err.println(e);
        }
        System.out.println("---Invoking class methods--");
        try {
            Class cls = Class.forName("Dog");
            Method meth = cls.getMethod("makeSound");
            Dog sound = new Dog();
            meth.invoke(sound);
            Method meth2 = cls.getMethod("showBreed");
            meth2.invoke(sound);
        }
        catch (Throwable e) {
            System.err.println(e);
        }
        System.out.println("----Show parental class----");
        try {
            Class c2 = Class.forName("Dog");
            System.out.println(c2.getSuperclass());
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}
