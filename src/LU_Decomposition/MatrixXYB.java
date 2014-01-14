package LU_Decomposition;

import javax.swing.SwingUtilities;
 
public class MatrixXYB extends MatrixA{

	MatrixXYB(Object[] headers, Object[][] data, String FrameName) {
		super(headers, data, FrameName);
		// TODO Auto-generated constructor stub
	}
	//������� main, ������������� ��� ������ ����������
    public static void main(String[] args) {
    	
    	//������ ���������� �������� �������
        final Object[] headers = { "X", "Y", "B" };
     
        //������ ���������� ���������� ��� �������
        final Object[][] data = {
        		 	{ LU.X[1], LU.Y[1], LU.B[1] },
        	        { LU.X[2], LU.Y[2], LU.B[2]},
        	        { LU.X[3], LU.Y[3], LU.B[3]},
        	        { LU.X[4], LU.Y[4], LU.B[4]},
        };
        
        final String FrameName = "���: X, Y, B";
        //������� ����� � ������ ��������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MatrixA(headers, data, FrameName);
            }
        });
    }
    
}