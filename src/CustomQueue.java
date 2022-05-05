import java.util.ArrayList;

public class CustomQueue<T>{
    private ArrayList<T> values;

    public CustomQueue(){

    }
    public void enQueue (T element){
        values.add(element);
    }

    public  T deQueue (){
        return this.values.remove(0);
    }
}
