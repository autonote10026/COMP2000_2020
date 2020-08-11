import static java.awt.Color.WHITE;

import java.awt.*;
public class Cell {
int x;
int y;
static int size = 35;

public Cell(int x, int y){
    this.x = x;
    this.y = y;
}

void paint(Graphics g, Point mousePos){
    if(contains(mousePos)){
        g.setColor(Color.GRAY);
    }else{
g.setColor(WHITE);
    }
    g.setColor(Color.WHITE);
    g.fillRect(x,y,size,size);
    g.setColor(Color.BLACK);
    g.drawRect(x,y,size,size);
}

boolean contains(Point p){
    if (p!=null){
    return (x<p.x&&x+35>p.x&&y<p.y&&y+size>p.y);
}else{
    return false;
}
}
}