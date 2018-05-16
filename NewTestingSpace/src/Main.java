import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.run();
    }

    private void run() {
        //declare ArrayList and initialize (final product)
        ArrayList<Integer> list = new ArrayList<>();
        //and int which will be the total of all runs
        ArrayList<Integer> listRunsDnCount = new ArrayList<>();
        ArrayList<Integer> listRunsCount = new ArrayList<>();

        try {
            ArrayList<Integer> fileRead = read("p01-int.txt");
            ArrayList<Integer> listRunsUpCount = runCount(fileRead, 1);

            System.out.println("here" + fileRead.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("Test!");
            //add instructions for exception handling here
        }
    }

    private ArrayList<Integer> read(String file) throws FileNotFoundException {
        ArrayList<Integer> array = new ArrayList<>();
        File in = new File(file);
        Scanner scan = new Scanner(in);
        while (scan.hasNext()) {
            array.add(scan.nextInt());
        }
        scan.close();
        return array;
    }

    private ArrayList<Integer> runCount(ArrayList<Integer> list, int direction) {
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            count.add(0);
        }
        if (direction == 1) {
            int k = 0;

            for (int i = 0; i < list.size(); i++) {
                while (i < list.size() - 1 && list.get(i) < list.get(i + 1)) {
                    i++;
                    k++;
                }

                if (k != 0) {
                    count.set(k, count.get(k) + 1);
                    k = 0;
                } else {
                    while (i < list.size() - 1 && list.get(i) > list.get(i + 1)) {
                        i++;
                    }
                    k++;
                }
            }
        }
        return count;
    }

    private ArrayList<Integer> merge(ArrayList<Integer> listRunsUpCount, ArrayList<Integer> listRunsDnCount, ArrayList<Integer> list) {
        int temp;
        ArrayList<Integer> mergeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            temp = listRunsUpCount.get(i) + listRunsDnCount.get(i);
            mergeList.set(i, temp);
        }
        return mergeList;
    }
    
    
    
}