public class PrimitiveDataType{
  public static void main(String[] args) {
     byte myAge = 30;
     System.out.printf("Miss mercy is %d years old%n",myAge);
     
     short quantity = 20000;
     System.out.printf("The quantity of iphones ordered is %,d%n",quantity);
     
     int nigeriaPopulation = 294848848;
     System.out.printf("The population of Nigeria is %,d%n",nigeriaPopulation);
     
     long worldPopulation = 474747474747474747L;
     System.out.printf("The world's population is %,d%n",worldPopulation);
     
     float price = 577858.84747F;
     System.out.printf("The price of each iphone per unit is %.2f%n",price);
     
     double myBalance = 567656565654565.7676787;
     System.out.printf("My account balance is %c%,.2f",'$',myBalance);
     
    char symbol = '%';
    System.out.printf("There is an increment in the world's population by 20.5%c%n",symbol);
    
    boolean isJavaFun = true;
    System.out.printf("Do you love java? %b",isJavaFun);
  }
  
}