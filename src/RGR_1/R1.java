package RGR_1;
import java.util.*;

public class R1 {
		
		//Сканер клавіатури
			private static Scanner sc;

		//Сума
		   public static int getSumNumbers(int[] numbers) {
		    int Summa = 0;

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
		 		   
		   //Добуток
		   public static int getProdNumbers (int[] numbers){
			    int Prod = 1;

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
		   
				   
		   //Мінімальне
		   public static int getMinNumbers (int[] numbers){
			    int min = numbers[1];

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
		   
		 
		   
		   // Основне тіло програми!
		   public static void main(String[] args) 
		      {
			  System.out.println("Введіть масив з 5 чисел.");
			  System.out.print("a[] = ");
			  
		     sc = new Scanner(System.in);
		     int[] a = new int[5];
		     for (int i = 0; i < 5; i++)
		     a[i] = sc.nextInt();
		  
		   System.out.println("Сума = " + getSumNumbers(a));
		   System.out.println("Різниця = " +getDiffNumbers(a));
		   System.out.println("Добуток = " +getProdNumbers(a));
		   System.out.println("Найбільше = " +getMaxNumbers(a));
		   System.out.println("Найменше = " +getMinNumbers(a));
		   System.out.println("Середнє = " +getAverNumbers(a));
		      }
		}