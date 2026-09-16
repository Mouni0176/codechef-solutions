public static String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int n = chars.length;

    // Step 1: Reverse the entire string
    reverse(chars, 0, n - 1);

    // Step 2: Reverse each word
    int start = 0;
    for (int i = 0; i <= n; i++) {
        if (i == n || chars[i] == ' ') {
            reverse(chars, start, i - 1);
            start = i + 1;
        }
    }

    // Step 3: Remove extra spaces in-place
    int idx = 0;
    int i = 0;
    while (i < n) {
        // skip spaces
        while (i < n && chars[i] == ' ') i++;
        if (i >= n) break;

        // copy word
        while (i < n && chars[i] != ' ') {
            chars[idx++] = chars[i++];
        }

        // skip spaces after word
        while (i < n && chars[i] == ' ') i++;

        // add space if another word exists
        if (i < n) {
            chars[idx++] = ' ';
        }
    }

    return new String(chars, 0, idx);
}

private static void reverse(char[] arr, int l, int r) {
    while (l < r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
    }
}