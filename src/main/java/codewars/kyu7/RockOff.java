package codewars.kyu7;

public class RockOff {
    public static String solveRockOff(final int[] alice, final int[] bob) {
        int aliceCount = 0;
        int bobCount = 0;
        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > bob[i]) {
                aliceCount++;
            }
            if (bob[i] > alice[i]) {
                bobCount++;
            }
        }
        return String.format("%d, %d: ", aliceCount, bobCount) +
                (aliceCount > bobCount ? "Alice made \"Kurt\" proud!" :
                        aliceCount < bobCount ? "Bob made \"Jeff\" proud!" :
                                "that looks like a \"draw\"! Rock on!");
    }
}
