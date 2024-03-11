import java.util.Scanner;
public class NameSorter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter 5 names:");
String[] names = new String[5];
for (int i = 0; i < 5; i++) {
names[i] = input.nextLine();
}
// Bubble Sorting of names in ascending order
bubbleSortAscending(names);
System.out.println("Names in ascending alphabetical order:");
printNames(names);
// Bubble Sorting of names in descending order
bubbleSortDescending(names);
System.out.println("Names in descending alphabetical order:");
printNames(names);
input.close();
}
public static void bubbleSortAscending(String[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - 1 - i; j++) {
if (arr[j].compareTo(arr[j + 1]) > 0) {
// Swapping
String temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}
public static void bubbleSortDescending(String[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - 1 - i; j++) {
if (arr[j].compareTo(arr[j + 1]) < 0) {
// Swapping
String temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}
public static void printNames(String[] arr) {
for (String name : arr) {
System.out.println(name);
}
}
}
