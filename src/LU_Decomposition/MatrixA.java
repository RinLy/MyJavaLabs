package LU_Decomposition;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
 
public class MatrixA {
 
    
 
    MatrixA(Object[] headers, Object[][] data, String FrameName) {
    	
     
        //������ �������
        JTable jTabPeople;
    	//������� ����� ��������� JFrame
        JFrame jfrm = new JFrame(FrameName);
        //������������� ��������� ����������
        jfrm.getContentPane().setLayout(new FlowLayout());
        //������������� ������ ����
        jfrm.setBounds(450, 500, 300, 170);
        //������������� ���������� ��������� ��� �������� ����
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //������� ����� ������� �� ������ ���������� ������� ������ � ����������
        jTabPeople = new JTable(data, headers);
        //������� ������ ��������� � �������� � �� ������ ���� �������
        JScrollPane jscrlp = new JScrollPane(jTabPeople);
        //������������ ������� �������������� �������
        jTabPeople.setPreferredScrollableViewportSize(new Dimension(250, 100));
        //��������� � ��������� ���� ������ �������� � ������� ������ � ���
        jfrm.getContentPane().add(jscrlp);
        //���������� ���������
        jfrm.setVisible(true);
        
    }
 
    //������� main, ������������� ��� ������ ����������
    public static void main(final String[] args) {
    	
    	//������ ���������� �������� �������
        final Object[] headers = { "1", "2", "3","4" };
     
        //������ ���������� ���������� ��� �������
        final Object[][] data = {
            { LU.A[1][1], LU.A[1][2], LU.A[1][3],LU.A[1][4] },
            { LU.A[2][1], LU.A[2][2], LU.A[2][3],LU.A[2][4] },
            { LU.A[3][1], LU.A[3][2], LU.A[3][3],LU.A[3][4] },
            { LU.A[4][1], LU.A[4][2], LU.A[4][3],LU.A[4][4] },
        };
        
        final String FrameName = "������� �";
        //������� ����� � ������ ��������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MatrixA(headers, data, FrameName);
            }
        });
        
       
    }
}