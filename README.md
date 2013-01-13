# CSCI 1302 - Game of Life Project (cs1302-life)

This repository contains the skeleton code for the Game of Life project assigned
to the students in Michael E. Cotterell's Spring 2013 CSCI 1302 class at the 
University of Georgia. 

**Please read the entirety of this file before beginning your project.**

## Academic Honesty

You implicitly agree to Academic Honesty policy as outlined in the course 
syllabus and course website (available at: http://cs.uga.edu/~mec/cs1302/).

In accordance with the notice above, I must caution you **not** to fork this
repository on GitHub if you have an account. Doing so will more than likely make
your copy of the project publicly visible. Please follow the instructions 
contained in the Resources section below in order to do your development on
<code>nike</code>.

## Project Description

Your goal is to implement Conway's Game of Life. The Game of Life, also known 
simply as Life, is a cellular automaton devised by the British mathematician 
John Horton Conway in 1970. The "game" is a zero-player game, meaning that its 
evolution is determined by its initial state, requiring no further input. One 
interacts with the Game of Life by creating an initial configuration and 
observing how it evolves. 

This project will also teach you some of the basics of game programming. Even
though Life is a zero-player game, your implementation will involve the central 
component of any game, at least from a programming standpoint: the game loop. 
The game loop allows the game to run smoothly regardless of a user's input or 
lack thereof.

The primary goals of this project are to assess your knowledge of prerequisite
material as well as your ability to compile, test, run and submit assignments on
<code>nike</code>.

## Project Tasks

Before you submit your project, you need to perform the following tasks:

 1. (40 points) Implement <code>Life.java</code>. You will find information
    about the methods in the file itself as well as some more detailed
    information later in this document. 

 5. (10 points) Include inline documentation where appropriate to explain how
    your implementation works.
   
 6. Update the <code>README.md</code> in your project directory (this file) to 
    contain the following information at the top of the file (updating it with 
    your own information:

    ```markdown
    # Project Submission

 Author: YOUR NAME (LAST 3 DIGITS OF 810 NUMBER HERE)

    [If you did any of the extra credit then please indicate that here.]
    ```
        
## Extra Credit Project Tasks

You may earn extra credit for each of the tasks listed below:

 1. (20 points extra credit) 

## Game of Life



## Resources

The files for this project are hosted Github using <code>git</code>. They can be
retrieved by cloning the repository found at <code>git@github.com:mepcotterell-cs1302/cs1302-life.git</code>. 
For example, you can issue the following command to clone the repository:

    $ git clone git@github.com:mepcotterell-cs1302/cs1302-life.git LastName-FirstName-p1

As always, I suggest developing directly on <code>nike.cs.uga.edu</code> because
this is where your project will be run and tested. Since <code>git</code> is 
already installed on <code>nike</code>, you can clone the project directly into 
your <code>nike</code> home directory using the command provided above.

If any changes are made to the project description or skeleton code, they will
be announced in class. In order to incorporate such changes into your code, you 
need only do a <code>git pull</code>.

Also, since <code>git</code> is a decentralized version control system, you will
have your own local copy of the repository. This means that you can log your 
changes using commits and even revert to a previous revision if necessary.

## Directory Structure and Packages

All of the non-test classes for this project should be contained in the <code>src/main/java/</code>
directory. These classes are in the default package.

## Method Summary

Below is the list of methods you will need to implement in order to complete
this project.

## Build System

For this project, we will be using the Simple Build System (sbt). If you clone 
the project from the GitHub repository then everything will be setup for you. In 
order to compile your project, you can use the following command:

    $ ./sbt compile

To run your project, use the following command:

    $ ./sbt run

In order to clean your project (remove compiled code), use the following command:

    $ ./sbt clean

## Submission Instructions

You will still be submitting your project via <code>nike</code>. Make sure your 
work is on <code>nike.cs.uga.edu</code> in a directory called 
<code>LastName-FirstName-p1</code>, and, from within the parent directory, 
execute the following command:

    $ submit LastName_FirstName-p1 cs1302b

It is also a good idea to email a copy to yourself. To do this, simply execute 
the following command, replacing the email address with your email address:

    $ tar zcvf LastName-FirstName-p1.tar.gz LastName-FirstName-p1
    $ mutt -s "[cs1302] p1" -a LastName-FirstName-p1.tar.gz -- your@email.com < /dev/null

## Questions

If you have any questions, please email them to Michael E. Cotterell at 
<code>mepcotterell+1302@gmail.com</code>

## Frequently Asked Questions

 1. What do I do if the <code>sbt</code> command does not execute?

    You probably need to make the file executable. To do this, simply make sure 
    you are in the same directory as <code>sbt</code> and issue the following
    command:

        $ chmod +x sbt

    This command updates the permissions on the file, making it executable for the
    current user.

 2. I created a <code>Driver</code> class (a class with a <code>main</code> method), 
    but <code>sbt</code> won't run it when I execute <code>sbt run</code>. How do I
    fix that?

    You should be able to fix the problem by executing the following command:

        $ sbt clean

 3. None of these questions are even close to the question I have. What should I
    do?

    You should email your question to Michael E. Cotterell at 
    <code>mepcotterell+1302@gmail.com</code>

