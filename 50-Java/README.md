# 50 Java Programs

<br/><br/>

#### 1. Simple Java Program.

``` java
public static void main(String args[]) 
{ 
System.out.println("Hello World by Technolamror"); 
} 
```
#### 2. Print Integer. 

```java
public static void main(String[] arguments) { 
	int c; 
	for (c = 1; c <= 10; c++){ 
		System.out.println(c); 
	} 
} 
```
#### 3. Command Line Argument.

```java
	public static void main(String[] args)
	{
		System.out.println(args[0]);
	}
```
#### 4. How to get Using input using Scanner.

```java
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
```
#### 5. How to convert Fahrenheit  to Celsius.

```java
  public static void main(String[] args) { 
    float temperatue; 
    Scanner in = new Scanner(System.in);       
  
    System.out.println("Enter temperatue in Fahrenheit"); 
    temperatue = in.nextInt(); 
  
    temperatue = ((temperatue - 32)*5)/9; 
  
    System.out.println("Temperatue in Celsius = " + temperatue); 
  }  
```
#### 6. How to swap 2 using 3rd variable. 

```java 
   public static void main(String args[]){ 
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
```
#### 7. How to swap 2 no without using 3rd variable. 

```java 
   public static void main(String args[]) { 
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
```
#### 8. How to add two number.

```java
public static void main(String args[]){ 
     int x, y, z; 
     System.out.println("Enter two integers to calculate their sum "); 
     Scanner in = new Scanner(System.in); 
     x = in.nextInt(); 
     y = in.nextInt(); 
     z = x + y; 
     System.out.println("Sum of entered integers = "+z); 
   }  
```
#### 9. Find Largest  no.

```java 
   public static void main(String args[]) { 
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
```
#### 10. If Else clause.

```java
  public static void main(String[] args) { 
    boolean learning = true; 
    if (learning) { 
      System.out.println("Java programmer"); 
    }else { 
      System.out.println("What are you doing here?"); 
    } 
  } 
```
#### 11. If Else clause in java- Program 2 

```java   
  public static void main(String[] args) { 
    int marksObtained, passingMarks; 
  
    passingMarks = 40; 
  
    Scanner input = new Scanner(System.in); 
  
    System.out.println("Input marks scored by you"); 
  
    marksObtained = input.nextInt(); 
  
    if (marksObtained >= passingMarks) { 
      System.out.println("You passed the exam."); 
    } else { 
      System.out.println("Unfortunately you failed to pass the exam."); 
    } 
  } 
```
#### 12.   Nested If Else clause. 

```java
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
```
#### 13. How to check Odd and Even Number.

```java
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
```
#### 14. Find factorial for given.

```java
   public static void main(String args[]) { 
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
```
#### 15. How to complete 2 string.

```java
   public static void main(String args[]) { 
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
```
#### 16.Simple For  Loop.

```java
  public static void main(String[] args) { 
    int c; 
    for (c = 1; c <= 10; c++) { 
      System.out.println(c); 
    } 
  } 
```
#### 17.Print Star console using Loop.

```java 
  public static void main(String[] args) { 
    int row, numberOfStars; 
  
    for (row = 1; row <= 10; row++) { 
      for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) { 
        System.out.print("*"); 
      } 
      System.out.println(); // Go to next line 
    } 
  } 
```
####  18.Print Star console using Loop.

```java
	public static void main(String[] args) { 
	int row, numberOfStars; 
	for (row = 1; row <= 10; row++) { 
		for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) { 
			System.out.print("*");
			} 
			System.out.println();
		}
	}
```
#### 19.While loop.

```java
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
```
#### 20.Print Reverse number.

```java
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
```
#### 21.While loop using break. 

```java
  public static void main(String[] args) { 
    int n; 
    Scanner input = new Scanner(System.in); 
    while (true) { 
      System.out.println("Input an integer"); 
      n = input.nextInt(); 
      if (n == 0) { 
        break; 
      } 
      System.out.println("You entered " + n); 
    } 
  }  
```
#### 22.While loop using break and continue.

```java 
  public static void main(String[] args) { 
    int n; 
    Scanner input = new Scanner(System.in); 
    while (true) { 
      System.out.println("Input an integer"); 
      n = input.nextInt(); 
      if (n != 0) { 
        System.out.println("You entered " + n); 
        continue; 
      } 
      else { 
        break; 
      } 
    } 
  }  
```
#### 23.Print all alphabet using for loop.

```java
   public static void main(String args[]) 
   { 
      char ch; 
      for( ch = 'a' ; ch <= 'z' ; ch++ ) 
         System.out.println(ch); 
   }  
```
#### 24. Enhance loop.

```java
  public static void main(String[] args) { 
    int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; 
    for (int t: primes) { 
      System.out.println(t);  
    } 
  } 
```
##### Another sol:
```java 
  public static void main(String[] args) { 
    String languages[] = { "C", "C++", "Java", "Python", "Ruby"}; 
  
    for (String sample: languages) { 
      System.out.println(sample); 
    } 
  } 
```
#### 25.Print Multiplication table. 

```java
   public static void main(String args[]) 
   { 
      int n, c; 
      System.out.println("Enter an integer to print it's multiplication table"); 
      Scanner in = new Scanner(System.in); 
      n = in.nextInt(); 
      System.out.println("Multiplication table of "+n+" is :-"); 
  
      for ( c = 1 ; c <= 10 ; c++ ) 
         System.out.println(n+"*"+c+" = "+(n*c)); 
   } 
```
#### 26. Print prime numbers.

```java
   public static void main(String args[]) 
   { 
      int n, status = 1, num = 3; 
  
      Scanner in = new Scanner(System.in); 
      System.out.println("Enter the number of prime numbers you want"); 
      n = in.nextInt(); 
  
      if (n >= 1) { 
         System.out.println("First "+n+" prime numbers are :-"); 
         System.out.println(2); 
      }  
      for ( int count = 2 ; count <=n ;  ) { 
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) { 
            if ( num%j == 0 ) { 
               status = 0; 
               break; 
            } 
         } 
         if ( status != 0 ) { 
            System.out.println(num); 
            count++; 
         }
	  status = 1; 
	         num++; 
	      }          
        }  
```
#### 27. Check no is Armstrong or not.

```java 
   public static void main(String args[]) 
   { 
      int n, sum = 0, temp, remainder, digits = 0; 
  
      Scanner in = new Scanner(System.in); 
      System.out.println("Input a number to check if it is an Armstrong number");       
      n = in.nextInt(); 
      temp = n; 
      // Count number of digits 
      while (temp != 0) { 
         digits++; 
         temp = temp/10; 
      } 
      temp = n; 
      while (temp != 0) { 
         remainder = temp%10; 
         sum = sum + power(remainder, digits); 
         temp = temp/10; 
      }  
      if (n == sum) 
         System.out.println(n + " is an Armstrong number."); 
      else 
         System.out.println(n + " is not an Armstrong number.");          
   } 
  
   static int power(int n, int r) { 
      int c, p = 1; 
  
      for (c = 1; c <= r; c++)  
         p = p*n; 
  
      return p;
   } 
```
#### 28. Print Floyd’s Triangle.

```java
   public static void main(String args[]) 
   { 
      int n, num = 1, c, d; 
      Scanner in = new Scanner(System.in); 
  
      System.out.println("Enter the number of rows of floyd's triangle you want"); 
      n = in.nextInt(); 
  
      System.out.println("Floyd's triangle :-"); 
  
      for ( c = 1 ; c <= n ; c++ ) { 
         for ( d = 1 ; d <= c ; d++ ) { 
            System.out.print(num+" "); 
            num++; 
         } 
  
         System.out.println(); 
      } 
   } 
```
#### 29. Find All substring of string.

```java 
   public static void main(String args[]) 
   { 
      String string, sub; 
      int i, c, length; 
  
      Scanner in = new Scanner(System.in); 
      System.out.println("Enter a string to print it's all substrings"); 
      string  = in.nextLine(); 
  
      length = string.length();
      System.out.println("Substrings of \""+string+"\" are :-"); 
	for( c = 0 ; c < length ; c++ ) { 
		for( i = 1 ; i <= length - c ; i++ ) { 
		sub = string.substring(c, c+i); 
		System.out.println(sub); 
		} 
	} 
     }
```
#### 30. Print reverse string.

```java
	public static void main(String args[]) 
	{ 
	String original, reverse = ""; 
	Scanner in = new Scanner(System.in); 
	Program 
	System.out.println("Enter a string to reverse"); 
	original = in.nextLine(); 
	int length = original.length(); 
	for ( int i = length - 1 ; i >= 0 ; i-- ) 
	reverse = reverse + original.charAt(i); 
	} 
	System.out.println("Reverse of entered string is: "+reverse); 
} 
//Using Internal java Methog 
	public static void main(String args[]) 
	{ 
	StringBuffer a = new StringBuffer("Java programming is fun"); 
	System.out.println(a.reverse()); 
	}  

```
#### 31.Check Given No is palindrome or Not.

```java
 public static void main(String args[]) 
   { 
      String original, reverse = ""; 
      Scanner in = new Scanner(System.in); 
  
      System.out.println("Enter a string to check if it is a palindrome"); 
      original = in.nextLine(); 
      int length = original.length(); 
      for ( int i = length - 1; i >= 0; i-- ) 
         reverse = reverse + original.charAt(i); 
      if (original.equals(reverse)) 
         System.out.println("Entered string is a palindrome."); 
      else 
         System.out.println("Entered string is not a palindrome."); 
   }
```
##### Another Method:
```java
 public static void main(String args[]) 
  { 
    String inputString; 
    Scanner in = new Scanner(System.in); 
  
    System.out.println("Input a string"); 
    inputString = in.nextLine(); 
  
    int length  = inputString.length(); 
    int i, begin, end, middle; 
  
    begin  = 0; 
    end    = length - 1; 
    middle = (begin + end)/2; 
  
    for (i = begin; i <= middle; i++) { 
      if (inputString.charAt(begin) == inputString.charAt(end)) { 
        begin++; 
        end--; 
      } 
      else { 
        break; 
      } 
    }
 if (i == middle + 1) { 
      System.out.println("Palindrome"); 
    }else { 
      System.out.println("Not a palindrome"); 
    }   
  }
```
#### 32.How to add two matrix.

```java
 public static void main(String args[]) 
   { 
      int m, n, c, d; 
      Scanner in = new Scanner(System.in); 
  
      System.out.println("Enter the number of rows and columns of matrix"); 
      m = in.nextInt(); 
      n  = in.nextInt(); 
  
      int first[][] = new int[m][n]; 
      int second[][] = new int[m][n]; 
      int sum[][] = new int[m][n]; 
  
      System.out.println("Enter the elements of first matrix"); 
  
      for (  c = 0 ; c < m ; c++ ) 
         for ( d = 0 ; d < n ; d++ ) 
            first[c][d] = in.nextInt(); 
  
      System.out.println("Enter the elements of second matrix"); 
  
      for ( c = 0 ; c < m ; c++ ) 
         for ( d = 0 ; d < n ; d++ ) 
            second[c][d] = in.nextInt(); 
  
      for ( c = 0 ; c < m ; c++ ) 
         for ( d = 0 ; d < n ; d++ ) 
             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' 
to subtract matrices 
  
      System.out.println("Sum of entered matrices:-"); 
  
      for ( c = 0 ; c < m ; c++ ) 
      { 
         for ( d = 0 ; d < n ; d++ ) 
            System.out.print(sum[c][d]+"\t"); 
  
         System.out.println();
      } 
   } 
```
#### 33.How to multiply two matrix.

```java
 public static void main(String args[]) 
   { 
      int m, n, p, q, sum = 0, c, d, k; 
      Scanner in = new Scanner(System.in); 
      System.out.println("Enter the number of rows and columns of first matrix"); 
      m = in.nextInt(); 
      n = in.nextInt(); 
      int first[][] = new int[m][n]; 
      System.out.println("Enter the elements of first matrix"); 
      for ( c = 0 ; c < m ; c++ ) 
         for ( d = 0 ; d < n ; d++ ) 
            first[c][d] = in.nextInt(); 
      System.out.println("Enter the number of rows and columns of second matrix"); 
      p = in.nextInt(); 
      q = in.nextInt(); 
      if ( n != p ) 
         System.out.println("Matrices with entered orders can't be multiplied with each other."); 
      else { 
         int second[][] = new int[p][q]; 
         int multiply[][] = new int[m][q]; 
         System.out.println("Enter the elements of second matrix"); 
         for ( c = 0 ; c < p ; c++ ) 
            for ( d = 0 ; d < q ; d++ ) 
               second[c][d] = in.nextInt(); 
         for ( c = 0 ; c < m ; c++ ) { 
            for ( d = 0 ; d < q ; d++ ) {    
               for ( k = 0 ; k < p ; k++ ) {
            sum = sum + first[c][k]*second[k][d]; 
               } 
               multiply[c][d] = sum; 
               sum = 0; 
            } 
         } 
         System.out.println("Product of entered matrices:-"); 
         for ( c = 0 ; c < m ; c++ ) { 
            for ( d = 0 ; d < q ; d++ ) 
               System.out.print(multiply[c][d]+"\t"); 
            System.out.print("\n"); 
         } 
      } 
   } 
```
#### 34. How to get transpose of matrix.

```java
 public static void main(String args[]) 
   { 
      int m, n, c, d; 
      Scanner in = new Scanner(System.in); 
      System.out.println("Enter the number of rows and columns of matrix"); 
      m = in.nextInt(); 
      n = in.nextInt(); 
      int matrix[][] = new int[m][n]; 
      System.out.println("Enter the elements of matrix"); 
      for ( c = 0 ; c < m ; c++ ) 
         for ( d = 0 ; d < n ; d++ ) 
            matrix[c][d] = in.nextInt(); 
      int transpose[][] = new int[n][m]; 
      for ( c = 0 ; c < m ; c++ ) { 
         for ( d = 0 ; d < n ; d++ )                
            transpose[d][c] = matrix[c][d]; 
      }
       System.out.println("Transpose of entered matrix:-"); 
      for ( c = 0 ; c < n ; c++ ) { 
        for ( d = 0 ; d < m ; d++ ) 
	System.out.print(transpose[c][d]+"\t"); 
	System.out.print("\n"); 
      } 
   } 
```
#### 35. How to compare 2 string.

```java
public static void main(String args[]){   
	String s1="hello";   
	String s2="hello";   
	String s3="meklo";   
	String s4="hemlo";   
	System.out.println(s1.compareTo(s2));   
	System.out.println(s1.compareTo(s3));   
	System.out.println(s1.compareTo(s4));   
}
```
#### 36. How to string width with specific char.

```java
public static void main(String args[]){   
	String s1="java by TechnoLamror";   
	System.out.println(s1.endsWith("r"));  //true 
	System.out.println(s1.endsWith("Lamror"));  //true 
	System.out.println(s1.endsWith("lamror"));//false 
}
```
#### 37. How to use indesOf().

```java
public static void main(String args[]){   
	String s1="this is index of example";   
	//passing substring   
	int index1=s1.indexOf("is");//returns the index of is substring   
	int index2=s1.indexOf("index");//returns the index of index substring   
	System.out.println(index1+"  "+index2);//2 8
	 //passing substring with from index   
	int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index   
	System.out.println(index3);//5 i.e. the index of another is   
	//passing char value   
	int index4=s1.indexOf('s');//returns the index of s char value   
	System.out.println(index4);//3   
} 
```
####  38. How to replace string with another string.

```java
public static void main(String args[]){   
	String s1="My name is Rajendra. My name is lamror. My name is Technolamror.";   
	String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to 
	"was"   
	System.out.println(replaceString);   
}
```
#### 39. How to split string.

```java
public static void main(String args[]){   
	String s1="java string split method by Technolamror";   
	String[] words=s1.split("\\s");//splits the string based on whitespace   
	//using java foreach
	 loop to print elements of string array   
	for(String w:words){   
	System.out.println(w);   
	}   
}
```
#### 40. How to remove space in string both end.

```java
public static void main(String args[]){   
	String s1="  hello string   ";   
	System.out.println(s1+"Technolamror");//without trim()   
	System.out.println(s1.trim()+"Technolamror");//with trim()   
}
```
#### 41. How to convert all char in string lower case.

```java
public static void main(String args[]){   
	String s1="TECHNOLAMROR by Rajendralamror HELLO stRIng";   
	String s1lower=s1.toLowerCase();
	System.out.println(s1lower);   
}
```
#### 42. How to create method.

```java
 // Constructor method 
  Methods() { 
    System.out.println("Constructor method is called when an object of it's class is created"); 
  } 
  // Main method where program execution begins 
  public static void main(String[] args) { 
    staticMethod(); 
    Methods object = new Methods(); 
    object.nonStaticMethod(); 
  } 
  // Static method 
  static void staticMethod() { 
    System.out.println("Static method can be called without creating object"); 
  } 
  // Non static method 
  void nonStaticMethod() { 
    System.out.println("Non static method must be called by creating an object"); 
  } 

```
#### 43. Find Length, Concatenate and Replace String.

```java
 public static void main(String args[]) 
  { 
    int n; 
    String s = "Java programming", t = "", u = ""; 
    System.out.println(s); 
    // Find length of string
     n = s.length(); 
    System.out.println("Number of characters = " + n); 
    // Replace characters in string 
    t = s.replace("Java", "C++"); 
    System.out.println(s); 
    System.out.println(t); 
    // Concatenating string with another string 
    u = s.concat(" is fun"); 
    System.out.println(s); 
    System.out.println(u); 
  } 
```
#### 44. How Static block working.

```java
 public static void main(String[] args) { 
    System.out.println("Main method is executed."); 
  } 
  
  static { 
    System.out.println("Static block is executed before main method."); 
  } 
} 
//Static Block Application …. We need to open Program in speciif window 
class StaticBlock { 
  public static void main(String[] args) { 
    System.out.println("You are using Windows_NT operating system."); 
  } 
  
  static { 
    String os = System.getenv("OS"); 
    if (os.equals("Windows_NT") != true) { 
      System.exit(1); 
    } 
  }
```
#### 45.Difference between Static and Instance method working.

```java
 public static void main(String[] args) { 
    display();  //calling without object
    Difference t = new Difference(); 
    t.show();  //calling using object 
} 
static void display() { 
    System.out.println("Programming is amazing."); 
} 
void show(){ 
    System.out.println("Java is awesome."); 
} 
```
####

```java

```
####

```java

```

