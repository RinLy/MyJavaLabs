package RGR_1;
import java.util.*;

public class R1 {
		
		//������ ���������
			private static Scanner sc;

		//����
		   public static int getSumNumbers(int[] numbers) {
		    int Summa = 0;

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
		 		   
		   //�������
		   public static int getProdNumbers (int[] numbers){
			    int Prod = 1;

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
		   
				   
		   //̳�������
		   public static int getMinNumbers (int[] numbers){
			    int min = numbers[1];

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
		   
		 
		   
		   // ������� ��� ��������!
		   public static void main(String[] args) 
		      {
			  System.out.println("������ ����� � 5 �����.");
			  System.out.print("a[] = ");
			  
		     sc = new Scanner(System.in);
		     int[] a = new int[5];
		     for (int i = 0; i < 5; i++)
		     a[i] = sc.nextInt();
		  
		   System.out.println("���� = " + getSumNumbers(a));
		   System.out.println("г����� = " +getDiffNumbers(a));
		   System.out.println("������� = " +getProdNumbers(a));
		   System.out.println("�������� = " +getMaxNumbers(a));
		   System.out.println("�������� = " +getMinNumbers(a));
		   System.out.println("������ = " +getAverNumbers(a));
		      }
		}