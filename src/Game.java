
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Game extends JFrame implements KeyListener {


    ImageIcon RoadGame,CarGame,ObstacleGame;
    JLabel labelRoad ;
    JLabel labelCar ;
    JLabel labelObstacle;
    boolean faound = true;
    int value;

    Game(){
        RoadGame = new ImageIcon("src/FinalRoad.png");
        CarGame = new ImageIcon("src/Car.png");
        ObstacleGame = new ImageIcon("src/obstacle1.png");

        labelRoad = new JLabel(RoadGame);
        labelCar = new JLabel(CarGame);
        labelObstacle = new JLabel(ObstacleGame);

        labelRoad.setSize(RoadGame.getIconWidth(),RoadGame.getIconHeight());

        labelCar.setBounds(Numbers.PostionCarX,Numbers.PostionCarY,Numbers.CarWidth,Numbers.Carhight);
        labelObstacle.setBounds(Numbers.ObstacleX,Numbers.ObstacleY,Numbers.ObstacleWidth,Numbers.Obstaclehight);

        this.setSize(RoadGame.getIconWidth(),RoadGame.getIconHeight());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.addKeyListener(this);
        this.add(labelRoad);
        labelRoad.add(labelCar);
        labelRoad.add(labelObstacle);

        this.setVisible(true);
        GameLoop();
    }
    private void GameLoop(){
        new Thread(()->{
            while(true){
                try{

                    labelObstacle.setLocation(labelObstacle.getX(),labelObstacle.getY()+Numbers.ObstacleMove);
                    if((labelObstacle.getY()== labelCar.getY()&&labelObstacle.getX()==Numbers.ObstacleX&&labelCar.getX()==85)||(labelObstacle.getY()== labelCar.getY()&&labelObstacle.getX()==labelCar.getX())){
                        faound = false;
                        this.setVisible(false);
                    }


                    if(faound == true&&labelObstacle.getY()>Numbers.EndObstacle){
                    Random random = new Random();
                    value = random.nextInt(3);
                    switch (value) {
                        case 0:
                            labelObstacle.setBounds(Numbers.ObstacleX, Numbers.StartObstacle, Numbers.ObstacleWidth,Numbers.Obstaclehight);
                            labelRoad.add(labelObstacle);
                            break;
                        case 1:
                            labelObstacle.setBounds(Numbers.ObstacleX+200, Numbers.StartObstacle, Numbers.ObstacleWidth,Numbers.Obstaclehight);
                            labelRoad.add(labelObstacle);
                            break;
                        case 2:
                            labelObstacle.setBounds(Numbers.ObstacleX+400,Numbers.StartObstacle, Numbers.ObstacleWidth,Numbers.Obstaclehight);
                            labelRoad.add(labelObstacle);
                            break;
                    }
                    }
                    repaint();
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37:
                if(labelCar.getX()>85){
                    labelCar.setLocation(labelCar.getX()-200,labelCar.getY());

                }
                break;
            case 39:
                if(labelCar.getX()<485){
                    labelCar.setLocation(labelCar.getX()+200,labelCar.getY());
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
