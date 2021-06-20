import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {

    Image RoadImage;
    ImageIcon CarImage;
    int positionX = 500;
    JLabel label;

    MyPanel(){


        RoadImage = new ImageIcon("src/FinalRoad.png").getImage();
       // CarImage = new ImageIcon("src/Car.png");
     //   label = new JLabel(CarImage);
   //     label.setBounds(200,200,145,305);

   //     this.add(label);
        this.setPreferredSize(new Dimension(720,971));

        

    }
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D)g;

    //    g2D.drawImage(RoadImage,0,0,null);
    //    g2D.drawImage(CarImage,positionX,500,null);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}
