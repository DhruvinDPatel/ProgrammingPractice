class Solution {
  public static void main(String[] args) {
    
    int arr[] = {5,4,3,2,1,2,4,6,8,10};
    int arr2[] = new int[10];
    
    int n = arr.length, i =n/2-1, j=n/2, k = 0;
    
    System.out.println("J"+j);
    
    while(i >= 0 && j < n){
      if( arr[i] <= arr[j]){
        arr2[k] = arr[i--];
      }else{
        arr2[k] = arr[j++];
      }
      k++;
    }
    
    while(i>=0){
              arr2[k++] = arr[i--];
    }
    
    while(j<n){
              arr2[k++] = arr[j++];    
    }
    
    for (int p: arr2) {
      System.out.println(p);
    }
  }
}