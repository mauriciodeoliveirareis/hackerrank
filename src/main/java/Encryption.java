public class Encryption {


    public static String encryption(String s) {
        s = s.replaceAll("\\s", "");
        int sLength = s.length();
        char[] sArr = s.toCharArray();

        double sqrtOfLength = Math.sqrt(sLength);
        int nRows = (int)Math.floor(sqrtOfLength);
        int nColumns = (int)Math.ceil(sqrtOfLength);
        char[][] encStringMatrix = new char[nRows][nColumns];
        for(int r = 0; r < nRows; r++) {
            int currentRowIndex = nColumns * r;
            for (int c = 0; c < nColumns; c++) {
                int currentRowColumnIndex = currentRowIndex + c;
                if(!(currentRowColumnIndex < sLength)) break;
                    encStringMatrix[r][c] = sArr[currentRowColumnIndex];

            }
        }
        StringBuilder returnString = new StringBuilder("");
        for (int c = 0; c < nColumns; c++) {
            for(int r = 0; r < nRows; r++) {
                char currentCharOnMatrix = encStringMatrix[r][c];
                if (currentCharOnMatrix != '\u0000')
                    returnString.append(currentCharOnMatrix);
            }
            returnString.append(" ");
        }
        return returnString.toString().trim();

    }
}
