package Controllers;
import GameComponents.Account;
import GameComponents.Board.DeedSquare;
import GameComponents.Board.Square;
import GameComponents.Die;
import GameComponents.Player;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
 public class GuiController {

     GUI gui;
     //TextReader reader = new TextReader(DanskTekst);
     GUI_Field[] fields = new GUI_Field[24];


     Die die1 = new Die();
     Die die2 = new Die();
     int diceSum = 0;

    String message;
    int[] player;
    GUI_Player gui_player;
    GUI_Player[] gui_players;
    private String playerName;
    private int balance;
    GUI_Ownable ownable ;

    Account account = new Account();
    //DeedSquare deedSquare = new DeedSquare(, checkSquarePris(getCurrentPosition()));
     DeedSquare deedSquare;
     Square square;



    public GuiController() {
         fields = new GUI_Field[]{
                 new GUI_Start(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Chance(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Jail(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Chance(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Chance(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Street(),
                 new GUI_Chance(),
                 new GUI_Street(),
                 new GUI_Street(),
         };

        this.gui = new GUI(fields);

        gui.getFields()[0].setTitle("Start");
        gui.getFields()[0].setBackGroundColor(Color.yellow);
        gui.getFields()[0].setSubText("M1");

        gui.getFields()[1].setTitle("Burgerbaren");
        gui.getFields()[1].setBackGroundColor(Color.PINK);
        //gui.getFields()[1].setSubText("M1");
        ownable = (GUI_Ownable)fields[1];
        ownable.setSubText("M1");


        gui.getFields()[2].setTitle("Pizzahuset");
        gui.getFields()[2].setBackGroundColor(Color.red);
        //gui.getFields()[2].setSubText("M1");
        ownable = (GUI_Ownable)fields[2];
        ownable.setSubText("M1");

        gui.getFields()[3].setBackGroundColor(Color.MAGENTA);

        gui.getFields()[4].setTitle("Slikbuttiken");
        gui.getFields()[4].setBackGroundColor(Color.ORANGE);
        //gui.getFields()[4].setSubText("M1");
        ownable = (GUI_Ownable)fields[4];
        ownable.setSubText("M1");

        gui.getFields()[5].setTitle("Iskiosken");
        gui.getFields()[5].setBackGroundColor(Color.blue);
        //gui.getFields()[5].setSubText("M1");
        ownable = (GUI_Ownable)fields[5];
        ownable.setSubText("M1");

        gui.getFields()[6].setTitle("I fengsel");
        gui.getFields()[6].setBackGroundColor(Color.gray);
        gui.getFields()[6].setSubText("På besøg!");

        gui.getFields()[7].setTitle("Museet");
        gui.getFields()[7].setBackGroundColor(Color.PINK);
        //gui.getFields()[7].setSubText("M2");
        ownable = (GUI_Ownable)fields[7];
        ownable.setSubText("M2");

        gui.getFields()[8].setTitle("Biblioteket");
        gui.getFields()[8].setBackGroundColor(Color.orange);
        //gui.getFields()[8].setSubText("M2");
        ownable = (GUI_Ownable)fields[8];
        ownable.setSubText("M2");

        gui.getFields()[9].setBackGroundColor(Color.magenta);

        gui.getFields()[10].setTitle("Skateparken");
        gui.getFields()[10].setBackGroundColor(Color.CYAN);
        //gui.getFields()[10].setSubText("M2");
        ownable = (GUI_Ownable)fields[10];
        ownable.setSubText("M2");

        gui.getFields()[11].setTitle("Swimmingpoolen");
        gui.getFields()[11].setBackGroundColor(Color.orange);
        //gui.getFields()[11].setSubText("M2");
        ownable = (GUI_Ownable)fields[11];
        ownable.setSubText("M2");

        gui.getFields()[12].setTitle("Parkering");
        gui.getFields()[12].setBackGroundColor(Color.darkGray);
        gui.getFields()[12].setSubText("Gratis");

        gui.getFields()[13].setTitle("Spillehallen");
        gui.getFields()[13].setBackGroundColor(Color.orange);
        //gui.getFields()[13].setSubText("M3");
        ownable = (GUI_Ownable)fields[13];
        ownable.setSubText("M3");

        gui.getFields()[14].setTitle("Biografen");
        gui.getFields()[14].setBackGroundColor(Color.pink);
        //gui.getFields()[14].setSubText("M3");
        ownable = (GUI_Ownable)fields[14];
        ownable.setSubText("M3");

        gui.getFields()[15].setBackGroundColor(Color.magenta);

        gui.getFields()[16].setTitle("Legetøjsbutikken");
        gui.getFields()[16].setBackGroundColor(Color.orange);
        //gui.getFields()[16].setSubText("M3");
        ownable = (GUI_Ownable)fields[17];
        ownable.setSubText("M3");

        gui.getFields()[17].setTitle("Dyrebutikken");
        gui.getFields()[17].setBackGroundColor(Color.pink);
        //gui.getFields()[17].setSubText("M3");
        ownable = (GUI_Ownable)fields[17];
        ownable.setSubText("M3");

        gui.getFields()[18].setTitle("I fengsel");
        gui.getFields()[18].setBackGroundColor(Color.gray);
        gui.getFields()[18].setSubText("Gå i fengsel!");

        gui.getFields()[19].setTitle("Bowlinghallen");
        gui.getFields()[19].setBackGroundColor(Color.blue);
        //gui.getFields()[19].setSubText("M4");
        ownable = (GUI_Ownable)fields[19];
        ownable.setSubText("M4");

        gui.getFields()[20].setTitle("Zoologisk Have");
        gui.getFields()[20].setBackGroundColor(Color.PINK);
        //gui.getFields()[20].setSubText("M4");
        ownable = (GUI_Ownable)fields[20];
        ownable.setSubText("M4");


        gui.getFields()[21].setBackGroundColor(Color.MAGENTA);

        gui.getFields()[22].setTitle("Vandlandet");
        gui.getFields()[22].setBackGroundColor(Color.CYAN);
        //gui.getFields()[22].setSubText("M5");
        ownable = (GUI_Ownable)fields[22];
        ownable.setSubText("M5");

        gui.getFields()[23].setTitle("Strand");
        gui.getFields()[23].setBackGroundColor(Color.orange);
        //gui.getFields()[23].setSubText("M5");
        ownable = (GUI_Ownable)fields[23];
        ownable.setSubText("M5");

        gui.getUserButtonPressed("Press Ok to start!");
        gui.showMessage("Welcome to Monopoly Junior game.");


    }
    public int checkSquarePris(int currentPositionIndex ){
        int pris = 0;
        switch (currentPositionIndex){
            case 1:
                pris = 1;
                break;
            case 2:
                pris = 1;
                break;
            case 4:
                pris = 1;
                break;
            case 5:
                pris = 1;
                break;
            case 7:
                pris = 2;
                break;
            case 8:
                pris = 2;
                break;
            case 10:
                pris = 2;
                break;
            case 11:
                pris = 2;
                break;
            case 13:
                pris = 3;
                break;
            case 14:
                pris = 3;
                break;
            case 16:
                pris = 4;
                break;
            case 17:
                pris = 4;
                break;
            case 19:
                pris = 4;
                break;
            case 20:
                pris = 4;
                break;
            case 22:
                pris = 5;
                break;
            case 23:
                pris = 5;
                break;
            default:
                pris = 0;
        }

        return pris;
    }
    public void payToBank(GUI_Player currentPlayer , int point){
        account.withDraw(point);
        balance = account.getBalance();
        currentPlayer.setBalance(balance);
        // return balance;
    }
    //Check account of the current balance, if there is enough balance
    public boolean hasAmount(GUI_Player currentlayer , int currentPositionIndex){
        if(account.getBalance() >= square.checkSquarePris(currentPositionIndex) )
            return true;
        return false;
    }

    public boolean hasDeed(GUI_Field[] currentField){
        return deedSquare.hasDeed();
    }
    public void payToOwner(Player currentPlayer , Player owner , int point ){
        balance =currentPlayer.getCurrentBalance();
        account.withDraw(point);
        currentPlayer.getCurrentBalance();
        owner.getCurrentBalance();
        account.deposit(point);
    }
     public GuiController(Die die1 , Die die2) {
        die1 = new Die();
        die2 = new Die();


     }

     public void showMessage(String message){
        gui.showMessage(message);
    }

    public int getBalance() {
        return balance;
    }

    public String getPlayerName() {
        return playerName;
    }
     /*public GUI_Player addPlayer(String userInput, int balance){

         GUI_Player gui_player = new GUI_Player(playerName, balance);
         fields[0].setCar(gui_player,true);
         return gui_player;
     }*/
     public GUI_Player[] addPlayerOnBoard(Player[] list){
         gui_players = new GUI_Player[list.length];
         for (int i = 0; i < list.length; i++) {
             gui_players[i] = new GUI_Player(list[i].getPlayerName(),list[i].getCurrentBalance());
             fields[0].setCar(gui_players[i],true);
             gui.addPlayer(gui_players[i]);
         }
         return gui_players;
     }
     public void setBalanceToPlayers(GUI_Player[] currentPlayer , int balance){
         account.deposit(balance);
     }

    /* public GUI_Player addPlayer(GUI_Player gui_player, String userInput, int balance){

         gui_player = new GUI_Player(playerName, balance);
         fields[0].setCar(gui_player,true);
         return gui_player;
     }*/


     public void move(GUI_Player currentPlayer, int currentPositionIndex, int diceSum){

        fields[currentPositionIndex].setCar(currentPlayer,false);
        fields[diceSum].setCar(currentPlayer,true);
     }
     public int getCurrentPosition(){
        return getCurrentPosition();
     }
     public int getCurrentPlayer(int player){
        return player;
     }
     public int setBalance(int balance){
        return balance;
     }

     public Die getDie1() {
         return die1;
     }

     public Die getDie2() {
         return die2;
     }




     public int getUserInteger() {
        return gui.getUserInteger("Enter players count:");
     }
     public String getUserString(){
        return gui.getUserString("");
     }



    public void setDice(int die1, int die2){
        //gui = new GUI();
        gui.setDice(die1,die2);// why gui is null ???????????

    }

    /* @Override
     public String toString() {
         int d1 = die1.roll();
         int d2 = die2.roll();
         int sum = d1 + d2 ;
        String result = Integer.toString(sum);
         return result;
     }*/

     public int[] diceSum (int die1, int die2){
        //return die1.roll() + die2.roll();
        int sum = 0;
        sum = die1 + die2;
        int DiceData[] = new int[3];
        DiceData[0]=die1;
        DiceData[1]=die2;
        DiceData[2]=sum;
        return DiceData;
    }



     /*public void setDice(int d1, int d2) {
        gui.setDice(d1,d2);
     }*/
 }
