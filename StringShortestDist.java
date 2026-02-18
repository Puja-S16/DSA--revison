// You are given a route represented as a string containing four cardinal directions: 'E' (East), 'W' (West), 'N' (North), and 'S' (South). Starting from the origin (0, 0) on a 2D Cartesian plane, you must determine the shortest distance (displacement) required to reach the final destination after following the entire route.
// "WNEENESENNN"
public class StringShortestDist {
  public static double shortestDist(String str) {
    int x=0;
    int y=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='N'){
        y++;
      }
      else if(ch=='S'){
        y--;
      }
      else if(ch=='W'){
        x--;
      }
      else if(ch=='E'){
        x++;
      }
    }
    return Math.sqrt((x*x)+(y*y));

  }
  public static void main(String[] args) {
    System.out.println(shortestDist("WNEENESENNN"));
  }
}
