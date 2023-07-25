import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

//La classe GAME contient la logique interne du jeu (joueurs, avancement)

//-Le programme lance le menu principal
// Le game demande à l'user ce qu'il souhaite faire (menu principal)
public class Game {
    //Déclarer un attribut :
    UserInterface ui;
    Character mainCharacter;

    public Game() {
        this.ui = new UserInterface();
    }

    public void initGame() {
        //Le choix de l'utilisateur c'est égal à ce qui est choisi dans la fonction
        //  int userMenuChoice = ui.getMenuChoice();
        //  System.out.println(userMenuChoice);

        //  int typeChoice = ui.getCharacterChoice();
        // System.out.println(typeChoice);

        // int changeCharacter1 = ui.getChangeCharacter();
        //System.out.println(changeCharacter1);

        // int exitChoice1 = ui.getExitGame();
        // System.out.println(exitChoice1);

        //  String nameCharacter = ui.getCharacterName();
        // System.out.println(nameCharacter);

        // int changeCharacter2 = ui.getChangeCharacter();
        //  System.out.println(changeCharacter2);

        //  int exitChoice2 = ui.getExitGame();
        // System.out.println(exitChoice2);

        // this.mainCharacter = new Character(nameCharacter, typeChoice);
        // System.out.println(this.mainCharacter);

        //   int changeCharacter3 = ui.getChangeCharacter();
        //  System.out.println(changeCharacter3);

        //  int exitChoice3 = ui.getExitGame();
        // System.out.println(exitChoice3);

        boolean quit = false;
        while (!quit) {
            //1 = startGame;
            //  2 = new Character();
            //  3 = quit;
            int userMenuChoice = ui.getMenuChoice();
            if (userMenuChoice == 1) {
                int typeChoice = ui.getCharacterChoice();
                System.out.println(typeChoice);
                String nameCharacter = ui.getCharacterName();
                System.out.println(nameCharacter);
                this.mainCharacter = new Character(nameCharacter, typeChoice);
                System.out.println(this.mainCharacter);
                playGame();
            } else if (userMenuChoice == 2) {
                int typeChoice = ui.getCharacterChoice();
                System.out.println(typeChoice);
                String nameCharacter = ui.getCharacterName();
                System.out.println(nameCharacter);
                this.mainCharacter = new Character(nameCharacter, typeChoice);
                System.out.println(this.mainCharacter);
            } else if (userMenuChoice == 3) {
                int exitGame = ui.getExitGame();
                System.out.println(exitGame);
                if (exitGame == 1) {
                    quit = true;
                }
            }
        }
    }

    private void playGame() {
        //Créer un tableau de taille 64
        int plateauDeJeu[] = new int[64];
//Initialiser une variable à 0 qui représente la position du joueur
        int position=0;

        //Entrée en scène du dé (chiffre random entre 1 et 6)
        Random ranNum = new Random();
        int randomNumber;


// Tant que la position est inférieure à 64, je lance un dé, j'augmente la position et je l'affiche
        while (position<64) {
            randomNumber = ranNum.nextInt(6) + 1 ;
            position += randomNumber;
            System.out.println("Hey Gamer! You rolled: "+randomNumber);
            System.out.println("Vous êtes tombé sur la case : " + position);
        }
    }
}


