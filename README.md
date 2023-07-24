# DonjonsEtDragons

Objectifs : créer un jeu, inspiré des jeux de plateaux de l'univers "Donjons et Dragons", en utilisant le langage JAVA.

Compétences :
- Programmer avec des variables
- Programmer une condition
- Programmer une boucle
- Programmer avec des tableaux
- Programmer une fonction et l'appeler
- Définir et utiliser une méthode
- Définir des classes
- Instancier des objets
- Générer la javadoc


STRUCTURE DU JEU ET CREATION DE PERSONNAGES :

Nous allons manipuler deux types de personnages : guerrier et magicien (pour le moment une seule
classe “Personnage”, avec un attribut de type string qui vaudra “guerrier” ou “magicien”) et leur
équipement offensif par défaut (arme ou sort). Le guerrier possède un EquipementOffensif (une
arme) et peut être équipé d’un EquipementDefensif (un bouclier) pour se défendre. Le magicien
possède un EquipementOffensif (un sort) et peut avoir un EquipementDefensif ( un) philtre pour se
défendre.
Chaque type de personnage est caractérisé par les attributs suivants :
● Guerrier : Nom, Niveau de vie (10), Force d’attaque (10), EquipementOffensif,
EquipementDefensif
● Magicien : Nom, Niveau de vie (6), Force d’attaque (15), EquipementOffensif,
EquipementDefensif

Le programme commence par vous proposer un premier menu :
● Nouveau personnage ou quitter le jeu :
○ Création du personnage : le programme va demander quel type de personnage vous
voulez créer, puis vous demande les informations adéquates pour créer ce
personnage, avec la saisie via lecture des entrées clavier (classe Scanner), des
informations du personnage (Guerrier ou Magicien, et nom).
○ Pour le personnage en cours de création, un choix permettra de :
■ afficher toutes les infos du personnage
■ modifier ses infos
○ Quitter le jeu : vous pouvez à tout moment quitter le jeu


CONSEILS DE DÉVELOPPEMENT
● Préférez le développement en anglais. Si c’est trop complexe, le français est toléré
● Veillez à bien nommer vos classes, fonctions et variables ainsi que répartir logiquement vos
classes dans des packages correctement nommés.
● Commencez à architecturer votre code correctement en utilisant des classes :
○ Une classe « Personnage » qui aura 3 constructeurs (sans paramètres / avec nom /
avec nom et type)
○ Une classe « EquipementOffensif » caractérisée par un type (String “Arme” ou
“Sort”), un niveau d’attaque et un nom.
○ Une classe « EquipementDefensif » caractérisée par un type (String “Bouclier” ou
“Philtre”), un niveau de défense et un nom.
○ Une classe « Menu » qui vous permettra de structurer correctement le déroulement
du jeu et les messages pour l’utilisateur en utilisant des fonctions.
○ Une classe « Game » qui contiendra la logique interne du jeu ( joueurs, avancement )
● Attention !! Toutes vos classes devront être structurées correctement (Getters/Setters,
constructeurs, méthode toString(), ...).
