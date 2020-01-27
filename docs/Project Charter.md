Document Owner: Enrico Marchi

**Project Title:** # Potatolk (A PotatoChatProtocol client side) 

**Start Date:**  18/10/2019 

**End Date:**  13/12/2019 

**Project Manager:** Enrico Marchi 

**Project Sponsor:**  ITI G. Marconi Verona

**Customer:** Teacher Antonio Sette 

**Users:**  5^EI Students

## Stakeholders and Expectations
Team: Have a working client application that implements all protocol specifications.
Professor Sette: Have a working client application for each team which minimum allows to send and receive messages in a chat room, a server application produced by a single specialized team and both clients and server must implement functionalities according to protocol specifications.

## Purpose (Problem or opportunity addressed by the project)
The purpose of my team project is to produce an application, that we decide to call Potatolk, that allows users to text chat among them by sending specific packets to the server, according to the PotatoChatProtocol standard.
The application will allow the user to login by choosing an username and the topic of the chat room where he want to join, next the user can see all the name of the users who are connected to the same chat room and chat with all user of the topic (group chat) or with a single user (private chat) finally he will finish to chat he logout by using the dedicated menu.
These functionalities will be usable by means of an intuitive and cool graphical interface.

## Goals and Objectives 
The general goal of the project is to create a client that allows students to chat among them by means of an intuitive graphical interface
The app is expected to:
- Provide a login interface that allows the user to connect by typing the username and the topic.
- Provide a main interface where the user can see the list of all users connect to the same chat room and can send and receive chat room and private messages.
- Provide a logout interface that allows the user to disconnect.
- Provide simple and intuitive interfaces.

## Schedule Information (Major milestones and deliverables)
18/10/2019 - Gather requirements and thinking about a protocol  
25/10/2019 - Produce a sort of RFC for the protocol and a client GUI mockup  
31/10/2019 - Started to develop the client using GitHub as VCS  
08/11/2019 - Developed first version of Potatolk GUI (PCPClient)  
15/11/2019 - Developed registration method and login GUI (PCPLogin)  
22/11/2019 - Improved registration method and PCPLogin  
26/11/2019 - Merged Model and GUI branches to master (so we added new features to master)
29/11/2019 - Binded registration method with PCPLogin  
29/11/2019 - Developed logout GUI (PCPLogout)
03/12/2019 - Merged GUI branch to master (so we added new graphic improvements to master)
04/12/2019 - Completed ClientStatus class
04/12/2019 - Developed Connection class
04/12/2019 - GUI improvements
05/12/2019 - Developed graphical UserListPanel
06/12/2019 - Developed packetReceiver and packetInterpreter threads
09/12/2019 - Model and GUI improvements
10/12/2019 - Merged Model and GUI branches to master
11/12/2019 - Last application improvements to master  
13/12/2019 - Product Released

## Financial Information (Cost estimate and budget information)
This is a school project so there isn’t a budget because all team members (students) works free in order to learn how to develop a good software.

## Project Priorities and degrees of freedom
The project end date is fixed because the customer request the software working with minimum functionalities by the 13th of December. Roles are changeable based on workloads of individual team members.  Roles are expected to shift throughout the project as needs arise.
The software must be easy to use and reliable.

## Approach
The highest priority features will be implemented first such as login interface and main interface with the related methods responsible to send packets, receive and process packets according to the protocol.
My teammates and I have experience with Java programming language that we will use to code the entire project. Also, we have little experience in the field of network programming, and we need to learn Java swing that we will use it to make graphical interfaces.

## Constraints
The Model code needs to use the library GSON to convert the JSON list of users sent from the server to Java List in order to use and show the usernames on the GUI; this library is included in the Requirements folder of the project which is the default Netbeans folder for the libraries.
Also the GUI needs to use libraries to do the animation when opening the UserListPanel.

## Assumptions
We assume that in the computer of who want to run this application is installed the Java Running Environment and on the local host, on the same network or on internet there is an active PotatoChatProtocol server of which we know the IP address that can be modified in the Connection Class.

## Success Criteria
The project will be considered a success if (1) the team delivers an operational prototype by December 13 which allows to receive and send messages in a group chat.

## Scope
At the minimum, the software will (1) allow users to receive and send messages in a group chat. Time permitting, the scope could be extended to include all features supported by the server that implements the PotatoChatProtocol.

## Risks and obstacles to success  
A risk the team face is a lack of experience in developing network application.  This lack of experience generates a lot of unknowns. We do not yet have a clear picture of how the code will be implemented. So, there is the possibility that application won’t support all features within 13th of December.

**Signature**

Enrico Marchi  
**Project Manager**

**__________________________________** 
**Project Sponsor**

**__________________________________**  
**Customer**

**__________________________________**  
**Technical Lead**
