package Algorithm.BinariesSearchQuestionaries;

public class CellingAndFloorOfCharacter {
    /*
    Q. Find the smallest number in the array which is greater than target number.
     */
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        char result = ceilingOfCharacter(letters, target);
        System.out.println(result);
    }
    static char ceilingOfCharacter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
    static char floorOfCharacter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[end % letters.length];
    }
}
