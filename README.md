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

Since we have not learned how to make cool graphical user interfaces in Swing
yet, letting the game of life run in the console might look a little funny. In
order to make sure that everything looks neat and runs correctly, the game will
be paused after each generation (or tick), explained below.

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

 1. (40 points) Implement <code>Life.java</code>. You will find more information
    about the methods in the file (including a point breakdown) later in this 
    document in the section called "Method Summary".

 5. (10 points) Include inline documentation where appropriate to explain how
    your implementation works. Also make sure your source code is neat and
    properly indented. The grader needs to be able to read your code.
   
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

 1. (10 points extra credit) Use ANSI escape codes to make live cells appear bright green
    on the screen.

## Game of Life

![Game of Life](http://upload.wikimedia.org/wikipedia/commons/e/e5/Gospers_glider_gun.gif)

The universe of the Game of Life is an infinite two-dimensional orthogonal grid 
of square cells, each of which is in one of two possible states, alive or dead. 
In this project, the two-dimensional grid will be implemented using a
two-dimensional boolean array. A value of <code>true</code> in the array denotes
that the cell at that coordinate in the grid is alive. Similarly, a value of 
<code>falsee</code> in the array denotes that the cell at that coordinate in the
grid is dead. 


Every cell or array coordinate interacts with its
eight neighbours, which are the cells that are horizontally, vertically, or 
diagonally adjacent. 

At each step in time, certain rules are applied to the cells. These rules are
explained in a later section.

The initial pattern constitutes the seed of the system. The first generation is 
created by applying the above rules simultaneously to every cell in the seed.
Note that births and deaths occur simultaneously. The discrete moment at which 
this happens is sometimes called a tick (in other words, each generation is a 
pure function of the preceding one). The rules continue to be applied repeatedly 
to create further generations.

One of the trickiest parts of implementing the Game of Life is making sure that
you can consistently access all eight neighbors for each cell, especially those
neighbors that exist outside the bounds of the grid array. Programmers have used
several strategies to address this problem. Tehe simplest strategy is simply to
assume that every cell outside the array is dead because this is easy to
program. However, it leads to inaccurate results when the active area crosses 
the boundary. A more sophisticated trick (**and the one that you are expected to
use**) is to consider the left and right edges of the grid to be stitched 
together, and the top and bottom edges also, yielding what is sometimes referred
to as a toroidal array. The result is that active areas that move across a grid
edge reappear at the opposite edge. 

## Seed Files

This implementation of Conway's Game of Life will use seed files to initially
populate the grid. The format of a seed file is specified below (each point
corresponds to a line in the file):

 1. The first line denotes whether or not the game is _random_ or 
    _set_.  

 2. The second line denotes the width and height of the grid, separated by a
    whitespace.  

 3. The third line dentoes how many cells to make alive in the initial 
    population.  

 4. If the first line is _set_, then all subsequent lines represent a row and 
    column (separated by whitespace) of a cell to make alive in the initial 
    population.  

Here is an example of a _random_ seed file with a grid size of 340 rows and 480
columns. The number of random cells to make alive in the initial population is 
10.

```
random
340 480
10
```

You can run the game using the above seed file by using the following command:

    $ ./sbt "run Driver seeds/seed2.txt"

Here is an example of a _set_ seed file with a grid size of 340 rows and 480
columns. In this example, three cells are made alive in the initial population
(i.e., the cells at positions <code>0, 0</code>, <code>10, 10</code> and 
<code>14, 125</code> are alive). Index positions are based on standard array
indices where the first element is indexed at 0.

```
set
340 480
3
0 0
10 10
14 125
```

You can run the game using the above seed file by using the following command:

    $ ./sbt "run Driver seeds/seed1.txt"

As you can imagine, you can create your own seed files and place them in the 
<code>seeds</code> directory. In order to run a game using your seed file, you
can use the following command:

    $ ./sbt "run Driver seeds/seedFile"

All of the code for file IO is already implemented within 
<code>Driver.java</code>. This code, for the most part, assumes that the seed
file is correctly formatted.

## Resources

The files for this project are hosted Github using <code>git</code>. They can be
retrieved by cloning the repository found at <code>git://github.com/mepcotterell-cs1302/cs1302-life.git</code>. 
For example, you can issue the following command to clone the repository:

    $ git clone git://github.com/mepcotterell-cs1302/cs1302-life.git LastName-FirstName-p1

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

All of the non-test classes for this project should be contained in the 
<code>src/main/java/</code> directory. These classes are in the default package.

## Method Summary

Below is the list of methods you will need to implement in order to complete
this project. 

**Note**: You may need to create other methods not listed below in order to
complete this project and/or make things easier for you. 

 1. (5 points) The constructor <code>Life(int rows, int cols)</code>: This 
    method constructs the Game of Life using with a grid of the specified size. 
    In this method,
    you will need to set the instance variables for <code>rows</code> and 
    <code>cols</code> appropriately. Remember that when a method parameter and
    an instance variable use the same literal for their name, you need to access
    the instance variable using the <code>this</code> keyword. You will also 
    need to create the 2-dimensional boolean array that will be used for the 
    grid (at the appropriate size) and assign it to the <code>grid</code>
    instance variable.  

 2. (5 points) <code>void display()</code>: Displays the grid. More information 
    about displaying the grid is included in a section below.  
 
 3. (10 points) <code>void prompt()</code>: Prompts the user for input. The user 
    should be presented with the option to either continue to the next 
    generation or quit the game. More information on the prompt is included in a
    section below.  
 
 4. (10 points) <code>void update()</code>: Update the grid according to the 
    rules of the Game of Life. 
    In this method, you will need to create a new two-dimensional
    boolean array (for the grid at the next time step/tick) that is the same
    size as the existing grid. Then, you will examine every cell in the existing
    grid and apply the following rules:

     1. If a cell in the existing grid is alive and has fewer than two 
        neighbours that are alive, then it should be set to dead in the new 
        grid. We call this under-population. 

     2. If a cell in the existing grid is alive and has two or three neighbours 
        that are alive, then it should be set to alive in the new grid.

     3. If a cell in the existing grid is alive and has more than three 
        neighbours that are alive, then it should be set to dead in the new 
        grid. We call this overcrowding.

     4. If a cell in the existing grid is dead and has exactly three neighbours
        that are alive, then it should be set to alive in the new grid. We call 
        this reproduction.

    After every cell has been examined and the new grid is populated, you need
    to set the value of the existing grid instance variable to the newly created
    array.  

 5. (10 points) <code>void init(int numCells)</code>: Generates the initial 
    population randomly. 
    In this method, you will need to randomly make a cell in the grid alive as 
    many times as is indicated by the <code>numCells</code> parameter</code>. 
    Take special care that you do not assign <code>true</code> to the same 
    location twice as that will result in fewer cells than intended being made 
    alive.

### Note about Other Methods

Although there are other methods already implemented (for convenience), you may
find it extremely useful to modify the <code>boolean getCell(int row, int col)</code>
and <code>boolean setCell(int row, int col, boolean alive)</code> methods in
order to make your algorithm in the <code>void update()</code> easier to
implement.

### Displaying the Grid

The grid should be displayed in a consistent manner. The border of the grid
should be denoted by asterisks (*) and cells in the grid that are alive should
be denoted by plus signs (+). Cells which are dead are to denoted by whitespace. 

Here is an example of a grid with 10 rows and 10 columns.

```
**********************
*++                  *
*                    *
*                    *
*     +              *
*      +             *
*                    *
*                    *
*                    *
*                    *
*                    *
**********************
```

In the example above, cells with grid coordinates <code>0,0</code>, <code>0, 1</code>,
<code>3, 5</code>, and <code>4, 6</code> are alive. Note that <code>0,0</code> 
is located in the upper left-hand side of the grid.

### The Prompt

The prompt should look like this:

```
(c)ontinue or (q)uit: 
```

There should be a whitespace included after the colon (:) and user input should
be read on the __same line__ as the prompt. User input can be broken down into 
three scenarios:

 * The user enters in "c": In this scenario, you can simply do nothing and let 
   the game loop continue.

 * The user enters in "q": In this scenario, you must exit the game. This can be
   done quie easily (since the game loop logic is implemented <code>Driver.java</code>)
   by setting the instance variable <code>running</code> to <code>false</code>.

 * The user enters in something that is not "c" or "q": In this scenario, the
   following message should be displayed and the user should be re-prompted for
   input:

   ```
   Incorrect input. Please try again.
   ```

The basic logic for the prompt can be done recursively or iteratively using a
while loop. I suggest you take the iterative approach as we have not covered
recursion yet.

### Random Numbers

You can use the [<code>java.util.Random</code>](http://docs.oracle.com/javase/6/docs/api/java/util/Random.html)
class to generate random numbers. You will probably need to use an import 
statement in order to make the class available for use. Alternatively, you may 
find the static method [<code>Math.random()</code>](http://docs.oracle.com/javase/6/docs/api/java/lang/Math.html#random()) 
simpler to use.

## Build System

For this project, we will be using the [Simple Build System (sbt)](http://www.scala-sbt.org/). 
If you clone the project from the GitHub repository then everything you need 
in order to compile and run your project on <code>nike</code> is already included. 
In order to compile your project, you can use the following command:

    $ ./sbt compile

To run your project, use the following command:

    $ ./sbt "run Driver seeds/seedFile"

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

