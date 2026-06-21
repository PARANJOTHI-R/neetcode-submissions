class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int limitFinder(int row,int col){
        if(row<=2){
            if(col<=2) return 1;
            if(col>2 && col<=5) return 2;
            if(col>5 && col<=8) return 3;
        }else if(row>2 && row<=5){
            if(col<=2) return 4;
            if(col>2 && col<=5) return 5;
            if(col>5 && col<=8) return 6;
        }else if(row>5 && row<=8){
            if(col<=2) return 7;
            if(col>2 && col<=5) return 8;
            if(col>5 && col<=8) return 9;
        }
        return -1;
    }
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,ArrayList<Pair>> hm = new HashMap<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                 if(board[i][j]=='.')
                    continue;
                int val=board[i][j]-'0';
                int limit=limitFinder(i,j);
                if(hm.containsKey(val)){
                    ArrayList<Pair> l=hm.get(val);
                    for(int k=0;k<l.size();k++){
                        int row=l.get(k).row;
                        int col=l.get(k).col;
                        boolean b=limitFinder(row,col)==limit?true:false;
                        if(row==i ||col==j || b) return false;
                    }
                }

                if(!hm.containsKey(val)){
                    hm.put(val,new ArrayList<>());
                }
                hm.get(val).add(new Pair(i,j));
            }
        }
        return true;
    }
}
