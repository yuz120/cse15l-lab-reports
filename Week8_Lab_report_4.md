## Week 8 Lab Report 4
    Yuyang Zhou
    2022.05.22


### Part 1 Tests for the markdownParse for review
* [The link to the repository](https://github.com/jina-leemon/markdown-parser.git)

* I added three test files and three testers in MarkdownParseTest.java according to the snippets.
* Snippet 1
![image](snippet1.jpeg)
* Snippet 2
![image](snippet2.jpeg)
* Snippet 3
![image](snippet3.jpeg)

* The first and second testers
![image](st12.jpeg)
* Snippet 1 : expect to be no links

* Snippet 2: expect three links
*  "a.com","a.com(())", "example.com"
* The third tester
![image](snippet3T.jpeg)
* Snippet 3: expect three links.
* "https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/"

* As I run the testers, at first, the paths are not found. It is because I used the VSCode play button to run the tests.
* Then I used the terminal to run the tests.
![image](reviewfailure.jpeg)

### Part 2 Tests for markdownParse in my repository.
* [The link to the repository](https://github.com/yuz120/markdown-parser.git)
* The testers are the same as those in Part 1. 
* All the testers for snippets did not pass.


