class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] temp : image)
        {
            int i=0;
            int j=temp.length-1;
            while(i<=j)
            {
                int tempo = temp[i];
                temp[i]=temp[j];
                temp[j]=tempo;
                i++;
                j--;
            }

            for(int k=0;k<temp.length;k++)
            {
                if(temp[k]==0)temp[k]=1;
                else temp[k]=0;
            }
        }
        return image;
    }
}