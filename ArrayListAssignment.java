package Main;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment {

	public static void displayArrayList(ArrayList<Integer> numberList) {
		for (int i : numberList) {
			System.out.print(i + " ");
		}
	}

	public static void addElement(ArrayList<Integer> numberList, int element) {
		numberList.add(element);
	}

	public static void removeElement(ArrayList<Integer> numberList, int index) {
		numberList.remove(index);
	}

	public static void reverseArrayList(ArrayList<Integer> numberList) {
		Collections.reverse(numberList);
		System.out.println("After Reverse Order, ArrayList Contains : " + numberList);
	}

	public static void findSum(ArrayList<Integer> numberList) {
		int sum = 0;
		for (int i : numberList) {
			sum = sum + i;
		}
		System.out.print("sum : " + sum);
	}

	public static void findMax(ArrayList<Integer> numberList) {
		int max = numberList.get(0);
		for (int i : numberList) {
			if (i > max) {
				max = i;
			}
		}
		System.out.print("Max : " + max);
	}

	public static void findMin(ArrayList<Integer> numberList) {
		int min = numberList.get(0);
		for (int i : numberList) {
			if (i < min) {
				min = i;
			}
		}
		System.out.print("min : " + min);
	}

	public static void sortArrayList(ArrayList<Integer> numberList) {
		Collections.sort(numberList);
		System.out.println(numberList);
	}

	public static int sortArrayList(ArrayList<Integer> numberList, int elements) {
		int position = -1;
		position = numberList.indexOf(elements);
		if (position == -1) {
			System.out.println("obj not found");
			return -1;
		}
		return position;
	}

	public static void subList(ArrayList<Integer> numberList, int start, int end) {
		System.out.println(numberList.subList(2, 4));
	}

	public static void isEmptyArrayList(ArrayList<Integer> numberList) {
		System.out.println(numberList.isEmpty());
	}

	public static void findAverage(ArrayList<Integer> numberList, int start, int end) {
		int sum = 0;
		for (int i : numberList) {
			sum = sum + i;
		}
		int average = sum / numberList.size();
		System.out.print("Average : " + average);
	}

	public static void replaceElement(ArrayList<Integer> numberList, int oldElement, int newElement) {
		int oldElementIndex = numberList.indexOf(oldElement);
		numberList.set(oldElementIndex, newElement);
	}

	public static int countOccurrences(ArrayList<Integer> numberList, int elements) {
		int count = 0;
		for (int i : numberList) {
			if (i == elements) {
				count++;
			}
		}
		return count;
	}

	@SuppressWarnings("unchecked")
	public static void copyArrayList(ArrayList<Integer> numberList) {
		ArrayList<Integer> numberListCopy = new ArrayList<Integer>(10);
		numberListCopy = (ArrayList<Integer>) numberList.clone();
		System.out.println(numberListCopy);
	}

	public static void getArrayListSize(ArrayList<Integer> numberList, int start, int end) {
		System.out.println(numberList.size());
	}

	public static void clearArrayList(ArrayList<Integer> numberList) {
		numberList.clear();
		System.out.println(numberList);
	}

	public static void removeDuplicates(ArrayList<Integer> numberList, int element) {
		int count=0;
		if (numberList.contains(element)) {
			for(int i : numberList) {
				if(i == element) {
					count++;
					if(count>1) {
						numberList.remove(numberList.indexOf(i));
					}
				}
			}
		}
		count=0;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<Integer>(10);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		numberList.add(9);
		numberList.add(1);
		numberList.add(2);
		numberList.add(4);
		numberList.add(5);
		
		findSum(numberList);
		findMax(numberList);
		
	}

}
