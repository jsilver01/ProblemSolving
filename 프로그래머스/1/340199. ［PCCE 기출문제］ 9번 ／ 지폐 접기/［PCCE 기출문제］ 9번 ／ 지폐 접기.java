class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int bill_max, bill_min, wallet_max, wallet_min;
        
        if(bill[0]>bill[1]){
            bill_max = bill[0];
            bill_min = bill[1];
        }else{
            bill_max = bill[1];
            bill_min = bill[0];
        }
        
        if(wallet[0]>wallet[1]){
            wallet_max = wallet[0];
            wallet_min = wallet[1];
        }else{
            wallet_max = wallet[1];
            wallet_min = wallet[0];
        }
        
        while(bill_min > wallet_min || bill_max > wallet_max){
            if(bill[0] > bill[1]){
                bill[0] = bill[0]/2;
            }else{
                bill[1] = bill[1]/2;
            }
            
            answer++;
            
            if(bill[0]>bill[1]){
                bill_max = bill[0];
                bill_min = bill[1];
            }else{
                bill_max = bill[1];
                bill_min = bill[0];
            }

            if(wallet[0]>wallet[1]){
                wallet_max = wallet[0];
                wallet_min = wallet[1];
            }else{
                wallet_max = wallet[1];
                wallet_min = wallet[0];
            }
        }
        return answer;
    }
}