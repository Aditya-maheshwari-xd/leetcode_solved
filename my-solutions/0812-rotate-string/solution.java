class Solution {
    public String rotate(String s, int start, int end) {
        char[] a = s.toCharArray();
        while (start < end) {
            char t = a[start];
            a[start++] = a[end];
            a[end--] = t;
        }
        return new String(a);
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            return true;
        }

        int n = s.length();
        String original = s;
        for (int pos = 0; pos < n; pos++) {
            if (goal.charAt(pos) != s.charAt(0)) continue;
            int k = (n - pos) % n;
            String t = original;
            if (k != 0) {
                t = rotate(t, 0, k - 1);
                t = rotate(t, k, n - 1);
                t = rotate(t, 0, n - 1);
            }
            boolean same = true;
            for (int i = 0; i < n; i++) {
                if (t.charAt(i) != goal.charAt(i)) {
                    same = false;
                    break;
                }
            }
            if (same) return true;
        }
        return false;
    }
}

