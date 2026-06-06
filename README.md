# Gestion-centre-de-formation-uk

# Système de Gestion - Centre de Formation

Ce projet est une application console écrite en Java qui permet de gérer les inscriptions, les cours, les enseignants et les notes au sein d'un centre de formation. L'application propose différents espaces de connexion adaptés au rôle de chaque utilisateur (Étudiant, Enseignant, Responsable).

## 🚀 Fonctionnalités

Le système s'articule autour d'un menu principal offrant les options suivantes :

*   **1. Inscription Étudiant** : Permet à un nouvel étudiant de s'enregistrer en saisissant son nom, prénom et un mot de passe. Un matricule unique (ex: `ETU001`) lui est automatiquement attribué.
*   **2. Liste des Cours** : Affiche l'ensemble des cours actuellement disponibles dans le centre de formation.
*   **3. Suivi Étudiant (Espace Étudiant)** : Permet à un étudiant de s'authentifier via son matricule et son mot de passe pour consulter son profil, la liste des cours et sa moyenne générale.
*   **4. Espace Enseignant** : Permet à un enseignant de se connecter avec son matricule pour visualiser la liste complète des étudiants inscrits et gérer le suivi des notes.
*   **5. Espace Responsable** : Zone d'administration permettant de gérer la création des cours et l'enregistrement des enseignants (Fonctionnalité en cours de développement/complétion).

## 🛠️ Technologies Utilisées

*   **Langage** : Java (JDK 8 ou supérieur recommandé)
*   **Entrées/Sorties** : `java.util.Scanner` pour l'interaction dans la console
*   **Stockage des données** : `java.util.ArrayList` (Stockage dynamique en mémoire vive)

## 📁 Structure du Code

Le projet est contenu dans un fichier unique `Main.java` et s'appuie sur une architecture orientée objet avec plusieurs classes internes :

*   `Main` : Contient la logique principale de l'application et la boucle du menu.
*   `Etudiant` : Représente un élève (nom, prénom, matricule, mot de passe, moyenne).
*   `Enseignant` : Représente un professeur (nom, prénom, matricule, matière enseignée).
*   `Cours` : Représente une matière ou une formation dispensée dans le centre.

## 💻 Comment Lancer le Projet

### Prérequis
Assurez-vous d'avoir installé le kit de développement Java (JDK) sur votre machine.

### Instructions

1. **Cloner ou télécharger** le code source du projet.
2. Ouvrez votre terminal (ou invite de commandes) dans le dossier contenant le fichier `Main.java`.
3. **Compiler** le fichier Java avec la commande suivante :
   ```bash
   javac Main.java
   ```
4. **Exécuter** l'application compilée :
   ```bash
   java Main
   ```

## 📝 Exemple d'Utilisation

À l'exécution, le menu suivant s'affiche à l'écran :

```text
===== CENTRE DE FORMATION =====
1. S'inscrire
2. Liste des cours
3. Suivi
4. Espace Enseignant
5. Espace Responsable
0. Quitter
Votre choix: 
```

Il suffit de saisir le chiffre correspondant à l'action souhaitée et de suivre les instructions textuelles à l'écran.

