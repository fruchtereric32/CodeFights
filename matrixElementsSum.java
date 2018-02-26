int matrixElementsSum(int[][] matrix) {
    HashMap<Integer,Integer> inv = new HashMap<Integer,Integer>();
    int cost =0;
    
    for(int x = 0; x< matrix.length; x++){
        for (int y = 0; y<matrix[0].length;y++){
            System.out.print(matrix[x][y]);
            if(matrix[x][y]==0){
                inv.put(y,0);
            }
            if(!inv.containsKey(y)){cost+=matrix[x][y];}
        }
        System.out.println();
    }
    return cost;
}
