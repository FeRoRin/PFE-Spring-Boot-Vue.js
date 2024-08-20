# Application de Gestion d'Achat en Ligne / Online Purchase Management Application

## Description

Ce projet est une application de gestion d'achat en ligne. L'application permet aux utilisateurs d'acheter des produits en ligne, de gérer leurs commandes, et offre une interface pour les administrateurs afin de gérer les produits, les commandes et les utilisateurs.

This project is an online purchase management application. The application allows users to purchase products online, manage their orders, and provides an interface for administrators to manage products, orders, and users.

## Cahier des Charges / Requirements Specification

### Partie Utilisateur / User Side

1. **Inscription et Connexion / Registration and Login**
   - Formulaire d'inscription avec vérification d'email / Registration form with email verification.
   - Connexion sécurisée avec mot de passe / Secure login with password.
2. **Profil Utilisateur / User Profile**
   - Mise à jour des informations personnelles / Update personal information.
   - Historique des commandes / Order history.
3. **Recherche de Produits / Product Search**
   - Barre de recherche avec filtres / Search bar with filters.
4. **Catalogue de Produits / Product Catalog**
   - Affichage des produits avec descriptions et prix / Display products with descriptions and prices.
5. **Panier d'Achat / Shopping Cart**
   - Ajout, modification, et calcul du montant total des produits / Add, modify, and calculate the total amount of products.
6. **Passer Commande / Place an Order**
   - Processus de commande en plusieurs étapes / Multi-step order process.

### Partie Administrateur / Administrator Side

1. **Tableau de Bord / Dashboard**
   - Vue d'ensemble des ventes, des commandes, et des produits populaires / Overview of sales, orders, and popular products.
2. **Gestion des Produits / Product Management**
   - Ajout, modification, et suppression de produits / Add, modify, and delete products.
3. **Gestion des Commandes / Order Management**
   - Traitement et suivi des commandes / Processing and tracking orders.
4. **Gestion des Utilisateurs / User Management**
   - Gestion des comptes utilisateur / Manage user accounts.
5. **Statistiques et Rapports / Statistics and Reports**
   - Génération de rapports divers / Generate various reports.
6. **Support Client / Customer Support**
   - Réponses aux demandes d'assistance / Respond to support requests.
7. **Système de Paiement / Payment System**
   - Intégration de passerelles de paiement sécurisées / Integration of secure payment gateways.
8. **Sécurité et Protection des Données / Security and Data Protection**
   - Sécurisation des données et des transactions / Securing data and transactions.
9. **Gestion des Promotions / Promotion Management**
   - Ajout de codes de réduction et d'offres spéciales / Add discount codes and special offers.
10. **Système de Gestion des Retours / Return Management System**
    - Gestion des demandes de retour et de remboursement / Manage return and refund requests.

## Conception et Analyse du Projet / Project Design and Analysis

### Analyse / Analysis

- **Analyse des Besoins / Needs Analysis**
- **Spécifications Fonctionnelles / Functional Specifications**
- **Conception de la Base de Données / Database Design**
- **Architecture Logicielle / Software Architecture**
- **Conception de l'Interface Utilisateur (UI) / User Interface (UI) Design**
- **Sécurité / Security**
- **Plan de Test / Testing Plan**

### Cas d'Utilisation : Passer une Commande / Use Case: Place an Order

- **Acteurs / Actors** : Utilisateur (Client), Système / User (Customer), System
- **Flux Principal / Main Flow** : Connexion, affichage des produits, ajout au panier, vérification et confirmation de la commande / Login, display products, add to cart, review and confirm order.

### Diagramme de Séquence : Passer une Commande / Sequence Diagram: Place an Order

- **Acteurs / Actors** : Utilisateur (Client), Système / User (Customer), System

## Conception Architecturale / Architectural Design

### Architecture Logique / Logical Architecture

- **Modèle-Vue-Contrôleur (MVC)**
- **Couche de Service / Service Layer**
- **Base de Données / Database**
- **Sécurité / Security**

### Architecture Physique / Physical Architecture

- **Serveurs / Servers**
- **Réseaux / Networks**
- **Systèmes d'Exploitation / Operating Systems**
- **Redondance et Évolutivité / Redundancy and Scalability**
- **Sécurité Matérielle / Hardware Security**
- **Plan de Sauvegarde et de Récupération / Backup and Recovery Plan**

## Conception de la Base de Données / Database Design

### Entités Principales / Main Entities

- **Client / Customer**
- **Commande / Order**
- **Produit / Product**
- **Fournisseur / Supplier**
- **Ligne_facture / Invoice Line**

### Relations / Relationships

- Relation un-à-plusieurs entre Client et Commande / One-to-many relationship between Customer and Order.
- Relation plusieurs-à-plusieurs entre Commande et Produit / Many-to-many relationship between Order and Product.
- Relation un-à-plusieurs entre Fournisseur et Produit / One-to-many relationship between Supplier and Product.

## Réalisation / Implementation

### Environnement Logiciel / Software Environment

- **Analyse SI v0.80**
- **Lucidchart**
- **Wrike**
- **Google Meet**
- **Git**

### Outils de Développement Utilisés / Development Tools Used

- **Spring Boot**
- **Vue.js**
- **MySQL**

### Structure du Projet / Project Structure

- **Dossiers principaux / Main Folders** : `src/main/java`, `src/main/resources`
- **Dossiers Java / Java Packages** : `com.votrepackage.application`, `controller`, `service`, `repository`
- **Classe principale / Main Class**
- **Dossiers de ressources / Resources Folders**
- **Tests**
- **Dossiers de documentation (optionnels) / Documentation Folders (optional)**
- **Dossiers de configuration (optionnels) / Configuration Folders (optional)**

## Interface du Site Web / Website Interface

- **Le Logo / Logo**
- **Quelques Interfaces de l'Application / Some Application Interfaces**
  - Page d'accueil / Homepage
  - Interface d'authentification / Authentication Interface
  - Page d'inscription / Registration Page
  - Liste des produits et commandes / Product and Order List

## Conclusion

Ce projet nous a permis de mettre en pratique nos compétences en SQL, Vue.js, et Spring Boot, et d'améliorer notre travail en équipe. Nous avons développé une application de gestion d'achat en ligne fonctionnelle et avons appris de nouvelles techniques et fonctionnalités au cours de ce projet.

This project allowed us to put into practice our skills in SQL, Vue.js, and Spring Boot, and improve our teamwork. We have developed a functional online purchase management application and learned new techniques and features throughout this project.
