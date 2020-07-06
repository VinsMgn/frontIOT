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

    public static void main(String[] args) {
        CentreContent frame = new CentreContent();
    }
    
    public CentreContent() {
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        myList = initCentre();

        String[][] data = {
                { myList.get(0).getNomCentre(),myList.get(0).getNoRueCentre().toString(), myList.get(0).getRueCentre(), myList.get(0).getCodePostalCentre().toString(), myList.get(0).getCityCentre() },
                { myList.get(1).getNomCentre(),myList.get(1).getNoRueCentre().toString(), myList.get(1).getRueCentre(), myList.get(1).getCodePostalCentre().toString(), myList.get(1).getCityCentre() },
                { myList.get(2).getNomCentre(),myList.get(2).getNoRueCentre().toString(), myList.get(2).getRueCentre(), myList.get(2).getCodePostalCentre().toString(), myList.get(2).getCityCentre() },
                { myList.get(3).getNomCentre(),myList.get(3).getNoRueCentre().toString(), myList.get(3).getRueCentre(), myList.get(3).getCodePostalCentre().toString(), myList.get(3).getCityCentre() },
        };

        String[] columnNames = { "Nom du centre", "N° de rue", "Rue", "Code Postal", "Ville" };
        table = new JTable(data,columnNames);
        table.setBounds(10, 50, 600, 500);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        JLabel informationEmployee = new JLabel("Informations sur les centres de traitement");
        informationEmployee.setBounds(350,15,350,50);
        panel.add(informationEmployee);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public ArrayList<CentreTraitement> initCentre() {
        ArrayList<CentreTraitement> centres = new ArrayList<>();

        CentreTraitement centre1 = new CentreTraitement(1, "Centre Bourdin", 23, "rue des Accassias", 95800, "Jouy-le-Moutier");
        CentreTraitement centre2 = new CentreTraitement(2, "Prorecycle", 218, "Avenue des ponts", 75019, "Paris");
        CentreTraitement centre3 = new CentreTraitement(3, "Revie", 56, "Allée des Sycomores", 94400, "Vitry-sur-Seine");
        CentreTraitement centre4 = new CentreTraitement(4, "Deuxième Vie", 36, "Rue des grands espoirs", 94490, "Ivry");
        CentreTraitement centre5 = new CentreTraitement(5, "Neo", 78, "Boulevard Jourdan", 95000, "Cergy");

        centres.add(centre1);
        centres.add(centre2);
        centres.add(centre3);
        centres.add(centre4);
        centres.add(centre5);

        return centres;
    }
}
