import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;


public class Circle {
  
  int x, y, r; // center coordinates plus radius 
  
  boolean lead = false; // to determine leader color
  
  public Circle(int x, int y, int r, boolean lead) {
    this.x = x; 
    this.y = y;
    this.r = r;
    this.lead = lead;
    
  }
  public void grow() {
    this.r += 1;  
  }
  
  public void isLead(boolean leader) {
    // change the leader property (the color) of this circle
    this.lead = leader;
    
  }

    
  public void draw(Graphics g) {
    // Draw a different colored circle, depending on lead boolean value
    if (this.lead) {
      
      g.setColor(Color.BLUE);
      g.fillOval(this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r);  
      
    } else {
      
      g.setColor(Color.RED);
      g.fillOval(this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r); 
      
    }
    //g.drawOval(this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r);  
  }
}