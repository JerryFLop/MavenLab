#  CHAPTER 9 Notes.
- The Stack is Where invocation(Calling method) and local variables live
- The Heap is where all objects live.
- private String name ; <-- This is an instance variable 
- Instance Variables are declared inside a class but not
inside a method.
They represent "fields" that each object has.
Instance variables live inside the objects they belong to.
 private String name ; <-- This is an instance variable
- Local variables are declared inside a method, including method parameters.   
They're temporary, and live only as long as the method has not reached the end of the closing  curly brace.
  public void foo(int x){ int i = x + 3; boolean b = true;} <-- x,i,b are all local variables.
- Local variables live on the stack(Method)
- Object reference variables work just like primitive variables. if the declared as a local variables, it goes on the stack.
- instance variables live within the object they belong to, on the heap.

