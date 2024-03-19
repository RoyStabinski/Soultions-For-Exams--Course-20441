public class missIndex {

    public static int findMissingIndex(int[]a){

        if(a.length < 3)
            return Integer.MIN_VALUE;// Default value in case of short length

        for(int i = 0 ; i < a.length-1 ; i++){
            int d = Math.min(Math.abs(a[1]-a[0]),Math.abs(a[2]-a[1]));

            if(Math.abs(a[i+1]-a[i]) > Math.abs(d))
                return i+1;
        }

        return a.length;
    }

    public static void main(String[]args){
        System.out.println(findMissingIndex(new int[]{2,4,6,8,10,12,18,22,24,26}));
    }

}
