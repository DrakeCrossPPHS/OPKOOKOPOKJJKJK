import java.util.Scanner;

public class the {

    private static String action;
    private static int cookie;
    private static int item;
    private static boolean twoX;
    private static boolean fourX;
    private static boolean eightX;
    private static boolean sixteenX;

  public static void main(String[] args) {
    System.out.println("WELCOME TO COOKIE CLICKER");
    System.out.println("");
    System.out.println("Type click to click");
    System.out.println("Type shop to enter the shop");
    System.out.println("Type exit to exit the game");
    System.out.println("");
    cookie();
    

  }
  public static void cookie(){
    Scanner in = new Scanner(System.in);
    System.out.print("What will you do? ");

    action = in.nextLine();
    if (action.equalsIgnoreCase("click"))
    {
      click();
    }else if(action.equalsIgnoreCase("shop"))
    {   
      shop();

    } else if (action.equalsIgnoreCase("exit")){
      System.exit(0);
    } else {
      System.out.println("Invalid action");
      cookie();
    }
    
  } 

    public static void click(){
      if (!twoX){
        cookie = cookie + 1;
      } else if (twoX){
        if (!fourX || !eightX || !sixteenX){
        cookie = cookie + 2;
        }
      } else if (fourX){
        if (!eightX || !sixteenX){
        cookie = cookie + 4;
        }
      } else if (eightX){
        if (!sixteenX){
        cookie = cookie + 8;
        }
      } else if (sixteenX){
        cookie = cookie + 16;
      }
      if (cookie > 1){
        System.out.println("You now have " + cookie + " cookies");
      } else {
        System.out.println("You now have " + cookie + " cookie");
      }
      cookie();
    }
        

    public static void shop(){
    Scanner in = new Scanner(System.in);
      System.out.println("Welcome to the shop");
      System.out.println("");
      System.out.println("0: Back");
        if (!twoX)
        {
            System.out.println("1: 10 Cookies: 2x Clicks");
        }
        if (!fourX)
        {
          System.out.println("2: 50 Cookies: 4x Clicks");
        }
        if (!eightX)
        {
          System.out.println("3: 150 Cookies: 8x Clicks");
        }
        if (!sixteenX)
        {
          System.out.println("4: 500 Cookies: 16x Clicks");
        }
        System.out.println("Enter item number you would like to buy");
        while (true){
          if (in.hasNextInt()){
            item = in.nextInt();
            break;
          }else
          {
            System.out.println("Invailid input enter a number instead");
            in.next();
          }
        }
        if (item == 0){
          cookie();
        } else if (item == 1){
          if (!twoX){
            twoX();
          }
          } else if (item == 2){
            if (!fourX){
              fourX();
            }
          } else if (item == 3){
            if (!eightX){
              eightX();
            }
          } else if (item == 4){
            if (!sixteenX){
              sixteenX();
            }
          } else if (item >= 5 || item >= -1){
          System.out.println("Invailid item");
          shop();
        } else {
            System.out.println("Invailid number");
            shop();
          }
  }
  private static void twoX(){
    if (cookie >= 10){
      twoX = true;
      System.out.println("You have bought 2X Clicks!");
      cookie = cookie - 10;
      cookie();
    } else {
      System.out.println("You don't have enough cookies");
      cookie();
    }
  }

  private static void fourX(){
    if (cookie >= 50){
      if (!twoX){
        twoX = true;
      }
      fourX = true;
      System.out.println("You have bought 4X Clicks!");
      cookie = cookie - 50;
      cookie();
    } else {
      System.out.println("You don't have enough cookies");
      cookie();
    }
  }
    private static void eightX(){
    if (cookie >= 150){
      if (!twoX){
        twoX = true;
      }
      if (!fourX){
        fourX = true;
      }
      fourX = true;
      System.out.println("You have bought 8X Clicks!");
      cookie = cookie - 150;
      cookie();
    } else {
      System.out.println("You don't have enough cookies");
      cookie();
    }
  }
    private static void sixteenX(){
    if (cookie >= 500){
      if (!twoX){
        twoX = true;
      }
      if (!fourX){
        fourX = true;
      }
      if (!eightX){
        eightX = true;
      }
      fourX = true;
      System.out.println("You have bought 16X Clicks!");
      cookie = cookie - 500;
      cookie();
    } else {
      System.out.println("You don't have enough cookies");
      cookie();
    }
  }
  


}   

