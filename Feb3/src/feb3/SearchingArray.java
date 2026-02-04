package feb3;
public class SearchingArray {
    public static void main(String[] args) {
        
        int numbers[] = {10,20,30,5,40,20,1,5,30,40};
        int search = 5;
        int indexNo = LinearSearch(numbers, search);
        System.out.println(indexNo);
        
    }
    
    public static int LinearSearch(int[] array, int searchNumber){
    int result = -1;
    for(int index = 0; index < array.length; index++){
    if(array[index]== searchNumber){
    result = index;
    break;
    }
    }
    return result;
    }
    
    
}
