
public class Sorting {
    public static int[] sortingArray(int[]array){
        int temp;
        for(int i= 0; i<array.length;i++){
            for(int j= i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] a){
        int[] numbers ={4,9,8,3,10,7,1,2,6,5};
        int[] sortingArray = sortingArray(numbers);
        for (int nb:sortingArray){
            System.out.print(nb+" ");
        }
    }
}
