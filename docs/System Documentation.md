# System Documentation
# Team 3
April 2, 2020


## Team Members
Marchi Enrico
Gaole Elia
Bulai Matteo
Emiliani Jennyfer
Grippi Giulio


## Contents
Introduction
Revision History
Interface appearance 
Functional programming part
Programming and realization of graphic aspect

# Introduction

The proposed software allows the user to create a chat with other users in a public context, such as a school or a company.
The application has an intuitive interface and a dark theme to facilitate its use.

# Revision History

Version : 1.0
Date :  12 November 2019
Name : Marchi Enrico, Gaole Elia, Bulai Matteo, Emiliani Jennyfer, Grippi Giulio
Description: First draft version, containing the essentials for the operations, without a graphic aspect

Version : 2.0
Date :  8 December 2019
Name : Marchi Enrico, Gaole Elia, Bulai Matteo, Emiliani Jennyfer, Grippi Giulio
Description: Introduced the graphic aspect. Introduced a dark theme for ease of use




# Interface Appearance
The graphic aspect is based on an interface initially implemented using a gray theme, and quite light, subsequently modernized and redesigned with a dark theme that can make the application easier to use. We initially have a window showing the access, so then login part. Once done, you can click on "login" button to access the main screen. On on the left it contains the contacts with which you intend to chat, and at the bottom: the chatting interface, flanked by the green "send" button. 






# Functional programming part


 The code is sufficiently organized. the programming part was clearly separated from the graphical one with the use of different classes. The classes are connected through Liesteners who, (as soon as they receive the command from the external user), respond with actions. 
The programming part also contains all the code sections necessary for the conservation of the chats that haave been carried out until a certan moment.
The application is divided into the following classes made in java. 
1. Messages 
2. Client Status 
3. Control Messages 
2. PacketReceiver 
3. PacketInterpreter 
4. Message 
5. Connection 
6. Group
 


# Programming and realization of graphic aspect
This section is focused on HOW graphic inferences were made. Everything is based on avoiding the use of the predefined Windows buttons, and therefore on the total recreation of a new interface, for this reason, all the buttons and graphic bodies have been completely recreated by the team, in particular Gaole Elia and Grippi Giulio as an assistant, who mainly created the graphic aspect.
All entities through which the user can interact with the graphical interface have therefore been implemented. Everything is based on an arrangement of buttons that lead to different windows. But not only that, in addition to the windows, dynamic drop-down menus have been implemented, which therefore they stay on the main page (or window)
