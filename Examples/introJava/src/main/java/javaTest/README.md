CS3354.252 Java Proficiency Test
Jan 19 2023

## Question 1: 
What is output of the [UnitTest](UnitTest) Java code?

**a.** Error: square(3)
 Error: square(1)
 Error: square(-1)
 Tests complete.

**b.** Error: square(3)
 Error: square(-1)
 Tests complete.

**c.** Error: square(3)
 Tests complete.

**d.** Tests complete

## Question 2: 
Given the following method definitions, what is printed at the output of [DatePrinter](DatePrinter.java)? If the method call would not compile, choose Error.

  1. Error
  2. 3
  3. 2
  4. 1

## Question 3: 
Following code will result in what type of Error? Why? Rewrite it so it runs correctly.

```
class Main {
  public static void main(String args[]) {
	int x = 0;
	int y = 55;
	int z = y/x;
  }
}
```

**Solution** [Main](Main.java)

## Question 4
Correct both by making minimal changes (e.g., don't completely rewrite the code – for example, don't redo the while loop as a for loop unless it's essential)

```
public class Product{

int x = 5, y = 55, prod = 0;

while (x \> 0) {

x--;

prod = prod + y;

}

System.out.println(x+"\*"+y+"="+prod);

}
```
**Solution** [Product.java](Product.java)

##Question 5
What is the output of the following program? Why?

```
class Test1 {
    public static void main(String[] args){
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1.x = 15;
        System.out.print(t1.x + " ");
        System.out.println(t2.x);
    }
}
```

**Solution** Run [Test1.java](Test1.java)

##Question 6
In the "Monster United" video game, each player has a username and an icon (javax.swing.Icon), and can own zero or more monsters. Each monster has an nickname and a health value (a decimal number between 0 and 100). There are two types of monsters: snakes and ogres. Ogres can own up to 2 weapons. Implement a **skeleton** for this video game in Java. Each type of monster inflicts a certain amount of damage (an integer value between 0 and 20). The amount of damage for each monster is determined as follows:
1. For a Snake, the damage is their health value divided by 100 plus 3.
2. For an Ogre, the damage is: 5 if it has no weapons, 10 if it owns 1 weapon, and 20 if it owns 2 weapons

**ChatGPT Solution:** [monsterUnited](monsterUnited) package
