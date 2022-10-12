public class GenClass <T>{
    private T id;
    GenClass(T id){
        this.id = id;
    }
    public T getId(){
       return id;
    }
}
