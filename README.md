This is the readme file for tutor-int-task. 

This repo is a coding exercise for building logic to grade respondents of a questionnaire, and produce a result. 

I have used Java 17 and Maven to complete the task and JUnit as a testing tool. This repo should be runnable with no configuration required. 

Requirements/ACs:

- To generate and return a request for a given id (as I have defined it) with a record of the original submission
- To keep a score, and to add to the sum of points for each multiple choice question, as defined in the task instructions.
- To add to the sum of points for each single choice question, as defined in the task instructions.
- Given both questions are answered then then the score should be the sum of their points

On input of the application and data modelling: 

I have assumed that the input may be JSON from a REST Api so have modelled what that could look like however the JSON are not currently used in the logic of the application. 
They are there as 'example data' for my own use, and to inform my POJOs and architecture. 
