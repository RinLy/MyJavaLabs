package RGR_1;
import java.util.Scanner;
public class R6 {
	private static Scanner sc;

   // ������� ��� ��������!
   public static void main(String[] args)
      {
	   
	 sc = new Scanner(System.in);     
     double[] a = new double[6];
     int[] m = new int[6];
     int s=0;
     
     for (int i = 0; i < 1; i++){
    	 int w;
    	 System.out.println("������� ������ ���������� ������: RANDOM(1), CMD(0)"); 
    	 w = sc.nextInt();
    	 
    	 if (w == 1){
    		 for (i=1;i<6;i++){
    		 a[i]= metods.getRandom(null);
    		 }
    	 }
    	 else if (w == 0){
    		//�������� ��� � ����� �������
    	     obrobka.test(args, a); 
    	 }
    	 else{
    		 metods.getError(); 
    	 }
     }
     	
               
     //���������� �� � �������
     for (int i = 0; i < 6; i++){
		 int x = (int) a[i];
	     double y = a[i] - x; 
    	if (y!=0){
    		s++;//���� � ���� � ����, �� ����� ����������;
    	} }
     if(s==0){//���� ������� �������, �� �� ����� ��� � ����� ���������� � ���
    	 for (int i = 1; i < 6; i++){
    		 m[i]=(int) a[i];     		 
    	 }
    	      
    	 System.out.println("���� int = " + metods.getSumNumbers(m));
    	 System.out.println("г����� int = " + metods.getDiffNumbers(m));
		 System.out.println("������� int = " + metods.getProdNumbers(m));
		 System.out.println("Max int = " + metods.getMaxNumbers(m));
		 System.out.println("Min int = " + metods.getMinNumbers(m));
		 System.out.println("������ int = " + metods.getAverNumbers(m));
		//�������� ������
			System.out.print("[");
			for (int i = 1; i < 6; i++){
			System.out.print (m[i]+" ");
			}
			System.out.println("]"); 
     } 
     else{//���� �, �� �������� ��� � ����
    	
      
    	 System.out.println("���� double = " + metods.getSumNumbers(a));
    	 System.out.println("г����� double = " + metods.getDiffNumbers(a));
		 System.out.println("������� double = " + metods.getProdNumbers(a));
		 System.out.println("Max double = " + metods.getMaxNumbers(a));
		 System.out.println("Min double = " + metods.getMinNumbers(a));
		 System.out.println("������ double = " + metods.getAverNumbers(a));
		//�������� ������
	      	System.out.print("[");
	      	for (int i = 1; i < 6; i++){
	     	 System.out.print (a[i]+"; ");
	      	}
	      	System.out.println("]");
     }
     	
     }
     }
