
public class GasStation {
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;

	    int gasSum = 0;
	    int costSum = 0;

	    int candidateIdx = 0;
	    int tank = 0;

	    for (int i = 0; i < n; i++) {
	        gasSum += gas[i];
	        costSum += cost[i];

	        tank += gas[i] - cost[i];

	        if (tank < 0) {
	            candidateIdx = i + 1;
	            tank = 0;
	        }
	    }

	    if (gasSum < costSum) return -1;

	    return candidateIdx;
    }
	
	public static void main(String[] args) {
		var gs = new GasStation();		
		System.out.println(gs.canCompleteCircuit(new int[] {1,2,3,4,5}, new int [] {3,4,5,1,2}));

	}

}
