import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayformat;
    SimpleDateFormat dateFormat;
    JLabel timelabel, daylabel, datelabel;
    String time, day, date;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Meu relegoio");
        this.setLayout(new FlowLayout());
        this.setSize(300, 500);
        this.setResizable(true);
        this.getContentPane().setBackground(Color.black);

        timeFormat = new SimpleDateFormat("HH:mm:ss");
        timelabel = new JLabel();
        timelabel.setFont(new Font("verdana", Font.PLAIN, 75));
        timelabel.setForeground(new Color(58, 232, 113));
        timelabel.setBackground(Color.black);
        timelabel.setOpaque(true);

        dayformat = new SimpleDateFormat("EE");
        daylabel = new JLabel();
        daylabel.setFont(new Font("verdana", Font.PLAIN, 50));
        daylabel.setForeground(new Color(58, 232, 113));
        daylabel.setBackground(Color.black);
        daylabel.setOpaque(true);

        dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        datelabel = new JLabel();
        datelabel.setFont(new Font("verdana", Font.PLAIN, 40));
        datelabel.setForeground(new Color(58, 232, 113));
        datelabel.setBackground(Color.black);
        datelabel.setOpaque(true);


        this.add(timelabel);
        this.add(daylabel);
        this.add(datelabel);

        this.setVisible(true);

        setTime();
    }
public void setTime() {
        while (true){
            time= timeFormat.format(Calendar.getInstance().getTime());
            timelabel.setText(time);
            day = dayformat.format((Calendar.getInstance().getTime()));
            daylabel.setText(day);
            date = dateFormat.format((Calendar.getInstance().getTime()));
            datelabel.setText(date);
        }
}
}
