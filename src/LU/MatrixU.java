package LU;

import javax.swing.SwingUtilities;

 
public class MatrixU extends MatrixA{

	MatrixU(Object[] headers, Object[][] data, String FrameName) {
		super(headers, data, FrameName);
		// TODO Auto-generated constructor stub
	}
	
	//������� main, ������������� ��� ������ ����������
    public static void main(String[] args) {
    	
    	//������ ���������� �������� �������
        final Object[] headers = { "1", "2", "3","4" };
     
        //������ ���������� ���������� ��� �������
        final Object[][] data = {
        		{ LU.U[1][1], LU.U[1][2], LU.U[1][3],LU.U[1][4] },
                { LU.U[2][1], LU.U[2][2], LU.U[2][3],LU.U[2][4] },
                { LU.U[3][1], LU.U[3][2], LU.U[3][3],LU.U[3][4] },
                { LU.U[4][1], LU.U[4][2], LU.U[4][3],LU.U[4][4] },
        };
        
        final String FrameName = "������� U";
        //������� ����� � ������ ��������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MatrixA(headers, data, FrameName);
            }
        });
    }
    
}