package networkFlow;

public class MaximumBipartiteMatching {

    static final int M = 6;
    static final int N = 6;

    static boolean bpm(boolean bpGraph[][], int u, boolean seen[], int matchR[]) {
        for (int v = 0; v < N; v++)
        {
            if (bpGraph[u][v] && !seen[v])
            {
                seen[v] = true;
                if (matchR[v] < 0 || bpm(bpGraph, matchR[v],
                        seen, matchR))
                {
                    matchR[v] = u;
                    return true;
                }
            }
        }
        return false;
    }
    static int maxBPM(boolean bpGraph[][])
    {
        int matchR[] = new int[N];
        for(int i = 0; i < N; ++i)
            matchR[i] = -1;
        int result = 0;
        for (int u = 0; u < M; u++)
        {
            boolean seen[] =new boolean[N] ;
            for(int i = 0; i < N; ++i)
                seen[i] = false;
            if (bpm(bpGraph, u, seen, matchR))
                result++;
        }
        return result;
    }
    public static void main (String[] args)
            throws java.lang.Exception
    {
        boolean bpGraph[][] = new boolean[][]{
                {false, true, true,
                        false, false, false},
                {true, false, false,
                        true, false, false},
                {false, false, true,
                        false, false, false},
                {false, false, true,
                        true, false, false},
                {false, false, false,
                        false, false, false},
                {false, false, false,
                        false, false, true}};
        System.out.println( "Maximum number of applicants that can"+ " get job is "+maxBPM(bpGraph));
    }

}
