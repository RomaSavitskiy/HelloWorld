package lesson5;

public class Executor
{

    public void outputSquare()
    {
        int[][] array = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                array[i][j] = array[i][j] * array[i][j];
            }
        }

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void outputSumLines()
    {
        int[][] array = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};
        int sum = 0;

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                sum = sum + array[i][j] ;
            }
            System.out.println(sum);
            sum = 0;
        }

    }

    public void comparisonArrays()
    {
        int[][] array1 = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};
        int[][] array2 = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};
        boolean flag = false;

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                if(array1[i][j] != array2[i][j])
                {
                    System.out.println("No equal");
                    flag = true;
                }
            }
        }

        if(flag == false)
        {
            System.out.println("Equal");
        }

    }

    public void findMinValue()
    {
        int[][] array1 = {{1,2,4,4}, {1,1,1,10}, {0,3,4,6}};
        int min = array1[0][0];

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                if(array1[i][j] < min)
                {
                    min = array1[i][j];
                }
            }
            System.out.print(min + " ");
            min = array1[i][0];
        }
        System.out.println();
        System.out.println();
    }

        public void sortArraysLines()
        {
            int[][] array = {{9, 2, 1, 4}, {9, 1, 1, 10}, {0, 3, 4, 6}};
            int temp;

            for (int i = 0; i < array.length; i++)
            {
              for (int j = 0; j < array[i].length - 1; j++)
              {
                for (int k = 0; k < array[i].length ; k++)
                {
                  if (array[i][j] > array[i][j + 1])
                  {
                    temp = array[i][j];
                    array[i][j] = array[i][j + 1];
                    array[i][j + 1] = temp;
                  }
                }
              }
            }

            for (int i = 0; i <= 2; i++) {
              for (int j = 0; j <= 3; j++) {
                System.out.print(array[i][j] + " ");
              }
              System.out.println();
            }
        }


}
