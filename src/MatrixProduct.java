import java.util.Scanner;

public class MatrixProduct {
    static void Product(int arr[][],int rows,int cols,int b)
    {
        int result=1;
        int output[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            result=1;
            for(int j=0;j<cols;j++)
            {
                result=b*arr[i][j];
                output[i][j]=result;
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(output[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int array[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        int b=scanner.nextInt();
        Product(array,rows,cols,b);
    }
}
