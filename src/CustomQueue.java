import java.util.ArrayList;

public class CustomQueue{
    private ArrayList<Float> values;
    private int top;

    public CustomQueue(){
        this.values = new ArrayList<>();
        this.top = 0;
    }
    public void enQueue (Float element){
        values.add(element);
        top ++;
    }

    public int getTop() {
        return top;
    }

    public  Float deQueue (){
        return this.values.remove(0);
    }
}
