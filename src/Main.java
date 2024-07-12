import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world of arrays!");
        System.out.println("Go!");

        //task1&&task2&&task3
        // первые 3 задачи объединил[учусь оптимизировать листинг программмы))]
        int[] numbers = {1, 2, 3};
        System.out.print(Arrays.toString(numbers) + " 1й массив из целоочисленных значений.А дальше наоборот");
        for (int i = numbers.length - 1; i >= 0; i--)
            System.out.print(" " + numbers[i] );
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println("\n Отредактированный массив");
        System.out.println(Arrays.toString(numbers));
        System.out.println("\n==========");

        double[] numbersDouble = {5.36, 7.569, 1.111};
        System.out.print(Arrays.toString(numbersDouble) + " 2й массив из дробных значений.А дальше наоборот.");
        for (int i = numbersDouble.length - 1; i >= 0; i--)
            System.out.print(" " + numbersDouble[i] );
        System.out.println("\n==========");

        char[] chars = {'J', 'a', 'v', 'a', ' ', 'F', 'X', '@', '!', '#'};
        System.out.print(Arrays.toString(chars) + " 3й массив из любых значений");
        for (int i = chars.length - 1; i >= 0; i--)
            System.out.print(" " + chars[i] );
        System.out.println("\n==========");
        System.out.println("***end of  the tasks 1 and 2 and 3***");
        System.out.println("***END OF HOME WORK 8***");


        //ЗАКОМИТИЛ СТАРЫЙ ВАРИК,ЧТОБЫ БЫЛИ ВИДНЫ ИЗМЕНЕИЯ
        //task4
        //int[] districts={1,2,3,4};
        //for(int i=0;i<districts.length;i++) {
        //if (districts[i] % 2 != 0) {
        //   districts[i]++;}
    }
    //System.out.println("Отредактированный массив");
    //System.out.println(Arrays.toString(districts));
}

