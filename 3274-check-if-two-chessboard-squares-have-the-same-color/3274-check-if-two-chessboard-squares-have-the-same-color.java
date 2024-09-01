class Solution {
    public String helper(String coordinate) {
   
    
    char column = coordinate.charAt(0);
    char row = coordinate.charAt(1);   
    int columnIndex = column - 'a';
    int rowIndex = row - '1';
    if ((columnIndex + rowIndex) % 2 == 0) {
        return "black";
    } else {
        return "white";
    }
}

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String cor1 = helper(coordinate1);
        String cor2 = helper(coordinate2);
       
        
        if(cor1.equals(cor2)){
            return true;
        }
        
        return false;
    }
}