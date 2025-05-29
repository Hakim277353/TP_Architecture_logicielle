# Exemples d'Implémentation de Design Patterns en Java

Ce dépôt présente des implémentations pratiques de plusieurs patrons de conception (design patterns) en Java, notamment Singleton, Builder et Strategy.

## Structure du Projet

Le dépôt est organisé en trois modules principaux, chacun correspondant à un design pattern différent.

---

### 1. TD2Singleton – Implémentation d’un Logger

📁 Dossier : [`TD2Singelton`](TD2Singelton/)

Cette section démontre l'utilisation du patron Singleton via un système de journalisation (logger).

- [`Logger.java`](TD2Singelton/src/Logger.java) : Un logger singleton thread-safe qui écrit des messages horodatés dans un fichier.

**Fonctionnalités :**
- Création d’une seule instance (singleton)
- Journalisation avec horodatage
- Sortie dans un fichier

---

### 2. TD4 - Patron Builder : Construction d’un Ordinateur

📁 Dossier : [`TD4DESIGN PATTERN BUILDER`](TD4DESIGN%20PATTERN%20BUILDER/)

Cette section illustre le patron Builder à travers l’assemblage d’ordinateurs.

**Composants :**
- [`Computer.java`](TD4DESIGN%20PATTERN%20BUILDER/Computer.java) : Classe du produit
- [`ComputerBuilder.java`](TD4DESIGN%20PATTERN%20BUILDER/ComputerBuilder.java) : Interface du constructeur
- [`DesktopBuilder.java`](TD4DESIGN%20PATTERN%20BUILDER/DesktopBuilder.java) et [`LaptopBuilder.java`](TD4DESIGN%20PATTERN%20BUILDER/LaptopBuilder.java) : Constructeurs concrets
- [`ComputerDirector.java`](TD4DESIGN%20PATTERN%20BUILDER/ComputerDirector.java) : Gère le processus de construction

---

### 3. TD5 - Patron Strategy : Gestion du Stockage

📁 Dossier : [`TD5DESIGN PATTERN STRATEGY`](TD5DESIGN%20PATTERN%20STRATEGY/)

Cette section applique le patron Strategy à la gestion des dispositifs de stockage.

**Composants :**
- Dispositifs de stockage : [`DisqueDur.java`](TD5DESIGN%20PATTERN%20STRATEGY/DisqueDur.java) et [`SSD.java`](TD5DESIGN%20PATTERN%20STRATEGY/SSD.java)
- Stratégies de gestion :
  - [`StrategieCompression.java`](TD5DESIGN%20PATTERN%20STRATEGY/StrategieCompression.java)
  - [`StrategieSansCompression.java`](TD5DESIGN%20PATTERN%20STRATEGY/StrategieSansCompression.java)
- [`Ordinateur.java`](TD5DESIGN%20PATTERN%20STRATEGY/Ordinateur.java) : Classe contexte qui applique les stratégies
- [`ParcOrdinateurs.java`](TD5DESIGN%20PATTERN%20STRATEGY/ParcOrdinateurs.java) : Gère un ensemble d’ordinateurs

---

## 🔧 Comment Exécuter

Chaque implémentation contient une classe `Main` qui démontre son utilisation. Pour exécuter un exemple :

1. Ouvrir le projet dans votre IDE (comme IntelliJ ou Eclipse)
2. Naviguer jusqu'au fichier `Main.java` dans le dossier concerné
3. Exécuter le fichier `Main.java`

---

## 🧠 Objectif Pédagogique

Ces exemples ont été développés dans un but pédagogique pour illustrer le fonctionnement des design patterns les plus courants utilisés dans la programmation orientée objet avec Java.
