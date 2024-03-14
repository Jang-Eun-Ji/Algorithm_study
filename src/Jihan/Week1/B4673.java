public class B4673 {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for(int i=1; i<10000; i++){
            String temp = Integer.toString(i);
            int p = i;
            for(int j=0; j<temp.length(); j++){
                int d = temp.charAt(j)-'0';
                p += d;
            }
            if(p<=10000) {
                arr[p-1] = 1;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                System.out.println(i+1);
            }
        }
    }
}
