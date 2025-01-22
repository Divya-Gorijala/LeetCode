public class Target {
    public static void main(String[] args){
        int[] a={1,2,3,4};
        int sum=5;
        int[] array1 = new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=i+1; j<a.length;j++) {
                if(a[i] + a[j] == sum){
                    array1[0]=a[i];
                    array1[1]=a[j];
                    System.out.println(array1[0]+" "+array1[1]);
                    }

                }
            }
        }
    }
