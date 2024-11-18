public class array {
    public static void main(String[]args){
        int arr[];
        arr = new int[5];
        arr[0]=2;
        arr[1]=0;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        
        for (int i =0; i< arr.length; i++){
            System.out.println("Element at index"+i+":"+arr[i]);
        }
    }
}
