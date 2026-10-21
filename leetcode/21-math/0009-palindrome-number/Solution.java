class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        int front = 0;
        int rear = sb.length()-1;

        while(front < rear){
            if(sb.charAt(front) != sb.charAt(rear)){
                return false;
            }

            if(front + 1 == rear){
                return true;
            }

            front++;
            rear--;
        }

        if(front == rear){
            return true;
        }

        return false;
    }
}