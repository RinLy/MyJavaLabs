

package RGR_1;
import java.util.*;
public class R2 {
	

	//Сканер клавіатури
	private static Scanner sc;

	//Сума
   public static int getSumNumbers(int[] numbers) {
    int Summa = 0;

    for (int i = 0; i<5; i++)
     Summa += numbers[i];
    return Summa;
   }
   
   //Сума дабл
   public static double getSumNumbers(double[] numbers) {
	    double Summa = 0;

	    for (int i = 0; i<5; i++)
	     Summa += numbers[i];
	    return Summa;
	   }
   
   //Різниця
   public static int getDiffNumbers (int[] numbers){
    int Diff = 0;

    for (int i = 0; i<5; i++)
     Diff -= numbers[i];
    return Diff;
   }
   
   //Різниця дабл
   public static double getDiffNumbers (double[] numbers){
    double Diff = 0;

    for (int i = 0; i<5; i++)
     Diff -= numbers[i];
    return Diff;
   }
   
   //Добуток
   public static int getProdNumbers (int[] numbers){
	    int Prod = 1;

	    for (int i = 0; i<5; i++)
	     Prod *= numbers[i];
	    return Prod;
	   }
   
   //Добуток double
   public static double getProdNumbers (double[] numbers){
	   double Prod = 1;

	    for (int i = 0; i<5; i++)
	     Prod *= numbers[i];
	    return Prod;
	   }
   
   //Максимальне
   public static int getMaxNumbers (int[] numbers){
	    int max = 0;

	    for (int i = 0; i<5; i++)
	     if (max <= numbers[i]){
	    	 max = numbers[i];
	     }
	    return max;
  }
   
   //Максимальне double
   public static double getMaxNumbers (double[] numbers){
	   double max = 0;

	    for (int i = 0; i<5; i++)
	     if (max <= numbers[i]){
	    	 max = numbers[i];
	     }
	    return max;
   }
   
   //Мінімальне
   public static int getMinNumbers (int[] numbers){
	    int min = numbers[1];

	    for (int i = 0; i<5; i++)
	    	
	     if (min >= numbers[i]){
	    	 min = numbers[i];
	     }
	    return min;
  }
   
   //Мінімальне
   public static double getMinNumbers (double[] numbers){
	   double min = numbers[1];

	    for (int i = 0; i<5; i++)
	     if (min >= numbers[i]){
	    	 min = numbers[i];
	     }
	    return min;
  }
   
   //Середнє
   public static int getAverNumbers (int[] numbers){
	    int aver = getSumNumbers(numbers)/5;
	    return aver;
  }
   
   //Середнє double
   public static double getAverNumbers (double[] numbers){
	    
	    double aver = getSumNumbers(numbers)/5;
	    return aver;
  }
   
 //Помилка  
   public static void getError (){
	   System.out.println("Wrong value please repeat!");
	      System.exit(0);
     
  }
   
   // Основне тіло програми!
   public static void main(String[] args) 
      {
	  System.out.println("Введіть масив з 5 чисел.");
	  
     sc = new Scanner(System.in);
     double[] a = new double[5];
     int[] m = new int[5];
     int s=0;
     
     //Перевіряємо вхід
     for (int i = 0; i < 5; i++){
    	 if (sc.hasNextDouble()){
     a[i] = sc.nextDouble();}
    	 else	   { 
             getError();
         }
     }
     //Перевіряємо чи є мантиса
     for (int i = 0; i < 5; i++){
		 int x = (int) a[i];
	     double y = a[i] - x; 
    	if (y!=0){
    		s++;//Якщо є хоча б одна, то змінна збільшується;
    	} }
     if(s==0){//якщо мантиса нульова, то всі числа цілі і масив переводимо в Інт
    	 for (int i = 0; i < 5; i++){
    		 m[i]=(int) a[i];     		 
    	 }
    	 System.out.println("Сума int = " + getSumNumbers(m));
    	 System.out.println("Різниця int = " +getDiffNumbers(m));
		 System.out.println("Добуток int = " +getProdNumbers(m));
		 System.out.println("Найбільше int = " +getMaxNumbers(m));
		 System.out.println("Найменше int = " +getMinNumbers(m));
		 System.out.println("Середнє int = " +getAverNumbers(m));
    	 
     } else{//Якщо ні, то виводимо все в дабл
    	 System.out.println("Сума double = " + getSumNumbers(a));
    	 System.out.println("Різниця double = " +getDiffNumbers(a));
		 System.out.println("Добуток double = " +getProdNumbers(a));
		 System.out.println("Найбільше double = " +getMaxNumbers(a));
		 System.out.println("Найменше double = " +getMinNumbers(a));
		 System.out.println("Середнє double = " +getAverNumbers(a));
     }
     }
     }
