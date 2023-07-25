public class Array{

   //main method
   public static void main(String[] args){
   
      //Declare and initialize the array elements
      int arr[] = { 10,98,3,33,12,22,21,11};
      
      //get the length of the array
      int size = arr.length;
      
      
      for(int i=0; i<size; i++){
         if(arr[i]%2==0){
         
            //separates even numbers
            System.out.print(arr[i]+" ");
         }
      }
    
      for(int i=0; i<size; i++){
         if(arr[i]%2==1){
         
            //separates odd numbers
            System.out.print(arr[i]+" ");
         }
      }
   }
}
