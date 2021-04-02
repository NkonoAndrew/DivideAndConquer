package cs146F20Mwaseprject2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


class FileReader {
	/*Reads file into an Integer array*/
	public static Integer[] readIn(String filename) throws FileNotFoundException {

        File file = new File(filename);
        Scanner input = new Scanner(file);

        ArrayList<Integer> list = new ArrayList<>();

        while (input.hasNext()){
            int numbers = input.nextInt();
            list.add(numbers);
        }
        input.close();

        Integer[] array = new Integer[list.size() - 1];
        array = list.toArray(array);

        return array;
    }

}
