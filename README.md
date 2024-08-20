# Application de Gestion d'Achat en Ligne / Online Purchase Management Application

## Description

Ce projet est une application de gestion d'achat en ligne développée dans le cadre du projet de fin d'études pour l'année académique 2022-2023 à l'École Nationale des Sciences Appliquées (ENSA) de Tanger. L'application permet aux utilisateurs d'acheter des produits en ligne, de gérer leurs commandes, et offre une interface pour les administrateurs afin de gérer les produits, les commandes et les utilisateurs.

This project is an online purchase management application developed as a final year project for the 2022-2023 academic year at the École Nationale des Sciences Appliquées (ENSA) of Tangier. The application allows users to purchase products online, manage their orders, and provides an interface for administrators to manage products, orders, and users.

## Table des Matières / Table of Contents

- [Remerciements / Acknowledgments](#remerciements--acknowledgments)
- [Introduction](#introduction)
- [Cahier des Charges / Requirements Specification](#cahier-des-charges--requirements-specification)
  - [Partie Utilisateur / User Side](#partie-utilisateur--user-side)
  - [Partie Administrateur / Administrator Side](#partie-administrateur--administrator-side)
- [Conception et Analyse du Projet / Project Design and Analysis](#conception-et-analyse-du-projet--project-design-and-analysis)
  - [Analyse / Analysis](#analyse--analysis)
  - [Cas d'Utilisation : Passer une Commande / Use Case: Place an Order](#cas-dutilisation--passer-une-commande--use-case-place-an-order)
  - [Diagramme de Séquence : Passer une Commande / Sequence Diagram: Place an Order](#diagramme-de-séquence--passer-une-commande--sequence-diagram-place-an-order)
- [Conception Architecturale / Architectural Design](#conception-architecturale--architectural-design)
  - [Architecture Logique / Logical Architecture](#architecture-logique--logical-architecture)
  - [Architecture Physique / Physical Architecture](#architecture-physique--physical-architecture)
- [Conception de la Base de Données / Database Design](#conception-de-la-base-de-données--database-design)
  - [Entités Principales / Main Entities](#entités-principales--main-entities)
  - [Relations / Relationships](#relations--relationships)
- [Réalisation / Implementation](#réalisation--implementation)
  - [Environnement Logiciel / Software Environment](#environnement-logiciel--software-environment)
  - [Outils de Développement Utilisés / Development Tools Used](#outils-de-développement-utilisés--development-tools-used)
  - [Structure du Projet / Project Structure](#structure-du-projet--project-structure)
- [Interface du Site Web / Website Interface](#interface-du-site-web--website-interface)
- [Conclusion](#conclusion)

## Remerciements / Acknowledgments

Nous tenons à exprimer notre sincère gratitude envers nos enseignants de la formation DCA Génie Informatique à l'ENSA de Tanger pour leur soutien tout au long de l'année. Un grand merci également à nos camarades de classe pour leur collaboration et leur esprit d'équipe.

We would like to express our sincere gratitude to our teachers from the DCA Computer Engineering program at ENSA Tangier for their support throughout the year. A big thank you also to our classmates for their collaboration and team spirit.

## Introduction

Ce rapport présente le développement d'une application de gestion d'achat en ligne. Il couvre les étapes de conception, développement, et réalisation de l'application, mettant en lumière les défis rencontrés, les solutions apportées, ainsi que les technologies et méthodologies utilisées.

This report presents the development of an online purchase management application. It covers the design, development, and implementation phases of the application, highlighting the challenges encountered, solutions provided, and the technologies and methodologies used.

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

1. **Analyse des Besoins / Needs Analysis**
2. **Spécifications Fonctionnelles / Functional Specifications**
3. **Conception de la Base de Données / Database Design**
4. **Architecture Logicielle / Software Architecture**
5. **Conception de l'Interface Utilisateur (UI) / User Interface (UI) Design**
6. **Sécurité / Security**
7. **Plan de Test / Testing Plan**

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
- **Dossiers de
