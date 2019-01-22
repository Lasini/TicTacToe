import javax.swing.*;

public class TicTacToe{
  
  public static void main(String [] args){
    while(true){
      
      //imag eicons used for JOptionPane
      ImageIcon iconic= new ImageIcon("dice.png");
      ImageIcon icon = new ImageIcon("exx.png");
      ImageIcon icon1 = new ImageIcon("oh.png");
      ImageIcon icon2 = new ImageIcon("tictactoesymbol.png");
      ImageIcon rolling=new ImageIcon("tenor.gif");
      ImageIcon works=new ImageIcon("fie.gif");
      //
      
      //Deciding who plays as Player X and Player O
      JOptionPane.showMessageDialog(null, "This is a 2 player game!!!!!", "TIC TAC TOE", JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(null, "Both players will roll a dice to randomly decide who goes first.", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE, iconic);
      
      for(int w=0; w>=0; w++){
        Object[] options= {"ROLL"};
        JOptionPane.showOptionDialog(null, "Player 1, roll the dice.", "ROLL FIRST", JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, rolling, options, options[0]);
        int mi=player1roll();
        
        JOptionPane.showOptionDialog(null, "Player 2, roll the dice.", "P2'S ROLL", JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, rolling, options, options[0]);
        int my=player2roll();
        
        if(mi>my){
          
          JOptionPane.showMessageDialog(null, "Player 1 will play as X and Player 2 will play as O", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
          break;
        }
        else if (mi<my){
          
          JOptionPane.showMessageDialog(null, "Player 2 will play as X and Player 1 will play as O", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
          break;
        }
        else if(mi==my){
          JOptionPane.showMessageDialog(null, "Roll again.");
          
        }
      }
      //
      
      //warning
      JOptionPane.showMessageDialog(null, "Please do not enter nothing or a coordinate that is already taken; otherwise, you will be made to skip your turn....", "Warning", JOptionPane.INFORMATION_MESSAGE, icon2);
      JOptionPane.showMessageDialog(null, "To enter X or O onto the tic tac toe board, enter a two digit number. \n\nEX:\n If you enter 12, the 1 stands for the row and 2 stands for the column. \nTherefore, the letter X or O will be placed inthe first row and second column. \n\nA REMINDER: \nThe Tic Tac Toe board is 3 by 3.\nMeaning, there are 3 rows and 3 columns. ", "How To Play", JOptionPane.INFORMATION_MESSAGE, icon2);
      
      String [][] gameArray =  {{  " ",  " ", " " },{  " ", " ",  " " },{ " ", " ",  " " }}; 
      //Array that would store the Xs and Os for the game or the tic tac toe 3x3 square 
      
      String line = "";
      int i=0;
      while(i<9){
        //declareing X for the inputed location
        if((i%2)==0){
          line= JOptionPane.showInputDialog(null, "Player X, please enter from rows(1-3) and columns(1-3), ALSO DO NOT ADD COMMAS AND SPACES BETWEEN THE TEO DIGITS(EX. 12): ", "TIC TAC TOE", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
          if(line.length()==2){
            char k= line.charAt(0);//number for row from input
            char j= line.charAt(1);//number for column from input
            int e=Integer.parseInt(String.valueOf(k))-1;//string to int
            int f=Integer.parseInt(String.valueOf(j))-1;//string to int
            if(gameArray[e][f]==" "){
              gameArray[e][f]="X";
            }
            else{//error message
              JOptionPane.showMessageDialog(null, "Invalid...\nPlease try again....", "INVALID", JOptionPane.WARNING_MESSAGE);
            }
          }
          else{//error message
            JOptionPane.showMessageDialog(null, "Invalid... You have to enter 2 digits(no more and no less)\nPlease try again....", "INVALID", JOptionPane.WARNING_MESSAGE);
          }
          //System.out.println(Arrays.deepToString(gameArray));//Printing the 2D array in one line
          
          //Printing if it’s either X or O
          JOptionPane.showMessageDialog(null," "+gameArray[0][0]+" | "+gameArray[0][1]+" | "+gameArray[0][2]+"\n-----------\n"+" "+gameArray[1][0]+" | "+gameArray[1][1]+" | "+gameArray[1][2]+"\n-----------\n"+" "+gameArray[2][0]+" | "+gameArray[2][1]+" | "+gameArray[2][2]);// Print each item of the 3rd row
          //who won
          if(method(gameArray)== 0 || method(gameArray)== 1){
            if(method(gameArray)== 0 ){JOptionPane.showMessageDialog(null,"Player X has WON!!!!!", "WINNER", JOptionPane.PLAIN_MESSAGE, works );}
            else if(method(gameArray)== 1 ){JOptionPane.showMessageDialog(null, "Player O has WON!!!!!", "WINNER", JOptionPane.PLAIN_MESSAGE, works);}
            break;}
          //
          else{i++;}
          
        }
        
        //declareing O for the inputed location
        else if((i%2)==1){
          line= JOptionPane.showInputDialog(null, "Player O, please enter from rows(1-3) and columns(1-3), ALSO DO NOT ADD COMMAS AND SPACES BETWEEN THE TEO DIGITS(EX. 12): ", "TIC TAC TOE", JOptionPane.PLAIN_MESSAGE, icon1, null, "").toString();
          if(line.length()==2){
            char k= line.charAt(0);//number for row from input
            char j= line.charAt(1);//number for column from input
            int e=Integer.parseInt(String.valueOf(k))-1;//string to int
            int f=Integer.parseInt(String.valueOf(j))-1;//string to int
            if(gameArray[e][f]!="X"){
              gameArray[e][f]="O";
            }
            else{//error mesaage
              JOptionPane.showMessageDialog(null, "Invalid...\nPlease try again....", "INVALID", JOptionPane.WARNING_MESSAGE);
            }
          }
          else{//error message
            JOptionPane.showMessageDialog(null, "Invalid... You have to enter 2 digits(no more and no less)\nPlease try again....", "INVALID", JOptionPane.WARNING_MESSAGE);
          }
          
          //Printing if it’s either X or O
          JOptionPane.showMessageDialog(null," "+gameArray[0][0]+" | "+gameArray[0][1]+" | "+gameArray[0][2]+"\n-----------\n"+" "+gameArray[1][0]+" | "+gameArray[1][1]+" | "+gameArray[1][2]+"\n-----------\n"+" "+gameArray[2][0]+" | "+gameArray[2][1]+" | "+gameArray[2][2]);// Print each item of the 3rd row
          //who won
          if(method(gameArray)== 0 || method(gameArray)== 1){
            if(method(gameArray)== 0 ){JOptionPane.showMessageDialog(null,"Player X has WON!!!!!", "WINNER", JOptionPane.PLAIN_MESSAGE, works);}
            else if(method(gameArray)== 1 ){JOptionPane.showMessageDialog(null, "Player O has WON!!!!!", "WINNER", JOptionPane.PLAIN_MESSAGE, works);}
            break;}
          //
          else{i++;}
        }
      }
      //playing again or not
      String ay = JOptionPane.showInputDialog(null, "If you would like to play again, Please enter yes or press cancel : ", "TIC TAC TOE", JOptionPane.PLAIN_MESSAGE);
      if(ay == "no"){
        break;
      }
    }
  }
  
  public static int method(String [][] gameArray){//method that decides who won
    int g=3;
    int x=0;
    for(int n = 0; n < g; n++){ 
      if(gameArray[n][0]=="X" && gameArray[n][1]=="X" && gameArray[n][2]=="X"){
        //return "Player X has won!";
        return x;
      }
      else if(gameArray[n][0]=="O" && gameArray[n][1]=="O" && gameArray[n][2]=="O"){
        //return"Player O has won!";
        x=1;
        return x;
      }
      if(gameArray[0][n]=="X" && gameArray[1][n]=="X" && gameArray[2][n]=="X"){
        //return "Player X has won!";
        return x;
      }
      else if(gameArray[0][n]=="O" && gameArray[1][n]=="O" && gameArray[2][n]=="O"){
        // return "Player O has won!";
        x=1;
        return x;
      }
      if(gameArray[0][0]=="X" && gameArray[1][1]=="X" && gameArray[2][2]=="X"){
        // return "Player X has won!";
        return x;
      }
      else if(gameArray[0][0]=="O" && gameArray[1][1]=="O" && gameArray[2][2]=="O"){
        // return "Player O has won!";
        x=1;
        return x;
      }
    }
    if(gameArray[0][2]=="X" && gameArray[1][1]=="X" && gameArray[2][0]=="X"){
      // return "Player X has won!";
      return x;
    }
    else if(gameArray[0][2]=="O" && gameArray[1][1]=="O" && gameArray[2][0]=="O"){
      //return "Player O has won!"; 
      x=1;
      return x;
    }
    return g;
  }
  
  public static int player1roll(){//player 1's dice roll
    int numSides = 6;
    double randDouble = Math.random (); 
    randDouble = randDouble * numSides;
    int roll = (int) randDouble + 1;
    JOptionPane.showMessageDialog(null, "Player 1's roll is: " + roll);
    return roll;
  }
  
  public static int player2roll(){//player 2's dice roll
    int numSides = 6; 
    double randomDouble = Math.random (); 
    randomDouble= randomDouble * numSides;
    int roll2 = (int) randomDouble + 1;
    JOptionPane.showMessageDialog(null, "Player 2's roll is: " + roll2);
    return roll2;
  }
  
}