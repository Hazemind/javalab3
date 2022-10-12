public class Main {
    public static void main(String[] args){
        Student a = new Student();
        a.showInfo(25, "white ","Russian", "RGATU");
        Dog d = new Dog();
        System.out.print("And i have a ");
        d.showBreed();
        d.makeSound();
        d.goToSleep();
    }
}
