import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }

        return -1;
    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(string)) return i;
        }

        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length-1;
        int mid = 0;

        boolean found = false;

        while (start <= end) {
            mid = (start + end) / 2;

            if (array[mid] > value) end = mid - 1;
            else if (array[mid] < value) start = mid + 1;
            else {
                found = true;
                break;
            }
        }

        if (found) return mid;
        return -1;
    }

    public static int binarySearch(String[] array, String string) {
        int start = 0;
        int end = array.length-1;
        int mid = 0;

        boolean found = false;

        while (start <= end) {
            mid = (start + end) / 2;

            if (array[mid].compareTo(string) > 0) end = mid - 1;
            else if (array[mid].compareTo(string) < 0) start = mid + 1;
            else {
                found = true;
                break;
            }
        }

        if (found) return mid;
        return -1;
    }
}
