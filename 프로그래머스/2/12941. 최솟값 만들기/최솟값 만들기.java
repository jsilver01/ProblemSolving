import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int sum = 0;
        // A 배열 오름차순 정리 int 배열이라 내림차순 정리가 복잡해서 그냥 for 문 거꾸로 도는거로 우회
        Arrays.sort(A);
        //B 도 오름차순 정리.
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++) {
            sum += A[i]*B[B.length-1-i];
        }
        
        return sum;
    }
}