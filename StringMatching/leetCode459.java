class leetCode459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int sub = len / i;
                
                String unique = s.substring(0, i);
                StringBuilder newStr = new StringBuilder();

                for (int j = 0; j < sub; j++) {
                    newStr.append(unique);
                }

                if (newStr.toString().equals(s)) return true;
            }
        }

        return false;
    }
}