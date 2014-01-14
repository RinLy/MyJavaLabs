package LU_Decomposition;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
 
public class MatrixA {
 
    
 
    MatrixA(Object[] headers, Object[][] data, String FrameName) {
    	
     
        //Объект таблицы
        JTable jTabPeople;
    	//Создаем новый контейнер JFrame
        JFrame jfrm = new JFrame(FrameName);
        //Устанавливаем диспетчер компоновки
        jfrm.getContentPane().setLayout(new FlowLayout());
        //Устанавливаем размер окна
        jfrm.setBounds(450, 500, 300, 170);
        //Устанавливаем завершение программы при закрытии окна
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Создаем новую таблицу на основе двумерного массива данных и заголовков
        jTabPeople = new JTable(data, headers);
        //Создаем панель прокрутки и включаем в ее состав нашу таблицу
        JScrollPane jscrlp = new JScrollPane(jTabPeople);
        //Устаналиваем размеры прокручиваемой области
        jTabPeople.setPreferredScrollableViewportSize(new Dimension(250, 100));
        //Добавляем в контейнер нашу панель прокрути и таблицу вместе с ней
        jfrm.getContentPane().add(jscrlp);
        //Отображаем контейнер
        jfrm.setVisible(true);
        
    }
 
    //Функция main, запускающаяся при старте приложения
    public static void main(final String[] args) {
    	
    	//Массив содержащий заголоки таблицы
        final Object[] headers = { "1", "2", "3","4" };
     
        //Массив содержащий информацию для таблицы
        final Object[][] data = {
            { LU.A[1][1], LU.A[1][2], LU.A[1][3],LU.A[1][4] },
            { LU.A[2][1], LU.A[2][2], LU.A[2][3],LU.A[2][4] },
            { LU.A[3][1], LU.A[3][2], LU.A[3][3],LU.A[3][4] },
            { LU.A[4][1], LU.A[4][2], LU.A[4][3],LU.A[4][4] },
        };
        
        final String FrameName = "Матриця А";
        //Создаем фрейм в потоке обработки событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MatrixA(headers, data, FrameName);
            }
        });
        
       
    }
}