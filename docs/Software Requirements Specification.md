## Software Requirements Specification

**For**  
**Team 3**
**January 1st 2020**
**Version 1**
Prepared by:
Bulai Matteo Alexandru

## 1  Introduction
#### 1.1  Overview and Objectives
Potatolk is a chat application which is based on Java. Our team have developed a client protocol and the GUI of the program. Our first objective was to create something easy to use and really intuitive, so our GUI must have this attributes to be accepted.
The client protocol which will connect to the client server is very simple and easy to understand.

#### 1.2  Definitions
**Potatolk** –  chat application
**Project** –  creation of the client protocol and the GUI to use in an easier way the skills of  the app.
**Client** –  Marconi HighSchool
**User** –  anyone
**Developer** –  TEAM 3.

## 2  General Design Constraints

#### 2.1  Potatolk Application Environment
The Potatolk works in a really easy way. Once you started the app, he will lead you in creating an alias to log in and connect to the server.
Here there should be the functional application schema image, but it is on the pdf version of this document available on our ReadtheDocs.

#### 2.2  User Characteristics
**Potatolk Users**: Actually only 5^EI Students using school computers or their own  computer.

#### 2.3 Mandated Constraints
The application will run on any platform.

## 3 Nonfunctional Requirements

#### 3.1  Operational Requirements
Usability: 99% of users will not need to read the user manual to be able to use the application.

#### 3.2  Performance Requirements
Maintainability: Changes made to the alias can be adopted without altering the application.

#### 3.3  Security Requirements
The application has only the private id one for each user, an id that is stored server side and it is assigned and shared with the user when he register during the login and it prevent the identity spoofing while sending messages.

#### 3.4  Documentation and Training
Potatolk will have a documentation if the user asks for it.

#### 3.5  External Interface

#### 3.5.1 User Interface
The user interface must be appealing and pretty to look at. Once the log in is done there will be a really simple application where you can chat with other users.
The interface will be intuitive.

#### 3.5.2 Software Interface
The Potatolk server protocol will serve as an interface between one client and another.
It will enable interaction between the users.

## 4 Functional Requirements

#### 4.1  Required Features

#### 4.1.1 Use Case: 1

**Description: User Login**

Basic Path:
 1. User inserts an alias and press log in
 2. Here the user can use the application, create other chats or answer the unanswered one.
 3. User can press exit to log out.