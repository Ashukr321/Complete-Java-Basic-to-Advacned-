
![Logo](https://d2jdgazzki9vjm.cloudfront.net/core/images/java-logo1.png)

# CORE JAVA AND ADVANCED  JAVA



* Java is a programming language and computing platform that was first released by Sun Microsystems in 1995. It's a multi-platform, object-oriented, and network-centric language that can be used as a platform in itself. Java is known for being fast, secure, and reliable, and it's widely used for developing large-scale applications, including Android apps, web applications, and enterprise software.

* Java is also known for its "write once, run anywhere" philosophy, which means that Java code can be written on one platform and run on any other platform that has a Java Virtual Machine (JVM) installed. This makes Java a versatile and widely-used language.
Features of Java
----------------

* Object-Oriented: Java is based on the object-oriented programming paradigm, which promotes the use of objects and classes.
* Platform-Independent: Java code is compiled into bytecode, which can be run on any platform using the JVM.
* Simple and Familiar: Java is easy to learn for those with experience in other programming languages like C or C++.
* Secure: Java provides a secure environment by enabling the development of virus-free, tamper-free systems.
* Robust: Java has strong memory management, exception handling, and type-checking mechanisms that make it robust.
* Multithreaded: Java supports multithreading, allowing the development of highly interactive and responsive applications.
* High Performance: Java is optimized for high performance through the use of Just-In-Time (JIT) compilers.
* Distributed: Java has extensive support for distributed computing, enabling the creation of networked applications.
* Dynamic: Java is capable of adapting to an evolving environment, allowing programs to dynamically load classes and libraries.

Important Topics in Core Java
-----------------------------

## Java Basics

* Application of java 		
* jre , jdk , jvm 		
* data types in java 		
* null in java 		
* variables in java 		
* literals in java 		
* Operators in java 		
* type casting , comment java 		
* class and object in java 		

## Constructor

* default constructor				
* constructor and its types				
* constructor chaining using this()  , and super () 				
* paramterised constructor				
* why java plateform independent			
* diff btw  java and cpp 			
* instanceof operator in java 			

## Inheritance and Encapsulation	


* Generalization vs Specialization
* Inheritance
* Types of Inheritance
* Single Inheritance
* Multilevel Inheritance
* Hierarchical Inheritance
* Multiple Inheritance
* Hybrid Inheritance

## Encapsulation in java 	

* Access Modifiers in Java
* Public: Accessible from anywhere
* Private: Accessible only within the same class
* Protected: Accessible within the same class and subclasses
* Default (no modifier): Accessible within the same package


## Abstraction 	

### Abstract Class
    An abstract class is a class that cannot be instantiated and is designed to be inherited by other classes. It provides a way to define a blueprint for other classes to follow.

### Abstract Methods
    Abstract methods are methods declared in an abstract class that do not have an implementation. They must be implemented by any subclass that inherits from the abstract class.

### Method Overriding

    Method overriding is a process where a subclass provides a specific implementation for a method that is already defined in its superclass.

### Concrete Methods

    Concrete methods are methods that have an implementation and can be called directly

### Abstract Class Example
    public abstract class Animal {
        public abstract void sound();
        public void eat() {
            System.out.println("Eating...");
        }
    }

    public class Dog extends Animal {
        public void sound() {
            System.out.println("Barking...");
        }
    }

### Rules of Abstract Class
* An abstract class cannot be instantiated.
* An abstract class can have both abstract and concrete methods.
* A subclass of an abstract class must implement all the abstract methods of the superclass.
* An abstract class can have constructors, but they can only be called by subclasses.
* An abstract class can have state (variables) and behavior (methods).
* An abstract class can extend another abstract class or implement an interface.


## Interface


An interface is a abstract class that contains only constants, method signatures, and default methods. It is used to define a contract that must be implemented by any class that implements it.

## Interface Default Methods and Static Methods

    Interfaces can have default methods and static methods.
### Default Methods
    A default method is a method that is declared in an interface with a default implementation. It can be overridden by any class that implements the interface.

### Static Methods
    A static method is a method that is declared in an interface with a static implementation. It cannot be overridden by any class that implements the interface.

## Interface Example
    public interface Printable {
        default void print() {
            System.out.println("Printing...");
        }
        
        static void printAll(Printable[] printables) {
            for (Printable printable : printables) {
                printable.print();
            }
        }
    }


## Polymorphism			
* methods		
* Recursion		
* methods overloading		
* methods overriding		


#Inner class 
* inner class 		
* Local class
* nested member class 		
* nested static class 		
* anonymous class 		
* scanner class object in java 		


## String 
* string 		
* string methods 		
* string buffer 		
* string builder		
* string tokenizer 		

## Exception handling
* diff. error and exception		
* checked and uncheked exception		
* keywords use in exception 		
* try 	
* catch 	
* throw	
* throw	
* finally	


## File Handling
Concept of stream 						
Byte Oriented Stream						
### InputStream				
* Output Stream				
						
* InputStream					
* byte from input device to java program			
* example 	inbuilt class				
						
* ByteArrayInputStream					
* FilterIinputStream					
* DataInputStream					
* ObjectInputStream					
* FileInputStream					
* StringBufferStream					
* BufferInputStream					

### Output Stream	

* byte from java program to output device			
					
* Example inbuilt classes 					
					
* ByteArrayOutPutStream					
* FilterOutputStream					
* DataOutputStream					
* PrintStream					
* BufferedOutputStream					

## Character Oriented Stream		
* character from input device to java program				
    Reader class						
    Writer class					
													
### 1. Reader class ( input device to java program )			
							
* inbuilt classess are						
* CharArrayReader						
* FilterReader						
* BufferReader						
* FileReader						
* InputStreamReader		

### 2. Writer class ( java program to output device )		
* CharArrayWriter				
* FilterWriter				
* FileWriter				
* PrintWriter				
* BufferedWriter

## Anonymous class in the java 		

* 3 types										
* Anonymous class extending another class										
* Anonymous class by  implementing interface										
* In methods or constructor parameters argument										
* Ambiguty error  in multiple inheritance 				
* static methods  and default methods in interface					

## Constructor chaining in the inheritance 			
    super()
    this() 

## Multitasking	

* multitasking , 			
* multiprocessing , 			
* multithreading			
* thread and process in java 			
* nways to achives multithreading 			
* thread schedular			
			
* Multithreading using Thread class			
* Multithreading using Runnable class			
			
* life Cycle of thread			
* thread Priorites			
* thread - Daemon , join, yield			
* Synchronsation ( multithreading) 			
* why we need synchronised		
* synchronised methods
		
## Collection framework

* collection framework  and its classifcation 						
* what is arraylist and how use in real life give one example						
* what is linkedlist how they implemented give one real life use  case 						
* what is  vector and its implementation						
* what is stack how stack is implemented in the java 	
## Queue Set and HashSet Treeset LinkedHashSet
* Eplain the  queue of collection framework 				
* Explain the priority queue of collection framwork 				
* Eplain the Deque of collection framework 				
* Explain the the set  hashset  and its implementation,				
* implementation of LinkedHashSet				
* implementation of Treeset of set Interface	

## Map and Hashmap
* Introduction of Map interface 						
* Implementation of hashTable class of map interface						
* Implementation of LinkedhashMap class of Map interface						
* Explain the implement its methods of HashMap class of map interface						
* Explain the implementation of TreeMap class of SortedMap interface						

## Introduction to AWT 
* GUI api 
* Component Awt 
* Button ,Label, Checkbox ,Text Component (TextField,TextArea)
* List
* Container(Window-> Frame, Dialog ,Panel->Aplet)
* Method Frame Class
    setVisible(boolean b)
    setSize(int width,int height)
    setTitle(String title)
* Two ways to Create Frame
    By creating the Object of Frame Class (Association)
    By extending Frame class (Inheritance)
### Constant in Color Class 
* public static final Color black
* public static final Color Black
* public static final Color blue
* public static final Color Blue
* public static final Color red
* public static final Color Red
* public static final Color gray
* public static final Color Gray
* public static final Color orange
* public static final Color Orange
* public static final Color yellow
* public static final Color pink 
* ......

### Commonly used methods of Graphics class 
* drawString(String str, int x ,int y)
* drawRect(int x,int y ,int width ,int height)
* fillRect(int x,int y ,int width, int heigh)
* drawArc(int x, int y , int width , int height)
* fillArc(int x, int y ,int width ,int height , int startAngle,int arcAngle)
* setColor(Color c)

## Spring Intro Basic concepts 
* difference between spring and hibernate 				
* Explain the dependencies injection in java 				
* what is the purpose of java persistence api ( jpa) 				
* difference between c++ and java 		
* Explain the code execution of java code 

## keywords
* final keywords			
* static keywords			
* this keywords			
* super keywords	

## generic
* generic in java  ( this is similar to cpp template ) 		

## javaDoc

## comparable vs comparator			
## How does hashMap internally work 			




# CORE JAVA INTERVIEW QUESTIONS

    1)  what are static blocks and static initalizers in Java ?
    2)  How to call one constructor from the other constructor ? 
    3)  What is method overriding in java ?
    4)  What is super keyword in java ?
    5)  Difference between method overloading and method overriding in java ?
    6)  Difference between abstract class and interface ?
    7)  Why java is platform independent?
    8)  What is method overloading in java ?
    9)  What is difference between c++ and Java ?
    10) What is JIT compiler ?
    11) What is bytecode in java ? 
    12) Difference between this() and super() in java ?
    13) What is a class ? 
    14) What is an object ?
    15) What is method in java ? 
    16) What is encapsulation ?
    17) Why main() method is public, static and void in java ?
    18) Explain about main() method in java ?
    19) What is constructor in java ?
    20) What is difference between length and length() method in java ?
    21) What is ASCII Code?
    22) What is Unicode ? 
    23) Difference between Character Constant and String Constant in java ?
    24) What are constants and how to create constants in java? 
    25) Difference between ‘>>’ and ‘>>>’ operators in java?
    Core java Interview questions on Coding Standards 
    26) Explain Java Coding Standards for classes or Java coding conventions for 



    28) Explain Java Coding standards for Methods?
    29) Explain Java Coding Standards for variables ?
    30) Explain Java Coding Standards for Constants? 
    31) Difference between overriding and overloading in java? 
    32) What is ‘IS-A ‘ relationship in java?
    33) What is ‘HAS A’’ relationship in java?
    34) Difference between ‘IS-A’ and ‘HAS-A’ relationship in java?
    35) Explain about instanceof operator in java?
    36) What does null mean in java? 
    37) Can we have multiple classes in single file ? 
    38) What all access modifiers are allowed for top class ?
    39 ) What are packages in java? 
    40) Can we have more than one package statement in source file ?
    41) Can we define package statement after import statement in java? 
    42) What are identifiers in java?
    43) What are access modifiers in java?
    44) What is the difference between access specifiers and access modifiers in java?16
    45) What access modifiers can be used for class ?
    46) Explain what access modifiers can be used for methods?
    47) Explain what access modifiers can be used for variables? 
    48) What is final access modifier in java?
    49) Explain about abstract classes in java?
    50) Can we create constructor in abstract class ?
    51) What are abstract methods in java? 

##  Java Exception Handling Interview questions


    52) What is an exception in java?
    53) State some situations where exceptions may arise in java? 
    54) What is Exception handling in java? 
    55) What is an eror in Java?
    56) What are advantages of Exception handling in java?
    57) In how many ways we can do exception handling in java?
    58) List out five keywords related to Exception handling ?
    59) Explain try and catch keywords in java?
    60) Can we have try block without catch block?
    61) Can we have multiple catch block for a try block? 
    62) Explain importance of finally block in java?
    63) Can we have any code between try and catch blocks?
    64) Can we have any code between try and finally blocks?
    65) Can we catch more than one exception in single catch block?
    66) What are checked Exceptions?
    67) What are unchecked exceptions in java? 
    68) Explain differences between checked and Unchecked exceptions in java?
    69) What is default Exception handling in java? 
    70) Explain throw keyword in java?
    71) Can we write any code after throw statement?
    72) Explain importance of throws keyword in java?
    73) Explain the importance of finally over return statement?
    74) Explain a situation where finally block will not be executed?
    75) Can we use catch statement for checked exceptions? 
    76) What are user defined exceptions?
    77) Can we rethrow the same exception from catch handler?
    78) Can we nested try statements in java?
    79) Explain the importance of throwable class and its methods? 
    80) Explain when ClassNotFoundException will be raised ? 
    81) Explain when NoClassDefFoundError will be raised ?

## Java Interview questions on threads

    83) What is process ?
    84) What is thread in java? 
    85) Difference between process and thread? 
    86) What is multitasking ?
    87) What are different types of multitasking?
    88) What are the benefits of multithreaded programming? 
    89) Explain thread in java?
    90) List Java API that supports threads?
    91) Explain about main thread in java?
    92) In how many ways we can create threads in java? 
    93) Explain creating threads by implementing Runnable class?
    94) Explain creating threads by extending Thread class ? 
    95) Which is the best approach for creating thread ? 
    96) Explain the importance of thread scheduler in java?
    97) Explain the life cycle of thread?
    98) Can we restart a dead thread in java? 
    99) Can one thread block the other thread?
    100) Can we restart a thread already started in java?
    101) What happens if we don’t override run method ? 
    102) Can we overload run() method in java?
    105) What is a lock or purpose of locks in java?
    106) In how many ways we can do synchronization in java? 
    107) What are synchronized methods ? 
    108) When do we use synchronized methods in java?
    109) When a thread is executing synchronized methods , then is it possible to
    execute other synchronized methods simultaneously by other threads? 
    110) When a thread is executing a synchronized method , then is it possible for the
    same thread to access other synchronized methods of an object ?
    111) What are synchronized blocks in java?
    112) When do we use synchronized blocks and advantages of using synchronized
    blocks? 
    113) What is class level lock ?
    114) Can we synchronize static methods in java? 
    115) Can we use synchronized block for primitives?
    116) What are thread priorities and importance of thread priorities in java? 
    117) Explain different types of thread priorities ? 
    118) How to change the priority of thread or how to set priority of thread?
    119) If two threads have same priority which thread will be executed first ?
    120) What all methods are used to prevent thread execution ?
    121) Explain yield() method in thread class ?
    122) Is it possible for yielded thread to get chance for its execution again ? 
    123) Explain the importance of join() method in thread class? 
    124) Explain purpose of sleep() method in java?
    125) Assume a thread has lock on it, calling sleep() method on that thread will
    release the lock?
    126) Can sleep() method causes another thread to sleep? 
    127) Explain about interrupt() method of thread class ?
    128) Explain about interthread communication and how it takes place in java? 
    129) Explain wait(), notify() and notifyAll() methods of object class ? 
    130) Explain why wait() , notify() and notifyAll() methods are in Object class rather
    than in thread class? 
    131) Explain IllegalMonitorStateException and when it will be thrown? 
    132) when wait(), notify(), notifyAll() methods are called does it releases the lock
    or holds the acquired lock? 
    133) Explain which of the following methods releases the lock when yield(),
    join(),sleep(),wait(),notify(), notifyAll() methods are executed? 
    134) What are thread groups? 
    135) What are thread local variables ?
    136) What are daemon threads in java?
    137) How to make a non daemon thread as daemon? 
    138) Can we make main() thread as daemon?

## Interview questions on Nested classses and inner classes
    139) What are nested classes in java?
    140) What are inner classes or non static nested classes in java? 
    141) Why to use nested classes in java? 
    What is the purpose of nested class in java?
    142) Explain about static nested classes in java? 
    143) How to instantiate static nested classes in java? 
    144) Explain about method local inner classes or local inner classes in java?
    145) Explain about features of local inner class? 
    146) Explain about anonymous inner classes in java?
    147) Explain restrictions for using anonymous inner classes?
    148) Is this valid in java ? can we instantiate interface in java?
    149) Explain about member inner classes?
    150) How to instantiate member inner class? 
    151) How to do encapsulation in Java?
    152) What are reference variables in java?
    153) Will the compiler creates a default constructor if I have a parameterized
    constructor in the class?
    154) Can we have a method name same as class name in java?
    155) Can we override constructors in java?
    156) Can Static methods access instance variables in java?
    157) How do we access static members in java?
    158) Can we override static methods in java?
    159) Difference between object and reference?
    160 ) Objects or references which of them gets garbage collected?
    161) How many times finalize method will be invoked ? who invokes finalize()
    method in java?
    162) Can we able to pass objects as an arguments in java?
    163) Explain wrapper classes in java?
    164) Explain different types of wrapper classes in java? 
    165) Explain about transient variables in java?
    166) Can we serialize static variables in java?
    167) What is type conversion in java?
    168) Explain about Automatic type conversion in java?
    169) Explain about narrowing conversion in java?
    170) Explain the importance of import keyword in java? 
    171) Explain naming conventions for packages ?
    172) What is classpath ?
    173) What is jar ?
    174) What is the scope or life time of instance variables ?
    175) Explain the scope or life time of class variables or static variables?
    176) Explain scope or life time of local variables in java? 
    177) Explain about static imports in java? 
    178) Can we define static methods inside interface? 
    179) Define interface in java?
    180) What is the purpose of interface?
    181) Explain features of interfaces in java? 
    182) Explain enumeration in java? 
    183) Explain restrictions on using enum?
    184) Explain about field hiding in java?
    185) Explain about Varargs in java?
    186) Explain where variables are created in memory?
    187) Can we use Switch statement with Strings?
    188) In java how do we copy objects?

## Oops concepts interview questions
    189) Explain about procedural programming language or structured programming
    language and its features?
    190) Explain about object oriented programming and its features?
    191) List out benefits of object oriented programming language?
    192) Differences between traditional programming language and object oriented
    programming language? 
    193) Explain oops concepts in detail? 
    194) Explain what is encapsulation? 
    195) What is inheritance ?
    196) Explain importance of inheritance in java?
    197) What is polymorphism in java?

## Collection Framework interview questions
    198) What is collections framework ?
    199) What is collection ?
    200) Difference between collection, Collection and Collections in java? 
    201) Explain about Collection interface in java ?
    202) List the interfaces which extends collection interface ? 
    203) Explain List interface ? 
    204) Explain methods specific to List interface ?
    205) List implementations of List Interface ? 
    206) Explain about ArrayList ?
    207) Difference between Array and ArrayList ? 
    208) What is vector?
    209) Difference between arraylist and vector ?
    210) Define Linked List and its features with signature ?
    211) Define Iterator and methods in Iterator? 
    212) In which order the Iterator iterates over collection?
    212) Explain ListIterator and methods in ListIterator?
    213) Explain about Sets ?
    214) Implementations of Set interface ?
    215) Explain HashSet and its features ? 
    216) Explain Tree Set and its features?
    217) When do we use HashSet over TreeSet? 
    218) What is Linked HashSet and its features?
    219) Explain about Map interface in java?
    220) What is linked hashmap and its features?
    221) What is SortedMap interface? 
    222) What is Hashtable and explain features of Hashtable?
    223) Difference between HashMap and Hashtable? 
    224) Difference between arraylist and linkedlist? 
    225) Difference between Comparator and Comparable in java? 
    226) What is concurrent hashmap and its features ?
    227) Difference between Concurrent HashMap and Hashtable and
    collections.synchronizedHashMap?
    228) Explain copyOnWriteArrayList and when do we use copyOnWriteArrayList?
    229) Explain about fail fast iterators in java?
    230) Explain about fail safe iterators in java?

## Core java Serialization interview questions

    231) What is serialization in java? 
    232) What is the main purpose of serialization in java?
    233) What are alternatives to java serialization?
    234) Explain about serializable interface in java?
    235) How to make object serializable in java?
    236) What is serial version UID and its importance in java?
    237) What happens if we don’t define serial version UID ? 
    238) Can we serialize static variables in java?
    239) When we serialize an object does the serialization mechanism saves its
    references too? 
    240) If we don’t want some of the fields not to serialize How to do that?
## Authors

- [@Ashutosh kumar](https://github.com/Ashukr321)



## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://modern-portfolio-phi-rouge.vercel.app/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ashutosh-kumar-7ba1a6211/)
[![instagram](https://img.shields.io/badge/instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/ashukr321/)


## 🚀 About Me
I'm ASHUTOSH KUMAR FULLSTACK DEVELOPER 

I specialize in creating modern and responsive web applications. With a strong passion for front-end development, I bring creative solutions to life through code and design. Additionally, I am a winner 🏆 of the GDG Patna WEB Hackathon


## Acknowledgements

 * Ashutosh kumar for creating and maintaining this repository.

