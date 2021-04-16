import java.util.*;

public class Board {
  static Node[][] board;
  static Node[][] playerViewBoard;
  static int boardSize = 10;
  static boolean ships = true;
  static List<Ships> shipList;
  static List<Node> shipStorage;

  // initialize statistics function
  static int shotsFired;
  static int shotsHit;
  static int shotsMissed;

  // constructor methods to setup the board
  public Board() {
    // initialize boards
    board = new Node[boardSize][boardSize];
    playerViewBoard = new Node[boardSize][boardSize];
    shotsFired = 0;
    shotsHit = 0;
    shotsMissed = 0;
    // initialize board
    createEmptyBoard();
    // initialize player board
    createPlayerViewBoard();
    // randomly place ships
    placeShips(ships);
  }

