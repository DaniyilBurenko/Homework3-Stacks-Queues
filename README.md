
# Homework 3 - Stacks and Queues

Name: Daniyil Burenko  
Programming Language: Java  
IDE: Visual Studio Code


## Part 2 - ADT Questions


1. What does ADT stand for?

ADT stands for Abstract Data Type.



2. What is an Abstract Data Type?

An ADT is a set of rules that tells us how a data structure should work and what operations it can perform.



3. What is the difference between an ADT and its implementation?

An ADT describes what a data structure does. The implementation is how we actually build it in code.



4. Can two programmers create different implementations of the same ADT?

Yes. Two programmers can write different code or use different ways to store data. As long as they follow the same rules, they can create the same ADT.



5. Are an array-based Stack and a linked-list Stack both still Stacks?

Yes. They both follow the same Stack rules. The only difference is how the data is stored.



## Part 8 - Stack Questions


6. What does LIFO mean?

LIFO means Last In, First Out. The last item added is the first one removed.



7. Why did 55 get removed before 15?

Because 55 was added last, it was at the top of the Stack and got removed first.



8. If A, B, C and D are added in order, which item gets removed first?

D gets removed first because it was added last.



9. Give an example of where a Stack could be useful.

A good example is the Undo button in a text editor. When you undo something, it reverses your most recent change first.



## Part 14 - Queue Questions


10. What does FIFO mean?

FIFO means First In, First Out. The first item added is the first one removed.



11. Why was 15 removed before 55?

Because 15 was added first, it was at the front of the Queue and got removed first.



12. If Alex, Maria, John and Sarah enter a line in that order, who leaves first?

Alex leaves first because Alex was the first person in line.



13. Give an example of where a Queue could be useful.

A printer is a good example. When multiple people send documents to a printer, the first document sent normally gets printed first.



## Part 15 - Stack vs Queue


Scenario 1 - Undo Feature

Stack. The last thing typed should be the first thing undone.



Scenario 2 - Printer

Queue. The first document sent should normally be printed first.



Scenario 3 - Browser Back Button

GitHub would appear first when going back from Amazon. This works like a Stack because the most recent previous page comes up first.



Scenario 4 - Customer Service

Queue. The first customer to arrive should normally be helped first.



Scenario 5 - Plates

Stack. When plates are stacked on top of each other, the last plate added is usually the first one taken off.



## Part 16 - Predict the Output

14. What does pop() return?

18



15. What does the final Stack peek() return?

22



16. What does dequeue() return?

7



17. What does the final Queue peek() return?

12




## Part 17 - Stack and Queue Comparison

| Feature | Stack | Queue |
|---|---|---|
| Rule | LIFO | FIFO |
| Add an item | push() | enqueue() |
| Remove an item | pop() | dequeue() |
| View the next item | peek() | peek() |
| First item removed | Last item added | First item added |



## Part 18 - ADT and Implementation


18. If you implement a Stack using an array, which part is the ADT?

The ADT is the Stack's rules and operations, like push(), pop() and peek().



19. Which part is the implementation?

The implementation is the actual code that uses an array to store the items and keeps track of the top.



20. If you replace the array with a linked list, does the ADT change?

No. The way the Stack is built changes, but it still has the same operations and follows the same LIFO rule.
