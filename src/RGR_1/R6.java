package RGR_1;
import java.util.Scanner;
public class R6 {
	private static Scanner sc;

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
    		 a[i]= metods.getRandom(null);
    		 }
    	 }
    	 else if (w == 0){
    		//Отримуємо дані з класу Обробка
    	     obrobka.test(args, a); 
    	 }
    	 else{
    		 metods.getError(); 
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
    	      
    	 System.out.println("Сума int = " + metods.getSumNumbers(m));
    	 System.out.println("Різниця int = " + metods.getDiffNumbers(m));
		 System.out.println("Добуток int = " + metods.getProdNumbers(m));
		 System.out.println("Max int = " + metods.getMaxNumbers(m));
		 System.out.println("Min int = " + metods.getMinNumbers(m));
		 System.out.println("Середнє int = " + metods.getAverNumbers(m));
		//Перевірка масиву
			System.out.print("[");
			for (int i = 1; i < 6; i++){
			System.out.print (m[i]+" ");
			}
			System.out.println("]"); 
     } 
     else{//Якщо ні, то виводимо все в дабл
    	
      
    	 System.out.println("Сума double = " + metods.getSumNumbers(a));
    	 System.out.println("Різниця double = " + metods.getDiffNumbers(a));
		 System.out.println("Добуток double = " + metods.getProdNumbers(a));
		 System.out.println("Max double = " + metods.getMaxNumbers(a));
		 System.out.println("Min double = " + metods.getMinNumbers(a));
		 System.out.println("Середнє double = " + metods.getAverNumbers(a));
		//Перевірка масиву
	      	System.out.print("[");
	      	for (int i = 1; i < 6; i++){
	     	 System.out.print (a[i]+"; ");
	      	}
	      	System.out.println("]");
     }
     	
     }
     }
