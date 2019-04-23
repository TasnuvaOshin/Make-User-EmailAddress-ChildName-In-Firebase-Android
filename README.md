# Make-User-EmailAddress-ChildName-In-Firebase-Android
I Found It Interesting As in firebase You cant User user Email Address as Childname so here is the simple process how you can do this 



Suppose you want to do this : 


Users--(parent)
|
(child1)------example.com@gmail.com
|
(child2)------example2@gmail.com



------ so now how to do this . In General it is not possible as firebase restrick to use . operator in child 
So Now we can do this by using some simple code . {check out the MainActivity.java for description}



        static String encodeUserEmail(String userEmail) {
              return userEmail.replace(".", ",");
          }



you need to use this simple encodeUser Method . this method will change all the (.) to (,) this . now you can this as child 
so now your tree will look like this : 


Users-(parent)
|
(child1)
|------example,com@gmail,com
|
(child2)
|------example2@gmail,com






thats all .
