package frontElement;

import Utils.DateLabelFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class CalendarCustom extends JFrame implements ActionListener {

    private static JFrame frame;
    private JPanel panel;
    private JButton selectDate;
    private static JDatePanelImpl datePanel;
    private static JDatePickerImpl datePicker;

    public static void main(String[] args) {
        CalendarCustom customCalendar = new CalendarCustom();
    }
    public CalendarCustom() {
        frame = new JFrame();
        frame.setSize(350,200);
        frame.setTitle("Monitoring Application");
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        selectDate = new JButton("Choisir cette date");
        selectDate.setBounds(10,25,200,20);
        selectDate.addActionListener(this);
        frame.add(selectDate);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        frame.add(datePicker);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TourneeDateChoose element = new TourneeDateChoose(datePicker);
//        System.out.println(datePicker.getModel().getValue());
    }
}
