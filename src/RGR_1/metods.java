package RGR_1;
import java.util.Random;

public class metods {
	
	//Сума
	   public static int getSumNumbers(int[] numbers) {
	    int Summa = 0;

	    for (int i = 1; i<6; i++)
	     Summa = Summa + numbers[i];
	    return Summa;
	   }
	   
	   //Сума дабл
	   public static double getSumNumbers(double[] numbers) {
		    double Summa = 0;

		    for (int i = 1; i<6; i++)
		     Summa = Summa + numbers[i];
		    return Summa;
		   }
	   
	   //Різниця
	   public static int getDiffNumbers (int[] numbers){
	    int Diff = 0;

	    for (int i = 1; i<6; i++)
	     Diff = Diff - numbers[i];
	    return Diff;
	   }
	   
	   //Різниця дабл
	   public static double getDiffNumbers (double[] numbers){
	    double Diff = 0;

	    for (int i = 1; i<6; i++)
	     Diff = Diff - numbers[i];
	    return Diff;
	   }
	   
	   //Добуток
	   public static int getProdNumbers (int[] numbers){
		    int Prod = 1;

		    for (int i = 1; i<6; i++)
		     Prod = Prod * numbers[i];
		    return Prod;
		   }
	   
	   //Добуток double
	   public static double getProdNumbers (double[] numbers){
		   double Prod = 1;

		    for (int i = 1; i<6; i++)
		     Prod = Prod * numbers[i];
		    return Prod;
		   }
	   
	   //Максимальне
	   public static int getMaxNumbers (int[] numbers){
		    int max = 0;

		    for (int i = 1; i<6; i++)
		     if (max <= numbers[i]){
		    	 max = numbers[i];
		     }
		    return max;
	  }
	   
	   //Максимальне double
	   public static double getMaxNumbers (double[] numbers){
		   double max = 0;

		    for (int i = 1; i<6; i++)
		     if (max <= numbers[i]){
		    	 max = numbers[i];
		     }
		    return max;
	   }
	   
	   //Мінімальне
	   public static int getMinNumbers (int[] numbers){
		    int min = numbers[1];

		    for (int i = 1; i<6; i++)
		    	
		     if (min >= numbers[i]){
		    	 min = numbers[i];
		     }
		    return min;
	  }
	   
	   //Мінімальне
	   public static double getMinNumbers (double[] numbers){
		   double min = numbers[1];

		    for (int i = 1; i<6; i++)
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
	   
	   //Random
	   public static double getRandom (double[] numbers){
		   Random rand = new Random();
		   double a;
		   a = rand.nextDouble();
		   return a;
		   }
	   
	   //Помилка  
	   public static void getError (){
		   System.out.println("Wrong value please repeat!");
		      System.exit(0);
	     
	  }
}
