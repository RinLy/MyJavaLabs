

package RGR_1;
import java.util.*;
public class R2 {
	

	//������ ���������
	private static Scanner sc;

	//����
   public static int getSumNumbers(int[] numbers) {
    int Summa = 0;

    for (int i = 0; i<5; i++)
     Summa += numbers[i];
    return Summa;
   }
   
   //���� ����
   public static double getSumNumbers(double[] numbers) {
	    double Summa = 0;

	    for (int i = 0; i<5; i++)
	     Summa += numbers[i];
	    return Summa;
	   }
   
   //г�����
   public static int getDiffNumbers (int[] numbers){
    int Diff = 0;

    for (int i = 0; i<5; i++)
     Diff -= numbers[i];
    return Diff;
   }
   
   //г����� ����
   public static double getDiffNumbers (double[] numbers){
    double Diff = 0;

    for (int i = 0; i<5; i++)
     Diff -= numbers[i];
    return Diff;
   }
   
   //�������
   public static int getProdNumbers (int[] numbers){
	    int Prod = 1;

	    for (int i = 0; i<5; i++)
	     Prod *= numbers[i];
	    return Prod;
	   }
   
   //������� double
   public static double getProdNumbers (double[] numbers){
	   double Prod = 1;

	    for (int i = 0; i<5; i++)
	     Prod *= numbers[i];
	    return Prod;
	   }
   
   //�����������
   public static int getMaxNumbers (int[] numbers){
	    int max = 0;

	    for (int i = 0; i<5; i++)
	     if (max <= numbers[i]){
	    	 max = numbers[i];
	     }
	    return max;
  }
   
   //����������� double
   public static double getMaxNumbers (double[] numbers){
	   double max = 0;

	    for (int i = 0; i<5; i++)
	     if (max <= numbers[i]){
	    	 max = numbers[i];
	     }
	    return max;
   }
   
   //̳�������
   public static int getMinNumbers (int[] numbers){
	    int min = numbers[1];

	    for (int i = 0; i<5; i++)
	    	
	     if (min >= numbers[i]){
	    	 min = numbers[i];
	     }
	    return min;
  }
   
   //̳�������
   public static double getMinNumbers (double[] numbers){
	   double min = numbers[1];

	    for (int i = 0; i<5; i++)
	     if (min >= numbers[i]){
	    	 min = numbers[i];
	     }
	    return min;
  }
   
   //������
   public static int getAverNumbers (int[] numbers){
	    int aver = getSumNumbers(numbers)/5;
	    return aver;
  }
   
   //������ double
   public static double getAverNumbers (double[] numbers){
	    
	    double aver = getSumNumbers(numbers)/5;
	    return aver;
  }
   
 //�������  
   public static void getError (){
	   System.out.println("Wrong value please repeat!");
	      System.exit(0);
     
  }
   
   // ������� ��� ��������!
   public static void main(String[] args) 
      {
	  System.out.println("������ ����� � 5 �����.");
	  
     sc = new Scanner(System.in);
     double[] a = new double[5];
     int[] m = new int[5];
     int s=0;
     
     //���������� ����
     for (int i = 0; i < 5; i++){
    	 if (sc.hasNextDouble()){
     a[i] = sc.nextDouble();}
    	 else	   { 
             getError();
         }
     }
     //���������� �� � �������
     for (int i = 0; i < 5; i++){
		 int x = (int) a[i];
	     double y = a[i] - x; 
    	if (y!=0){
    		s++;//���� � ���� � ����, �� ����� ����������;
    	} }
     if(s==0){//���� ������� �������, �� �� ����� ��� � ����� ���������� � ���
    	 for (int i = 0; i < 5; i++){
    		 m[i]=(int) a[i];     		 
    	 }
    	 System.out.println("���� int = " + getSumNumbers(m));
    	 System.out.println("г����� int = " +getDiffNumbers(m));
		 System.out.println("������� int = " +getProdNumbers(m));
		 System.out.println("�������� int = " +getMaxNumbers(m));
		 System.out.println("�������� int = " +getMinNumbers(m));
		 System.out.println("������ int = " +getAverNumbers(m));
    	 
     } else{//���� �, �� �������� ��� � ����
    	 System.out.println("���� double = " + getSumNumbers(a));
    	 System.out.println("г����� double = " +getDiffNumbers(a));
		 System.out.println("������� double = " +getProdNumbers(a));
		 System.out.println("�������� double = " +getMaxNumbers(a));
		 System.out.println("�������� double = " +getMinNumbers(a));
		 System.out.println("������ double = " +getAverNumbers(a));
     }
     }
     }
