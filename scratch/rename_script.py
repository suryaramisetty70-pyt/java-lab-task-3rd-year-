import os
import re
import subprocess

repo_dir = r"C:\Users\surya\.gemini\antigravity\scratch\java-tasks"

# 1. Delete all .class files
for root, dirs, files in os.walk(repo_dir):
    for f in files:
        if f.endswith(".class"):
            path = os.path.join(root, f)
            try:
                os.remove(path)
                print(f"Removed class file: {path}")
            except Exception as e:
                print(f"Error removing {path}: {e}")

# Mappings for each folder
week1_mapping = [
    ("Task2_ArrayIndexAccess.java", "Week1_Task1_ArrayIndexAccess.java"),
    ("Task3_BinarySearch.java", "Week1_Task2_BinarySearch.java"),
    ("Task4_MaxElement.java", "Week1_Task3_MaxElement.java"),
    ("Task5_KthSmallest.java", "Week1_Task4_KthSmallest.java"),
    ("Task6_PrintPairs.java", "Week1_Task5_PrintPairs.java"),
    ("Task7_DigitSumOpt.java", "Week1_Task6_DigitSumOpt.java"),
    ("Task8_NthFibonacci.java", "Week1_Task7_NthFibonacci.java"),
    ("Task9_IsPalindrome.java", "Week1_Task8_IsPalindrome.java"),
    ("Task10_SumOfLastDigits.java", "Week1_Task9_SumOfLastDigits.java"),
]

week2_mapping = [
    ("Week2_Session6_BuildArrayFromPermutation.java", "Week2_Task1_BuildArrayFromPermutation.java"),
    ("Week2_Session6_ShuffleTheArray.java", "Week2_Task2_ShuffleTheArray.java"),
    ("Week2_Session7_RemoveElement.java", "Week2_Task3_RemoveElement.java"),
    ("Week2_Session7_RemoveDuplicates.java", "Week2_Task4_RemoveDuplicates.java"),
    ("Week2_Session8_MaximumSubarray.java", "Week2_Task5_MaximumSubarray.java"),
    ("Week2_Session8_HighestAltitude.java", "Week2_Task6_HighestAltitude.java"),
    ("Week2_Session9_GroupAnagrams.java", "Week2_Task7_GroupAnagrams.java"),
    ("Week2_Session9_TopKFrequentElements.java", "Week2_Task8_TopKFrequentElements.java"),
    ("Week2_Session10_JavaDeque.java", "Week2_Task9_JavaDeque.java"),
    ("Week2_Session10_JavaHashSet.java", "Week2_Task10_JavaHashSet.java"),
]

week3_mapping = [
    ("Week3_Session11_JavaDateAndTime.java", "Week3_Task1_JavaDateAndTime.java"),
    ("Week3_Session11_DaysBetweenDates.java", "Week3_Task2_DaysBetweenDates.java"),
    ("Week3_Session12_DayOfTheYear.java", "Week3_Task3_DayOfTheYear.java"),
    ("Week3_Session12_DayOfTheWeek.java", "Week3_Task4_DayOfTheWeek.java"),
    ("Week3_Session13_JavaPriorityQueue.java", "Week3_Task5_JavaPriorityQueue.java"),
    ("Week3_Session13_JavaArrayList.java", "Week3_Task6_JavaArrayList.java"),
    ("Week3_Session14_LargestNumber.java", "Week3_Task7_LargestNumber.java"),
    ("Week3_Session14_JavaComparator.java", "Week3_Task8_JavaComparator.java"),
    ("Week3_Session15_SortArrayByParity.java", "Week3_Task9_SortArrayByParity.java"),
    ("Week3_Session15_SortThePeople.java", "Week3_Task10_SortThePeople.java"),
]

week4_mapping = [
    ("Week4_Session1_DetermineIfStringHalvesAreAlike.java", "Week4_Task1_DetermineIfStringHalvesAreAlike.java"),
    ("Week4_Session1_Lapindromes.java", "Week4_Task2_Lapindromes.java"),
    ("Week4_Session2_CompareTheTriplets.java", "Week4_Task3_CompareTheTriplets.java"),
    ("Week4_Session2_ContainsDuplicate.java", "Week4_Task4_ContainsDuplicate.java"),
    ("Week4_Session3_TimeConversion.java", "Week4_Task5_TimeConversion.java"),
    ("Week4_Session3_MoveZeroes.java", "Week4_Task6_MoveZeroes.java"),
    ("Week4_Session4_DiagonalDifference.java", "Week4_Task7_DiagonalDifference.java"),
    ("Week4_Session4_TransposeMatrix.java", "Week4_Task8_TransposeMatrix.java"),
    ("Week4_Session5_MatrixBlockSum.java", "Week4_Task9_MatrixBlockSum.java"),
    ("Week4_Session5_MatrixRotationAlgo.java", "Week4_Task10_MatrixRotationAlgo.java"),
]

week5_mapping = [
    ("Week5_Session1_MaximumSubarray.java", "Week5_Task1_MaximumSubarray.java"),
    ("Week5_Session1_TheBirthdayBar.java", "Week5_Task2_TheBirthdayBar.java"),
    ("Week5_Session2_MaxSubarray.java", "Week5_Task3_MaxSubarray.java"),
    ("Week5_Session2_MaximumSumCircularSubarray.java", "Week5_Task4_MaximumSumCircularSubarray.java"),
    ("Week5_Session3_StringToIntegerAtoi.java", "Week5_Task5_StringToIntegerAtoi.java"),
    ("Week5_Session3_AlternatingCharacters.java", "Week5_Task6_AlternatingCharacters.java"),
    ("Week5_Session4_LongestSubstringWithoutRepeatingCharacters.java", "Week5_Task7_LongestSubstringWithoutRepeatingCharacters.java"),
    ("Week5_Session4_FindAndReplacePattern.java", "Week5_Task8_FindAndReplacePattern.java"),
    ("Week5_Session5_StringMatchingInAnArray.java", "Week5_Task9_StringMatchingInAnArray.java"),
    ("Week5_Session5_NaivePatternSearching.java", "Week5_Task10_NaivePatternSearching.java"),
]

week6_mapping = [
    ("Week6_Session1_StringSimilarity.java", "Week6_Task1_StringSimilarity.java"),
    ("Week6_Session1_RepeatedSubstringPattern.java", "Week6_Task2_RepeatedSubstringPattern.java"),
    ("Week6_Session2_TwoStrings.java", "Week6_Task3_TwoStrings.java"),
    ("Week6_Session2_RotateString.java", "Week6_Task4_RotateString.java"),
    ("Week6_Session3_MarsExploration.java", "Week6_Task5_MarsExploration.java"),
    ("Week6_Session3_FindAllAnagramsInAString.java", "Week6_Task6_FindAllAnagramsInAString.java"),
    ("Week6_Session4_PalindromeIndex.java", "Week6_Task7_PalindromeIndex.java"),
    ("Week6_Session4_FirstOccurrenceInString.java", "Week6_Task8_FirstOccurrenceInString.java"),
    ("Week6_Session5_LongestPalindromicSubstring.java", "Week6_Task9_LongestPalindromicSubstring.java"),
    ("Week6_Session5_CircularPalindromes.java", "Week6_Task10_CircularPalindromes.java"),
]

classtasks_mapping = [
    ("AgeCalculator.java", "ClassTask1_AgeCalculator.java"),
    ("CurrentLocalDateTime.java", "ClassTask2_CurrentLocalDateTime.java"),
    ("UppercaseNamesStream.java", "ClassTask3_UppercaseNamesStream.java"),
    ("SquaresOfEvenNumbersStream.java", "ClassTask4_SquaresOfEvenNumbersStream.java"),
    ("StreamFilterMapForEach.java", "ClassTask5_StreamFilterMapForEach.java"),
    ("EmployeeSalaryAscending.java", "ClassTask6_EmployeeSalaryAscending.java"),
    ("EmployeeSalaryDescending.java", "ClassTask7_EmployeeSalaryDescending.java"),
    ("EmployeeDeptAlphabetical.java", "ClassTask8_EmployeeDeptAlphabetical.java"),
    ("EmployeeDeptSalaryDescending.java", "ClassTask9_EmployeeDeptSalaryDescending.java"),
    ("LambdaAddTwoIntegers.java", "ClassTask10_LambdaAddTwoIntegers.java"),
    ("LambdaCheckEven.java", "ClassTask11_LambdaCheckEven.java"),
    ("LambdaSquareNumber.java", "ClassTask12_LambdaSquareNumber.java"),
    ("LambdaCompareStringsByLength.java", "ClassTask13_LambdaCompareStringsByLength.java"),
    ("HigherOrderFunctionArgument.java", "ClassTask14_HigherOrderFunctionArgument.java"),
    ("HigherOrderPredicateFilter.java", "ClassTask15_HigherOrderPredicateFilter.java"),
    ("HigherOrderConsumerProcessNames.java", "ClassTask16_HigherOrderConsumerProcessNames.java"),
    ("HigherOrderFunctionSequentialComposition.java", "ClassTask17_HigherOrderFunctionSequentialComposition.java"),
    ("SortIntegersAscending.java", "ClassTask18_SortIntegersAscending.java"),
    ("SortIntegersDescending.java", "ClassTask19_SortIntegersDescending.java"),
    ("SortNamesAlphabetically.java", "ClassTask20_SortNamesAlphabetically.java"),
    ("SortNamesByLength.java", "ClassTask21_SortNamesByLength.java"),
    ("StudentSortByMarks.java", "ClassTask22_StudentSortByMarks.java"),
]

all_folders = [
    ("Week1", week1_mapping),
    ("Week2", week2_mapping),
    ("Week3", week3_mapping),
    ("Week4", week4_mapping),
    ("Week5", week5_mapping),
    ("Week6", week6_mapping),
    ("ClassTasks", classtasks_mapping),
]

for folder, mapping in all_folders:
    folder_path = os.path.join(repo_dir, folder)
    for old_file, new_file in mapping:
        old_path = os.path.join(folder_path, old_file)
        new_path = os.path.join(folder_path, new_file)

        if not os.path.exists(old_path):
            print(f"Skipping {old_path} (does not exist)")
            continue

        old_class_name = old_file.replace(".java", "")
        new_class_name = new_file.replace(".java", "")

        # Read content and replace class name
        with open(old_path, "r", encoding="utf-8") as f:
            content = f.read()

        new_content = re.sub(r'\bpublic class ' + re.escape(old_class_name) + r'\b', f'public class {new_class_name}', content)

        # Write to old path first
        with open(old_path, "w", encoding="utf-8") as f:
            f.write(new_content)

        # Git mv
        subprocess.run(["git", "mv", os.path.join(folder, old_file), os.path.join(folder, new_file)], cwd=repo_dir, shell=True)
        print(f"Renamed: {folder}/{old_file} -> {folder}/{new_file}")

print("All file renames completed successfully!")
