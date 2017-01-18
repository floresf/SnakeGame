import java.awt.*; 
import java.awt.event.*; 

public class Game extends World {
  Snake s; 
  public Game() {
    this.s = new Snake(); 
  }
  public void teh() { 
    this.s.move(); 
  }
  public void meh() { 
  
  }
  public void keh(KeyEvent e) { 
    System.out.println(e.getKeyCode()); 
    this.s.turn(e.getKeyCode()); 
  }
  public void draw(Graphics g) { 
    this.s.draw(g); 
  }
  public static void main(String[] args) {
    BigBang b = new BigBang(new Game()); 
    b.start(200, 400); 
  }
}