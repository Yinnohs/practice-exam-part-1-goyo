import java.util.ArrayList;

public class CustomQueue{
    private ArrayList<Float> values;

    public CustomQueue(){

    }
    public void enQueue (Float element){
        values.add(element);
    }

    public  Float deQueue (){
        return this.values.remove(0);
    }
}
