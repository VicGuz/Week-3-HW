import java.util.Arrays;

public class week3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] ages = new int [] {3, 9, 23, 64, 2, 8, 28, 93, 34};
    System.out.println(Arrays.toString(ages));
    System.out.print("Subtracting 1st element from last element: ");
    System.out.println(ages[ages.length-1]- ages[0]);
    
    int avg= 0;
    int sum =0;
   System.out.print("Average age: "); 
    for (int i=0; i <=ages.length-1; i++) {
      sum= sum+ages[i];
      avg = sum/ages.length-1;
      }
    System.out.println(avg);
    
    
    String[] names = new String [] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    int sums = 0;
    for (String name:names) {
      sums += names.length-1;}
    
    System.out.println(Arrays.toString(names));
    System.out.print("Average letter per name: ");
    System.out.println(sums/names.length-1);
    
    for(int i =0; i <= names.length-1; i++){
   
     System.out.print(names[i] +" " );
    }
    System.out.println(" ");
    
 
    int[] nameLength = new int[names.length];
    
    System.out.println("Each name has this many characters...");
    for(int i = 0; i < names.length; i++){
        nameLength[i] = names[i].length();
       
        System.out.print (nameLength[i]+" "); }
   System.out.println(" ");
   
  int total = 0;
   for (int i = 0; i < nameLength.length; i++) {
     total = total + nameLength[1]-1;
                }
   System.out.println("The total sum is:" + total);
   
 }

   
  public static String hello (String word, int n ) {
String word;
    return word.repeat(n);
 
    }
      
    
 
  
public static String writeFullName (String firstName, String lastName) { 
  String fullName = firstName +" " + lastName;
  return fullName; 
}


public static boolean sumOver100 (int arr[]) {

int sum =0;
for (int i : arr)
  sum+= i;
return true  ;
}

public static double average (double arr[]) {
  int sum=0;
  for (int i=0; i <= arr.length; i++) {
    sum+= arr[i];
  double average= sum/ arr.length;
  return average;
  }
 
  
  
}


}


