package hunter.clarification;

/*
Mixed-up modifier

    Move one static modifier to make the example compile.

    Requirements:
    1. The Solution class must have a variable called A.
    2. The Solution class must have a variable called B.
    3. The Solution class must have a variable called C.
    4. The Solution class must have a variable called D.
    5. The Solution class must have only three methods.
    6. The class must have 4 static modifiers (variables and methods).
*/

public class StaticMethodsAndVariables {
public static int A = 5;
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}

/*
ORIGINAL CODE:
public class Solution {
    public int A = 5;           // Does `D` not recognize `A` b/c:  `this.A` and `null.D` can't "communicate" with each other
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public static int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}

QUESTIONS:
Solution.getValue(<Object> ref) ???

 */
