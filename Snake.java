import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.util.*; 

public class Snake extends ArrayList<Circle> {
  String direction = "south"; 
  public Snake() {
    this.add(new Circle(200, 200, 10, true)); 
    this.add(new Circle(200, 180, 10, false)); 
    this.add(new Circle(220, 180, 10, false)); 
    this.add(new Circle(240, 180, 10, false)); 
    this.add(new Circle(240, 200, 10, false)); 
  }
  public void move() { 
    int x = this.get(0).x; 
    int y = this.get(0).y;
    
    int position;
    
    if (this.direction.equals("north")) { 
      y -= 20; 
      
      // remove last circle
      this.remove(this.size() - 1);

      // add new HEAD circle, color it blue
      this.add(0, new Circle(x, y, 10, true));
      
      // color 2nd circle red
      this.get(1).isLead(false);
      
      
    } else if (this.direction.equals("south")) {
      y += 20;
      
      this.remove(this.size() - 1);  
      this.add(0, new Circle(x, y, 10, true));
      
      // color 2nd circle red
      this.get(1).isLead(false);
      
    } else if (this.direction.equals("west")) {
      x -= 20;
      
      this.remove(this.size() - 1);  
      this.add(0, new Circle(x, y, 10, true));
      
      // color 2nd circle red
      this.get(1).isLead(false);
      
    } else if (this.direction.equals("east")) {
      x += 20;
      
      this.remove(this.size() - 1);  
      this.add(0, new Circle(x, y, 10, true));
      
      // color 2nd circle red
      this.get(1).isLead(false);
      
    } else if (this.direction.equals("stopped")) {
     
      // Do nothing. Snake is stopped.
      
    } else {
      
    }
  }
  public void turn(int code) {
    
    // number 5 pressed(Code 53)
    if (code == 37) this.direction = "west"; 
    else if (code == 38) this.direction = "north"; 
    else if (code == 39) this.direction = "east"; 
    else if (code == 40) this.direction = "south";
    else if (code == 53) this.direction = "stopped";
    else { }
  }
  
  public void draw(Graphics g) { 
    for (Circle c : this) 
      c.draw(g);
    System.out.println( this.direction ); 
  } 
}
