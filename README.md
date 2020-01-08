# Java-to-AST-with-Visulization

This project is used for generating an AST for a given Java program. The AST will be stored in .dot format and can be simply visulized by several online tools.

# How to run?

- Import the project to eclipse as a Java project.
- Add libraries in `lib` folder to build path.
- Run `Main.java`.

# Example

- Input program

```java
public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}
```

- Output .dot

```
digraph "DirectedGraph" {
graph [label = "main", labelloc=t, concentrate = true];
"1188392295" [ label="(public static void main(String[] args){  System.out.println(\"Hello, World\"); } ,MethodDeclaration,3,6)" type=31 startLineNumber=3 endLineNumber=6 ]
"226710952" [ label="(public,Modifier,3,3)" type=83 startLineNumber=3 endLineNumber=3 ]
"1509563803" [ label="(static,Modifier,3,3)" type=83 startLineNumber=3 endLineNumber=3 ]
"684874119" [ label="(void,PrimitiveType,3,3)" type=39 startLineNumber=3 endLineNumber=3 ]
"1157740463" [ label="(main,SimpleName,3,3)" type=42 startLineNumber=3 endLineNumber=3 ]
"1379435698" [ label="(String[] args,SingleVariableDeclaration,3,3)" type=44 startLineNumber=3 endLineNumber=3 ]
"1529306539" [ label="(String[],ArrayType,3,3)" type=5 startLineNumber=3 endLineNumber=3 ]
"1635985705" [ label="(String,SimpleType,3,3)" type=43 startLineNumber=3 endLineNumber=3 ]
"695682681" [ label="(String,SimpleName,3,3)" type=42 startLineNumber=3 endLineNumber=3 ]
"1073502961" [ label="(args,SimpleName,3,3)" type=42 startLineNumber=3 endLineNumber=3 ]
"1582797472" [ label="({  System.out.println(\"Hello, World\"); } ,Block,3,6)" type=8 startLineNumber=3 endLineNumber=6 ]
"644166178" [ label="(System.out.println(\"Hello, World\"); ,ExpressionStatement,5,5)" type=21 startLineNumber=5 endLineNumber=5 ]
"892529689" [ label="(System.out.println(\"Hello, World\"),MethodInvocation,5,5)" type=32 startLineNumber=5 endLineNumber=5 ]
"1757676444" [ label="(System.out,QualifiedName,5,5)" type=40 startLineNumber=5 endLineNumber=5 ]
"182738614" [ label="(System,SimpleName,5,5)" type=42 startLineNumber=5 endLineNumber=5 ]
"94345706" [ label="(out,SimpleName,5,5)" type=42 startLineNumber=5 endLineNumber=5 ]
"670035812" [ label="(println,SimpleName,5,5)" type=42 startLineNumber=5 endLineNumber=5 ]
"1870647526" [ label="(\"Hello, World\",StringLiteral,5,5)" type=45 startLineNumber=5 endLineNumber=5 ]
"1188392295" -> "226710952"
"1188392295" -> "1509563803"
"1188392295" -> "684874119"
"1188392295" -> "1157740463"
"1188392295" -> "1379435698"
"1379435698" -> "1529306539"
"1529306539" -> "1635985705"
"1635985705" -> "695682681"
"1379435698" -> "1073502961"
"1188392295" -> "1582797472"
"1582797472" -> "644166178"
"644166178" -> "892529689"
"892529689" -> "1757676444"
"1757676444" -> "182738614"
"1757676444" -> "94345706"
"892529689" -> "670035812"
"892529689" -> "1870647526"
}
```

- Visualization

![Visualization](https://github.com/Program-Analysis/Java-to-AST-with-Visulization/blob/master/visulization/graphviz.png)

