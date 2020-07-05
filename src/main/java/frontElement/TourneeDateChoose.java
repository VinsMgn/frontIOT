package frontElement;

import Data.Tournee;
import Utils.DateLabelFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class TourneeDateChoose extends JFrame {
    private static JFrame frame;
    private JPanel panel;
    private JTable table;
    private ArrayList<Tournee> myList = new ArrayList<>();

    private static JDatePanelImpl datePanel;
    private static JDatePickerImpl datePicker;


    public static void main(String[] args) {
        TourneeDateChoose element = new TourneeDateChoose(datePicker);
    }

    public TourneeDateChoose(JDatePickerImpl datePickerParam) {
        frame = new JFrame();
        frame.setSize(650,650);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        datePicker = datePickerParam;


        myList = initTournee();

        String[][] data = {
                { myList.get(0).getNoTournee().toString(),myList.get(0).getDateTournee().toString(), myList.get(0).getNoImmatCamion(), myList.get(0).getNoEmploye() },
                { myList.get(1).getNoTournee().toString(),myList.get(1).getDateTournee().toString(), myList.get(1).getNoImmatCamion(), myList.get(1).getNoEmploye() },
                { myList.get(2).getNoTournee().toString(),myList.get(2).getDateTournee().toString(), myList.get(2).getNoImmatCamion(), myList.get(2).getNoEmploye() },
        };
        String[] columnNames = { "N° Tournée", "Date", "Immat Camion", "Employee" };

        table = new JTable(data,columnNames);
        table.setBounds(10, 50, 500, 500);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public ArrayList<Tournee> initTournee() {
        ArrayList<Tournee> tournees = new ArrayList<Tournee>();
        Tournee t1 = new Tournee(1, new Date(Calendar.YEAR, Calendar.JUNE,15), "532DFC95", "Antoine");
        Tournee t5 = new Tournee(5, new Date(Calendar.YEAR, Calendar.JUNE,16), "124FAK95", "Gabriel");
        Tournee t6 = new Tournee(6, new Date(Calendar.YEAR, Calendar.JUNE,20), "124FAK95", "Marcus");


        tournees.add(t1);
        tournees.add(t5);
        tournees.add(t6);

        return tournees;
    }
}
