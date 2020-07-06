package frontElement;

import Data.Tournee;

import javax.swing.*;
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
    private JButton tourneeButton;
    private JButton detailTourneButton;
    private JButton detailTypeDechet;
    private JButton nombreTournee;
    private JButton entrepriseDemande;

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
                { myList.get(6).getNoTournee().toString(),myList.get(6).getDateTournee().toString(), myList.get(6).getNoImmatCamion(), myList.get(6).getNoEmploye() },
                { myList.get(7).getNoTournee().toString(),myList.get(7).getDateTournee().toString(), myList.get(7).getNoImmatCamion(), myList.get(7).getNoEmploye() },
                { myList.get(8).getNoTournee().toString(),myList.get(8).getDateTournee().toString(), myList.get(8).getNoImmatCamion(), myList.get(8).getNoEmploye() },
                { myList.get(9).getNoTournee().toString(),myList.get(9).getDateTournee().toString(), myList.get(9).getNoImmatCamion(), myList.get(9).getNoEmploye() },
                { myList.get(10).getNoTournee().toString(),myList.get(10).getDateTournee().toString(), myList.get(10).getNoImmatCamion(), myList.get(10).getNoEmploye() },
        };
        String[] columnNames = { "N� Tourn�e", "Date", "Immat Camion", "Employ�" };


        table = new JTable(data,columnNames);
        table.setBounds(10, 50, 500, 500);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        JLabel informationTournee = new JLabel("Informations sur les tourn�es");
        informationTournee.setBounds(350,15,200,50);
        panel.add(informationTournee);

        empButton = new JButton("Voir les employ�s");
        empButton.setBounds(600,20,150,50);
        panel.add(empButton);
        empButton.addActionListener(this);


        centreButton = new JButton("Voir les centres de traitement");
        centreButton.setBounds(600, 80,250,50);
        panel.add(centreButton);
        centreButton.addActionListener(this);

        tourneeButton = new JButton("Voir une demande � partir d'une date");
        tourneeButton.setBounds(600, 140,250,50);
        panel.add(tourneeButton);
        tourneeButton.addActionListener(this);


        detailTourneButton = new JButton("Voir les d�tails d'une demande");
        detailTourneButton.setBounds(600, 200,250,50);
        panel.add(detailTourneButton);
        detailTourneButton.addActionListener(this);

        detailTypeDechet = new JButton("Voir les quantit�s par type de d�chet");
        detailTypeDechet.setBounds(600, 260,250,50);
        panel.add(detailTypeDechet);
        detailTypeDechet.addActionListener(this);

        nombreTournee = new JButton("Agent ayant r�alis� moins de 5 tourn�es");
        nombreTournee.setBounds(600, 320,300,50);
        panel.add(nombreTournee);
        nombreTournee.addActionListener(this);

        entrepriseDemande = new JButton("Entreprises ayant plus de demandes que Formalys ");
        entrepriseDemande.setBounds(600, 380,300,50);
        panel.add(entrepriseDemande);
        entrepriseDemande.addActionListener(this);

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
        } else if (e.getSource() == nombreTournee) {
            dispose();
            NombreTournee nombreTournee = new NombreTournee();
        }else if (e.getSource() == entrepriseDemande){
            dispose();
            EntrepriseDemande demandeEntreprise =  new EntrepriseDemande();
        }
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

}

