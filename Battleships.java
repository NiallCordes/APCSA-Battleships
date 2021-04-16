import java.util.*;

public class Battleships {
  public static void main(String[] args) {

    // initialze board and scanner
    Board gameBoard = new Board();
    Scanner scan = new Scanner(System.in);

    // introduction method and function
    System.out.println("Welcome to Battleships!");
    System.out.println("The ships have been placed on the board by the computer.");
    gameBoard.printPlayerViewBoard();

