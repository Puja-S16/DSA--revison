// container with max water
//return the max amount of water that can be hold by a container
import java.util.ArrayList;

public class ArrayList_3waterContainer {
  public static int water(ArrayList<Integer> list) {
    int water=0;
    int Mwater=Integer.MIN_VALUE;
    
    int i=0;
    int j=list.size()-1;
    while(i<j){
      int L=list.get(i);
      int R=list.get(j);
      if(L<=R){
        water=(j-i)*L;
        i++;
      }else{
        water=(j-i)*R;
        j--;
      }
      Mwater=Math.max(Mwater,water);
    }
    return Mwater;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>();
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);

    System.out.println(water(list));
  }
}
