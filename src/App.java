import bj.highfive.Exo;

public class App {
    public static void main(String[] args)
    {
        Exo obj = new Exo();
        obj.Test();
        int i = 0;
        for(; i<4; System.out.println("Good"))
        {
            i++;
        }

        int[] array = {4,8,7,0,5};
        int y=0;
        for(; y<array.length; )
        {
            System.out.println("Avec le for classic " + array[y]);
            y++;
        }

        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 8;
        arr[3] = 81;
        arr[4] = 47;
        for (int element : arr) {
            System.out.println("Avec le foreach " + element);
        }
        
    }
}
