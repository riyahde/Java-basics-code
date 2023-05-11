// import java.net.SocketTimeoutException;
// import java.util.Scanner;
 


// public class JavaBasics {
//     public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in); 
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//    }
// }            
           

//         1st question:average of 3 numbers::::
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int average = a+b+c/3;
//         System.out.println("average is:" + average);

//         2 question:area of the square :
//         int side = sc.nextInt();
//         int area = side * side;
//         System.out.println("area of the square is:" + area);
        
//         3 question:finding the bill:
//         float pen = sc.nextFloat();
//         float pencil = sc.nextFloat();
//         float eraser = sc.nextFloat();
//         float total = pen + pencil + eraser;
//         System.out.println("Bill is:" + total);
//         // Add on - with 18% tax :
//         float newTotal = total + (0.18f + total);
//         System.out.println("Bill with 18% tax :" + newTotal);
//     }
// }        

//         Arithmetic operators:
//         int A = 10;
//         int B = 5;
//         System.out.println("Sum:" +( A+B));
//         System.out.println("Difference:" + (A-B));
//         System.out.println("Product:" + (A*B));
//         System.out.println("Division" + A/B);
//         System.out.println("Modulo:" + A%B);

//         code for pre increment:
//         int a = 10;
//         int b = ++a;
//         System.out.println(a);
//         System.out.println(b);

//         code for post increment:
//         int a = 10;
//         int b = a++;
//         System.out.println(a);
//         System.out.println(b);
        
//         Relational operator:
//         int a = 10;
//         int b = 10;
//         System.out.println(a==b);

//         logical operator:
//         System.out.println((3>2) && (5>0));

//         Assignment operator :
//         int A = 10;
//         A += 10;
//         System.out.println(A);

//         conditional statement: if else statement:
//         int age = 16;
//         if(age >= 18) {
//             System.out.println("adult: drive,vote");
//         }

//         if(age>13 && age<18) {
//             System.out.println("teenager");
//         }

//         else {
//             System.out.println("not adult"); 
//         }

//         print the largest of 2 ,if a = 1,b = 3:
//         int a = 1;
//         int b = 3;
//         if(a >= b) {
//            System.out.println("a is the largest of 2");
//         }

//         else {
//            System.out.println("b is the largest of 2");
//         }  
        
//         print if a no. is odd or even:
//         int number = sc.nextInt();
//         if(number % 2 == 0) {
//             System.out.println("even");
//         }  
//         else {
//             System.out.println("odd");
//         }  

//         else if :
//         int age = 13;
//         if (age>=18) {
//             System.out.println("adult");
//         }
//         else if(age>=13 && age<18) {
//             System.out.println("teenager"); 
//         }
//         else {
//             System.out.println("child");
//         }   

//         Q. income tax calculator:income<5 lakh then 0% tax: income between 5-10 lakh then 20% tax: income> 10 lakh then 30
//         % tax:
//         int income = sc.nextInt();
//         int tax;
//         if (income < 500000) {
//             tax = 0;
//         }    
//         else if (income >= 500000 && income < 1000000) {
//             tax = (int) (income*0.2);
//         }
//         else {
//             tax = (int) (income*0.3);
//         }    
//             System.out.println("Your tax is:" + tax);

//         Q. Print the largest of 3 : if A = 1, B = 3, C = 6:
//         int A = 1 , B = 3 , C = 6;
//         if((A >= B) && (A >=C )) {
//             System.out.println("A is the largest");
//         }
//         else if((B >= C)) {
//             System.out.println("B is the largest"); 
//         }
//         else {
//             System.out.println("C is the largest");
//         }    

//         #:Ternary operator:
//         int number = 4;
//         String type = ((number%2) == 0) ? "even" : "odd";
//         System.out.println(type);

//         Q.Check if a student will pass or fail:
//         int marks = 67;
//         String reportCard = marks >= 33 ? "PASS" :"FAIL";
//         System.out.println(reportCard);

//         *switch variable: 
//         int number = 2;
//         switch(number)  {
//             case 1 : System.out.println("samosa");
//                          break;
//             case 2 : System.out.println("burger");
//                          break;
//             case 3 : System.out.println("mango shake");  
//                          break;
//             default : System.out.println("we wake up");                        
//         }

//    switch question: calculator:
//         System.out.println("enter a:");
//         int a = sc.nextInt();
//         System.out.println("enter b:");
//         int b = sc.nextInt();
//         System.out.println("enter operator");
//         char operator = sc.next().charAt(0);
//         switch(operator){
//             case '+': System.out.println(a+b);
//                           break;
//             case '-': System.out.println(a-b);  
//                           break;
//             case '*' : System.out.println(a*b);
//                         break;
//             case '/' : System.out.println(a/b);  
//                         break;
//             case '%' : System.out.println(a%b); 
//                         break;
//             default : System.out.println("wrong operator"); 
//         } 
//     } 
// }   
        
//         int number= sc.nextInt();
//         String type = (number>=0)?"positive": "negative";
//         System.out.println(type);

//         *question:if temperature above 100 
//         double temp = 103.5;
//         if(temp>100) {
//             System.out.println("you have a fever");
//         }else{
//             System.out.println("you don't have fever");  
//         }
 

//         System.out.println("enter the week number(1-7):");
//         int week = sc.nextInt();
//               switch(week){
//                 case 1: System.out.println("monday");
//                 break;
//                 case 2: System.out.println("tuesday");
//                 break;
//                 case 3: System.out.println("wednesday");
//                 break;
//                 case 4: System.out.println("thursday");
//                 break;
//                 case 5: System.out.println("friday");
//                 break;
//                 case 6: System.out.println("saturday");
//                 break;
//                 case 7: System.out.println("sunday");
//                 break;
//                 default: System.out.println("invalid input");
//               }
//         }        
// }



//            int counter = 0;
//            while(counter<100) {
//                 System.out.println("hello world");
//                 counter++;
//            }
//         }
// }        


// Q. PRINT NUMBER FROM 1 TO 10 ;
//                int counter = 1;
//                while(counter<=10){
//                 System.out.println(counter);
//                 counter++;
//                }
//         }
// }  



//  Q. PRINT NUMBER FROM 1 TO N;
//                   int range = sc.nextInt();
//                   int i = 1;
//                   while(i<=range){
//                         System.out.println(i);
//                         i++;
//                   }
//                   System.out.println(" ");
//                 }
//         }


//  Q.PRINT SUM OF N NATURAL NO.
//                      int range = sc.nextInt();
//                      int sum = 0;
//                      int i = 1;
//                      while(i<=range){
//                         sum += i;
//                         i++;
//                      }
//                      System.out.println("sum is:"+sum);
//                 }

// }


//  Q. PRINT SQARE PATTERN.
//                         for(int line=1; line<=4; line++){
//                                 System.out.println("****");
//                         }
//                 }
//         }



// Q. PRINT REVERSE OF A NUMBER:
//                            int n = 10899;
//                            while(n>0){
//                                 int lastdigit = n%10;
//                                 System.out.println(lastdigit + " ");
//                                 n = n/10;

//                            }
//                            System.out.println();
//                         }
//                 }


// Q.PRINT REVERSE OF A NUMBER:
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]){
        // scanner sc = new scanner(System.in);
//         int n = 10899;
//         while(n>0){
//             int lastdigit = n%10;
//             System.out.println(lastdigit);
//             n = n/10;

//         }
        
//     }
// }


//  Q. PRINT THE REVERSE OF THE NUMBER:
    //         int n = 10899;
    //         int rev = 0;
    //         while(n>0){
    //             int lastdigit = n%10;
    //             rev = (rev*10)+ lastdigit;
    //             n = n/10;
                

    //         }
    //         System.out.println(rev);
    //     }
    // }


    // import java.util.*;
    // public class JavaBasics{
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         do {
    //             System.out.println("enter your no.");
    //             int n = sc.nextInt();
    //             if(n % 10 == 0){
    //                 break;
    //             }
    //             System.out.println(n);
    //         }while(true);
    //     }
    // }
       


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//        // Scanner sc = new Scanner(System.in);
//         for(int line = 1;line<=4;line++){
//             for(int star = 1;star<=line;star++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }    


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         for(int line =1;line<=4;line++){
//             for(int star = 4;star>=line;star--){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
//


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         for(int line = 1;line<=4;line++){
//             for(int n = 1;n<=line;n++){
//                 System.out.print( n);
//             }
//             System.out.println( );
//         }
//     }
// }


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){

//         for(int line = 1; line<=4; line++){
//             int val=1;
//             for(int i =1 ;i<=line;i++){
//                 System.out.print(val);
//                 val+=2;
                

//             }
//             System.out.println( );
//         }
//     }
// }



//*function code :
// public class JavaBasics{
//     public static void printHelloWorld(){
//         System.out.println("Hello World");
//         return;
//     }
//     public static void main(String args[]){
//         printHelloWorld();
//     }
// }

// import java.util.*;
// public class JavaBasics{
//     public static void printHelloWorld(){
//          System.out.println("Hello World");
//          System.out.println("Hello World");
//          System.out.println("Hello World");
//     }
//     public static void calculateSum() {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("sum is:" +sum);
//     }
//     public static void main(String args []) {
//         calculateSum();

//     }
//     public static void main(String args[]){
//         printHelloWorld();
//     }
// }


// *FUNCTION USING PARAMETERS:
// import java.util.*;
// public class JavaBasics{
//     public static void calculateSum(int num1, int num2){
//         int sum = num1+num2;
//         System.out.println("sum is:"+sum);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculateSum(a,b);
//     }
// }


// or...
// import java.util.*;
// public class JavaBasics{
    // public static int calculateSum(int num1,int num2){        //parameters or formal parameters
//         int Sum = num1+num2;
//         return Sum;

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        // int sum = calculateSum(a,b);                         //arguments or actual parameters
//         System.out.println("sum is :" +sum);
//     }
// }



//*call by value:
// import java.util.*;
// public class JavaBasics{
//     public static void swap(int a , int b ){
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a= " +a);
//         System.out.println("b = " +b);
//     }


//     public static void main(String args[]){
//         int a = 5;
//         int b = 10;
//         swap(a,b);
//     }
    
// }



//*FIND THE PRODUCT OF A AND B WHERE A = 3 AND B =5;
// import java.util.*;
// public class JavaBasics{
//     public static int multiply(int a, int b ){
//         int product = a*b;
//         return product = a*b;

//     }
//     public static void main(String args[]){
//         int a = 3;
//         int b = 5;
//         int prod = multiply(a,b);
//         System.out.println("a * b = " +prod); 
    

//     }
// }



// *Find the factorial of a number:
// import java.util.*;
// public class JavaBasics{
//     public static int multiply(int a , int b ){
//         int product = a*b;
//         return product;
//     }
//     public static int factorial(int n){
//         int f = 1;
//         for(int i = 1;i<=n ;i++){
//             f = f*i;
//         }
//         return f;
//     }
//     public static void main(String args[]){
//         System.out.println(factorial(4));
//     }
// }
    


// *binomial coefficient where n= 5,r = 2;
import java.util.*;
public class JavaBasics{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n ;i++){
        f = f*i;
    }
        return f;
    }
    public static int binCoeff(int n, int r ){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;
    }
        
    
    public static void main(String args[]){
        System.out.println(binCoeff( 5,2));
    }
}





 












        



        
         



                    

         
   


        
        

        
        
        
        


    
   








        






       
   
        