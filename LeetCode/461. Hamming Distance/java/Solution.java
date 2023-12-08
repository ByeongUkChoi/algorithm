class Solution {
    public int hammingDistance(int x, int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);

        int xLength = binaryX.length();
        int yLength = binaryY.length();
        int indicesLength = Math.max(xLength, yLength);

        int[] xIndices = new int[indicesLength];
        int j = 0;
        for (int i = xLength - 1; i >= 0; i--) {
            xIndices[j++] = binaryX.charAt(i) - '0';
        }

        int[] yIndices = new int[indicesLength];
        int k = 0;
        for (int i = yLength - 1; i >= 0; i--) {
            yIndices[k++] = binaryY.charAt(i) - '0';
        }

        int answer = 0;
        for (int i = 0; i < indicesLength; i++) {
            if (xIndices[i] != yIndices[i]) {
                answer++;
            }
        }

        return answer;
    }
}