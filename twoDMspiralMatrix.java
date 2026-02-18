

public class twoDMspiralMatrix {
  public static void main(String[] args) {
    int[][] nums = { 
      {10, 20, 30, 40},
      {15, 25, 35, 45},
      {27, 29, 37, 48},
      {32, 33, 39, 50}
    };

    int SR=0;
    int ER=nums.length-1;
    int SC=0;
    int EC=nums[0].length-1;

    while(SR<=ER && SC<=EC){
      //top
      for(int i=SC;i<=EC;i++){
        System.out.print(nums[SR][i]+" ");
      }
      //right
      for(int i=SR+1;i<=ER;i++){
        System.out.print(nums[i][EC]+" ");
      }
      //bottom
      for(int i=EC-1;i>=SC;i--){
        if(ER==SR) break;
        System.out.print(nums[ER][i]+" ");
      }
      //top
      for(int i=ER-1;i>=SR+1;i--){
        if(SC==EC) break;
        System.out.print(nums[i][SC]+" ");
      }
      SR++;
      ER--;
      SC++;
      EC--;
    }
  }
}
