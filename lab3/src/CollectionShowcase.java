import java.util.*;

public class CollectionShowcase {
    public static String getCharForNumber(int i) {//функция чтобы найти букву по номеру
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
    public static void main(String[] args) {

        //------------HashMap------------------------
        HashMap<Integer, String> numAndLetter = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            numAndLetter.put(i, getCharForNumber(i));//заполнение мапы
            //System.out.println(i + " " + getCharForNumber(i));
        }
        HashSet<Integer> numbs = new HashSet<Integer>(numAndLetter.keySet());//создание сета и одновременно выборка данных из мапы
        System.out.println(numbs);

        ArrayList<String> letters = new ArrayList<>(numAndLetter.values());//создание листа и одновременно выборка данных из мапы
        System.out.println(letters);

        System.out.println("Map size - " + numAndLetter.size());//размер мапы
        numAndLetter.clear();//чистка мапы
        System.out.println("Map empty? - "+numAndLetter.isEmpty());//проверка на пустоту мапы

        //--------------Set--------------------------
        for (Integer i = 27; i < 31; i++) {
            numbs.add(i);//добавление чисел к сету
        }
        System.out.println(numbs);
        for (Integer i = 1; i < 26; i++) {
            numbs.remove(i);//удаление из сета
        }
        System.out.println(numbs);
        if (numbs.add(30)){//попытка добавить число, которое уже есть в сете
            System.out.println("Adding that number.");
        }else{
            System.out.println("Can't add that 30. Already in.");
        }
        //---------------ArrayList-------------------
        int lSize = letters.size();//размер листа
        System.out.println("Size of ArrayList - "+lSize);
        for (Integer i=1; i<14; i++){
            letters.remove(getCharForNumber(i));//удаление элементов
            letters.add(getCharForNumber(i));//добавление элементов
        }
        System.out.println(letters);
    }
}
