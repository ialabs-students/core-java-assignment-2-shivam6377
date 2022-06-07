package com.Assignment;
import java.util.*;
import java.math.*;
class ArrayListSort {
public static List<BigInteger> arrayListSortDesc(List<BigInteger> arrayList) {
arrayList.sort(Collections.reverseOrder());
return arrayList;
}
}
public class Javaassignment2{
public static void main(String[] args) {
ArrayList<BigInteger> arrayList = new ArrayList<>();
int[] values = {24, 543534, 545, 2342, 9};
for (Integer i : values) {
arrayList.add(new BigInteger(String.valueOf(i)));
}
System.out.println("Sorted array list in Descending order :" + ArrayListSort.arrayListSortDesc(arrayList));
}

}

