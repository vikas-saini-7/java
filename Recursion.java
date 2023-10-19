public class Recursion{
    // Permutations 
    public static void printPerm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }
    //     String str = "abc";
    //     printPerm(str, "1");

    // Count Path in matrix to go from (0, 0) to (n, m)
    public static int countPaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        // move downwords 
        int downPaths = countPaths(i+1, j, n, m);
        // move right 
        int rightPaths = countPaths(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    //     int n =5, m = 5;
    //     int totalPaths = countPaths(0, 0, n, m);
    //     System.out.println(totalPaths);.

    // Place Tiles problem
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        // vertically 
        int verticalPlacements = placeTiles(n-m, m);
        //horizontally
        int horizontalPlacements = placeTiles(n-1, m);
        return verticalPlacements + horizontalPlacements;
    }
    // int n = 4 , m = 3;
    // System.out.println(placeTiles(n, m));


    // Ways in which you can invite n people to party
    public static int callGuests(int n){
        if(n <=1){
            return 1;
        }

        //single
        int ways1 = callGuests(n-1);

        // pair 
        int ways2 = (n-1) * callGuests(n-2);

        return ways1 + ways2;
    }
    // int n = 12;
    // System.out.println(callGuests(n));

    // Subsets of set 
    // public static void printSubset(ArrayList<Integer> subset){
    //     for(int i=0; i<subset.size(); i++){
    //         System.out.println(subset.get(i)+" ");
    //     }
    // }
    // public static void findSubsets(int n, ArrayList<Integer> subset){
    //     if(n == 0){
    //         printSubset(subset);
    //         return;
    //     }

    //     // add hoga 
    //     subset.add(n);
    //     findSubsets(n-1, subset);

    //     // add nahi hoga 
    //     subset.remove(subset.size()-1);
    //     findSubsets(n-1, subset);
    // }
        // int n =3;
        // ArrayList<Integer> subset = new ArrayList<>();
        // findSubsets(n, subset);


    public static void main(String args[]){
    }
}