class Solution {

    public String encode(List<String> strs) {
        char delim = '#';
        StringBuilder encodedStr = new StringBuilder();
        for (String s : strs) {
            encodedStr.append(s.length()).append(delim).append(s);

        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        char delim = '#';
        int i = 0;
        List<String> decodedStrs = new ArrayList<>();
        while (i < str.length() - 1) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch) && str.charAt(i+1) == delim) {
                StringBuilder decode = new StringBuilder();
                for (int j = i+2; j < ch; j++) {
                    decode.append(ch);
                }
                decodedStr.add(decode.toString());
                i += ch + 1;
            }
            return decodedStrs;
        }
    }
}
