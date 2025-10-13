public class GasStation {

    public static int CompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int startIndex = 0;

        for (int h = 0; h < gas.length; h++) {
            totalGas += gas[h];
            totalCost += cost[h];
            tank += gas[h] - cost[h];
            
            
            if (tank < 0) {
                startIndex = h + 1;
                tank = 0;
            }
        }

        
        if (totalGas >= totalCost) {
        return startIndex;
        } else {
         return -1;
}
    }

    public static void main(String[] args) {
        int[] gas = {12,19,20,10,0,25};
        int[] cost = {35,25,10,20,19,12};

        int start = CompleteCircuit(gas, cost);
        System.out.println("Output: " + start);

        
        int[] gas2 = {5,10,4};
        int[] cost2 = {4,7,1};

        int start2 = CompleteCircuit(gas2, cost2);
        System.out.println("Output: " + start2);

        int[] gas3 = {13,8,4,9,3,2};
        int[] cost3 = {1,6,5,9,3,2};

        int start3 = CompleteCircuit(gas3, cost3);
        System.out.println("Output: " + start3);
    }
}