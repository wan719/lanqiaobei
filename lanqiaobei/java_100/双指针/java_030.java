package java_100.双指针;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class java_030 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i] =Integer.parseInt(st.nextToken());
        }
        int ans = Integer.MAX_VALUE;
        int sum=0;
        for(int i=0,j=0;i<n;i++){
            sum+=a[i];
            while(sum>=s){
                ans=Math.min(ans,i-j+1);
                sum-=a[j];
                j++;
            }
        }
        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
    }
}
