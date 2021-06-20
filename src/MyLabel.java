import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyLabel extends JFrame implements KeyListener {

    ImageIcon RoadGame;
    ImageIcon CarGame;
    JLabel labelRoad;
    JLabel labelCar;

    MyLabel(){
        RoadGame = new ImageIcon("src/FinalRoad.png");
        CarGame = new ImageIcon("src/Car.png");

        labelRoad = new JLabel(RoadGame);
        labelCar =new JLabel(CarGame);

        this.add(labelRoad);
        this.add(labelCar);

        this.setSize(RoadGame.getIconWidth(),RoadGame.getIconHeight());

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
