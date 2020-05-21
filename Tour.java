import java.io.Serializable;

public class Tour extends Piece implements Serializable {
  private String piece;
  private static final long serialVersionUID = 687953565886L;

  public Tour(String couleur, int ligne, int colonne, Echiquier echiquier) {
    super(couleur, ligne, colonne, echiquier);
    /*if(couleur.equals("Blanc")) {
      this.piece = "\u2656"; //Code utf-8 pour la Tour blanche
    }
    else {
      this.piece = "\u265C"; //Code utf-8 pour la Tour noire
    }*/
    piece = "To";
  }

  public boolean verifMouvement(int ligneArriver, int colonneArriver){
    if(!(this.verifCouleurPiece(ligneArriver,colonneArriver))) {
      return false;
    }

    String direction = this.direction(ligneArriver, colonneArriver);
    if(direction == "haut"){
      for(int i = this.ligne - 1; i > ligneArriver; i--){
        if(this.plateau[8*i+colonneArriver] != null) return false;
      }
      return true;
    }
    if(direction == "bas"){
      for(int i = this.ligne + 1; i < ligneArriver; i++){
        if(this.plateau[8*i+colonneArriver] != null) return false;
      }
      return true;
    }
    if(direction == "gauche"){
      for(int i = this.colonne - 1; i > colonneArriver; i--){
        if(this.plateau[8*ligneArriver+i] != null) return false;
      }
      return true;
    }
    if(direction == "droite"){
      for(int i = this.colonne + 1; i < colonneArriver; i++){
        if(this.plateau[8*ligneArriver+i] != null) return false;
      }
      return true;
    }
    return false;
  }


  public String toString() {
    return this.piece;
  }
}
