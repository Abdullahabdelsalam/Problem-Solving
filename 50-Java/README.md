# 50 Java Programs

<br/><br/>

#### 1. Simple Java Program.

``` java
 class Practices{ 
public static void main(String args[]) 
{ 
System.out.println("Hello World by Technolamror"); 
} 
} 
```
#### 2. Print Integer in java. 

```java
class Practices{ 
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
class Practices{
	public static void main(String[] args)
	{
		System.out.println(args[0]);
	}
}
```
#### 4. How to get Using input using Scanner Program in java .

```java
import java.util.Scanner; 
  
class  Practices{ 
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
  
class  Practices{ 
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
  
class Practices{ 
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
class Practices{ 
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
class Practices{ 
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
  
class Practices{ 
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
class Practices{ 
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
#### 11. If Else clause in java- Program 2 

```java
import java.util.Scanner;   
class  Practices{ 
  public static void main(String[] args) { 
    int marksObtained, passingMarks; 
  
    passingMarks = 40; 
  
    Scanner input = new Scanner(System.in); 
  
    System.out.println("Input marks scored by you"); 
  
    marksObtained = input.nextInt(); 
  
    if (marksObtained >= passingMarks) { 
      System.out.println("You passed the exam."); 
    } 
    else { 
      System.out.println("Unfortunately you failed to pass the exam."); 
    } 
  } 
} 
```
#### 12.   Nested If Else clause in java  

```java
import java.util.Scanner; 
  
class Practices{ 
  public static void main(String[] args) { 
    int marksObtained, passingMarks; 
    char grade; 
  
    passingMarks = 40; 
  
    Scanner input = new Scanner(System.in); 
  
    System.out.println("Input marks scored by you"); 
  
    marksObtained = input.nextInt(); 
  
    if (marksObtained >= passingMarks) { 
  
      if (marksObtained > 90)  
        grade = 'A';
 else if (marksObtained > 75) 
        grade = 'B'; 
      else if (marksObtained > 60) 
        grade = 'C'; 
      else 
        grade = 'D';  
  
      System.out.println("You passed the exam and your grade is " + grade); 
    } 
    else { 
      grade = 'F';  
      System.out.println("You failed and your grade is " + grade); 
    } 
  } 
} 
```
#### 13. How to check Odd and Even Number in java. 

```java
import java.util.Scanner; 
  
class Practices{ 
   public static void main(String args[]) 
   { 
      int x; 
      System.out.println("Enter an integer to check if it is odd or even "); 
      Scanner in = new Scanner(System.in); 
      x = in.nextInt(); 
  
      if ( x % 2 == 0 ) 
         System.out.println("You entered an even number."); 
      else 
         System.out.println("You entered an odd number."); 
   } 
} 
```
#### 14. Find factorial for given no Program in Java 

```java
import java.util.Scanner; 
  
class Practices{ 
   public static void main(String args[]) 
   { 
      int n, c, fact = 1; 
  
      System.out.println("Enter an integer to calculate it's factorial"); 
      Scanner in = new Scanner(System.in); 
  
      n = in.nextInt();
 if ( n < 0 ) 
         System.out.println("Number should be non-negative."); 
      else 
      { 
         for ( c = 1 ; c < (n+1) ; c++ ) 
            fact = fact*c; 
  
         System.out.println("Factorial of "+n+" is = "+fact); 
      } 
   } 
}
//Calculate factorial for large No 
import java.util.Scanner; 
import java.math.BigInteger; 
  
class Practices{ 
  public static void main(String args[]) 
  { 
    int n, c; 
    BigInteger inc = new BigInteger("1"); 
    BigInteger fact = new BigInteger("1"); 
  
    Scanner input = new Scanner(System.in); 
  
    System.out.println("Input an integer"); 
    n = input.nextInt(); 
  
    for (c = 1; c <= n; c++) { 
      fact = fact.multiply(inc); 
      inc = inc.add(BigInteger.ONE); 
    } 
  
    System.out.println(n + "! = " + fact); 
  } 
} 
```
#### 15. How to complete 2 string  in Java program

```java
import java.util.Scanner; 
  
class Practices{ 
   public static void main(String args[]) 
   { 
      String s1, s2; 
      Scanner in = new Scanner(System.in); 
  
      System.out.println("Enter the first string"); 
      s1 = in.nextLine();
 System.out.println("Enter the second string"); 
      s2 = in.nextLine(); 
  
      if ( s1.compareTo(s2) > 0 ) 
         System.out.println("First string is greater than second."); 
      else if ( s1.compareTo(s2) < 0 ) 
         System.out.println("First string is smaller than second."); 
      else    
         System.out.println("Both strings are equal."); 
   } 
} 
```
#### 16.Simple For  Loop Program in Java 

```java
class Practices{ 
  public static void main(String[] args) { 
    int c; 
  
    for (c = 1; c <= 10; c++) { 
      System.out.println(c); 
    } 
  } 
} 
```
#### 17.Print Star console using Loop 

```java
class Practices{ 
  public static void main(String[] args) { 
    int row, numberOfStars; 
  
    for (row = 1; row <= 10; row++) { 
      for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) { 
        System.out.print("*"); 
      } 
      System.out.println(); // Go to next line 
    } 
  } 
}
```
####  18.Print Star console using Loop

```java
class import java.util.Scanner; 
  
class Practices { 
	public static void main(String[] args) { 
	int row, numberOfStars; 
	for (row = 1; row <= 10; row++) { 
		for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) { 
			System.out.print("*");
			} 
			System.out.println();
		}
	}
}
 
```
#### 19.While loop Program in java

```java
 import java.util.Scanner; 
class Practices {
	public static void main(String[] args) { 
		int n; 
		Scanner input = new Scanner(System.in); 
		System.out.println("Input an integer");  
		while ((n = input.nextInt()) != 0) { 
		System.out.println("You entered " + n); 
		System.out.println("Input an integer"); 
		} 
        System.out.println("Out of loop");
	}
} 
```
#### 20.Print Reverse number in  java program

```java
import java.util.Scanner; 
  
class Practices{ 
   public static void main(String args[]) 
   { 
      int n, reverse = 0; 
  
      System.out.println("Enter the number to reverse"); 
      Scanner in = new Scanner(System.in); 
      n = in.nextInt(); 
  
      while( n != 0 ) 
      { 
          reverse = reverse * 10; 
          reverse = reverse + n%10; 
          n = n/10; 
      } 
  
      System.out.println("Reverse of entered number is "+reverse); 
   } 
}
```
####

```java

```
####

```java

```
