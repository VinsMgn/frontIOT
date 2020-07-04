package frontElement;

import Data.Tournee;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class SecondFrame extends JFrame implements ActionListener {

    private static JTable table;
    private JButton empButton;
    private JButton centreButton;

    private ArrayList<Tournee> myList = new ArrayList<>();
    private JPanel panel;


    public static void main(String[] args) {
        SecondFrame frame= new SecondFrame();

    }

    public SecondFrame() {
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        myList = initTournee();
        String[][] data = {
                { myList.get(0).getNoTournee().toString(),myList.get(0).getDateTournee().toString(), myList.get(0).getNoImmatCamion(), myList.get(0).getNoEmploye().toString() },
                { myList.get(1).getNoTournee().toString(),myList.get(1).getDateTournee().toString(), myList.get(1).getNoImmatCamion(), myList.get(1).getNoEmploye().toString() },
                { myList.get(2).getNoTournee().toString(),myList.get(2).getDateTournee().toString(), myList.get(2).getNoImmatCamion(), myList.get(2).getNoEmploye().toString() },
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
        centreButton.setBounds(600, 80,150,50);
        panel.add(centreButton);
        centreButton.addActionListener(this);



        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == empButton) {
            System.out.println("employé");
        } else {
            System.out.println("Centre de traitement");
        }
//        System.out.println("employé");
    }



    public ArrayList<Tournee> initTournee() {
        ArrayList<Tournee> tournees = new ArrayList<Tournee>();
        Tournee t1 = new Tournee(1, new Date(Calendar.YEAR, Calendar.JUNE,12), "ABC-123-ABC", "Marc");
        Tournee t2 = new Tournee(2, new Date(Calendar.YEAR, Calendar.JUNE,12), "ABC-456-ABC", "Gabriel");
        Tournee t3 = new Tournee(3, new Date(Calendar.YEAR, Calendar.JUNE,12), "ABC-789-ABC", "Mathilde");

        tournees.add(t1);
        tournees.add(t2);
        tournees.add(t3);

        return tournees;
    }

}

