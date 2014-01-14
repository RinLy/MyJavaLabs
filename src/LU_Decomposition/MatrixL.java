package LU_Decomposition;

import javax.swing.SwingUtilities;
 
public class MatrixL extends MatrixA{
    MatrixL(Object[] headers, Object[][] data, String FrameName) {
		super(headers, data, FrameName);
	}
 
    //Функция main, запускающаяся при старте приложения
    public static void main(String[] args) {
    	
    	//Массив содержащий заголоки таблицы
        final Object[] headers = { "1", "2", "3","4" };
     
        //Массив содержащий информацию для таблицы
        final Object[][] data = {
        		{ LU.L[1][1], LU.L[1][2], LU.L[1][3],LU.L[1][4] },
                { LU.L[2][1], LU.L[2][2], LU.L[2][3],LU.L[2][4] },
                { LU.L[3][1], LU.L[3][2], LU.L[3][3],LU.L[3][4] },
                { LU.L[4][1], LU.L[4][2], LU.L[4][3],LU.L[4][4] },
        };
        
        final String FrameName = "Матриця L";
        //Создаем фрейм в потоке обработки событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MatrixA(headers, data, FrameName);
            }
        });
    }
}