package RGR_2;

public class Main {
	//яЕпефю лнкндеж
	//ме люяяхб ю я йюфдшл вкемнл нрдекэмн, ясллхпсел б лехм!
	
	//он сякнбхч днкфмн ашрэ public static double аег []!
	public static double[] getSumSinuses(double[] angles, int type){
		double [] LAngles = new double [2];	//LAngles = LocalAngles	
		
		for (int i=0; i < angles.length;i++){
			if (type == 0){
			LAngles[i] = Math.cos(Math.toDegrees(angles[i]));
		}	
			else {
					if (type == 1){
						LAngles[i] = Math.sin(Math.toDegrees(angles[i]));
					}
			}
		}
		return LAngles;
		
	}
	
	

	public static void main(String[] args) {
		double[]angles = new double[2];
		angles [0] = 50;
		angles [1] = 35;
  		
		getSumSinuses(angles, 0);
		System.out.println (angles[1]);
	}
}
