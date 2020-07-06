package frontElement;

import Data.Tournee;
import Data.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class NombreTournee extends JFrame implements ActionListener {
    private JPanel panel;
    private JTable table;
    private ArrayList<Tournee> myList = new ArrayList<>();
    private JLabel columnName1;
    private JLabel columnName2;
    private JLabel columnName3;
    private JLabel columnName4;


    public static void main(String[] args) {
        NombreTournee nombreTournee = new NombreTournee();
    }

    public NombreTournee() {
        JFrame frame = new JFrame();
        frame.setSize(550,450);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);


        myList = initTournee();
        String[][] data = {
                { myList.get(6).getNoTournee().toString(),myList.get(6).getDateTournee().toString(), myList.get(6).getNoImmatCamion(), myList.get(6).getNoEmploye() },
                { myList.get(7).getNoTournee().toString(),myList.get(7).getDateTournee().toString(), myList.get(7).getNoImmatCamion(), myList.get(7).getNoEmploye() },
                { myList.get(0).getNoTournee().toString(),myList.get(0).getDateTournee().toString(), myList.get(0).getNoImmatCamion(), myList.get(0).getNoEmploye() },
                { myList.get(2).getNoTournee().toString(),myList.get(2).getDateTournee().toString(), myList.get(2).getNoImmatCamion(), myList.get(2).getNoEmploye() },
                { myList.get(3).getNoTournee().toString(),myList.get(3).getDateTournee().toString(), myList.get(3).getNoImmatCamion(), myList.get(3).getNoEmploye() },
                { myList.get(5).getNoTournee().toString(),myList.get(5).getDateTournee().toString(), myList.get(5).getNoImmatCamion(), myList.get(5).getNoEmploye() },

        };
        String[] columnNames = { "N° Tournée", "Date", "Immat Camion", "Employee" };


        table = new JTable(data,columnNames);
        table.setBounds(10, 80, 500, 250);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        columnName1 = new JLabel("N° Tournée");
        columnName1.setBounds(10,40,80,50);
        panel.add(columnName1);

        columnName2 = new JLabel("Date");
        columnName2.setBounds(140,40,80,50);
        panel.add(columnName2);

        columnName3 = new JLabel("Immatriculation");
        columnName3.setBounds(270,40,120,50);
        panel.add(columnName3);

        columnName4 = new JLabel("Nom de l'employé");
        columnName4.setBounds(400,40,130,50);
        panel.add(columnName4);

        JLabel informationTournee = new JLabel("Informations sur les tournées");
        informationTournee.setBounds(150,340,200,50);
        panel.add(informationTournee);

        frame.setVisible(true);

    }

    public ArrayList<Tournee> initTournee() {
        ArrayList<Tournee> tournees = new ArrayList<Tournee>();
        Tournee t1 = new Tournee(1, new Date(Calendar.YEAR, Calendar.JUNE,15), "532DFC95", "Antoine");
        Tournee t3 = new Tournee(3, new Date(Calendar.YEAR, Calendar.JUNE,12), "532DFC95", "Antoine");
        Tournee t7 = new Tournee(7, new Date(Calendar.YEAR, Calendar.APRIL,12), "532DFC95", "Antoine");
        Tournee t8 = new Tournee(8, new Date(Calendar.YEAR, Calendar.FEBRUARY,12), "532DFC95", "Antoine");

        Tournee t2 = new Tournee(2, new Date(Calendar.YEAR, Calendar.JUNE,13), "763OPE95", "Gabriel");
        Tournee t5 = new Tournee(5, new Date(Calendar.YEAR, Calendar.JUNE,16), "532DFC95", "Gabriel");
        Tournee t9 = new Tournee(9, new Date(119, Calendar.DECEMBER,16), "763OPE95", "Gabriel");
        Tournee t10 = new Tournee(10, new Date(Calendar.YEAR, Calendar.JUNE,10), "532DFC95", "Gabriel");
        Tournee t11 = new Tournee(11, new Date(Calendar.YEAR, Calendar.JUNE,7), "763OPE95", "Gabriel");

        Tournee t4 = new Tournee(4, new Date(Calendar.YEAR, Calendar.MAY,12), "124FAK95", "Marcus");
        Tournee t6 = new Tournee(6, new Date(Calendar.YEAR, Calendar.JUNE,20), "124FAK95", "Marcus");


        tournees.add(t1);
        tournees.add(t2);
        tournees.add(t3);
        tournees.add(t4);
        tournees.add(t5);
        tournees.add(t6);
        tournees.add(t7);
        tournees.add(t8);
        tournees.add(t9);
        tournees.add(t10);
        tournees.add(t11);

        return tournees;
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
