# java-features-examples

**JDK VERSION :** JDK 11 - [AMAZON CORRETTO](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html)

---

Maven build plugins for JDK 11
------
```java
  <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.0</version>
                <configuration>
                    <release>11</release>
                    <source>11</source>
                    <target>11</target>
                </configuration>
            </plugin>
   </plugins>
```
---
Examples
------
* composition vs inheritance
   
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/compositionVsinheritance)
* equals vs referance 

     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/equalsVSreferance)
* iterators
    
     >Iterators & ListIterator & Spliterator
     
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/iterators)
* collection differance 
    
     > ArrayList vs HashSet
     
     > HashSet vs LinkedHashSet vs TreeSet
     
     > ArrayList vs LinkedList
     
     > Vector vs ArrayList
     
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/collectionDifferences)

* map differance
    
     > HashMap vs LinkedHashMap vs TreeMap
     
     > HashMap vs ConcurrentHashMap
     
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/mapDifferences)

* Class structure

    > Inner & Static & Local Class and properties access 
    
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/innerVSstaticVSconstructorClass)

* interface vs abstract
  
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/interfaceVSabstract)
    
 * sorting
    
     > Array sorting
     
     > List sorting
     
     > Map sorting
     
     > Set sorting
     
     > Comparable vs Comparator
     
     > Sorting algorithms
     
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/sorting)

 * String Pooling vs StringBuilder vs StringBuffer
 
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/stringVsStringBufferVsStringBuilder)

 * Binary search
 
     > Iteration
     
     > Recursive
 
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/binarySearch)

 * Ternary search
 
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/ternarySearch)

 * Hierarchical Data Structure
 
     > Binary Tree
     
     > Binary Search Tree
     
     > Binary Heap
     
     [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/hierarchicalDataStructure)

 * error vs exception
 
      [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/errorVsexception)

  * LinkedList 
  
      [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/linkedListAdvance/singly)

  * Complexity
  
      > Constant Time
      
      > Linear Time
      
      > Logarithmic Time
      
      > N Log N Time
      
      > Polynomial Time
      
      > Quadratic Time
      
       [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/complexity)

   * Reflection
   
      [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/reflection)
      
   * Custom Annotation
   
      > Target
      
      > Retention
      
      > Inherited
   
      [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/customAnnotations)

   * Lambda
   
      > Coupling
      
      > Decoupling
      
      > Functional Interface
      
        + Consumer
        
        + Function
        
        + Predicate
        
        + Supplier
    
      [examples code](https://github.com/serdaralkancode/java-features-examples/tree/master/src/main/java/tr/salkan/code/java/pure/examples/lambdaFunctionalInterface)

        

  
  
