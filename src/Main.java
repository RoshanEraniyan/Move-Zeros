import java.util.*;


class MoveZeros
{
    public static void move(int n,int[] array)
    {
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]!=0)
            {
                array[index]=array[i];
                index+=1;
            }
        }
        for(int i=index;i<n;i++)
        {
            array[i]=0;
        }
        Arrays.sort(array,0,index);
        System.out.println(Arrays.toString(array));
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        move(n,array);
    }
}
