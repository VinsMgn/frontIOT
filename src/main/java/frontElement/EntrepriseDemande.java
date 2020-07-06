package frontElement;

import Data.CentreTraitement;
import Data.Entreprise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class EntrepriseDemande extends JFrame implements ActionListener {
    private JPanel panel;
    private ArrayList<Entreprise> myList = new ArrayList<>();
    private JTable table;

    public EntrepriseDemande(){
        JFrame frame = new JFrame();
        frame.setSize(850,400);
        frame.setTitle("Demandes > Formalys");
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);


        myList = initEntreprises();

        String[][] data = {
                { myList.get(3).getSiret().toString(), myList.get(3).getRaisonSociale(),myList.get(3).getCity(), myList.get(3).getCodePostal().toString(), myList.get(3).getContact(), "15" },
                { myList.get(4).getSiret().toString(), myList.get(4).getRaisonSociale(),myList.get(4).getCity(), myList.get(4).getCodePostal().toString(), myList.get(4).getContact(), "12" },
                { myList.get(0).getSiret().toString(), myList.get(0).getRaisonSociale(),myList.get(0).getCity(), myList.get(0).getCodePostal().toString(), myList.get(0).getContact(),"6" },
                { myList.get(1).getSiret().toString(), myList.get(1).getRaisonSociale(),myList.get(1).getCity(), myList.get(1).getCodePostal().toString(), myList.get(1).getContact(), "9" },
                { myList.get(2).getSiret().toString(), myList.get(2).getRaisonSociale(),myList.get(2).getCity(), myList.get(2).getCodePostal().toString(), myList.get(2).getContact(), "7" },
        };

        String[] columnNames = { "Siret", "Raison sociale", "Ville", "Code Postal", "Contact", "Nombre de demandes" };
        table = new JTable(data,columnNames);
        table.setBounds(10, 40, 700, 250);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        JLabel siretLabel = new JLabel("Siret");
        siretLabel.setBounds(10, 10, 100, 25);
        panel.add(siretLabel);

        JLabel raisonLabel = new JLabel("Raison sociale");
        raisonLabel.setBounds(130, 10, 150, 25);
        panel.add(raisonLabel);

        JLabel villeLabel = new JLabel("Ville");
        villeLabel.setBounds(250, 10, 100, 25);
        panel.add(villeLabel);

        JLabel cpLabel = new JLabel("Code Postal");
        cpLabel.setBounds(360,10 , 100, 25);
        panel.add(cpLabel);

        JLabel contactLabel = new JLabel("Contact");
        contactLabel.setBounds(480, 10, 100, 25);
        panel.add(contactLabel);

        JLabel demandeNbLabel = new JLabel("Demandes");
        demandeNbLabel.setBounds(595, 10, 150, 25);
        panel.add(demandeNbLabel);

        JLabel informationTournee = new JLabel("Informations sur les nombre de demande par entreprise");
        informationTournee.setBounds(150,280,400,50);
        panel.add(informationTournee);

        frame.setVisible(true);


    }

    public static void main(String[] args) {
        EntrepriseDemande frame = new EntrepriseDemande();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public ArrayList<Entreprise> initEntreprises() {
        ArrayList<Entreprise> entreprises = new ArrayList<>();
        Entreprise en1 = new Entreprise(1234567890, "Energym", 10, "Boulevard de Pontoise", 95000, "Pontoise",334205236,"Mme servant");
        Entreprise en2 = new Entreprise(234567890, "La clef des champs", 18, "Rue des Nouvelles", 95490, "Vaureal",335151256,"M Fourdan");
        Entreprise en4 = new Entreprise(483343679, "Cartoooche", 84, "avenue de la République", 75011, "Paris",334205236,"M Dun");
        Entreprise en5 = new Entreprise(1234567890, "Propack", 140, "rue du faubourg Saint Honoré", 75008, "Paris",336548790,"M Corall");
        Entreprise en3 = new Entreprise(1456789010, "Formalys", 145, "rue des Allouettes", 78000, "Saint Germain",333657932,"M Cresdon");

        entreprises.add(en1);
        entreprises.add(en2);
        entreprises.add(en4);
        entreprises.add(en3);
        entreprises.add(en5);

        return entreprises;
    }
}
