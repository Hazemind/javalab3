public class GenMeth {

    public static <T> void printT(T[] items){
        for (T item: items){
            System.out.print(item + " ");
        }
    }

    public static void main (String args[]){
        GenClass <String> GC1 = new GenClass<String>("Hello!");
        String a = GC1.getId();
        System.out.println(a);

        GenClass <Integer> GC2 = new GenClass<Integer>(225442);
        Integer b = GC2.getId();
        System.out.println(b);

        GenMeth gm = new GenMeth();
        String[] chars = {"A","B","C"};
        Integer[] numbs = {1,2,3};
        gm.printT(chars);
        gm.printT(numbs);
    }
}
