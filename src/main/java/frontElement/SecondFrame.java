package frontElement;

import Data.Tournee;
import Utils.DateLabelFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class SecondFrame extends JFrame implements ActionListener {

    private static JTable table;
    private JButton empButton;
    private JButton centreButton;
    private JButton tourneeButton;
    private JButton detailTourneButton;
    private JButton detailTypeDechet;


    private ArrayList<Tournee> myList = new ArrayList<>();
    private JPanel panel;


    public static void main(String[] args) {
        SecondFrame frame= new SecondFrame();

    }

    public SecondFrame() {
        JFrame frame = new JFrame();
        frame.setSize(1000,800);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        myList = initTournee();
        String[][] data = {
                { myList.get(0).getNoTournee().toString(),myList.get(0).getDateTournee().toString(), myList.get(0).getNoImmatCamion(), myList.get(0).getNoEmploye() },
                { myList.get(1).getNoTournee().toString(),myList.get(1).getDateTournee().toString(), myList.get(1).getNoImmatCamion(), myList.get(1).getNoEmploye() },
                { myList.get(2).getNoTournee().toString(),myList.get(2).getDateTournee().toString(), myList.get(2).getNoImmatCamion(), myList.get(2).getNoEmploye() },
                { myList.get(3).getNoTournee().toString(),myList.get(3).getDateTournee().toString(), myList.get(3).getNoImmatCamion(), myList.get(3).getNoEmploye() },
                { myList.get(4).getNoTournee().toString(),myList.get(4).getDateTournee().toString(), myList.get(4).getNoImmatCamion(), myList.get(4).getNoEmploye() },
                { myList.get(5).getNoTournee().toString(),myList.get(5).getDateTournee().toString(), myList.get(5).getNoImmatCamion(), myList.get(5).getNoEmploye() },
        };
        String[] columnNames = { "N° Tournée", "Date", "Immat Camion", "Employee" };


        table = new JTable(data,columnNames);
        table.setBounds(10, 50, 500, 500);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        JLabel informationTournee = new JLabel("Informations sur les tournées");
        informationTournee.setBounds(350,15,200,50);
        panel.add(informationTournee);

        empButton = new JButton("Voir les employés");
        empButton.setBounds(600,20,150,50);
        panel.add(empButton);
        empButton.addActionListener(this);


        centreButton = new JButton("Voir les centres de traitement");
        centreButton.setBounds(600, 80,250,50);
        panel.add(centreButton);
        centreButton.addActionListener(this);

        tourneeButton = new JButton("Voir une demande à partir d'une date");
        tourneeButton.setBounds(600, 140,250,50);
        panel.add(tourneeButton);
        tourneeButton.addActionListener(this);


        detailTourneButton = new JButton("Voir les détails d'une demande");
        detailTourneButton.setBounds(600, 200,250,50);
        panel.add(detailTourneButton);
        detailTourneButton.addActionListener(this);

        detailTypeDechet = new JButton("Voir les quantités par type de déchet");
        detailTypeDechet.setBounds(600, 260,250,50);
        panel.add(detailTypeDechet);
        detailTypeDechet.addActionListener(this);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == empButton) {
            dispose();
            EmployeeContent newFrame = new EmployeeContent();
        } else if(e.getSource() == centreButton) {
            dispose();
            CentreContent centreFrame = new CentreContent();
        } else if (e.getSource() == tourneeButton) {
            dispose();
            CalendarCustom calendarCustom = new CalendarCustom();
        } else if (e.getSource() == detailTourneButton) {
            dispose();
            DetailDemande detailDemande = new DetailDemande((String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
        } else if (e.getSource() == detailTypeDechet) {
            dispose();
            QuantiteDechet quantiteDechet = new QuantiteDechet();
        }
    }



    public ArrayList<Tournee> initTournee() {
        ArrayList<Tournee> tournees = new ArrayList<Tournee>();
        Tournee t1 = new Tournee(1, new Date(Calendar.YEAR, Calendar.JUNE,15), "532DFC95", "Antoine");
        Tournee t2 = new Tournee(2, new Date(Calendar.YEAR, Calendar.JUNE,13), "763OPE95", "Gabriel");
        Tournee t3 = new Tournee(3, new Date(Calendar.YEAR, Calendar.JUNE,12), "532DFC95", "Antoine");
        Tournee t4 = new Tournee(4, new Date(Calendar.YEAR, Calendar.MAY,12), "124FAK95", "Marcus");
        Tournee t5 = new Tournee(5, new Date(Calendar.YEAR, Calendar.JUNE,16), "532DFC95", "Gabriel");
        Tournee t6 = new Tournee(6, new Date(Calendar.YEAR, Calendar.JUNE,20), "124FAK95", "Marcus");


        tournees.add(t1);
        tournees.add(t2);
        tournees.add(t3);
        tournees.add(t4);
        tournees.add(t5);
        tournees.add(t6);

        return tournees;
    }

}

