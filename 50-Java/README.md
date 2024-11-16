# 50 Java Problem

<br/>

#### 1. Simple Java Program.

``` java
 class practices{ 
public static void main(String args[]) 
{ 
System.out.println("Hello World by Technolamror"); 
} 
} 
```
#### 2. Print Integer in java. 

```java
class practices { 
public static void main(String[] arguments) { 
int c; 
for (c = 1; c <= 10; c++)
{ 
System.out.println(c); 
} 
} 
} 
```
#### 3. Command Line Argument in java .

```java
class practices {
	public static void main(String[] args)
	{
		System.out.println(args[0]);
	}
}
```
#### 4. How to get Using input using Scanner Program in java .

```java
import java.util.Scanner; 
  
class  practices{ 
   public static void main(String args[])
     { 
      int a; 
      float b; 
      String s; 
  
      Scanner in = new Scanner(System.in); 
  
      System.out.println("Enter a string"); 
      s = in.nextLine(); 
      System.out.println("You entered string "+s); 
  
      System.out.println("Enter an integer"); 
      a = in.nextInt(); 
      System.out.println("You entered integer "+a); 
  
      System.out.println("Enter a float"); 
      b = in.nextFloat(); 
      System.out.println("You entered float "+b);    
   } 
} 
```
#### 5. How to convert Fahrenheit  to Celsius Program in java.

```java
import java.util.*; 
  
class  practices{ 
  public static void main(String[] args)
   { 
    float temperatue; 
    Scanner in = new Scanner(System.in);       
  
    System.out.println("Enter temperatue in Fahrenheit"); 
    temperatue = in.nextInt(); 
  
    temperatue = ((temperatue - 32)*5)/9; 
  
    System.out.println("Temperatue in Celsius = " + temperatue); 
  } 
} 
```
#### 6. How to swap 2 using 3rd variable Program in java. 

```java
import java.util.Scanner; 
  
class practices{ 
   public static void main(String args[])
    { 
      int x, y, temp; 
      System.out.println("Enter x and y"); 
      Scanner in = new Scanner(System.in); 
  
      x = in.nextInt(); 
      y = in.nextInt(); 
  
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y); 
  
      temp = x; 
      x = y; 
      y = temp; 
  
      System.out.println("After Swapping\nx = "+x+"\ny = "+y); 
   } 
} 
```
#### 7. How to swap 2 no without using 3rd variable Program in java. 

```java
import java.util.Scanner; 
class practices{ 
   public static void main(String args[])
    { 
      int x, y; 
      System.out.println("Enter x and y"); 
      Scanner in = new Scanner(System.in); 
  
      x = in.nextInt(); 
      y = in.nextInt(); 
  
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
       x = x + y; 
       y = x - y; 
       x = x - y; 
      System.out.println("After Swapping\nx = "+x+"\ny = "+y); 
   } 
} 
```
#### 8. How to add two number  Program in java.

```java
 import java.util.Scanner; 
class practices{ 
public static void main(String args[])
    { 
     int x, y, z; 
     System.out.println("Enter two integers to calculate their sum "); 
     Scanner in = new Scanner(System.in); 
     x = in.nextInt(); 
     y = in.nextInt(); 
     z = x + y; 
     System.out.println("Sum of entered integers = "+z); 
   } 
} 
```
#### 9. Find Largest  no in java Program .

```java
import java.util.Scanner; 
  
class practices{ 
   public static void main(String args[]) 
   { 
      int x, y, z; 
      System.out.println("Enter three integers "); 
      Scanner in = new Scanner(System.in); 
  
      x = in.nextInt(); 
      y = in.nextInt(); 
      z = in.nextInt(); 
  
      if ( x > y && x > z ) 
         System.out.println("First number is largest."); 
      else if ( y > x && y > z ) 
         System.out.println("Second number is largest."); 
      else if ( z > x && z > y ) 
         System.out.println("Third number is largest."); 
      else    
         System.out.println("Entered numbers are not distinct."); 
   } 
} 
```
#### 10. If Else clause in java.

```java
class practices{ 
  public static void main(String[] args) { 
    boolean learning = true; 
    if (learning) { 
      System.out.println("Java programmer"); 
    } 
    else { 
      System.out.println("What are you doing here?"); 
    } 
  } 
}
```
####

```java

```
