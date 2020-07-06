package frontElement;

import Data.TypeDechet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QuantiteDechet extends JFrame implements ActionListener {
    private JPanel panel;
    private JFrame frame;
    private JTable table;
    private ArrayList<TypeDechet> typeDechets = new ArrayList<>();

    public static void main(String[] args) {
        QuantiteDechet quantiteDechet = new QuantiteDechet();
    }

    public QuantiteDechet() {
        frame = new JFrame();
        frame.setSize(1000,800);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        typeDechets = initTypeDechet();
        String[][] data = {
                {typeDechets.get(0).getNomTypeDechet(), "1500"},
                {typeDechets.get(1).getNomTypeDechet(), "1050"},
                {typeDechets.get(2).getNomTypeDechet(), "1000"},
                {typeDechets.get(3).getNomTypeDechet(), "950"},
                {typeDechets.get(4).getNomTypeDechet(), "1250"},
                {typeDechets.get(5).getNomTypeDechet(), "1470"},
                {typeDechets.get(6).getNomTypeDechet(), "1530"},
                {typeDechets.get(7).getNomTypeDechet(), "2100"},
                {typeDechets.get(8).getNomTypeDechet(), "2300"},
                {typeDechets.get(9).getNomTypeDechet(), "2400"},
                {typeDechets.get(10).getNomTypeDechet(), "2700"},
                {typeDechets.get(11).getNomTypeDechet(), "2800"},
        };
        String[] columnNames = { "Type de déchet", "Quantité collectée"
        };

        table = new JTable(data, columnNames);
        table.setBounds(10, 50, 500, 500);
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        frame.setVisible(true);
    }


    public ArrayList<TypeDechet> initTypeDechet() {
        ArrayList<TypeDechet> typeDechets = new ArrayList<>();

        TypeDechet t1 = new TypeDechet(1,"Papier",0);
        TypeDechet t2 = new TypeDechet(2,"Verre",1);
        TypeDechet t3 = new TypeDechet(3,"Plastique",0);
        TypeDechet t4 = new TypeDechet(4,"Luminaires",1);
        TypeDechet t5 = new TypeDechet(5,"Piles",2);
        TypeDechet t6 = new TypeDechet(6,"Encre",0);
        TypeDechet t7 = new TypeDechet(7,"Métal",0);
        TypeDechet t8 = new TypeDechet(8,"Déchets verts",0);
        TypeDechet t9 = new TypeDechet(9,"Gravats",0);
        TypeDechet t10 = new TypeDechet(10,"Appareils électriques",2);
        TypeDechet t11 = new TypeDechet(11,"Huile et peinture",5);
        TypeDechet t12 = new TypeDechet(12,"Aérosols",5);

        typeDechets.add(t1);
        typeDechets.add(t2);
        typeDechets.add(t3);
        typeDechets.add(t4);
        typeDechets.add(t5);
        typeDechets.add(t6);
        typeDechets.add(t7);
        typeDechets.add(t8);
        typeDechets.add(t9);
        typeDechets.add(t10);
        typeDechets.add(t11);
        typeDechets.add(t12);
        return typeDechets;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
