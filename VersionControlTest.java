public class VersionControlTest extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1; // Start from version 1
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        VersionControl.setFirstBadVersion(4); // Set mock bad version

        VersionControlTest test = new VersionControlTest();
        int n = 5;
        System.out.println("First bad version is: " + test.firstBadVersion(n));
    }
}

// Mock VersionControl class
class VersionControl {
    private static int firstBad;

    public static void setFirstBadVersion(int version) {
        firstBad = version;
    }

    public boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}
