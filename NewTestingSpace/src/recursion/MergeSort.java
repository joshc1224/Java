package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

	private int lCount=0, rCount=0, mergeCount=0, totCount=0;
	private ArrayList<Integer> test;
	
	public MergeSort(ArrayList<Integer> list) {
		test= list;
	}
	
	public MergeSort() {
		test = new ArrayList<>();
		int[] testFill = {5,3,1,6,2,4};
		for(int x:testFill) {
			test.add(x);
		}
	}
	
	public void run() {
		
		MergeSorter(test);
		System.out.println(test);
		
	}
	
	private void MergeSorter(ArrayList<Integer> list){
		totCount++;
		System.out.println(totCount+" "+list);
		if (list.size()==1) {
			return;
		}else {
			ArrayList<Integer> listL = new ArrayList<Integer>(list.subList(0, list.size()/2));
			ArrayList<Integer> listR = new ArrayList<Integer>(list.subList(list.size()/2, list.size()));
			MergeSorter(listL);
			System.out.println("made Left"+" "+lCount);													//UnComment to count list iterations
			lCount++;
			MergeSorter(listR);
			System.out.println("Made Right"+" "+rCount);
			rCount++;
			merge(listL, listR, list);
			mergeCount++;																					//unComment to count list merges
			System.out.println("Merged Lists"+" "+mergeCount+" "+list);
			
		}
		
	}
	
	private void merge(ArrayList<Integer> listL, ArrayList<Integer> listR, ArrayList<Integer> list) {
		int leftI=0, rightI=0, LI=0;
		while (leftI<listL.size()&&rightI<listR.size()) {
			if (listL.get(leftI)<=listR.get(rightI)) {
				list.set(LI, listL.get(leftI));
				leftI++;
			}else {list.set(LI, listR.get(rightI));rightI++;}
			LI++;
		}
		if(leftI<listL.size()) {
			copyRest(listL, leftI, list, LI);	
		}
		else if (rightI<listR.size()) {
			copyRest(listR, rightI, list, LI);
		}
	}
	
	private void copyRest(ArrayList<Integer> fromList, int indexFrom, ArrayList<Integer> toList, int indexTo) {
		while(indexFrom<fromList.size()) {
			toList.set(indexTo, fromList.get(indexFrom));
			indexFrom++;
			indexTo++;
		}
	}
	private int[] randArray(int size, int upperBound) {
		
		int[] send = new int[size];
		
		for(int i=0;i<size;i++) {
			send[i]=(int)(Math.random()*upperBound);
		}
		return send;
	}
}
