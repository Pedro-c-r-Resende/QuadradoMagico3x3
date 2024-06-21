import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] somas  = new int[8];
        int soma;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

       for (int i = 0; i < matrix.length; i++) {
           soma=0;
           for (int j = 0; j < matrix[i].length; j++) {
               soma += matrix[i][j];
           }
           somas[i]=soma;
       }

        for (int j = 0; j < matrix.length; j++) {
            soma=0;
            for (int i = 0; i < matrix[j].length; i++) {
                soma += matrix[i][j];
            }
            somas[j+3]=soma;
        }

        somas[6]= matrix[0][0]+matrix[1][1]+matrix[2][2];
        somas[7]= matrix[0][2]+matrix[1][1]+matrix[2][0];

       for (int i = 0; i < somas.length; i++) {
           if (somas[i]!= somas[0]) {
               System.out.println("NO");
               break;
           }else if(i == somas.length-1){
               System.out.println("YES");
           }

       }

    }
} 