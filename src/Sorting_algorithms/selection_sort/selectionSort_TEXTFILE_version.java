package Sorting_algorithms.selection_sort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class selectionSort_TEXTFILE_version {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> nums = new ArrayList<>();

        File file = new File("sortingFile.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNext()){
            nums.add(Integer.parseInt(sc.next()));
        }


        for (int x = 0 ; x<nums.size() ; x ++){
            for (int y = 0 ; y<nums.size() ; y++){
                if(nums.get(x)>nums.get(y)){   //adjust the greater than sign to change ASC/DESC
                    int tempx = nums.get(x);
                    int tempy = nums.get(y);
                    nums.set(x,tempy);
                    nums.set(y,tempx);
                }
            }
        }
        //print in console
        System.out.println(Arrays.toString(nums.toArray()));

        //save to a text-file
        FileWriter myWriter = new FileWriter("sorted list.txt");
        for(int x : nums){
            myWriter.write(x + "\n");
        }
        myWriter.close();
    }
}
