public class QuickSort {

    private static void QuickSort(int[] array,int start,int end)
    {
        if(start<end)
        {
            int key=array[start];//��ʼ�������Ԫ
            int i=start,j;//��ʼ��i,j
            for(j=start+1;j<=end;j++)
            {
                if(array[j]<key)//����˴�Ԫ��С�ڻ�Ԫ����Ѵ�Ԫ�غ�i+1��Ԫ�ؽ���������i��1������ڻ���ڻ�Ԫ�����ѭ��
                {
                    int temp=array[j];
                    array[j]=array[i+1];
                    array[i+1]=temp;
                    i++;
                }
                
            }
            array[start]=array[i];//����i��Ԫ�غͻ�Ԫ
            array[i]=key;
            QuickSort(array, start, i-1);//�ݹ����
            QuickSort(array, i+1, end);
            
        }
        
    }
    public static void main(String[] args)
    {
        int[] array=new int[]{11,213,134,44,77,78,23,43};
        QuickSort(array, 0, array.length-1);
        for(int i=0;i<array.length;i++)
        {
            System.out.println((i+1)+"th:"+array[i]);
        }
    }
}