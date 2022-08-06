package P7_2DArrays;

public class Q13_RowToColZero {
    public int[][] solve(int[][] A) {
        int n = A.length, m = A[0].length;
    	for(int i = 0; i < n; i++){
    		int flag = 0;
    		for(int j = 0; j < m; j++){
    			if(A[i][j]==0)flag = 1;
    		}
    		if(flag == 1){
    			for(int j = 0; j < m; j++){
    				if(A[i][j] != 0) A[i][j] = -1;
    			}
    		}
    	}
    	for(int j = 0; j < m; j++){
    		int flag = 0;
    		for(int i = 0; i < n; i++){
    			if(A[i][j]==0)flag = 1;
    		}
    		if(flag == 1){
    			for(int i = 0; i < n; i++){
    				if(A[i][j] != 0) A[i][j] = -1;
    			}
    		}
    	}
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			if(A[i][j] == -1)A[i][j] = 0;
    		}
    	}
    	return A;  
    }
}


// Let's start row wise first. Select rows one by one and make all the elements of that row -1 except which are 0, if any element in that row is 0. Similariy you have to do the same thing for columns.
// Now, before returning traverse the matrix and make all the -1 elements 0.
