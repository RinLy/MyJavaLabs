package RGR_1;
public class obrobka{
	public static void test (String[] matr, double[]a){
	 
	 {
		try{
	
   	//Ïğèñâîºííÿ çíà÷åíü ç matr
			a[1] = Double.parseDouble(matr[0]);
	        a[2] = Double.parseDouble(matr[1]);
	        a[3] = Double.parseDouble(matr[2]);
	        a[4] = Double.parseDouble(matr[3]);
	        a[5] = Double.parseDouble(matr[4]);
        
   	 }
   	 catch(NumberFormatException e){
   		 System.out.println("ÁÓËÀ ÂÈßÂËÅÍÀ ÏÎÌÈËÊÀ!:");
   		e.printStackTrace();
   		
   	 }
	 }
}
}