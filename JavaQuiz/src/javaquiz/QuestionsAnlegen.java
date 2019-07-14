package javaquiz;

import java.util.HashMap;
import static javaquiz.JavaQuiz.menu;

public class QuestionsAnlegen {

    public static void fragen() throws InterruptedException {

        HashMap<Integer,Questions> qs = new HashMap<>();

        Questions qs1 = new Questions(1, "What is the size of float variable",
                "8 bit", "16 bit", "32 bit", "64 bit", 3, 8);
        Questions qs2 = new Questions(2, "What is the default value of Boolean variable",
                "true","0", "null", "false", 4, 4);
        Questions qs3 = new Questions(3, "What is instance variable", "..static variables "
                + "within a class but outside any method", "..are variables defined inside methods "
                        + "constructors or blocks", "..are variables within a class but outside any method",
                        "None of the above", 3, 12);
        Questions qs4 = new Questions(4, "Method Overloading is an example of..", "Static Binding",
                "Dynamic Binding", "Both of the above", "None of the above", 1, 6);
        Questions qs5 = new Questions(5, "A constructor can be inherited?", "True", "7", "ArrayList", "False", 4, 4);
        Questions qs6 = new Questions(6, "Which permits the removal of elements from a collection?",
                "Enumeration", "Iterator", "Integer", "None of the above", 2, 2);
        Questions qs7 = new Questions(7, "The Comparator interface contains the method...",
                "..compareWith", "..compareTo()", "..compare()", 3, 6);
        Questions qs8 = new Questions(8, "Which of those is synchronised?", "Array List", "Vector", "if", "for", 2, 2);
        Questions qs9 = new Questions(9, "double a = 10.0;\ndouble b = 3.0;\nint erg = 0;\nerg = (int) (a/b);\n- returns what?",
                "30", "13", "3", "420", 3, 3);
        Questions qs10 = new Questions(10, "java.util.Collections; is a..", "Class",
                "Interface", "Object", "None of the above", 1, 6);
        Questions qs11 = new Questions(11, "Which of these allows duplicate elements?",
                "ArrayList", "HashSet", "All", "None of the above", 1, 4);
        Questions qs12 = new Questions(12, "Which interface should be implemented for sorting on"
                + " basis of many criteria's?", "Comparator", "Comparable", "Remove", "String", 1, 3);
        Questions qs13 = new Questions(13, "Which of the following is not a Java keyword",
                "Try", "Main", "Integer", "String", 3, 4);
        Questions qs14 = new Questions(14, "Choose the appropriate data type for this value: 'Volatile'",
                "Double", "Boolean", "String", "Int", 3, 2);
        Questions qs15 = new Questions(15, "A Class is..", "An object", "An executable piece of code",
                "A variable", "An abstract definition of an object", 4, 4);
        Questions qs16 = new Questions(16, "The most common use of an array is to..",
                "..perform for loop on array", "..perform while loop on array", "..perform the same "
                        + "operation on all elements in array", "..perform different operations on "
                                + "each element in array", 3, 5);
        Questions qs17 = new Questions(17, "Given the declartion: int[] arr={1,2,3,4,5}; What is"
                + " the value of arr[3]?", "4", "5", "2", "3", 1, 2);
        Questions qs18 = new Questions(18, "What is a loop?", "A segment of code to be run infinite times",
                "A segment of code to be run once", "A segment of code to be run a specified amount of times",
                "To decide when something true or false is",3, 5);
        Questions qs19 = new Questions(19, "What does GUI stand for?", "Graphical User Interface",
                "Grand User Interface", "Graphical Useful Interface", "Great Underwear Installed", 1, 4);
        Questions qs20 = new Questions(20, "Class B inherits from Class A, what cannot be said?",
                "B is a sub-class of A", "A is a super-class of B", "B has access to protected "
                        + "members of A", "B has access to private members of A", 4, 6);
        Questions qs21 = new Questions(21, "What will be the value of 'num' after the following statements?\n"
                + "int num;\nnum = (5+4);\nnum = num*9;\nnum = 9;", "0", "9", "1", "num", 2, 3);
        Questions qs22 = new Questions(22, "Choose the best definition of an object in java", "Something you wear",
                "A thing", "An instance of a class", "A cup", 3, 8);
        Questions qs23 = new Questions(23, "The last value in an array called 'arr' can be found at index:",
                "0", "arr.length", "arr.length-1", "1", 3, 5);
        Questions qs24 = new Questions(24, "What is the difference between privat and public functions?",
                "Public functions can't be used", "Public functions are the only ones you can download",
                "Public functions are free, you have to buy private ones", "Public functions can be used "
                        + "by anyone, private can only be used by other code in the class you are writing",
                4,6);
        Questions qs25 = new Questions(25, "Which of the following always need a Capital letter?",
                "Objects and class names", "Data types and fields", "Class names and Strings",
                "Fields and Strings", 3, 6);
        Questions qs26 = new Questions(26, "Choose the best definition for a Class", "An action for a program",
                "An object definition, containing the data and function elements necessary to create an object",
                "A group of students in a class", "A turtle-neck", 2, 4);
        Questions qs27 = new Questions(27, "What is the keyword in java to create an object?", "New()",
                "new", "Sync", "this", 2, 4);
        Questions qs28 = new Questions(28, "An abstract class can have non-abstract methods", "True", "False",
                "Both", "Neither",1, 4);
        Questions qs29 = new Questions(29, "What is the size of a Char in java?", "16 bits", "8 bits", "4 bits",
                "7 bits", 1, 4);
        Questions qs30 = new Questions(30, "Java runs on__________", "Windows", "Unix/Linux", "Mac", "All of the above",
                4, 5);
        Questions qs31 = new Questions(31, "What is an instanceof?", "A keyword only", "A method in an object",
                "An operator and keyword", "An operator only", 3, 6);
        Questions qs32 = new Questions(32, "If we declare int[] arr={1,2,3,4,5,6}; The size of the array arr is?",
                "0", "6", "5", "7", 2, 4);
        Questions qs33 = new Questions(33, "An array holds..", "Same values of different data types",
                "Different values of different data types", "Similar values of same data type",
                "Different values of same data types", 3, 5);
        Questions qs34 = new Questions(34, "If class A implements an interface does it need to implement all methods "
                + "of that interface?", "No, not when A is abstract", "Yes, always", "Sometimes", "a=5;", 1, 5);
        Questions qs35 = new Questions(35, "Java keywords are written in lowercase as well as uppercase?", 
                "True", "False","Fals, because keywords are written in decimal","There are no keywords in java", 2, 4);
        
        qs.put(1,qs1); qs.put(2,qs2); qs.put(3,qs3);
        qs.put(4,qs4); qs.put(5,qs5); qs.put(6,qs6);
        qs.put(7,qs7); qs.put(8,qs8); qs.put(9,qs9);
        qs.put(10,qs10); qs.put(11,qs11); qs.put(12,qs12);
        qs.put(13,qs13); qs.put(14,qs14); qs.put(15,qs15);
        qs.put(16,qs16); qs.put(17,qs17); qs.put(18,qs18);
        qs.put(19,qs19); qs.put(20,qs20); qs.put(21,qs21);
        qs.put(22,qs22); qs.put(23,qs23); qs.put(24,qs24);
        qs.put(25,qs25); qs.put(26,qs26); qs.put(27,qs27);
        qs.put(28,qs28); qs.put(29,qs29); qs.put(30,qs30);
        qs.put(31,qs31); qs.put(32,qs32); qs.put(33,qs33);
        qs.put(34,qs34); qs.put(35,qs35);
        
        menu(qs);

    }
}
