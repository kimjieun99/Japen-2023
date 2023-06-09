import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

  Image bg = new ImageIcon("images/space.jpg").getImage();
  Image coin = new ImageIcon("images/dollar.png").getImage();
  Image mario = new ImageIcon("images/super-mario.png").getImage();
  Image SpeedUp = new ImageIcon("images/energy-drink.png").getImage();
  Image SpeedDown = new ImageIcon("images/devil.png").getImage();

  public boolean isLeft, isRight, isUp, isDown;
  public int marioX = 500;
  public int marioY = 500;
  public int coinX = 300;
  public int coinY = 300;

  public int coinTx = 300;
  public int coinTy = 300;

  public int speedX = 10;
  public int speedY = 10;

  // item
  public double t = 0;
  public int loadX = (int) (Math.random() * 800 + 100);
  public int radius = (int) (Math.random() * 50 + 50);

  public int speedUpX = 10;
  public int speedUpY = 10;

  public int speedDownX = 10;
  public int speedDownY = 10;

  public boolean isItem = true;
  // item end

  public Thread th;
  public Thread th02;
  public RandomThread randomThread = new RandomThread();
  public int score = 0;

  //

  public GamePanel() {
    // System.out.println("game panel");
    th = new Thread(this);
    th.start();

    th02 = new Thread(randomThread);
    th02.start();

    this.setPreferredSize(new Dimension(1280, 720));
    this.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {}

          @Override
          public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              isLeft = true;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              isRight = true;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
              isUp = true;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              isDown = true;
            }
          }

          @Override
          public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              isLeft = false;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              isRight = false;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
              isUp = false;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              isDown = false;
            }
          }
        }
      );
    this.setFocusable(true);
    this.requestFocus();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // 그림 그리는 곳
    g.drawImage(bg, 0, 0, null);
    g.drawImage(coin, coinX, coinY, null);
    g.drawImage(mario, marioX, marioY, null);
    g.drawImage(SpeedUp, speedUpX, speedUpY, null);
    g.drawImage(SpeedDown, speedDownX, speedDownY, null);
    g.setColor(Color.WHITE);
    g.setFont(new Font("맑은 고딕", Font.BOLD, 24));
    g.drawString("SCORE : " + score, 50, 50);
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(20);
      } catch (Exception e) {
        e.printStackTrace();
      }
      repaint();
      marioMove();
      checkCoin();
      itemCheck01();
      itemCheck02();
      speedUpMove();
      speedDownMove();
    }
  }

  private void marioMove() {
    if (isLeft) {
      marioX -= speedX;
    }
    if (isRight) {
      marioX += speedX;
    }
    if (isUp) {
      marioY -= speedY;
    }
    if (isDown) {
      marioY += speedY;
    }
    if (marioX < -32) {
      marioX = 1280;
    }
    if (marioX > 1280 + 32) {
      marioX = -32;
    }
    if (marioY < -32) {
      marioY = 720;
    }
    if (marioY > 720 + 32) {
      marioY = -32;
    }
  }

  public void speedUpMove() {
    if (isItem) {
      t += 0.05;
      speedUpX = loadX + (int) (Math.sin(t) * radius);
      speedUpY += 5;

      if (speedUpY > 800) {
        speedUpY = -100;
        isItem = false;
      }
    }
    if (Math.random() < 0.005 && !isItem) {
      isItem = true;
      loadX = (int) (Math.random() * 800 + 100);
      radius = (int) (Math.random() * 50 + 50);
    }
  }

  public void speedDownMove() {
    if (isItem) {
      t += 0.05;
      speedDownX = loadX + (int) (Math.sin(t) * radius);
      speedDownY += 10;

      if (speedDownY > 800) {
        speedDownY = -100;
        isItem = false;
      }
    }
    if (Math.random() < 0.005 && !isItem) {
      isItem = false;
      loadX = (int) (Math.random() * 800 + 100);
      radius = (int) (Math.random() * 50 + 50);
    }
  }

  public void checkCoin() {
    double distX = coinX - marioX;
    double distY = coinY - marioY;
    double dist = Math.sqrt(distX * distX + distY * distY);

    coinX += (coinTx - coinX) * 0.15;
    coinY += (coinTy - coinY) * 0.15;

    if (dist < 32) {
      coinTx = (int) (Math.random() * 1280);
      coinTy = (int) (Math.random() * 720);
      score++;
    }
  }

  public void itemCheck01() {
    double distX = speedUpX - marioX;
    double distY = speedUpY - marioY;
    double dist = Math.sqrt(distX * distX + distY * distY);

    if (dist <= 32) {
      speedX += 5;
      speedY += 5;
      speedUpY = -100;
      isItem = false;
    }
  }

  public void itemCheck02() {
    double distX = speedDownX - marioX;
    double distY = speedDownY - marioY;
    double dist = Math.sqrt(distX * distX + distY * distY);

    if (dist <= 32) {
      speedX -= 5;
      speedY -= 5;
      speedDownY = -150;
      isItem = false;
    }
  }

  class RandomThread implements Runnable {

    @Override
    public void run() {
      while (true) {
        coinTx = (int) (Math.random() * 1280);
        coinTy = (int) (Math.random() * 720);
        try {
          Thread.sleep(3000);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
}
// 확률을 정해서 arrow를 등장시키고 만약 그거랑 충돌하면 스피드가 올라가게
// coin game
