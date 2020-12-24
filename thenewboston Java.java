##            123
class apples{
    void bakecake(){    #the whole thing is method
        mix batter;
        put in oven;
        eat the fn cake;
    }
}

##            PRINT OUT STUFFS
class oranges{
    public static void main(String args[]){
        System.out.println("Hello Youtube");
    }
}


--------------------------------------------------
##            telling tuna is double and is 5,28
###                     System.out.print = print anything
###                     System.out.println = print next line

class apples{
    public static void main(String args[]){
        double tuna;
        tuna = 5.28;

        System.out.println("I want ");
        System.out.print(tuna);  ##            stay in the same line
        System.out.println(" movies");   
        ##           println = go to next line
    }
}


----------------------------------------------------
## Getting User Input
###          java.util.Scanner;
###
## java only takes what it needs, so need to 
## importing stuff everytime

import java.util.Scanner;

import sun.jvm.hotspot.ui.EditorCommands;

import java.util.Scanner;

class apples{
    public static void main(String args[]){
        Scanner bucky = new Scanner(System.in);
        double fnum, snum, answer;

        System.out.println("Enter first num: ");
        fnum = bucky.nextDouble();  
        ##using bucky Scanner variable for user input
        ##nextdatatype like nextstring
        System.out.println("Enter second num: ");
        snum = bucky.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);


    }
}


------------------------------------------------------------
##Math Operators
###int
###double
###%

import java.util.Scanner;

class apples{
    public static void main(String args[]){
        Scanner bucky = new Scanner(System.in);

        int girls, boys, people;
        girls = 11;
        boys = 3;
        people = girls / boys;
        System.out.println(people;)
    }
}

##int only give whole number , 11/3 = 3
##double = 11/3 = 3.6666
##% = remainder = 2

------------------------------------------------------
##            Increment Operators
###                     preincrementing
###                     ++var, --var
###                     var++, var--
###                     +=, -=, *=


import java.util.Scanner;

class apples{
    public static void main(String args[]){
        Scanner bucky = new Scanner(System.in);

        int tuna = 5;
        int bass = 18;

        System.out.println(++tuna)dedddesd
        ##            ++tuna = from 5+1 = 6

        System.out.println(tuna++)
        ##            tuna++, 1st = 5
                   2nd = 6

        int tuna = 5;
        int bass = 18;

        tuna += 8  ##            5+13
        tuna *= 8  ##            5*8
        tuna -= 8  ##            5-8

    }
}



##           -----------------------------------------------------------
##            if{}, else{}
###                     ==, !=, >, <, >=, <=


class aples{
    public static void main(String args[]){
        int test =6;

        if (test == 9){
            System.out.println("Yes"); ##            {1st body}
        }else{
            System.out.println("No");  ##            {2nd body}
        }
    }
}

-------------------------------------------------------------------------------
###                     Logical Operators
##            && = and
##            || = or




class apples{
    public static void main(String args[]){
        int boy,girl;
        boy = 18;
        girl = 68;

        if (boy > 10 && girl <30){
            System.out.println("wtf");
        }else{
            System.out.println("cant fuck");
        }
    }
}

---------------------------------------------------------------------------
---------------------------------------------------------------------------

##            Switch
###                     switch case break default break
##            many cases at once
##            test a variable equals to a value


switch (key) {
    case value:         ##            case 1 = means if age == 1
        
        break;

    default:
        break;
}

class apples{
    public static void main(String args[]){
        int age;
        age = 3;

        switch(age){
        case 1: ##            means if age == 1
            System.out.println("you can fk");
            break;
        case 2: ##            means if age == 2
            System.out.println("you can fk");
            break;
        case 3:
            System.out.println("you can fk");
            break;
        default:
            System.out.println("Error");
            break;
        }
}



--------------------------------------------------------------------
------------------------------------------------------------------
##            while


class apples{
    public static void main(String args[]){
        int counter = 0;
        while (counter < 10){
            System.out.println(counter);
            counter++;
        }
    }
}

0 1 2 3 4 5 6 7 8 9 stop


-----------------------------------------------------------
-------------------------------------------------------------
##            Multiple class
##            so everyone can work on different class without looking at 
##            the same file

###                     public = everyone can use this class
###                     void = gonna do something but not return1 any data
###                     main = everytime Java will look at MAIN first

##            call class first whenever use a METHOD in ANOTHER class
##            create an Object 

###                     object.method ()



public class tuna{
    public void simpleMessage(){
        System.out.println("This is 2nd class");
    }
}



class apples{
    public static void main(String[] args) {

        class classObject = new class();
        classObject.methodMETHOD();
    }
}

class apples{
    public static void main(String[] args) {

        tuna tunaObject = new tuna(); 
        ##            use method in tuna class  
        ##            create an Object
        ##            = to new class name()

        tunaObject.simpleMessage();        
        ##            object.method == use SPECIFIC message

    }
}


-----------------------------------------------------------
-------------------------------------------------------------
### Method with Parameters
### .nextLine() = anytime you want to input a String
## name = input.nextLine() = store STRING into name variable




import java.util.Scanner;

public class tuna{
    public void simpleMessage(SSSSString name){
        System.out.println("this is string" + name)
    }
}


class apples{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        tuna tunaObject = new tuna();

        System.out.println("Enter sth here:");
        SSSSString name = input.nextLine();

        tunaObject.simpleMessage(name)
    }
}

OUTPUT
Enter sth here
Edmond
this is string Edmond



-------------------------------------------------------------------
--------------------------------------------------------------------
## Methods and Instance
### private = only the methods inside this class can use it

## Scanner for input
## call tuna class and create tunaObject
## printout text
## set input stores to TEMP
## In class tuna     take variable temp and use setName() METHOD
## name is stored as girlName equals to WTF
## In class tuna      use saying() METHOD##



public class tuna {
    private String girlName;
    public void setName(String name){
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first GIRL was %s", getName());
    }
}

class apples{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        tuna tunaObject = new tuna();
        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying();
    }
}



Enter name of first gf here:
WTF
Your first GIRL was WTF
-------------------------------------------------------------------
--------------------------------------------------------------------
Constructors
## allows you to initial the variables as soon as an object
## is created

### both tunaObject and tunaOjbect2 cant see each
### others variable!!!

//apples.java
class apples
public static void main(String[] args) {
    tuna tunaObject = new tuna ("AA");
    tuna tunaObject2 = new tuna ("BBBB");
    tunaObject.saying();
    tunaObject2.saying();
}


//tuna.java
// 377 make a constructor same as CLASS NAME tuna
## making constructors
public class tuna {
    private String girlName;

    public tuna(String name){
        girlName=name;
    }


    public void setName(String name){
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first GIRL was %s", getName());
    }
}



-------------------------------------------------------------------
--------------------------------------------------------------------
Nested if

class apples{
    public static void main(String[] args) {
        int age = 60;

        if (age < 50){
            System.out.println("young");
        }else{
            System.out.println("OLDDD");
            if (age > 75){
                System.out.println("really old");
            }else{
                System.out.println("dont worry");
            }
        }
    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
else if

class apples{
    public static void main(String[] args){
        int age = 55;

        if (age >= 60)
            System.out.println("old");
        else if (age >= 50)
            System.out.println("in 50s");
        else if (age >= 40)
            System.out.println("40s")
        else
            System.out.println("YOUNG");
        
    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
Conditional Operators
### using ? and TRUE : FALSE


class apples {
    public static void  main(String[] args){
        int age = 21;

        System.out.println(age > 50 ? "TRUE" : "FALSE YOUNG");

    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
Simple Averaging Program

import java.util.Scanner;

class apples {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while (counter < 10){
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("Average is" + average);

    }
}

1
2
3
4
5
6
7
8
9
10
Average is 5

-------------------------------------------------------------------
--------------------------------------------------------------------
for loops
### for
### set number ; loop condition ; increment
### datatype start value ; end value/ condition as long as its true ; increment

class apples{
    public static void main(String[] args){
        for(int counter = 1; counter <= 10;counter+=3){
            System.out.println(counter)
        }
    }
}
1
4
7
10

-------------------------------------------------------------------
--------------------------------------------------------------------
Compound Interest Program
###Math.pow = power



//apples.java
class apples{
    public staic void main(String[] args){
        double amount;
        double principal = 10000;
        double rate = .01;

        for(int day = 1;day<=20;day++){
            amount = principal*Math.pow(1 + rate, day);
            System.out.println(day + "   " + amount);
        }
    }
}

1   10100.0
2   10201.0
3   10303.123
.
.
.
.
20  12201.93333

-------------------------------------------------------------------
--------------------------------------------------------------------
do while loops
### do while = this gurantee the loop runs at least once
## do at least once
## only run it if the test is true

//apples

class apples{
    public static void main(String[] args){
        int counter = 15;

        do{
            System.out.println(counter);
            counter++;
        }while(counter <= 10);
    }
}
## execute first
15

-------------------------------------------------------------------
--------------------------------------------------------------------
Math Class Methods
### Math.abs(x) = 26.7
### Math.ceil(x) = always round up
### Math.floor(x) = round down
### Math.max(x, y) = finding maximum x,y
### Math.min(x, y)
### Math.pow(x, index) = (5,3) = 5*5*5
### Math.sqrt(x) = sqrt of x = (9) = 3



//apples.java

class apples
public static void main(String[] args){
    System.out.println(Math.abs(-26.7))
}

-------------------------------------------------------------------
--------------------------------------------------------------------
Random Number Generator
### import Random


//apples.java
import java.util.Random;

class apples{
    public static void main(String[] args){
        Random dice = new Random ():
        int number;

        for(int counter=1; counter<=10; counter++){
            number = 1+dice.nextInt(6);
            System.out.println("number" + "    ");
        }
    }
}

1+dice.nextInt(6)
## 0-6


number = dice.nextInt(6)
## only give 0-5

1
3
4
5
1
2
3
4
5

-------------------------------------------------------------------
--------------------------------------------------------------------
Arrays
### int array[]
## int array[] = new int[how many values in an array]

### Array initializer (Smarter)
##int myArr[] = {2,4,5,6,7}

//apples.java

class apples{
    public static void main(String[] args){
        int myArray[] = new int[]

        myArray[0] = 87;
        myArray[1] = 543;
        .
        .
        .
        .
        .
        myArray[9]=65;


        System.out.println(myArray[1])
    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
Creating an array table
### arrayname.length = builtin
### \t



//apples.java
class apples{
    public static void main(String[] args){
        System.out.println("Index\tValue"); // \t = 4 spaces
        int array[] = {1,2,3,4,5};

        for(int counter=0;counter<=array.lenth;counter++){
            System.out.println(counter + "\t" + array[counter]);
        }
    }
}

Index   Value
0       1
1       2
2       3
3       4
4       5


-------------------------------------------------------------------
--------------------------------------------------------------------
Summing Elements of Arrays
### sum += array[counter]  == add all values and store

class apples{
    public static void main(String[] args){
        int array[] = {5,6,7,8,9};
        int sum = 0;

        for(int= counter=0;counter<array.lenth;counter++){
            sum += array[counter];
        }

        System.out.println("The sum of these" + sum);
    }
}
The sum of these 35

-------------------------------------------------------------------
--------------------------------------------------------------------
Array Elements as Counters
###  ++freq[1+rand.nextInt(6)]
## add one to that index when each time it hits the number [1 + random 0-5]


import java.util.Random;

class apples{
    public static void main(Sring[] args){
        Random rand = new Random();
        int freq[] = new int[7];

        for(int roll=1;roll<1000;roll++){
            ++freq[1+rand.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for(int face=1;face<freq.length;face++){
            System.out.println(face+"\t"+ freq[face]);
        }
    }
}

Face    Frequency
1       186
2       136
3       180
.
.
6       179

-------------------------------------------------------------------
--------------------------------------------------------------------
Enhanced for loop
### for(type identifier: arrayName)
## like for Identifier in arrayName

class apples{
    public static void main(String[] args){
        int array[] = {3,4,5,6,7};
        int total = 0;

        for(int x: array){
            total += x;
        }

        System.out.println(total);
    }
}

25

-------------------------------------------------------------------
--------------------------------------------------------------------
Arrays in Method
### change
### int x[] = very important = means array x instead of var x

class apples{
    public static void main(String[] args) {
        int array[] = {3,4,5,6,7}
        change(array);//array is chage

        for(int y:array)
            System.out.println(y);

    }


    //new method seperate from main method
    //want to change
    // x[] = array x
    public staic void change(int x[]){
        for(int counter=0,counter<x.length;counter++)
            x[counter]+=5;
    }
    
}

-------------------------------------------------------------------
--------------------------------------------------------------------
Multidimensional arrays
### multiarray[][] ={{1st rol}, {2nd row}}
## secarray[][] = {{30,31,32,33},{43},{4,5,6}} = 3 rows
## secarray[0][1] = 31
## secarray[1][0] = 43

### display
### int x[][]

class apples{
    public static void main(String[] args) {
        int firstarray[][] = {{4,5,6,7},{1,2,3,4}};
        int secarray[][] = {{30,31,32,33},{43},{4,5,6}};


        // calling the method
        System.out.println("this is the first array");
        display(firstarray);

        System.out.println("this is 2nd array");
        display(secarray);


    }

    // loop through row, then lopp through column
    public static void display(int x[][]){
        for(int row=0;row<x.length; row++){
            for(int column = 0; column<x[row].length; column++){
                System.out.print(x[row][column]+ "\t");
            }
            System.out.println();
        }
    }
}

30  31  32  33
43 
4   5   6

-------------------------------------------------------------------
--------------------------------------------------------------------
Variable Length Arguments
###  ... = just do it dont know how many arguments it takes
## dont know how many arguments
## without changing the method


class apples{
    public static void main(String[] args) {
        System.out.println(average(34,53,1231,646));


    }


    public static int average(int...numbers){
        int total=0;
        for(int x: numbers)
            total+=x;

        return total/numbers.length;
    }
}

506

-------------------------------------------------------------------
--------------------------------------------------------------------
Time class


//tuna.java

public class tuna {
    private int hour:
    private int minute;
    private int second;

    public void setTime(int h, int m,int s){
        hour = ((h>=0 && h<24) ? h : 0)//if its true, then h, else 0
        minute = ((m>=0 && m<60)) ? m : 0);
        second = ((s>=0 && s<60) ? s : 0);
    }
    // calling the method
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}



//apple.java
class apples{
    public static void main(String[] args) {
        tuna tunaObject = new tuna();
        System.out.println(tunaObject.toMilitary());
        tunaObject.setTime(13,27,6);
        System.out.println(tunaOjbect.toMilitart());
    }
}
00:00:00
13:27:06

-------------------------------------------------------------------
--------------------------------------------------------------------
Display regular time
### private = only this tuna class can use these variables h m s
## NEVER name private and public together
## Java only looks at private



public class tuna {
    private int hour:
    private int minute;
    private int second;

    public void setTime(int h, int m,int s){
        hour = ((h>=0 && h<24) ? h : 0)//if its true, then h, else 0
        minute = ((m>=0 && m<60)) ? m : 0);
        second = ((s>=0 && s<60) ? s : 0);
    }
    // calling the method
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", 
        ((hour==0 || hour==12)? 12:hour%12) ,minute,second,
        (hour < 12 ? "AM" : "PM"));
    }
}


//apple.java
class apples{
    public static void main(String[] args) {
        tuna tunaObject = new tuna();
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaOjbect.toString());

        tunaObject.setTime(13,27,6);
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaOjbect.toString());
    }
}

00:00:00
12:00:00 AM
13:27:06
1:27:06 PM

-------------------------------------------------------------------
--------------------------------------------------------------------
Public Private This
### this = use this variable instead of the local

public class tuna {
    private int hour:
    private int minute;
    private int second;

    public void setTime(int hour, int minute,int second){
        this.hour = 4;
        this.minute = 5;
        this.second = 6;
    }

    
-------------------------------------------------------------------
--------------------------------------------------------------------
Multiple constructors
Set Get
## 3 constructors for different arguments

//tuna.java

public class tuna {
    private int hour;
    private int minute;
    private int second;

    public tuna(){ // 0 argument
        this(0,0,0);
    }
    public tuna(int h){ //if only 1 argument input, then use this
        this(h,0,0);
    }
    public tuna(int h, int m){ //if 2 arguments input, then use this
        this(h,m,0);
    }
    public tuna(int h, int m, int s){
        setTime(h,m,s);
    }
    public void setTIme(int h,  int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        hour = ((h>=0 && h<24) ? h : 0) //if it is TRUE, then h, else 0
    }
    public void set(int m){
        hour = ((m>=0 && h<60) ? m : 0) //if it is TRUE, then h, else 0
    }
    public void setSecond(int s){
        hour = ((s>=0 && s<60) ? s : 0) //if it is TRUE, then h, else 0
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public String toMilitary(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond())
    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
BUilding Objects for constructor

class apples{
    public static void main(Stringp[] args){

        tuna tunaObject = new tuna();
        tuna tunaObject2 = new tuna(5);
        tuna tunaObject3 = new tuna(5,13);
        tuna tunaobject4 = new tuna(5,13,43)

        System.out.printf("%s\n", tunaObject.toMilitary());
        System.out.printf("%s\n", tunaObject2.toMilitary());
        System.out.printf("%s\n", tunaObject3.toMilitary());
        System.out.printf("%s\n", tunaObject4.toMilitary());
    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
toString method
### toString   built in method for string
## this = refer to current object = needs a string = look at toString method

//potpie.java
public class potpie{
    private int month;
    private int day;
    private int year;

    public potpie(int m, int d, int y){
        month = m;
        day = d;
        year = y;

        System.out.printf("the constructor for this is %s\n", this)
    }


    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}

//apples.java

class apples{
    public static void main(String[] args){
        potpie potObject = new potpie(4,5,6)
    }
}
the constructor for this is 4/5/6 

-------------------------------------------------------------------
--------------------------------------------------------------------
Composition
## birthday is an Object not a String, then look at TOSTRING method

//tuna.java
public class tuna {
    private String name;
    private potpie birthday; // composition here

    public tuna(String theName, potpie theDate){
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s,
        my birthday is %s", name, birthday))
    }
}


// apples.java
class apples{
    public static void main(Stringp[] args){
        potpie potObject = new potpie(4,5,6)
        tuna tunaObject = new tuna("EEEE", potObject)

        System.out.println(tunaObject)

    }
}
// return an object into string by refering tostring
the constructor for this is 4/5/6
my name is EEEEE, my birthday is 4/5/6

-------------------------------------------------------------------
--------------------------------------------------------------------
Enumeration
## like class, use to declare constant
EnumSet range
### EnumSet.range

//tuna.JAVA
public enum tuna {
    Edmond("nice", "22"),
    kelsey("cute", "10"),
    julia("bigmistake", "12"),
    nicole("itialian", "13"),
    candy("different", "14"),
    erin("iwish", "16");

    private final String desc;
    private final String year;

    tuna(String description, String birthday){
        desc = description;
        year = birthday

    }

    public String getDesc(){
        return desc;
    }

    public String getYear(){
        return year;
    }

    
}

//apples.java
import java.util.EnumSet;


class apples{
    public static void main(Stringp[] args){
        for(tuna people: tuna.values())
            System.out.printf("%s\t%s\t%\n", people, people.getDesc, people.getYear);
            
            System.out.println("\nAnd now for the range of constants")
            
        for(tuna people: EnumSet.range(tuna.Kelsey, tuna.candy))
            
            System.out.printf("%s\t%s\t%\n", people, people.getDesc, people.getYear);
    }
}

bucky nice 22
kelsey cute 10
julia bigmistake 12

And now for the range of constants

nicole 123
candy 1231

-------------------------------------------------------------------
--------------------------------------------------------------------
Static 
### Static = share the same VARIABLE for all OBJECT
## if you change one object = all
## dont need to update everytime


## dont need to do static object =

public class tuna {
    private String first;
    private String last;
    private static int members = 0;

    public tuna(String fn, String ln){
        first = fn;
        last = ln;
        members++
        System.out.printf("Contruscctor for %s %s, members in club %d\n",
        first, last, members)
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){ // STATIC HERE
        return members;
    }
}


//apples
class apples{
    public static void main(Stringp[] args){
        tuna member1= new tuna("Megan","fox");
        tuna member2 = new tuna("Natalie","portman");
        tuna member3 = new tuna("Taylor", "Swift");

        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());

        System.out.println(tuna.getMembers()); // CAN ONLY DO THIS WITH STATIC!!!
    }
}

Natalie 
portman 
2

Constructor for megan fox, members in 1
.
.

-------------------------------------------------------------------
--------------------------------------------------------------------
Final
### final = cant change it = gg variable

### format(format,argument)
### printf(format, argument)

//tuna.java
public class tuna{
    private int sum;
    private final int NUMBER;

    public tuna(int x){ //1st method
        NUMBER = x;
    }

    public void add(){ //2nd method
        sum += NUMBER;
    }

    public String toString(){ //3rd method
        return String.format("sum = %d\n", sum);
    }

}



//apples.java
class apples{
    public static void main(Stringp[] args){
        tuna tunaObject = new tuna(10);

        for (int i =0; i<5; i++){
            tunaObject.add();
            System.out.printf("%s", tunaObject)

        }
    }
}


10+20+...+50

-------------------------------------------------------------------
--------------------------------------------------------------------
Inheritance
### extends = classA extends classB
## inherit suff
## eg. dont need to change every function "method" in every class "file"
## only change function"method" in tuna class "file"
## super

## private function"method" cant be inherited

## override = just enter again, but dont EXTEND again




//tuna
public class tuna {
    public void eat(){
        System.out.println("I am the NEW methods")
    }
}

//potpie
public class potpie extends tuna{

}

//apples (main)

class apples{
    public static void main(String[] args){
        tuna tunaObject = new tuna();
        potpie potObject = new potpie();

        tunaObject.eat();
        potObject.eat();
    }
}

I am the NEW method
I am the eat method 

-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
Graphical User Interface GUI "LATERRRRR 50 - 70"
## import javax.swing.JFrame;
## import java.awt.FlowLayuot;
## import javax.swing.JLabel;


public class tuna extends Jframe{ //all basic functions

    private JLabel iterm1;

    public tuna(){
        super("The title bar");
        setLayuot(new FlowLayout());

        item = new JLabel("")


    }


}



-------------------------------------------------------------------
--------------------------------------------------------------------
Jlist 70 (Later 71-78)


import java.awt.*;

class apples{
    public static void main(Stringp[] args){


        private Jlist list;
        private static String[] colornames = {"red","black"};
        private static Color[] colors = {Color.RED, Color.BLACK}

        public Gui(){
            super("tilte");
            setLayout(new FlowLayout());

            list = new Jlist(colornames);
            list.setVisibleRowCount(2);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            add(new JScrollPane(list));

            list.addListSelection
        }

    }
}























-------------------------------------------------------------------
--------------------------------------------------------------------
file class
### java.io.File = checking file is exist or not
### \\ = 2 \\ for location equals 1\




import java.io.File;

class apples{
    public static void main(Stringp[] args){

        File x = new File("C:\\test\\edmond.txt");

        if (x.exists())
            System.out.println(x.getName() + "exist!");
        else    
            System.out.println("this thing doesnt exist")

    }        
}    



-------------------------------------------------------------------
--------------------------------------------------------------------
Creating files
### try = try this code
### catch(exception) = if error, then show this
### Formatter

class apples{
    public static void main(Stringp[] args){

        final Formatter x;

        try{
            x = new Formatter("fred.txt");\
            System.out.println("created");
        }
        catch(Exception e){
            System.out.println("you got an error");
        }

    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
Writing files
### .openFile()
### x.format = .addRecords() = writing something
### x.close = .closeFile()

import java.io.*;
import java.lang.*;
import java.util.*;


// createfile.java
public class createfile {

    private Formatter x;

    public void openFile(){
        try{
            x = new Formatter("chinese.txt");
        }
        catch(Exception e){
            System.out.println("ERROR");
        }
    }

    public void addRecords(){
        x.format("%s%s%s", "20", "edmond");
    }

    public  void closeFile(){
        x.close();
    }
}


//apples.java
class apples{
    public static void main(Stringp[] args){

        createfile g = new createfile();
        g.openFile();
        g.addRecords();
        g.closeFile();
    }
}

chinese.txt
20 edmond

-------------------------------------------------------------------
--------------------------------------------------------------------
Reading from files
## readfile using Scanner
## use Scanner x to read file
## setting file = x
## print 3 until the while loop ends


import java.io.*;
import java.util.*;

public class readfile{
    private Scanner x;

    public void openFile(){
        try{
            x = new Scanner(new File("chinese.txt"));
        }
        catch(Exception e){
            System.out.println("ERRRRROR")
        }
    }

    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n", a,b,c);
        }
    }
    public void closeFile(){
        x.close();
    }
}

//apples.java
class apples{
    public static void main(Stringp[] args){

        createfile RR = new createfile();
        RR.openFile();
        RR.addRecords();
        RR.closeFile();

    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
Exception Handling
### Exception e = catch ALL error
## using try catch loop to make sure the program runs
## add DO WHILE loop by setting x=2 then go back
## if everything GOOD x == 1 then bye

import java.util.*;

public class sample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 1

        do{
         
        try{
            System.out.println("First num")
            int n1 = input.nextInt();
            System.out.println("2nd num")
            int n2 = input.nextInt();
            int sum = n1/n2;
            System.out.println(sum);
            x=2;
        }
        catch(Exception e){
            System.out.println("ERROR go fix")   
        }
        }while (x==1);
    }
}

-------------------------------------------------------------------
--------------------------------------------------------------------
### a.equals("STRING")
## use equals method"function" to test String
## == will not since ID are different

### b.equalsIgnoreCase(c)

public class edmond{
    public static void main(String args[]){

        String a = "apples";
        String b = "GG";
        String c = "gg";
        System.out.println(a.length());


        if(a.equals("apples")){
            System.out.println("GOOD");
        }
    }
}





-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------

-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
-------------------------------------------------------------------
--------------------------------------------------------------------
---------------------------------------------
----------------------------------------------
Collections
## = a lot like an array that holds STUFF
## but it is dynamic like list

### List<Datatype> list = new Linked/Arraylist<String>()
### LinkedList<String>()
### ArrayList<String>()

//salmon.java
import java.util.*;
public class salmon{
    public static void main(String args[]){

        String[] = {"egg","laser","hat","pie"}
        List<String> list = new ArrayList<String>();

        // add array items to list
        for (String x: things)
        list1.add(x);
        
        
        String[] = morethings = ("lasers", "hats");
        List<String> list2 = new Arraylist<String>();
        
        // add array items to list
        for (String y: more)
        list2.add(y);

        //printout list1
        for(int i = 0; i<list1.size();i++){
            System.out.printf("%s", list2.get(i));
        }
        
        //remove item from list2 in list1
        editlist(list1, list2);
        System.out.println();
        
        //printout list1
        for(int i = 0; i<list1.size();i++){
            System.out.printf("%s", list2.get(i));
        }
    }

    public static void editlist(Collection<String> l1,Collection<String> l2){
        Iterator<String> it =l1.iterator();
        while(it.hasNext()){ // iterate 
            if(l2.contains(it.next())) // if l2 contains that item
                it.remove(); // then remove item
        }
    }
}
eggs lasers hat pie // laser & hat l2 so GG
eggs pie



---------------------------------------------
----------------------------------------------
LinkedList

### LinkedList<String>
## printme()
## removeStuff
## reverseMe

//salmon.java
import java.util.*;
public class salmon{
    public static void main(String args[]){


        String[] things = ("apples","noobs", "a", "b", "c");
        List<String> list1= new LinkedList<String>();
        for (String x : things)
            list1.add(x);

        String[] things 2 = ("WTF" , "AMAZON", "GOOGLE");
        List<String> list2 = new LinkedList<String>();
        for(String y : things)
            list2.add(y);

        list1.addAll(list2);
        list2 = null;


        printMe(list1);
        removeStuff(list1,2,5);
        printMe(list1);
        reverseMe(list1);
    }
}











