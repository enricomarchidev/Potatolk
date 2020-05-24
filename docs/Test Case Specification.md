# Test case specification
**Prepared by:** [Enrico Marchi](https://github.com/enricomarchidev "Enrico Marchi")



## 1) Introduction

This document provides the test cases to be carried out for the [Potatolk Client Application](https://github.com/enricomarchidev/Potatolk "Potatolk Client Application") based on [PotatoChatProtocol(PCP) specification](https://2020-5ei-team6-trentin.readthedocs.io/en/latest/PCP-Min/ "PCP Specification"). Each item to be tested is represented by an individual test case. Each case details the input and expected outputs.



## 2) Test Cases: Java Application (.jar)

| Test ID | 2.1 |
|--:|---|
| **Title** | Correct sign in |
| **Feature** | Sign in to the general topic chat room with Potatolk application |
| **Objective** | Sign in with valid username and then chat with other users of the room |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username:** mrossi |
| | **Topic(chat room topic):** |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information (in this case we let the field topic empty in order to join the general room, the default one) |
| | 3. Press "Sign In" button |
| **Expected Results** | Application displays Potatolk interface which provides to the user the list of all the online users in the chat room and allows him to send a text message to the chat room |

| Test ID | 2.2 |
|--:|---|
| **Title** | Correct sign in to a specific chat room |
| **Feature** | Sign in to a specific topic chat room with Potatolk application |
| **Objective** | Sign in with valid username and then chat with other users of the room |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username:** mrossi |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| **Expected Results** | Application displays Potatolk interface which provides to the user the list of all the online users in the chat room and allows him to send a text message to the chat room |

| Test ID | 2.3 |
|--:|---|
| **Title** | Username already taken |
| **Feature** | Sign in to a chat room with Potatolk application |
| **Objective** | Sign in with username already taken so the application denies the access |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username(we suppose that mrossi is already signed in):** mrossi |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| **Expected Results** | Application displays an error message and then gives to the user the possibility to sign in with different username |

| Test ID | 2.4 |
|--:|---|
| **Title** | Short username error |
| **Feature** | Sign in to a chat room with Potatolk application |
| **Objective** | Confirm that username field is shorter than 6 characters which isn't allowed by the PCP specification |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username(we suppose that mrossi is already signed in):** user |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| **Expected Results** | Application displays a message dialog error and then gives to the user the possibility to click the button "ok" and sign in with admitted username |

| Test ID | 2.5 |
|--:|---|
| **Title** | Long username error |
| **Feature** | Sign in to a chat room with Potatolk application |
| **Objective** | Confirm that username field is longer than 32 characters which isn't allowed by the PCP specification |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username(we suppose that mrossi is already signed in):** thisUsernameIsTooLongAccordingToThePcpSpecs |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| **Expected Results** | Application displays a message dialog error and then gives to the user the possibility to click the button "ok" and sign in with admitted username |

| Test ID | 2.6 |
|--:|---|
| **Title** | Short topic error |
| **Feature** | Sign in to a chat room with Potatolk application |
| **Objective** | Confirm that topic field is shorter than 3 characters which isn't allowed by the PCP specification |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username(we suppose that mrossi is already signed in):** mrossi |
| | **Topic(chat room topic):** ab |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| **Expected Results** | Application displays a message dialog error and then gives to the user the possibility to click the button "ok" and sign in with admitted topic |

| Test ID | 2.7 |
|--:|---|
| **Title** | Long topic error |
| **Feature** | Sign in to a chat room with Potatolk application |
| **Objective** | Confirm that topic field is longer than 64 characters which isn't allowed by the PCP specification |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username(we suppose that mrossi is already signed in):** mrossi |
| | **Topic(chat room topic):** thisTopicIsTooLongAccordingToThePotatoChatProtocolSpecification__ |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| **Expected Results** | Application displays a message dialog error and then gives to the user the possibility to click the button "ok" and sign in with admitted topic |

| Test ID | 2.8 |
|--:|---|
| **Title** | Show usernames |
| **Feature** | Show chat room usernames of online users |
| **Objective** | Open the chat room list of online users |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username:** mrossi |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| | 4. Click on the side tab at the bottom left |
| **Expected Results** | Application displays pop-up menu of the usernames list on the left side and the user can close it by clicking the side tab at the top left |

| Test ID | 2.9 |
|--:|---|
| **Title** | Open profile view |
| **Feature** | Open profile menu of the logged user |
| **Objective** | Show profile information of the logged user |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username:** mrossi |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| | 4. Click on the profile icon at the bottom left |
| **Expected Results** | Application displays all the profile information of the user |

| Test ID | 2.10 |
|--:|---|
| **Title** | Change username |
| **Feature** | Allows user to change his username |
| **Objective** | Set new username for the user |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username:** mrossi |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| | 4. Click on the profile icon at the bottom left |
| | 5. Click on the button "Change username" |
| | 6. Enter new username in the text field |
| | 7. Click the button "Confirm" |
| **Expected Results** | Application displays Potatolk interface and user will see his username changed |

| Test ID | 2.11 |
|--:|---|
| **Title** | Send a message |
| **Feature** | Allows user send a message in the chat room |
| **Objective** | Send a message to all the users of the chosen chat room |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username:** mrossi |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| | 4. Type a message on the text field |
| | 5. If you want to clear the text field because you write a wrong message click the red button with the icon of a cross or else go to the next step |
| | 6. Click the green button with the icon of a paper airplane to send the message |
| **Expected Results** | Application displays Potatolk interface and user will send his message to the chat room, so after that he can see the text of it on the Potatolk interface preceded by "you:" |

| Test ID | 2.12 |
|--:|---|
| **Title** | Correct logout |
| **Feature** | Allows the user to logout from the chat room |
| **Objective** | User can correctly logout from the chat room and the application |
| **Setup** | Windows PC has Potatolk application ready to run |
| **Test Data** | Sign in example information |
| | **Username:** mrossi |
| | **Topic(chat room topic):** food |
| **Test Actions** | 1. Start Potatolk application by double clicking the file PCPClient.jar |
| | 2. Enter your sign in information |
| | 3. Press "Sign In" button |
| | 4. Use the application as you want |
| | 5. Click on the cross on the top right |
| | 6. To cancel the operation click "No" or "X", to logout click "Yes" |
| **Expected Results** | User logs out and the application will be stopped |