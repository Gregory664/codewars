package codewars.kyu7;

public class CheckСontainedMatrix {
    public static int[] checkIsContained(int[][] mat1, int mat2[][]) {
        for (int i = 0; i <= mat1.length - mat2.length; i++) {
            for (int j = 0; j <= mat1[0].length - mat2[0].length; j++) {
                boolean flag = true;
                for (int k = 0; k < mat2[0].length; k++) {
                    for (int l = 0; l < mat2.length; l++) {
                        if (mat1[i + k][j + l] != mat2[k][l]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
