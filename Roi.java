import java.io.Serializable;

public class Roi extends Piece implements Serializable {
  private String piece;
  private static final long serialVersionUID = 1548938997L;

  public Roi(String couleur, int ligne, int colonne, Echiquier echiquier) {
    super(couleur,ligne,colonne, echiquier);
    /*if(couleur.equals("Blanc")) {
      this.piece = "\u2654";
    }
    else {
      this.piece = "\u265A";
    }*/
    piece = "Ro";
  }

  public boolean verifMouvement(int ligneArriver, int colonneArriver){
    if((Math.abs(ligneArriver - this.getLigne()) == 1 || Math.abs(ligneArriver - this.getLigne()) == 0) && (Math.abs(colonneArriver - this.getColonne()) == 1 || Math.abs(colonneArriver - this.getColonne()) == 0) && this.verifCouleurPiece(ligneArriver,colonneArriver) == true) return true;
    return false;
  }

  public String toString() {
    return this.piece;
  }
}
