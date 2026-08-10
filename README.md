# 📚 Java 3rd Year Lab Tasks & Class Tasks

Welcome! This repository contains Java programs for 3rd Year Java Lab Tasks and Class Tasks organized by folders.

---

## 📁 Repository Structure

```text
java-lab-task-3rd-year/
├── ClassTasks/
│   ├── AgeCalculator.java
│   ├── CurrentLocalDateTime.java
│   ├── UppercaseNamesStream.java
│   ├── SquaresOfEvenNumbersStream.java
│   ├── StreamFilterMapForEach.java
│   ├── EmployeeSalaryAscending.java
│   ├── EmployeeSalaryDescending.java
│   ├── EmployeeDeptAlphabetical.java
│   └── EmployeeDeptSalaryDescending.java
├── Week1/
│   ├── Task2_ArrayIndexAccess.java
│   ├── Task3_BinarySearch.java
│   ├── Task4_MaxElement.java
│   ├── Task5_KthSmallest.java
│   ├── Task6_PrintPairs.java
│   ├── Task7_DigitSumOpt.java
│   ├── Task8_NthFibonacci.java
│   ├── Task9_IsPalindrome.java
│   └── Task10_SumOfLastDigits.java
├── Week2/
│   ├── Week2_Session6_BuildArrayFromPermutation.java
│   ├── Week2_Session6_ShuffleTheArray.java
│   ├── Week2_Session7_RemoveElement.java
│   ├── Week2_Session7_RemoveDuplicates.java
│   ├── Week2_Session8_MaximumSubarray.java
│   ├── Week2_Session8_HighestAltitude.java
│   ├── Week2_Session9_GroupAnagrams.java
│   ├── Week2_Session9_TopKFrequentElements.java
│   ├── Week2_Session10_JavaDeque.java
│   └── Week2_Session10_JavaHashSet.java
├── Week3/
│   ├── Week3_Session11_JavaDateAndTime.java
│   ├── Week3_Session11_DaysBetweenDates.java
│   ├── Week3_Session12_DayOfTheYear.java
│   ├── Week3_Session12_DayOfTheWeek.java
│   ├── Week3_Session13_JavaPriorityQueue.java
│   ├── Week3_Session13_JavaArrayList.java
│   ├── Week3_Session14_LargestNumber.java
│   ├── Week3_Session14_JavaComparator.java
│   ├── Week3_Session15_SortArrayByParity.java
│   └── Week3_Session15_SortThePeople.java
├── .gitignore
└── README.md
```

---

## 📖 Class Tasks Overview
- **`AgeCalculator.java`**: Calculate age in Years, Months, and Days using `java.time.Period`.
- **`CurrentLocalDateTime.java`**: Find and print current LocalDate, LocalTime, and LocalDateTime.
- **`UppercaseNamesStream.java`**: Convert and print names in uppercase using Java Stream API.
- **`SquaresOfEvenNumbersStream.java`**: Filter even numbers and print their squares using Java Stream API.
- **`StreamFilterMapForEach.java`**: Perform Stream operations: stream conversion, filtering, mapping, and `forEach()`.
- **`EmployeeSalaryAscending.java`**: Sort employees by salary in ascending order (`Comparator.comparing`).
- **`EmployeeSalaryDescending.java`**: Sort employees by salary in descending order (`reversed()`).
- **`EmployeeDeptAlphabetical.java`**: Sort employees by department name alphabetically.
- **`EmployeeDeptSalaryDescending.java`**: Multiple fields sorting: Department alphabetically + Salary descending (`thenComparing()`).

---

## 📖 Week 1 Tasks Overview
- **Task 2**: Access and print the element at a given index in an array
- **Task 3**: Search for a given element in a sorted array using Binary Search
- **Task 4**: Find the maximum element in an array of n integers
- **Task 5**: Find the Kth smallest element in an array
- **Task 6**: Print all possible pairs of elements from an array
- **Task 7**: `digitSum opt`: Sum of even or odd digits (Lambda Expressions)
- **Task 8**: Nth Fibonacci (Lambda Expressions)
- **Task 9**: Is Palindrome Number? (Functional Interfaces & Method References)
- **Task 10**: Sum of last digits of two numbers (Functional Interfaces & Method References)

---

## 📖 Week 2 Tasks Overview
- **Session 6 (Functional Programming using map)**: Build Array from Permutation, Shuffle the Array
- **Session 7 (Functional Programming using filter)**: Remove Element, Remove Duplicates
- **Session 8 (Functional Programming using reduce)**: Maximum Subarray, Find Highest Altitude
- **Session 9 (Stream & Pipeline Processing)**: Group Anagrams, Top K Frequent Elements
- **Session 10 (Stream API & Collection Processing)**: Java Deque, Java HashSet

---

## 📖 Week 3 Tasks Overview
- **Session 11**: Java Date and Time, Number of Days Between Two Dates
- **Session 12**: Day of the Year, Day of the Week
- **Session 13**: Java Priority Queue, Java ArrayList
- **Session 14**: Largest Number, Java Comparator
- **Session 15**: Sort Array By Parity, Sort the People

---

## 🚀 How to Run the Code

1. Navigate to the desired folder:
   ```powershell
   cd ClassTasks
   # OR
   cd Week1
   # OR
   cd Week2
   # OR
   cd Week3
   ```

2. Compile and Run any task file:
   ```powershell
   javac FileName.java
   java ClassName
   ```
