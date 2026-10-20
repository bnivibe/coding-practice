class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            if(i % 3 == 0){
                sb.append("Fizz");
            }
            if(i % 5 == 0){
                sb.append("Buzz");
            }

            if(!sb.isEmpty()){
                results.add(sb.toString());
                continue;
            }

            results.add(Integer.toString(i));
        }

        return results;
    }
}