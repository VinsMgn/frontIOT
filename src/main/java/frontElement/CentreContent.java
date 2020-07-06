package frontElement;

import Data.CentreTraitement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CentreContent extends JFrame implements ActionListener {
    private JPanel panel;
    private ArrayList<CentreTraitement> myList = new ArrayList<>();
    private JTable table;

    private JLabel column1;
    private JLabel column2;
    private JLabel column3;
    private JLabel column4;
    private JLabel column5;

    public static void main(String[] args) {
        CentreContent frame = new CentreContent();
    }
    
    public CentreContent() {
        JFrame frame = new JFrame();
        frame.setSize(700,400);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        myList = initCentre();

        String[][] data = {
                { myList.get(0).getNomCentre(),myList.get(0).getNoRueCentre().toString(), myList.get(0).getRueCentre(), myList.get(0).getCodePostalCentre().toString(), myList.get(0).getCityCentre() },
                { myList.get(1).getNomCentre(),myList.get(1).getNoRueCentre().toString(), myList.get(1).getRueCentre(), myList.get(1).getCodePostalCentre().toString(), myList.get(1).getCityCentre() },
                { myList.get(2).getNomCentre(),myList.get(2).getNoRueCentre().toString(), myList.get(2).getRueCentre(), myList.get(2).getCodePostalCentre().toString(), myList.get(2).getCityCentre() },
                { myList.get(3).getNomCentre(),myList.get(3).getNoRueCentre().toString(), myList.get(3).getRueCentre(), myList.get(3).getCodePostalCentre().toString(), myList.get(3).getCityCentre() },
        };

        String[] columnNames = { "Nom du centre", "N� de rue", "Rue", "Code Postal", "Ville" };
        table = new JTable(data,columnNames);
        table.setBounds(10, 50, 600, 250);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        JLabel informationEmployee = new JLabel("Informations sur les centres de traitement");
        informationEmployee.setBounds(150,290,250,50);
        panel.add(informationEmployee);


        column1 = new JLabel("Nom du centre");
        column1.setBounds(10,10,100,50);
        panel.add(column1);

        column2 = new JLabel("N� de rue");
        column2.setBounds(150,10,100,50);
        panel.add(column2);

        column3 = new JLabel("Rue");
        column3.setBounds(270,10,50,50);
        panel.add(column3);

        column4 = new JLabel("Code postal");
        column4.setBounds(380,10,100,50);
        panel.add(column4);

        column5 = new JLabel("Ville");
        column5.setBounds(500,10,100,50);
        panel.add(column5);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public ArrayList<CentreTraitement> initCentre() {
        ArrayList<CentreTraitement> centres = new ArrayList<>();

        CentreTraitement centre1 = new CentreTraitement(1, "Centre Bourdin", 23, "rue des Accassias", 95800, "Jouy-le-Moutier");
        CentreTraitement centre2 = new CentreTraitement(2, "Prorecycle", 218, "Avenue des ponts", 75019, "Paris");
        CentreTraitement centre3 = new CentreTraitement(3, "Revie", 56, "All�e des Sycomores", 94400, "Vitry-sur-Seine");
        CentreTraitement centre4 = new CentreTraitement(4, "Deuxi�me Vie", 36, "Rue des grands espoirs", 94490, "Ivry");
        CentreTraitement centre5 = new CentreTraitement(5, "Neo", 78, "Boulevard Jourdan", 95000, "Cergy");

        centres.add(centre1);
        centres.add(centre2);
        centres.add(centre3);
        centres.add(centre4);
        centres.add(centre5);

        return centres;
    }
}
