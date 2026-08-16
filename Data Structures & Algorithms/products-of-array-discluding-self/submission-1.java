class Solution {
    public int[] productExceptSelf(int[] arr) {
        int prefixProduct[] = new int[arr.length];

        prefixProduct[0] = 1;
        for(int i = 1 ; i<arr.length ; i++){
            prefixProduct[i] = prefixProduct[i-1] * arr[i-1];
        }
        System.out.println(Arrays.toString(prefixProduct));


        int sufficProd[] = new int[arr.length];

        sufficProd[arr.length-1] = 1;
        for(int i = arr.length-2;i>=0 ; i--){
            sufficProd[i] = sufficProd[i+1] * arr[i+1];
        }


        int result[] = new int[arr.length];
        for(int i = 0 ; i<arr.length ; i++){
            result[i] = sufficProd[i]* prefixProduct[i];
        }

       

      return result;
    }
}  
