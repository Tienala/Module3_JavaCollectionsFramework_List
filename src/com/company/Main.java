/* Module 3. Task 1
 * Classname: Main
 *
 * Version 1
 *
 * Nataliia Zviertseva, NTU KhPI
 *
 *1.  Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 */
package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
 //-------------------------Task1-------------------------------------------------
//ArrayList&LinkedList creation for 100 000 Integer elements.
        LocalDateTime startTime = LocalDateTime.now();
        List<Integer> array1 = new ArrayList<>();
        for (int i = 0; i<= 100000; i++) {
            array1.add(i);
        }
        LocalDateTime finishTimeArray1 = LocalDateTime.now();
        List<Integer> linked1 = new LinkedList<>();
        for (int i = 0; i<= 100000; i++) {
            linked1.add(i);
        }
//Time counting        
        LocalDateTime finishTimeLinked1 = LocalDateTime.now();
        double array1fulfilling =
                ChronoUnit.MILLIS.between(startTime, finishTimeArray1);
        double linked1fulfilling =
                ChronoUnit.MILLIS.between(finishTimeArray1, finishTimeLinked1);
        System.out.println("ArrayList creation is " + array1fulfilling + " m.s."
                +"LinkedList creation is " + linked1fulfilling + " m.s.");
//Comparing results
        System.out.println("Lower time interval has "
                + (array1fulfilling < linked1fulfilling?
                "ArayList creation" : "Linkedlist creation"));

//-------------------------Task2-------------------------------------------------
//Adding elements to Array List
        LocalDateTime timeStartToAddInBeginningArray = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            array1.add(0, 1);
        }
        LocalDateTime timeFinishToAddInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            array1.add(array1.size() / 2, 2);
        }
        LocalDateTime timeFinishToAddInMidle = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            array1.add(3);
        }
        LocalDateTime timeFinishToAddInTheEnd = LocalDateTime.now();
//Time counting
        double addingElementsInArrayInBeginning =
                ChronoUnit.MILLIS.between(timeStartToAddInBeginningArray, timeFinishToAddInBeginning);
        double addingElementsInArrayInMiddle =
                ChronoUnit.MILLIS.between(timeFinishToAddInBeginning, timeFinishToAddInMidle);
        double addingElementsInArrayInTheEnd =
                ChronoUnit.MILLIS.between(timeFinishToAddInMidle, timeFinishToAddInTheEnd);
        System.out.println( "Time of adding elements in array in begginning is "
                + addingElementsInArrayInBeginning + " m.s. "
                + "Time of adding element in array in middle is "
                + addingElementsInArrayInMiddle+ " m.s. "
                + "Time of adding element in array in the end is  "
                + addingElementsInArrayInTheEnd + " m.s");
//Adding elements to Linked List
        LocalDateTime timeStarToAddInBeginningLinked = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
           linked1.add(0, 1);
        }
        LocalDateTime timeFinishToAddInBeginningLinked = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linked1.add(linked1.size() / 2, 1);
        }
        LocalDateTime timeFinishToAddInMidleLinked = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linked1.add(1);
        }
//Time counting
        LocalDateTime timeFinishToAddInTheEndLinked = LocalDateTime.now();
        double addingElemntsToLinkedBeginning =
                ChronoUnit.MILLIS.between
                        (timeStarToAddInBeginningLinked, timeFinishToAddInBeginningLinked);
        double addingElementsToLinkedMiddle =
                ChronoUnit.MILLIS.between
                        (timeFinishToAddInBeginningLinked, timeFinishToAddInMidleLinked);
        double addingElementsToLinkedEnd =
                ChronoUnit.MILLIS.between
                        (timeFinishToAddInMidleLinked, timeFinishToAddInTheEndLinked);

        System.out.println("Time of adding elements in linked list in beginning "
                + addingElemntsToLinkedBeginning + " m.s."
                +" Time of adding elements in linked list in midle "
                + addingElementsToLinkedMiddle + " m.s."
                + " Time of adding elements in linked list in the end "
                + addingElementsToLinkedEnd + " m.s.");
//-----------------------Task3---------------------------------------------------
//Updating Elements in Array List
        LocalDateTime timeStartToUpdateArray = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            array1.set(0, 1);
        }
        LocalDateTime timeFinishUpdateArrayInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
           array1.set(array1.size() / 2, 1);
        }
        LocalDateTime timeFinishUpdateArrayInMidle = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            array1.set(array1.size() - 1, 1);
        }
//Time counting
        LocalDateTime timeFinishUpdateInTheEnd = LocalDateTime.now();
        double updatingArrayInBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartToUpdateArray, timeFinishUpdateArrayInBeginning);
        double updatingArrayInMiddle =
                ChronoUnit.MILLIS.between
                        (timeFinishUpdateArrayInBeginning, timeFinishUpdateArrayInMidle);
        double updatingArrayInTheEnd =
                ChronoUnit.MILLIS.between
                        (timeFinishUpdateArrayInMidle, timeFinishUpdateInTheEnd);
        System.out.println("Time of Updating Array in beginning is "
                + updatingArrayInBeginning + " m.s."
                +"Time of Updating Array in midle is "
                + updatingArrayInMiddle + " m.s."
                +"Time of Updating Array in the end is "
                + updatingArrayInTheEnd + " m.s.");
//Updating Elements in Linked List
        LocalDateTime timeStartToUpdateLinked = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linked1.add(0, 1);
        }
        LocalDateTime timeFinisUpdateLinkedInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linked1.add(linked1.size() / 2, 1);
        }
        LocalDateTime timeFinisUpdateLinkedInMidle  = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linked1.add(array1.size() - 1, 1);
        }
        LocalDateTime timeFinisUpdateLinkedInTheEnd = LocalDateTime.now();
//Time counting
        double updatingLinkedInBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartToUpdateLinked, timeFinisUpdateLinkedInBeginning );
        double updatingLinkedInMiddle =
                ChronoUnit.MILLIS.between
                        (timeFinisUpdateLinkedInBeginning , timeFinisUpdateLinkedInMidle);
        double updatingLinkedInTheEnd =
                ChronoUnit.MILLIS.between
                        (timeFinisUpdateLinkedInMidle, timeFinisUpdateLinkedInTheEnd);

        System.out.println("Time of Updating Linked list in beginning is "
                + updatingLinkedInBeginning + " m.s."
                +"Time of Updating Linked list in midle is "
                + updatingLinkedInMiddle + " m.s."
                +"Time of Updating Linked list in the end is "
                + updatingLinkedInTheEnd + " m.s.");
//-------------------Task4-------------------------------------------------------
//Deleting Elements from Array list
        LocalDateTime timeStartToDeleteArray = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            array1.remove(0);
        }
        LocalDateTime timeFinishToDeleteArrayBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
           array1.remove(array1.size() / 2);
        }
        LocalDateTime timeFinishToDeleteArrayMidle  = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            array1.remove(array1.size() - 1);
        }
        LocalDateTime timeFinishToDeleteArrayTheEnd = LocalDateTime.now();
//Time counting
        double deleteArrayInBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartToDeleteArray, timeFinishToDeleteArrayBeginning );
        double deleteArrayInMiddle =
                ChronoUnit.MILLIS.between
                        (timeFinishToDeleteArrayBeginning , timeFinishToDeleteArrayMidle);
        double deleteArrayInTheEnd =
                ChronoUnit.MILLIS.between
                        (timeFinishToDeleteArrayMidle, timeFinishToDeleteArrayTheEnd);
        System.out.println("Time of delete Array in beginning is "
                + deleteArrayInBeginning + " m.s."
                +"Time of delete Array in midle is "
                + deleteArrayInMiddle + " m.s."
                +"Time of delete Array in the end is "
                + deleteArrayInTheEnd + " m.s.");
//Deleting Elements from Linked list
        LocalDateTime timeStartDeleteLinked = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linked1.remove(0);
        }
        LocalDateTime timeFinishDeleteLinkedInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linked1.remove(linked1.size() / 2);
        }
        LocalDateTime timeFinishDeleteLinkedInMidle  = LocalDateTime.now();

        for (int i = 0; i<= 1000; i++) {
           linked1.remove(array1.size() - 1);
        }
        LocalDateTime timeFinishDeleteLinkedInTheEnd = LocalDateTime.now();
//Time counting
        double deletingLinkedBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartDeleteLinked, timeFinishDeleteLinkedInBeginning );
        double deletingLinkedMiddle =
                ChronoUnit.MILLIS.between
                        (timeFinishDeleteLinkedInBeginning , timeFinishDeleteLinkedInMidle);
        double deletingLinkedEnd =
                ChronoUnit.MILLIS.between
                        (timeFinishDeleteLinkedInMidle, timeFinishDeleteLinkedInTheEnd);

        System.out.println("Time of delete Linked in beginning is "
                + deletingLinkedBeginning + " m.s."
                +"Time of delete Array in midle is "
                + deletingLinkedMiddle + " m.s."
                +"Time of delete Array in the end is "
                + deletingLinkedEnd + " m.s.");
    }
}
