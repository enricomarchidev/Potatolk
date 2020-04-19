# Test Plan
**Project Name:** Potatolk

**Team:** 3 

**Prepared by:** [Enrico Marchi](https://github.com/enricomarchidev "Enrico Marchi")

## Introduction
This document outlines the test plan for the [Potatolk Client Application](https://github.com/enricomarchidev/Potatolk "Potatolk Client Application").
The testing activities discussed in this document will verify that the software for the Potatolk meets the needs of the user to send messages to the others using a GUI intuitive, simple to navigate and beautiful to the eye.

## Items Tested
Items that will be tested during the testing phase as laid out by the [Test Case Specification document](https://2020-5ei-team3-marchi.readthedocs.io/en/latest/Test%20Case%20Specification/ "Test Case Specification").

## Approach
The overall method to this testing procedure is manual system testing. Each test
case created will have a direct link to the requirements as laid out in the
[Software Requirements Specification](https://2020-5ei-team3-marchi.readthedocs.io/en/latest/Software%20Requirements%20Specification/ "Software Requirements Specification"). Test cases that include similar Feature methods will
be tested together. Examples of these features include sign in to the default room, sign in to a specific room, send messages between users, logout from the chat room and the application.
In the test cases there are also all the mechanisms used by the software to detect errors related to the usage of the application, for example when the user sign in by entering a non admitted username or topic according to the [PotatoChatProtocol(PCP) specification](https://2020-5ei-team6-trentin.readthedocs.io/en/latest/PCP-Min/ "PCP Specification")
Manual system testing will continue throughout for each iteration, both old and newly implemented features will be tested. Adding new features or functionality can sometimes interfere with the functionality of old features and to ensure product/project success, all features implemented should function as intended throughout the life of the software.

## Item Pass/Fail Criteria
The minimum requirements for this software system were laid out in the
[Software Requirements Specification](https://2020-5ei-team3-marchi.readthedocs.io/en/latest/Software%20Requirements%20Specification/ "Software Requirements Specification") and in the [Project Charter](https://2020-5ei-team3-marchi.readthedocs.io/en/latest/Project%20Charter/ "Project Charter") outlined what the creators of the software considered project success.
Implemented features that meet the requirements as determined by the
customer, meaning the feature does what the user wants it to do with very little
difficulty, passes the testing procedure. Difficulty, as used here, is determined by user comprehension and user ability to use the feature with little to no training.
Features that contain major defects will fail the testing procedure and will be
documented via an incident report and turned over to the developer for
investigation and revision.

## Test Deliverables
In addition to the Test Plan, other test deliverables include the [Test Case Specification document](https://2020-5ei-team3-marchi.readthedocs.io/en/latest/Test%20Case%20Specification/ "Test Case Specification") which outlines the specific test cases and expected results of each test, and Test reports which is comprised of Incidents, Defects and Changes.