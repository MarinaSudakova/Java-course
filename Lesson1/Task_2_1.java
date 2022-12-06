// максимальное количствео друг за другом единиц

package Lesson1;

public class Task_2_1 {
    public static void main(String[] args) {
        
        int[] array = new int[]{0,1,0,1,0};
        int max = 0;
        for(int i=0;i<array.length;i++)
        {
            int count =0;
            while(i < array.length && array[i]==1)
            {
                count++;
                i++;
            }
            if(count>max)
                max = count;
        }
        System.out.println(String.format("Maximum ones into array: %d", max));
    }
}

