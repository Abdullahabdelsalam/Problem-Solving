# 51=>100 Java Programs

<br/><br/>

#### 51. Advantage  of Finally in Exception Handling.

``` java
 public static void main(String[] args) { 
  
    try { 
      long data[] = new long[1000000000];  
    } 
    catch (Exception e) { 
      System.out.println(e); 
    } 
  
    finally { 
      System.out.println("finally block will execute always."); 
    } 
  } 
```
#### 52. How to create Interface.

``` java
interface Info { 
  static final String language = "Java";   
  public void display(); 
} 
  
class Simple implements Info { 
  public static void main(String []args) { 
    Simple obj = new Simple(); 
    obj.display(); 
  }  
  
  // Defining method declared in interface 
  
  public void display() { 
    System.out.println(language + " is awesome"); 
  }  
} 
```
#### 

``` java

```
#### 

``` java

```
