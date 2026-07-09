// Last updated: 7/9/2026, 10:50:59 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digiSum = 0;
        int squareSum = 0;
        while( n > 0){
            int digit = n % 10;

            digiSum += digit;
            squareSum += digit * digit;

            n /= 10;
        }
        return ( squareSum - digiSum) >= 50;
    }
}