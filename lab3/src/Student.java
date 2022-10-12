public class Student implements Human{
    public void showAge(int x) {
        System.out.println(x);
    }
    public void showRace(String s) {
        System.out.println(s);
    }
    public void showNation(String n) {
        System.out.println(n);
    }
    public void showUni(String u){
        System.out.println(u);
    }
    public void showInfo(int x, String s,String n, String u){
        showAge(x);
        showRace(s);
        showNation(n);
        showUni(u);
    }
}
