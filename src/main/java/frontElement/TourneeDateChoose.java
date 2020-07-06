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

    private JLabel columnName1;
    private JLabel columnName2;
    private JLabel columnName3;
    private JLabel columnName4;
    private JLabel informationTournee;


    private static JDatePanelImpl datePanel;
    private static JDatePickerImpl datePicker;


    public static void main(String[] args) {
        TourneeDateChoose element = new TourneeDateChoose(datePicker);
    }

    public TourneeDateChoose(JDatePickerImpl datePickerParam) {
        frame = new JFrame();
        frame.setSize(500,400);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
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
        table.setBounds(10, 50, 450, 250);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        informationTournee = new JLabel("Informations sur les tournées");
        informationTournee.setBounds(150,290,200,50);
        panel.add(informationTournee);

        columnName1 = new JLabel("N° de tournée");
        columnName1.setBounds(10,10,100,50);
        panel.add(columnName1);

        columnName2 = new JLabel("Date");
        columnName2.setBounds(130,10,80,50);
        panel.add(columnName2);

        columnName3 = new JLabel("Immatriculation");
        columnName3.setBounds(240,10,120,50);
        panel.add(columnName3);

        columnName4 = new JLabel("Employé");
        columnName4.setBounds(360,10,80,50);
        panel.add(columnName4);

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
