import java.lang.reflect.Array;
/**Remove Duplicates from array without using any other collection method */
class GetDups<T>{
    Class claz;
    public GetDups(Class<T> claz){
        this.claz=claz;

    }
 
    public  T[] name(T[] array) {
        
        int len=array.length;
        T new_arr[]=(T[])Array.newInstance(claz, len);
       int k=0;
       for (T i:array){
           //System.out.println(i);
           for (int j=0;j<len;j++){
                if(i == array[j]  ){

                    array[j] = null;
                  
                }
           }
           if(i != null){
            new_arr[k]=i;
            k++;
           }
           
       }
        return new_arr;
    }
}
public class RemoveDups{
    public static void main(String[] args) {
       
        String k[]=testString();
        Integer i[]=testInteger();
        Character ch[]=testCharacter();
        printData(k);
        printData(i);
        printData(ch);
        
    }
    public static String[] testString(){
            String[] s={"Hello","hello","heLLO","hello","HELLo","Hello"};
            return new GetDups<String>(String.class).name(s);
    }
    public static Integer[] testInteger(){
        Integer[] i={1,2,3,4,2,4,7,235,2,2,4,5};
         return new GetDups<Integer>(Integer.class).name(i);
    }
    public static Character[] testCharacter(){
        Character chaR[]={'a','e','i','o','e','u','e'};
         return new GetDups<Character>(Character.class).name(chaR);
    }
    public static void printData(Object [] data){
        for (Object element : data) {
            System.out.println(element);
        }
    }
}