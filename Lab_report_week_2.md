## **Week 2 Lab Report**
                            Yuyang Zhou
                            April 10, 2022
#
### *Part 1*
### Install Visual Studio Code
* Go to website [Visual Studio Code](https://code.visualstudio.com/)
* Download the app and open it

 ![image](Visual_Studio_Code.png)
 * This is the first page when opening Visual Studio Code for the first time.

### *Part 2*
### Remotely Connecting
* Check the CSE15L account on [website](https://sdacs.ucsd.edu/~icc/index.php). 
* It looks like this.
![image](Remote_Connect_Accout_Lookup.png)
* Look at the "Additional Accounts".
* Your account name should be $ ssh cs15lsp22zz@ieng6.ucsd.edu, with "zz" replaced by your own letters.
* Open the terminal in Visual Studio Code. Type the command 
        $ ssh cs15lsp22zz@ieng6.ucsd.edu
After that, the terminal should look like this:
![image](Remotely_Connect.png)
* Now, the computer(the client) is successfully connected to the server.

### *Part 3*
### Trying Some Command
* Run some commands by yourself. Compare the output using commands with and without ssh.
    * cd 
    * cd ~
    * ls -lat
    * ls -a
    * pwd
    * cp
    * ...
Without ssp:
![image](Try_Command.png)
With ssp:
![image](Try_Command2.png)
There is the errors of no access to the files, because you need to type "$ssh" instead of "ssh".
Let's try again.
![image](SSH.png)
This time the commands work.

### *Part 4*
### Moving Files with scp
* Copy a file from your computer to a remote computer.
* Using the command "scp"
* Create a file called WhereAmI.java, and put contents as the picture shows:
![image]()


### *Part 5*
### Setting an SSH Key

### *Part 6*
### Optimizing Remote Running
