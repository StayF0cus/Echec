import java.awt.*;
import javax.swing.*;

public class BoutonJeu extends JButton{
  private int x;
  private int y;

  public BoutonJeu(int x){
    super();
    this.x = x;
  }

  public BoutonJeu(String nom,int x,int y){
    super(nom);
    this.x = x;
    this.y = y;
  }

  //Methodes

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

}
