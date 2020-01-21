public class Cars{
  private String myColor;
  private int myMpg;

  public Cars(String color, int mpg){
    myColor = color;
    myMpg = mpg;
  }

 public String getColor(){
   return myColor;
 }

 public void setColor(String c){
   myColor = c;
 }
public String toString(){
  return "The color of the car is: "+myColor+" and the miles per gallon are: "+myMpg;
}

}