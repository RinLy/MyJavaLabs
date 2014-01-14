package RGR_1;
import java.util.Random;
import java.util.Scanner;
public class R5 {
	private static Scanner sc;

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
   
   
   // Основне тіло програми!
   public static void main(String[] args)
      {
	   
	 sc = new Scanner(System.in);     
     double[] a = new double[6];
     int[] m = new int[6];
     int s=0;
     
     for (int i = 0; i < 1; i++){
    	 int w;
    	 System.out.println("Виберіть варіант заповнення масиву: RANDOM(1), CMD(0)"); 
    	 w = sc.nextInt();
    	 
    	 if (w == 1){
    		 for (i=1;i<6;i++){
    		 a[i]= getRandom(null);
    		 }
    	 }
    	 else if (w == 0){
    		//Отримуємо дані з класу Обробка
    	     obrobka.test(args, a); 
    	 }
    	 else{
    		 getError(); 
    	 }
     }
     	
               
     //Перевіряємо чи є мантиса
     for (int i = 0; i < 6; i++){
		 int x = (int) a[i];
	     double y = a[i] - x; 
    	if (y!=0){
    		s++;//Якщо є хоча б одна, то змінна збільшується;
    	} }
     if(s==0){//якщо мантиса нульова, то всі числа цілі і масив переводимо в Інт
    	 for (int i = 1; i < 6; i++){
    		 m[i]=(int) a[i];     		 
    	 }
    	      
    	 System.out.println("Сума int = " + getSumNumbers(m));
    	 System.out.println("Різниця int = " +getDiffNumbers(m));
		 System.out.println("Добуток int = " +getProdNumbers(m));
		 System.out.println("Max int = " +getMaxNumbers(m));
		 System.out.println("Min int = " +getMinNumbers(m));
		 System.out.println("Середнє int = " +getAverNumbers(m));
		//Перевірка масиву
			System.out.print("[");
			for (int i = 1; i < 6; i++){
			System.out.print (m[i]+" ");
			}
			System.out.println("]"); 
     } 
     else{//Якщо ні, то виводимо все в дабл
    	
      
    	 System.out.println("Сума double = " + getSumNumbers(a));
    	 System.out.println("Різниця double = " +getDiffNumbers(a));
		 System.out.println("Добуток double = " +getProdNumbers(a));
		 System.out.println("Max double = " +getMaxNumbers(a));
		 System.out.println("Min double = " +getMinNumbers(a));
		 System.out.println("Середнє double = " +getAverNumbers(a));
		//Перевірка масиву
	      	System.out.print("[");
	      	for (int i = 1; i < 6; i++){
	     	 System.out.print (a[i]+"; ");
	      	}
	      	System.out.println("]");
     }
     	
     }
     }
