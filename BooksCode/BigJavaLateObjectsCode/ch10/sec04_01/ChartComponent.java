import java.awt.Graphics;
import javax.swing.JComponent;

/*
   A component that draws a bar chart.
*/
public class ChartComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      g.fillRect(0, 10, 200, 10);
      g.fillRect(0, 30, 300, 10);
      g.fillRect(0, 50, 100, 10);
   }
}
