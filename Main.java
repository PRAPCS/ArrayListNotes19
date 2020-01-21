import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    // Create a dynamic array indicating the types of things it will store
    ArrayList<Integer> nums = new ArrayList<Integer>();
    // fill the arraylist with values
    for (int i = 0; i < 4; i++) {
      nums.add(i);
    }
    nums.set(3,10);//places the 10 in location 3
    nums.add(1,7);//add a 7 in location 1 and move everyone down
    nums.remove(2);//remove value at location 2 and move everyone down


    for(int j=0; j<nums.size();j++){
      System.out.println(nums.get(j));
    }
  
   ArrayList<Cars> garage = new ArrayList<Cars>();
   
   Cars ferrari = new Cars("Red",32);//Create car object
   garage.add(ferrari);//Add it to the list
   garage.add(new Cars("Silver",14));//Do both all in one line
   
   for(int i=0;i<garage.size();i++){
     Cars temp;//declare the type of object
     temp = garage.get(i);//get it out of the list
     System.out.println(temp);//run the toString method
   }




  }
}