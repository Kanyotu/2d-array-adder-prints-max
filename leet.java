public class leet {
    public static int maximumof(int[][] accounts) {
        int left = 0;
        int total = 0;
        int[] totals = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }
            totals[i] = total;
            total = 0;
        }
        for (int k = 0; k < totals.length; k++) {
            System.out.println(totals[k]);
        }
        int right = totals.length - 1;
        while (left != right) {
            if (totals[left] < totals[right]) {
                left++;
            } else if (totals[left] > totals[right]) {
                right--;
            } else {
                left++;
            }

        }
        return totals[left];
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] kanyo = { { 2, 3, 4 }, { 4, 5, 6 }, { 3, 4, 5 } };

        System.out.println(maximumof(kanyo));
    }

}