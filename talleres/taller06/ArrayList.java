import java.util.Arrays;
public class ArrayList
{
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] array;

    public ArrayList(){
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public ArrayList(int size){
        this.array = new Object[size];
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public Object get(int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: "+ index);
        }
        return this.array[index];
    }

    public void remove(int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: "+ index);
        }
        else{
            Object[] elements2 = new Object[this.array.length];
            for(int i = 0; i < this.size-1; i++){
                if(i == index)            
                    elements2[i] = this.array[i+1];
                else if(i < index)  
                    elements2[i] = this.array[i];
                else
                    elements2[i] = this.array[i+1];
            }
            this.array = elements2;
            this.size--;
        }
    }

    public void add(Object a){
        this.array = Arrays.copyOf(this.array, this.array.length+1);
        this.array[size] = a;
        this.size++;
    }

    public void add(int index, Object a){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: "+ index);
        }
        else{
            Object[] elements2 = new Object[this.array.length+1]; 
            for(int i = 0; i <= this.array.length; i++){
                if(i == index)            
                    elements2[i] = a;
                else if(i < index)  
                    elements2[i] = this.array[i];
                else
                    elements2[i] = this.array[i-1];
            }               
            this.array = elements2;
            this.size++;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        Object[] elements2 = new Object[DEFAULT_CAPACITY];
        this.array = elements2;
        this.size = 0;
    }
    
    public boolean contains(int n){
        return Arrays.binarySearch(this.array, n) != -1;
    }

    public int indexOf(int n){
        return Arrays.binarySearch(this.array, n);
    }
}