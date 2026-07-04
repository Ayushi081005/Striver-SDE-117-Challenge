class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[]le = new int [n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[0]-a[0]);
        for(int i = 0; i < n ; i++){
            pq.add(new int[]{score[i],i});
        }
        int qte =1;

        String[] qtte =new String[n];
        while(!pq.isEmpty()){
            int[] kl =pq.poll();
            if (qte==1) {
                qtte[kl[1]]="Gold Medal";
            }
            else if(qte==2){
                qtte[kl[1]]="Silver Medal";
            }
            else if(qte==3){
                qtte[kl[1]]="Bronze Medal";
            }
            else{
                qtte[kl[1]] = String.valueOf(qte);
            }
        qte++;
        }
        return qtte;
    }
}