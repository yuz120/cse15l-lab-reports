# Week 8 Lab Report 4
    Yuyang Zhou
    2022.05.22


## Part 1 Tests for the markdownParse for review
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
* The third tester
![image](snippet3T.jpeg)

* Snippet 1 : expect to be no links
    *  Because there are backsticks in between brackets and parenthesis on each lines, also there is an extra opening bracket on line 3 and an extra closing bracket on line 4. 
* Snippet 2: expect three links
*  "a.com","a.com(())", "example.com"
    * The nested link has complete markdown structure on line 1
    * On line 2, although a.com(())is not an actual link, the structure is correct (with a pair of brackets and a pair of parenthesis)
    * on line 3, the example.com is a valid link also because the structure is complete.
* Snippet 3: expect three links.
* "https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/"   

    * Although there are line breaks in between the brackets and extra long sentences, the structure of a pair of brackets and a pair of parenthesis is complete. Thus, I think the three links are all valid and should be printed out.


* As I run the testers, at first, the paths are not found. It is because I used the VSCode play button to run the tests.
* Then I used the terminal to run the tests.
![image](reviewfailure.jpeg)
### Why they did not pass the tests? (The bugs)

* For snippet 1:
    * The markdownParse under review does not check if backsticks exist in between the brackets.
    * It does not check the extra opening bracket in between the brackets.
    * As long as there is a pair of brackets and a pair of parenthesis, the links will be detected, including the invalid links.

## Part 2 Tests for markdownParse in my repository.
* [The link to the repository](https://github.com/yuz120/markdown-parser.git)
* The testers are the same as those in Part 1. 
* All the testers for snippets did not pass.
![image]()


