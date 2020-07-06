package frontElement;

import Data.Fonction;
import Data.User;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class EmployeeContent extends JFrame implements ActionListener {

    private JPanel panel;
    private ArrayList<User> myList = new ArrayList<>();
    private JTable table;


    public static void main(String[] args) {
        EmployeeContent frame = new EmployeeContent();
    }

    public EmployeeContent() {
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        myList = initUser();
        String[][] data = {
                { myList.get(0).getLastName(),myList.get(0).getFirstName(), myList.get(0).getHireDate().toString(),
                        myList.get(0).getWage().toString(), myList.get(0).getFonction().getNomFonction() },
                { myList.get(1).getLastName(),myList.get(1).getFirstName(), myList.get(1).getHireDate().toString(),
                        myList.get(1).getWage().toString(), myList.get(1).getFonction().getNomFonction() },
                { myList.get(2).getLastName(),myList.get(2).getFirstName(), myList.get(2).getHireDate().toString(),
                        myList.get(2).getWage().toString(), myList.get(2).getFonction().getNomFonction() },
                { myList.get(3).getLastName(),myList.get(3).getFirstName(), myList.get(3).getHireDate().toString(),
                                        myList.get(3).getWage().toString(), myList.get(3).getFonction().getNomFonction() },
                { myList.get(4).getLastName(),myList.get(4).getFirstName(), myList.get(4).getHireDate().toString(),
                                        myList.get(4).getWage().toString(), myList.get(4).getFonction().getNomFonction() },
                { myList.get(5).getLastName(),myList.get(5).getFirstName(), myList.get(5).getHireDate().toString(),
                                        myList.get(5).getWage().toString(), myList.get(5).getFonction().getNomFonction() },
                { myList.get(6).getLastName(),myList.get(6).getFirstName(), myList.get(6).getHireDate().toString(),
                                        myList.get(6).getWage().toString(), myList.get(6).getFonction().getNomFonction() },
        };

        String[] columnNames = { "Nom", "Prénom", "Date d'embauche", "Salaire", "Fonction" };
        table = new JTable(data,columnNames);
        table.setBounds(10, 50, 500, 500);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        JLabel informationEmployee = new JLabel("Informations sur les employés");
        informationEmployee.setBounds(350,15,200,50);
        panel.add(informationEmployee);



        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public ArrayList<User> initUser() {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Fonction> fonctionsList = initFonction();
        User user1 = new User(1,"Marc", "Dupont","abcd","marc@recycl.com",1200, new Date(120, Calendar.JANUARY, 1), fonctionsList.get(1));
        User user2 = new User(2,"Gabriel", "Martin","1234","gabriel@recycl.com",1050, new Date(115, Calendar.FEBRUARY, 15), fonctionsList.get(2));
        User user3 = new User(3,"Mathilde", "Dupond","abcd","mathilde@recycl.com",1200, new Date(118, Calendar.DECEMBER, 20), fonctionsList.get(0));
        User user4 = new User(4,"Antoine", "Larby","abcd","antoine@recycl.com",1500, new Date(99, Calendar.MARCH, 30), fonctionsList.get(2));
        User user5 = new User(5,"Juliana", "Zevallos","azerty","juliana@recycl.com",2000, new Date(105, Calendar.DECEMBER, 12), fonctionsList.get(3));
        User user6 = new User(6,"Marie-Laure", "Anders","azerty","ml@recycl.com",1900, new Date(101, Calendar.SEPTEMBER, 26), fonctionsList.get(4));
        User user7 = new User(7,"Marcus", "Delhaye","azerty","ml@recycl.com",1550, new Date(10, Calendar.JULY, 31), fonctionsList.get(2));

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        return users;
    }


    public ArrayList<Fonction> initFonction() {
        ArrayList<Fonction> fonctions = new ArrayList<>();

        Fonction rh = new Fonction(1, "DRH");
        Fonction pdg = new Fonction(2, "Directeur");
        Fonction chauffeur = new Fonction(3, "Chauffeur");
        Fonction secretaire = new Fonction(4, "Secrétaire");
        Fonction controleur = new Fonction(5, "Contrôleur");

        fonctions.add(rh);
        fonctions.add(pdg);
        fonctions.add(chauffeur);
        fonctions.add(secretaire);
        fonctions.add(controleur);

        return fonctions;
    }
}
