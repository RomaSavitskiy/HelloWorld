package lesson4;

public class Executor {
    public void bubbleSortExecute()
    {
        int array1[] = {1, 3, 7, 2, 4, 8, 6, 10 , 9, 5};
        int temp;
        int length = array1.length;


        for (int i = 0; i < length - 1; i++)
        {
            for (int j = 0; j < length - 1; j++)
            {
                if (array1[j + 1] < array1[j])
                {
                    temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++)
        {
            System.out.print(array1[i] + " ");
        }
    }
}
