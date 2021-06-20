
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){
        label = new JLabel("for move you need to use <- and ->");
        button = new JButton("play");
        button.setFocusable(false);
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);
        this.setSize(Numbers.FirstWidth,Numbers.FirstHight);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            button.setVisible(false);
            label.setVisible(false);
            this.setVisible(false);
            Game game = new Game();
        }
    }
}
