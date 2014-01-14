package LU;
/*���������� ������*/
import java.awt.event.*; /*��� ����������� �������*/
import javax.swing.*; /*��� ����������� ��������*/

public class LU {
	static double [][]A = new double [5][5];
	static double []X = new double [5];
	static double [][]U = new double [5][5];
	static double [][]L = new double [5][5];
	static double []B = new double [5];
	static double []Y = new double [5];
	
	static JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf18, tf19, tf20; /*��������� ��� ��������� ����*/
	static JTextArea textArea1, textArea2, textArea3, textArea4;
	
	public static void clicked() { /*���������, ������������� ��� ������� �� ������*/
		
		
		A[1][1]= Double.parseDouble(tf1.getText());
		A[1][2]= Double.parseDouble(tf2.getText());
		A[1][3]= Double.parseDouble(tf3.getText());
		A[1][4]= Double.parseDouble(tf4.getText());
		
		A[2][1]= Double.parseDouble(tf6.getText());
		A[2][2]= Double.parseDouble(tf7.getText());
		A[2][3]= Double.parseDouble(tf8.getText());
		A[2][4]= Double.parseDouble(tf9.getText());
		
		A[3][1]= Double.parseDouble(tf11.getText());
		A[3][2]= Double.parseDouble(tf12.getText());
		A[3][3]= Double.parseDouble(tf13.getText());
		A[3][4]= Double.parseDouble(tf14.getText());
		
		A[4][1]= Double.parseDouble(tf16.getText());
		A[4][2]= Double.parseDouble(tf17.getText());
		A[4][3]= Double.parseDouble(tf18.getText());
		A[4][4]= Double.parseDouble(tf19.getText());
		
		B[1] = Double.parseDouble(tf5.getText());
		B[2] = Double.parseDouble(tf10.getText());
		B[3] = Double.parseDouble(tf15.getText());
		B[4] = Double.parseDouble(tf20.getText());
		
		L[1][1] = 1;
		L[2][2] = 1;
		L[3][3] = 1;
		L[4][4] = 1;
		
		L[1][2] = 0;
		L[1][3] = 0;
		L[1][4] = 0;
		L[2][3] = 0;
		L[2][4] = 0;
		L[3][4] = 0;
		
		U[2][1] = 0;
		U[3][1] = 0;
		U[3][2] = 0;
		U[4][1] = 0;
		U[4][2] = 0;
		U[4][3] = 0;
		
		
		
		U[1][1] = A[1][1];
		U[1][2] = A[1][2];
		U[1][3] = A[1][3];
		U[1][4] = A[1][4];
		
		L[2][1] = A[2][1]/U[1][1];
		L[3][1] = A[3][1]/U[1][1];
		L[4][1] = A[4][1]/U[1][1];
		
		U[2][2] = A[2][2]-(L[2][1]*U[1][2]);
		U[2][3] = A[2][3]-(L[2][1]*U[1][3]);
		U[2][4] = A[2][4]-(L[2][1]*U[1][4]);
		
		L[3][2] = (A[3][2] - (L[3][1] * U[1][2]))/U[2][2];
		L[4][2] = (A[4][2] - (L[4][1] * U[1][2]))/U[2][2];
		
		U[3][3] = A[3][3] - (L[3][1] * U[1][3]) - (L[3][2] * U[2][3]);
		U[3][4] = A[3][4] - (L[3][1] * U[1][4]) - (L[3][2] * U[2][4]);
		
		L[4][3] = (A[4][3] - (L[4][1] * U[1][3]) - (L[4][2] * U[2][3]))/ U[3][3];
		
		U[4][4] = A[4][4] - (L[4][1] * U[1][4]) - (L[4][2] * U[2][4]) - (L[4][3]) * U[3][4];
	
		//FINISH
		Y[1] = B[1];
		Y[2] = B[2] - (L[2][1] * Y[1]);
		Y[3] = B[3] - (L[3][1] * Y[1]) - (L[3][2] * Y[2]);
		Y[4] = B[4] - (L[4][1] * Y[1]) - (L[4][2] * Y[2]) - (L[4][3] * Y[3]);
		
		X[4] = Y[4]/(U[4][4]);
		X[3] = (Y[3] - (U[3][4] * X[4])) / U[3][3];
		X[2] = (Y[2]/U[2][2]) - (((X[4] * U[2][4]) + X[3] * U[2][3])/U[2][2]);
		X[1] = (U[1][2] * X[2] + U[1][3] * X[3] + U[1][4] * X [4] - Y[1]) / U[1][1] * (-1);
		
		
		MatrixA.main(null);
		MatrixXYB.main(null);
		MatrixL.main(null);
		MatrixU.main(null);
	}
	
	

	/*���� ������ main, ������ ��������� ���������� ������*/
	public static void main(String[] args) {
		/*
		 * 	int x,       // ���������� �� ��� X
  			int y,       // ���������� �� ��� Y
  			int width,   // ������
  			int height); // ������
  			
		 */
		int x = 10;
		int y = 10;
		int w = 50;
		int h = 20;

		/*������� �����*/
		JFrame frame = new JFrame("LU - �����������");
		frame.setLayout(null); /*��������� ����������� ������������ ��������� ������*/
		frame.setBounds(450,200,300,150);
		
		
		
	//������ ���
		
		//����� ����
		tf1 = new JTextField(); /*������ ����*/
		tf1.setBounds(x, y, w, h); /*������������ � �������*/
		frame.getContentPane().add(tf1); /*��������� ������� �� �����*/
		
		//����� ����
		tf2 = new JTextField();
		tf2.setBounds(x+w, y, w, h);
		frame.getContentPane().add(tf2);
		
		//���� �3
		tf3 = new JTextField();
		tf3.setBounds(x+w*2, y, w, h);
		frame.getContentPane().add(tf3);
		
		//���� �4
		tf4 = new JTextField();
		tf4.setBounds(x+w*3, y, w, h);
		frame.getContentPane().add(tf4);
		
		//���� ��в��ު
		textArea1 = new JTextArea("=");
		textArea1.setBounds(x+w*4, y, 5, 20);
        textArea1.setEditable(false);
        frame.add(textArea1);
        
        //���� �5
        tf5 = new JTextField();
		tf5.setBounds(x+5+w*4, y, w, h);
		frame.getContentPane().add(tf5);
        
	//������ �����
		
		//���� �6
		tf6 = new JTextField();
		tf6.setBounds(x, y*3, w, h);
		frame.getContentPane().add(tf6);
		
		//���� �7
		tf7 = new JTextField();
		tf7.setBounds(x+w, y*3, w, h);
		frame.getContentPane().add(tf7);
		
		//���� �8
		tf8 = new JTextField();
		tf8.setBounds(x+w*2, y*3, w, h);
		frame.getContentPane().add(tf8);
        
		//���� �9
		tf9 = new JTextField();
		tf9.setBounds(x+w*3, y*3, w, h);
		frame.getContentPane().add(tf9);
		
		//���� ��в��ު
		textArea2 = new JTextArea("=");
		textArea2.setBounds(x+w*4, y*3, 5, 20);
		textArea2.setEditable(false);
		frame.add(textArea2);
		        
		//���� �10
		tf10 = new JTextField();
		tf10.setBounds(x+5+w*4, y*3, w, h);
		frame.getContentPane().add(tf10);
		
		//����� �����
		
				//���� �11
				tf11 = new JTextField();
				tf11.setBounds(x, y*5, w, h);
				frame.getContentPane().add(tf11);
				
				//���� �12
				tf12 = new JTextField();
				tf12.setBounds(x+w, y*5, w, h);
				frame.getContentPane().add(tf12);
				
				//���� �13
				tf13 = new JTextField();
				tf13.setBounds(x+w*2, y*5, w, h);
				frame.getContentPane().add(tf13);
		        
				//���� �14
				tf14 = new JTextField();
				tf14.setBounds(x+w*3, y*5, w, h);
				frame.getContentPane().add(tf14);
				
				//���� ��в��ު
				textArea3 = new JTextArea("=");
				textArea3.setBounds(x+w*4, y*5, 5, 20);
				textArea3.setEditable(false);
				frame.add(textArea3);
				        
				//���� �115
				tf15 = new JTextField();
				tf15.setBounds(x+5+w*4, y*5, w, h);
				frame.getContentPane().add(tf15);
		
				
			//��������� �����
				
				//���� �16
				tf16 = new JTextField();
				tf16.setBounds(x, y*7, w, h);
				frame.getContentPane().add(tf16);
				
				//���� �17
				tf17 = new JTextField();
				tf17.setBounds(x+w, y*7, w, h);
				frame.getContentPane().add(tf17);
				
				//���� �18
				tf18 = new JTextField();
				tf18.setBounds(x+w*2, y*7, w, h);
				frame.getContentPane().add(tf18);
		        
				//���� �19
				tf19 = new JTextField();
				tf19.setBounds(x+w*3, y*7, w, h);
				frame.getContentPane().add(tf19);
				
				//���� ��в��ު
				textArea4 = new JTextArea("=");
				textArea4.setBounds(x+w*4, y*7, 5, 20);
				textArea4.setEditable(false);
				frame.add(textArea4);
				        
				//���� �20
				tf20 = new JTextField();
				tf20.setBounds(x+5+w*4, y*7, w, h);
				frame.getContentPane().add(tf20);

		
		JButton b1 = new JButton("����������"); /*������� ������*/
		b1.setBounds(50, 95, 150, 24);
		frame.getContentPane().add(b1);
		/*��������� ���������� ������� ��� ������ b1*/
				b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clicked(); /*��������� ���������, ������� ����������� ��� ������ ������ ����������� �������*/
			}
		}
		);
		
		frame.setVisible(true);
	}
	}


