//                                               ARRAYS (List)

// length -->                   to find the length of the array   .length
// sort   -->                   to sort the given array           .sort


import java.util.*;             
// this import all the java util packages
// for arrays package we use 
// import java.util.Array;


public class E_arrays {
    
    public static void main(String[] args) {
        int[] marks = new int[3];                                     // new keyword is used to allocate memory or declare the size of the array
        
    marks[0] = 95;
    marks[1] = 98;
    marks[2] = 92;

    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);

    System.out.println(marks.length);                                 // gives the length of the array and we dont need () in length

    System.out.println(marks[0]);                                     // before sorting 95
    Arrays.sort(marks);
    System.out.println(marks[0]);                                     // after sorting 92

    int[][] marks_two_students = {{97, 98, 99},{90, 95, 97}};
    System.out.println(marks_two_students[0][0]);                     // 1st student 1st subject marks 
    }
}

//  int[] marks = new int[3];                                         if we didnt initlize the array by default all the index are 0
// boolean[] adult = new boolean[3]                                    same if we didnt initlize the array all the index are False 
// int[] marks = {90, 95, 97};
