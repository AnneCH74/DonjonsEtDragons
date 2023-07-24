//La classe GAME contient la logique interne du jeu (joueurs, avancement)

//-Le programme lance le menu principal
// Le game demande à l'user ce qu'il souhaite faire (menu principal)
public class Game {
    //Déclarer un attribut :
    UserInterface ui;
    Character mainCharacter ;
    public Game () {
        this.ui = new UserInterface();
    }
    public void initGame (){
        //Le choix de l'utilisateur c'est égal à ce qui est choisi dans la fonction
        int userMenuChoice = ui.getMenuChoice();
        System.out.println(userMenuChoice);

        int typeChoice = ui.getCharacterChoice();
        System.out.println(typeChoice);

       // int changeCharacter1 = ui.getChangeCharacter();
        //System.out.println(changeCharacter1);

       // int exitChoice1 = ui.getExitGame();
       // System.out.println(exitChoice1);

       String nameCharacter = ui.getCharacterName();
        System.out.println(nameCharacter);

       // int changeCharacter2 = ui.getChangeCharacter();
      //  System.out.println(changeCharacter2);

      //  int exitChoice2 = ui.getExitGame();
       // System.out.println(exitChoice2);

        this.mainCharacter = new Character(nameCharacter,typeChoice);
        System.out.println(this.mainCharacter);

     //   int changeCharacter3 = ui.getChangeCharacter();
      //  System.out.println(changeCharacter3);

      //  int exitChoice3 = ui.getExitGame();
       // System.out.println(exitChoice3);

       boolean quit = false;
       While|!quit| {
            1 = startGame;
            2 = new Character();
            3 =quit;
            int userMenuChoice;
                    if quit == 1 {
                        startGame
        } else if quit ==2 {
            int typeChoice = ui.getCharacterChoice();
            System.out.println(typeChoice);
            String nameCharacter = ui.getCharacterName();
            System.out.println(nameCharacter);
            this.mainCharacter = new Character(nameCharacter,typeChoice);
            System.out.println(this.mainCharacter);
        } else if quit==3 {
                        userExitGame;

        }

       }

    }


}

