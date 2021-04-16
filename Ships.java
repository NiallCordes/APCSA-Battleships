public class Ships {
    // initialize important values to store in ships
    int length;
    Node symbol;
    int row;
    int col;
    boolean orientation;
  
    // store coordinates of a ship in the object
    public void setCoordinates(int newRow, int newCol, boolean newOrientation) {
        this.row = newRow;
        this.col = newCol;
        this.orientation = newOrientation;
        }
    
    // simple getter methods
    public Node getSymbol() {
      return this.symbol;
    }
  
    public int getLength() {
      return this.length;
    }

    public int getRow() {
      return this.row;
    }
  
    public int getCol() {
      return this.col;
    }
  
    public boolean getOrientation() {
      return this.orientation;
    }
  
  }