import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class przyklad extends JFrame {
    private JPanel panel1;
    private JButton wyjśćieButton;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumaButton;
    private JButton różnicaButton;
    private JRadioButton javaRadioButton;
    private JRadioButton cRadioButton;
    private JCheckBox poniedziałekCheckBox;
    private JCheckBox wtorekCheckBox;
    private JButton wyczyśćButton;
    private JLabel WynikL;
    private JButton wyświetlWybórButton;
    private JLabel labelIcon;

    public static void  main(String[] args)
    {
        przyklad gui = new przyklad();
        gui.setVisible(true);
    }
    private ImageIcon logo1wsiz = new ImageIcon(getClass().getResource("logo1wsiz.png"))
    double a,b,wynik;
    public przyklad()
    {
        super("Moje pierwsze GUI");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        int width=400,height=400;
        this.setSize(width,height);

        wyjśćieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(textField1.getText());
                b= Double.parseDouble(textField2.getText());
                wynik=a+b;
                WynikL.setText("Suma: "+String.valueOf(a)+" + "+String.valueOf(b)+" = "+String.valueOf(wynik));
            }
        });
        różnicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(textField1.getText());
                b= Double.parseDouble(textField2.getText());
                wynik=a-b;
                WynikL.setText("Różnica: "+String.valueOf(a)+" - "+String.valueOf(b)+" = "+String.valueOf(wynik));
            }
        });
        wyświetlWybórButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text="";
                if (javaRadioButton.isSelected()&& poniedziałekCheckBox.isSelected()) text="JAVA - poniedziałek";
                else if (javaRadioButton.isSelected()&& wtorekCheckBox.isSelected()) text="JAVA - wtorek";
                else if (javaRadioButton.isSelected()) text="JAVA";
                else if (cRadioButton.isSelected()&& poniedziałekCheckBox.isSelected()) text="C# - poniedziałek";
                else if (cRadioButton.isSelected()&& wtorekCheckBox.isSelected()) text="C# - wtorek";
                else if (cRadioButton.isSelected()) text="C#";

                        JOptionPane.showMessageDialog(przyklad.this,"Wybrano język: "+text);
            }
        });
        wyczyśćButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                poniedziałekCheckBox.isSelected();
                wtorekCheckBox.isSelected();
            }
        });
        javaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   if (javaRadioButton.isSelected())labelIcon.setIcon(resize(logo1wsiz,10));
            }
        });
    }
}
