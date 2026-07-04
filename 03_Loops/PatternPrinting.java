public class PatternPrinting {

    // BASIC STAR PATTERNS

    // Q1. Print a Solid Rectangle
    public static void solidRectangle(int rows, int cols) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Q2. Print a Hollow Rectangle
    public static void hollowRectangle(int rows, int cols) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == rows || j == 1 || j == cols)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q3. Print a Solid Square
    public static void solidSquare(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Q4. Print a Hollow Square
    public static void hollowSquare(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q5. Print a Half Pyramid
    public static void halfPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Q6. Print an Inverted Half Pyramid
    public static void invertedHalfPyramid(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Q7. Print a Rotated Half Pyramid
    public static void rotatedHalfPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Q8. Print a Full Pyramid
    public static void fullPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Q9. Print an Inverted Full Pyramid
    public static void invertedFullPyramid(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Q10. Print a Hollow Pyramid
    public static void hollowPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1) || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // NUMBER PATTERNS

    // Q11. Print an Increasing Number Triangle
    public static void increasingNumberTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    // Q12. Print a Repeated Number Triangle
    public static void repeatedNumberTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    // Q13. Print an Inverted Increasing Number Triangle
    public static void invertedIncreasingNumberTriangle(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    // Q14. Print an Inverted Repeated Number Triangle
    public static void invertedRepeatedNumberTriangle(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    // Q15. Print Floyd's Triangle
    public static void floydTriangle(int n) {

        int number = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(number + " ");
                number++;

            }

            System.out.println();
        }
    }

    // Q16. Print a Binary Triangle
    public static void binaryTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }

            System.out.println();
        }
    }

    // ALPHABET PATTERNS

    // Q17. Print an Alphabet Triangle
    public static void alphabetTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    // Q18. Print a Repeated Alphabet Triangle
    public static void repeatedAlphabetTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1) + " ");
            }

            System.out.println();
        }
    }

    // Q19. Print an Inverted Alphabet Triangle
    public static void invertedAlphabetTriangle(int n) {

        for (int i = n; i >= 1; i--) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    // Q20. Print an Inverted Repeated Alphabet Triangle
    public static void invertedRepeatedAlphabetTriangle(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1) + " ");
            }

            System.out.println();
        }
    }

    // Q21. Print a Continuous Character Pattern
    public static void continuousCharacterPattern(int n) {

        char ch = 'A';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(ch + " ");
                ch++;

            }

            System.out.println();
        }
    }

    // Q22. Print a Reverse Character Triangle
    public static void reverseCharacterTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (char ch = (char) ('A' + n - 1);
                    ch >= (char) ('A' + n - i);
                    ch--) {

                System.out.print(ch + " ");

            }

            System.out.println();
        }
    }

    // PYRAMID PATTERNS

    // Q23. Print a Number Pyramid
    public static void numberPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    // Q24. Print a Character Pyramid
    public static void characterPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (char ch = 'A'; ch <= 'A' + i - 1; ch++) {
                System.out.print(ch + " ");
            }

            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    // Q25. Print a Palindrome Number Pyramid
    public static void palindromeNumberPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    // ADVANCED STAR PATTERNS

    // Q26. Print a Diamond
    public static void diamond(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // Q27. Print a Hollow Diamond
    public static void hollowDiamond(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q28. Print a Rhombus
    public static void rhombus(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= n; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // Q29. Print a Hollow Rhombus
    public static void hollowRhombus(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q30. Print a Butterfly Pattern
    public static void butterfly(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

        // Q31. Print a Hollow Butterfly Pattern
    public static void hollowButterfly(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q32. Print Sandglass Pattern
    public static void sandglass(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = 2; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // Q33. Print Hourglass Pattern
    public static void hourglass(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * (n - i) + 1; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = 2; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // Q34. Print X Pattern
    public static void xPattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q35. Print Plus Pattern
    public static void plusPattern(int n) {

        int mid = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == mid || j == mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q36. Print Border Cross Pattern
    public static void borderCrossPattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q37. Print Zig Zag Pattern
    public static void zigZag(int n) {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 4 * n - 3; j++) {

                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q38. Print Reverse Zig Zag Pattern
    public static void reverseZigZag(int n) {

        for (int i = 3; i >= 1; i--) {

            for (int j = 1; j <= 4 * n - 3; j++) {

                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

   
    // PASCAL TRIANGLE
   
    public static int nCr(int n, int r) {

        int result = 1;

        for (int i = 0; i < r; i++) {

            result *= (n - i);
            result /= (i + 1);

        }

        return result;
    }

    // Q39. Print Pascal Triangle
    public static void pascalTriangle(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print(nCr(i, j) + " ");

            System.out.println();
        }
    }
        // Q40. Print an Inverted Pascal Triangle
    public static void invertedPascalTriangle(int n) {

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print(nCr(i, j) + " ");

            System.out.println();
        }
    }

    // Q41. Print Right Pascal Triangle
    public static void rightPascalTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // Q42. Print Left Pascal Triangle
    public static void leftPascalTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // Q43. Print a Mirror Pyramid
    public static void mirrorPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i - 1; j++)
                System.out.print("  ");

            for (int j = i; j <= n; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // Q44. Print an Arrow Pattern
    public static void arrowPattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++)
                System.out.print("  ");

            System.out.println("*");
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j < i; j++)
                System.out.print("  ");

            System.out.println("*");
        }
    }

    // Q45. Print a Heart Pattern
    public static void heartPattern() {

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= 7; j++) {

                if ((i == 1 && (j == 1 || j == 4 || j == 7)) ||
                    (i == 2 && (j == 2 || j == 3 || j == 5 || j == 6)) ||
                    (i >= 3 && j >= i - 1 && j <= 8 - i))
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q46. Print a Christmas Tree
    public static void christmasTree(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = 1; i <= 2; i++) {

            for (int j = 1; j < n; j++)
                System.out.print(" ");

            System.out.println("|");
        }
    }

    // Q47. Print Concentric Square Number Pattern
    public static void concentricSquare(int n) {

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int value = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }

    // Q48. Print Hollow Hourglass
    public static void hollowHourglass(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1 || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }

        for (int i = 2; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1 || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

    // Q49. Print Spiral Number Pattern
    public static void spiralNumbers(int n) {

        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int value = 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                matrix[top][i] = value++;

            top++;

            for (int i = top; i <= bottom; i++)
                matrix[i][right] = value++;

            right--;

            if (top <= bottom) {

                for (int i = right; i >= left; i--)
                    matrix[bottom][i] = value++;

                bottom--;
            }

            if (left <= right) {

                for (int i = bottom; i >= top; i--)
                    matrix[i][left] = value++;

                left++;
            }
        }

        for (int[] row : matrix) {

            for (int num : row)
                System.out.printf("%3d", num);

            System.out.println();
        }
    }

    // Q50. Print Checkerboard Pattern
    public static void checkerBoard(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if ((i + j) % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        System.out.println("\nBasic Star Patterns\n");

        System.out.println("Q1. Solid Rectangle");
        solidRectangle(4, 6);

        System.out.println("\nQ2. Hollow Rectangle");
        hollowRectangle(4, 6);

        System.out.println("\nQ3. Solid Square");
        solidSquare(5);

        System.out.println("\nQ4. Hollow Square");
        hollowSquare(5);

        System.out.println("\nQ5. Half Pyramid");
        halfPyramid(5);

        System.out.println("\nQ6. Inverted Half Pyramid");
        invertedHalfPyramid(5);

        System.out.println("\nQ7. Rotated Half Pyramid");
        rotatedHalfPyramid(5);

        System.out.println("\nQ8. Full Pyramid");
        fullPyramid(5);

        System.out.println("\nQ9. Inverted Full Pyramid");
        invertedFullPyramid(5);

        System.out.println("\nQ10. Hollow Pyramid");
        hollowPyramid(5);

        System.out.println("\nNumber Patterns\n");
    
        System.out.println("Q11. Increasing Number Triangle");
        increasingNumberTriangle(5);

        System.out.println("\nQ12. Repeated Number Triangle");
        repeatedNumberTriangle(5);

        System.out.println("\nQ13. Inverted Increasing Number Triangle");
        invertedIncreasingNumberTriangle(5);

        System.out.println("\nQ14. Inverted Repeated Number Triangle");
        invertedRepeatedNumberTriangle(5);

        System.out.println("\nQ15. Floyd's Triangle");
        floydTriangle(5);

        System.out.println("\nQ16. Binary Triangle");
        binaryTriangle(5);

        System.out.println("\nAlphabet Patterns\n");

        System.out.println("Q17. Alphabet Triangle");
        alphabetTriangle(5);

        System.out.println("\nQ18. Repeated Alphabet Triangle");
        repeatedAlphabetTriangle(5);

        System.out.println("\nQ19. Inverted Alphabet Triangle");
        invertedAlphabetTriangle(5);

        System.out.println("\nQ20. Inverted Repeated Alphabet Triangle");
        invertedRepeatedAlphabetTriangle(5);

        System.out.println("\nQ21. Continuous Character Pattern");
        continuousCharacterPattern(5);

        System.out.println("\nQ22. Reverse Character Triangle");
        reverseCharacterTriangle(5);

        System.out.println("\nPyramid Patterns\n");

        System.out.println("Q23. Number Pyramid");
        numberPyramid(5);

        System.out.println("\nQ24. Character Pyramid");
        characterPyramid(5);

        System.out.println("\nQ25. Palindrome Number Pyramid");
        palindromeNumberPyramid(5);

        System.out.println("\nAdvanced Star Patterns\n");

        System.out.println("Q26. Diamond");
        diamond(5);

        System.out.println("\nQ27. Hollow Diamond");
        hollowDiamond(5);

        System.out.println("\nQ28. Rhombus");
        rhombus(5);

        System.out.println("\nQ29. Hollow Rhombus");
        hollowRhombus(5);

        System.out.println("\nQ30. Butterfly");
        butterfly(5);

        System.out.println("\nQ31. Hollow Butterfly");
        hollowButterfly(5);

        System.out.println("\nQ32. Sandglass");
        sandglass(5);

        System.out.println("\nQ33. Hourglass");
        hourglass(5);

        System.out.println("\nQ34. X Pattern");
        xPattern(7);

        System.out.println("\nQ35. Plus Pattern");
        plusPattern(7);

        System.out.println("\nQ36. Border Cross Pattern");
        borderCrossPattern(7);

        System.out.println("\nQ37. Zig Zag");
        zigZag(5);

        System.out.println("\nQ38. Reverse Zig Zag");
        reverseZigZag(5);

        System.out.println("\nPascal Triangle\n");

        System.out.println("Q39. Pascal Triangle");
        pascalTriangle(5);

        System.out.println("\nQ40. Inverted Pascal Triangle");
        invertedPascalTriangle(5);

        System.out.println("\nQ41. Right Pascal Triangle");
        rightPascalTriangle(5);

        System.out.println("\nQ42. Left Pascal Triangle");
        leftPascalTriangle(5);

        System.out.println("\nSpecial Patterns\n");

        System.out.println("Q43. Mirror Pyramid");
        mirrorPyramid(5);

        System.out.println("\nQ44. Arrow Pattern");
        arrowPattern(5);

        System.out.println("\nQ45. Heart Pattern");
        heartPattern();

        System.out.println("\nQ46. Christmas Tree");
        christmasTree(6);

        System.out.println("\nQ47. Concentric Square");
        concentricSquare(5);

        System.out.println("\nQ48. Hollow Hourglass");
        hollowHourglass(5);

        System.out.println("\nQ49. Spiral Numbers");
        spiralNumbers(5);

        System.out.println("\nQ50. Checkerboard");
        checkerBoard(8);
    }
}