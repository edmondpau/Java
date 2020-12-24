
//assume thenewboston_intermediate.java
### i.startswith()
### i.endswith()


public class thenewboston_intermediate{
    public static void main(String args[]){
        String[] words = {"funk", "chunk", "furry", "baconator"};


        //startswith
        for(String w : words){
            if(w.startsWith("fu"))
                System.out.println(w +  "starts with fu");
        }
        //endswith
        for(String w : words){
            if(w.endsWith("fu"))
                System.out.println(w +  "ends with fu");
        }
    }
}

---------------------------------------------
----------------------------------------------
### string.indexOf('character',fromIndex starting from)
## s.indexOf('k',5) = "find k by ignoring first 5+1 index"


//salmon.java
public class salmon{
    public static void main(String args[]){

        String s = "buckyrobertsbuckyroberts";

        System.out.println(s.indexOf("k",5))
        System.out.println(s.indexOf("rob", 10))
    }
}

11
17


---------------------------------------------
----------------------------------------------
Concatenate
### concat = stringa.concat(stringb)
### replace = stringa.replace('character','character')
### x.toUpperCase() = string.toUpperCase()
### x.trim() = delete all spaces



//salmon.java
public class salmon{
    public static void main(String args[]){

        String a = "Bacon";
        String b = "    monster ";

        System.out.println(a + b);
        System.out.println(a.concat(b))
        System.out.println(a.replace('B','F'))
        System.out.println(b.toUpperCase());
        System.out.println(b.trim());

    }
}
Facon

---------------------------------------------
----------------------------------------------
Recursion
### Recursion algo for factorial

public class salmon{

    //main method"funciton"
    public static void main(String args[]){
        System.out.println(fact(5));
    
    }

    //fact method
    public static long fact(long n){
        if(n <= 1) // base case here, stop here and start filling
            return 1;
        else
            return n * fact(n-1);
    }
}


## stop at 1, then start filling until ANSWER
120                 1,2,6,24,120

---------------------------------------------
----------------------------------------------
Collections
## = a lot like an array that holds STUFF
## but it is dynamic like list

### List<Datatype>
### ArrayList<String>()

//salmon.java
import java.util.*;
public class salmon{
    public static void main(String args[]){

        String[] = {"a","b","c","d"}
        List<String> list = new ArrayList<String>();

    // add array items to list
    for (String x: things)
        list1.add(x);

    
    String[] = morethings = 
    }
}