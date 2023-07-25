import java.util.Scanner;

public class UserInterface {

    //-le Menu s'affiche et demande à l'user de faire un choix
    public int getMenuChoice() {
        System.out.println("Faites votre choix : \n Nouveau jeu = 1 \n Nouveau personnage = 2\n Quitter le jeu = 3");
        Scanner terminal = new Scanner(System.in);
        int userMenuChoice = terminal.nextInt();
        terminal.nextLine();
        return userMenuChoice;
    }

    //- Le Menu demande à l'utilisateur le type de character qu'il veut incarner
    public int getCharacterChoice (){
        System.out.println("Choisissez votre personnage : \n warrior = 1 \n wizard = 2");
        Scanner terminal = new Scanner(System.in);
        int userCharacterChoice = terminal.nextInt();
        terminal.nextLine();
        return userCharacterChoice;
    }

    //- Le Menu propose à l'utilisateur de modifier les infos de son personnage en cours de création
    public int getChangeCharacter (){
        System.out.println("Voulez-vous modifier les infos de votre personnage ? \n oui = 1 \n non = 2");
        Scanner terminal = new Scanner(System.in);
        int userChangeCharacter= terminal.nextInt();
        terminal.nextLine();
        return userChangeCharacter;
    }

    //- Le Menu demande à l'utilisateur si il veut quitter le jeu
    public int getExitGame (){
        System.out.println("Voulez-vous quitter le jeu ? \n oui = 1 \n non = 2");
        Scanner terminal = new Scanner(System.in);
        int userExitGame= terminal.nextInt();
        terminal.nextLine();
        return userExitGame;
    }

    //- Le Menu demande à l'utilisateur le nom de son character
    public String getCharacterName (){
        System.out.println("Saisissez le nom de votre personnage ");
        Scanner terminal = new Scanner(System.in);
        String userCharacterName = terminal.nextLine();
        //terminal.nextLine();
        return userCharacterName;
    }

}


//La classe Menu permet de structurer le déroulement du jeu et les messages pour l'utilisateur en utilisant des fonctions.





