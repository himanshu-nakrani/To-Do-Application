# **Project Title:**  To-Do Application

In this project I created a command line app in java to store a list of tasks. 

## **Implementation:**
Here I used ArrayList available in the java collection framework to store the task. I used arrayList because ArrayList maintains insertion order and its size can be dynamic. Here I used generic version of ArrayList, so it can store only one type of data i.e. String.  And then its  methods are used for various operations. 


### **Class:**

One Main class

### **Methods:**

**menu():** this method is used to show the list of available options to the user and take an input for further processing. Also , Try & catch block is used for exception handling if a user enters anything which is not an integer. 

**showList():** this method is used to show the list of tasks to the user. List is printed by iterating over it and printing every string element available at that index position.

**addItem():** this method is used to add a task. add() method of arraylist will add elements at the end of the list.

**removeItem()**: this method is used to remove any task from the list specified by the user. It will use remove() method and delete elements at the particular index given by the user. 

**totalTasks():** it is used to display the number of tasks in the list. It will show the number of elements available in the list using the size() method of arraylist class.

**editTasks():** this method is used to edit any task specified by the user. It will use the set() method of arrayList and set elements at the index given by the user with the element entered by the user. 
