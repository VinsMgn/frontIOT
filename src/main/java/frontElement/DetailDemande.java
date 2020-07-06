package frontElement;

import Data.Entreprise;
import Data.Tournee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailDemande extends JFrame implements ActionListener {
    private static JFrame frame;
    private JPanel panel;
    private Entreprise entreprise;
    private JTable table;
    private String noTournee;

    private JLabel columnName1;
    private JLabel columnName2;
    private JLabel columnName3;

    public static void main(String[] args) {

    }


    public DetailDemande(String noTourneeParam) {
        this.noTournee = noTourneeParam;
        frame = new JFrame();
        frame.setSize(550,400);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        entreprise = initEntreprise();
        String[][] data = {
                {entreprise.getRaisonSociale(), this.noTournee, "120"}
        };
        String[] columnNames = { "Raison sociale", "N° Tournée", "Quantité de type de déchet" };

        table = new JTable(data,columnNames);
        table.setBounds(10, 50, 450, 250);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        columnName1 = new JLabel("Raison sociale");
        columnName1.setBounds(10,10,100,50);
        panel.add(columnName1);

        columnName2 = new JLabel("N° tournée");
        columnName2.setBounds(180,10,100,50);
        panel.add(columnName2);

        columnName3 = new JLabel("Quantité de type de déchet");
        columnName3.setBounds(310,10,200,50);
        panel.add(columnName3);

        JLabel informationTournee = new JLabel("Informations sur la demande n°3");
        informationTournee.setBounds(150,280,200,50);
        panel.add(informationTournee);


        frame.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public Entreprise initEntreprise() {
        Entreprise entreprise = new Entreprise(1234567890, "Energym", 10, "Boulevard de Pontoise",95000,"Pontoise",0134205236, "Mme servant");
        return entreprise;
    }
}
