public class Box
{
    private Box next;
    private Box previous;
    private int data;
    
    public Box(Box inputBoxNext, Box inputBoxPrevious, int inputData){
        data = inputData;
        next = inputBoxNext;
        previous = inputBoxPrevious;
    }
    
    // 2 getters 2 setters
    
    public Box getNextBox(){return next;}

    public Box getPreviousBox(){return previous;}
    
    public void setNextBox(Box newBox){
        next = newBox;
    }

    public void setPreviousBox(Box newBox){previous = newBox;}

    public int getData(){
        return data;
    }
    
    public void setData(int newData){
        data = newData;
    }
}
