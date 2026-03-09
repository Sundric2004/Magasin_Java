# 🧼 Station de Lavage - Gestionnaire de Rendez-vous

Ce projet a été réalisé dans le cadre du module de **Conception et Programmation Objet** (Année 2025/2026) à l'**EFREI**. Il s'agit d'une application console permettant de gérer les activités d'une station de nettoyage manuel de véhicules.

---

## 🚀 Fonctionnalités principales

L'application permet de piloter l'ensemble de l'activité de la station :

* **👥 Gestion des Clients** : Création de fiches clients identifiés par un numéro, avec nom, téléphone et adresse électronique optionnelle. Les clients sont automatiquement triés par ordre lexicographique.
* **📅 Planning de Rendez-vous** : Gestion des créneaux toutes les demi-heures sur 7 jours. L'établissement est ouvert de 10h à 18h tous les jours sauf le lundi.
* **✨ Types de Prestations** :
    * **Express** : Lavage et séchage, avec option pour nettoyer l'intérieur du véhicule.
    * **Véhicule Sale** : Ajoute une phase de prélavage et inclut systématiquement le nettoyage intérieur.
    * **Véhicule Très Sale** : Identique au mode "Sale" mais avec des phases de prélavage et lavage adaptées au type de salissure (boue, nourriture, etc.).
* **💾 Persistance des données** : Sauvegarde et chargement automatique des clients et du planning via des fichiers texte respectant un formatage strict.

---

## 🛠 Architecture Technique

Le projet respecte les concepts de la programmation orientée objet :

* **Hiérarchie de classes** : Utilisation de l'héritage pour les prestations (`Prestation` -> `PrestationExpress`, `PrestationSale`, `PrestationTresSale`).
* **Gestion des dates** : Utilisation des API Java `LocalDate`, `LocalTime` et `LocalDateTime` pour les créneaux.
* **Flux I/O** : Utilisation de `FileWriter` et `BufferedReader` pour la gestion des fichiers.

---

## 💰 Grille Tarifaire

Le prix total est la somme des phases effectuées. Il varie selon la catégorie du véhicule : **A** (Citadines), **B** (Berlines), **C** (Monospaces et 4x4).

| Phase | Prix Base (Cat. A) | Majoration Cat. B | Majoration Cat. C |
| :--- | :--- | :--- | :--- |
| **Lavage** | 20 € | +50% | +75% |
| **Séchage** | 10 € | +5% | +10% |
| **Prélavage** | 5 € | +50% | +75% |
| **Intérieur** | 30 € (A/B) | - | 40 € (C) |

*(Des surcoûts s'appliquent pour les véhicules très sales selon le produit utilisé).*

---

## 📂 Format de Sauvegarde

Les fichiers texte suivent une structure stricte (sans ligne vide):

* **`clients.txt`** : `numéro: nom: téléphone: [email optionnel]`.
* **`rdv.txt`** : Stocke la date (`yyyy-MM-ddThh:mm`), le numéro client, la catégorie, les options de nettoyage/salissure et le prix final.

---

## 💻 Installation & Lancement

1. Clonez ce dépôt sur votre machine.
2. Ouvrez le projet dans votre IDE (ex: NetBeans en mode console).
3. Compilez et lancez la classe principale.
4. Utilisez le menu interactif pour naviguer dans l'application.

---
