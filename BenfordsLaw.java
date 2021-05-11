/*
 * Date: May 6th 2021
 * Name: Sasha and Tisha
 * Teacher: Mr.Ho
 * Description: Part 2 of the methods assignment using Benford's Law and a Sales/Results csv file.
*/

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;

public class BenfordsLaw {
    
   
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(30.1, "Frequency", "1");
        dataset.setValue(17.6, "Frequency", "2");
        dataset.setValue(12.5, "Frequency", "3");
        dataset.setValue(9.7, "Frequency", "4");
        dataset.setValue(7.9, "Frequency", "5");
        dataset.setValue(6.7, "Frequency", "6");
        dataset.setValue(5.8, "Frequency", "7");
        dataset.setValue(5.1, "Frequency", "8");
        dataset.setValue(4.6, "Frequency", "9");

        JFreeChart chart = ChartFactory.createBarChart(
            "Benfords Law Distribution Leading Digit",
            "Digits",
            "Frequency",
            dataset,
            PlotOrientation.VERTICAL,
            false, true, false);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        chartPanel.setBackground(Color.white);
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.pack();
        frame.setTitle("Figure 1");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
}




