

public class LambdaExpressions {



}

class A {

}


//public class LambdaExpressions {
//
//    private static final String SOME_CONSTANT = "SOME_CONSTANT";
//
//    private String x;
//    private String someField;
//
//    public static class BoxPublic {
//        int x;
//
//        public void print() {
////            System.out.println(x);
////            System.out.println(someField);
//            System.out.println(SOME_CONSTANT);
//        }
//    }
//
//    protected static class BoxProtected {
//        int x;
//
//        protected void print() {
//            // ...
//        }
//    }
//
//    static class BoxPackage {
//        int x;
//
//        void print() {
//            // ...
//        }
//    }
//
//    private static class BoxPrivate {
//        int x;
//
//        private void print() {
//            // ...
//        }
//    }
//
//
//}



























//public class LambdaExpressions {
//
//    private static final String SOME_CONSTANT = "SOME_CONSTANT";
//    private String someField;
//    private String x = "100";
//
//    public class BoxPublic {
//        int x = 10;
//
//        public void print() {
//            System.out.println(x);
//            System.out.println(someField);
//            System.out.println(SOME_CONSTANT);
//        }
//    }
//
//    protected class BoxProtected {
//        int x;
//
//        protected void print() {
//            // ...
//        }
//    }
//
//    class BoxPackage {
//        int x;
//
//        void print() {
//            // ...
//        }
//    }
//
//    private class BoxPrivate {
//        int x;
//
//        private void print() {
//            // ...
//        }
//    }
//
//}


























//public class LambdaExpressions {
//
//    private static final String SOME_CONSTANT = "SOME_CONSTANT";
//    private String someField;
//    private String x = "100";
//
//    public interface MovablePublic {
//        default void print() {
////            System.out.println(x);
////            System.out.println(SOME_CONSTANT);
//        }
//    }
//    protected interface MovableProtected {}
//    interface MovablePackage {}
//    private interface MovablePrivate {}
//
//    public enum ColorPublic {
//        VALUE,;
//        private void print() {
////            System.out.println(x);
////            System.out.println(SOME_CONSTANT);
//        }
//    }
//    protected enum ColorProtected {}
//    enum ColorPackage {}
//    private enum ColorPrivate {}
//
//}

























//public class LambdaExpressions {
//
//    public interface Movable {
//        void move();
//    }
//
//    public static void callMove(Movable m) {
//        m.move();
//    }
//
//    private static class A implements Movable {
//        @Override
//        public void move() {
//            System.out.println("Move!");
//        }
//    }
//
//
//    public static void main(String[] args) {
//        A a = new A();
//        callMove(a);
//    }
//
//}













//public class LambdaExpressions {
//
//    public interface Movable {
//        void move(String s);
//    }
//
//    public static void callMove(Movable m) {
//        m.move("I am move!");
//    }
//
//    private static class A implements Movable {
//        @Override
//        public void move(String s) {
//            System.out.println(s);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        A a = new A();
//        callMove(a);
//    }
//
//
//}










//public class LambdaExpressions {
//
//    public interface Movable {
//        void move(String s);
//    }
//
//    public static void callMove(Movable m) {
//        m.move("I am move!");
//    }
//
//
//    public static void main(String[] args) {
//        callMove(new Movable() {
//            @Override
//            public void move(String s) {
//                System.out.println(s);
//            }
//        });
//    }
//
//
//}











//public class LambdaExpressions {
//
//    public interface Movable {
//        void move(String s);
//    }
//
//    public static void callMove(Movable m) {
//        m.move("I am move!");
//    }
//
//
//    public static void main(String[] args) {
//        callMove(new Movable() {
//            private int x = 4;
//
//            private void someMethod() {
//                System.out.println("method");
//            }
//            @Override
//            public void move(String s) {
//                System.out.println(x);
//                System.out.println(s);
//                someMethod();
//            }
//        });
//    }
//
//}














//public class LambdaExpressions {
//
//    public interface Movable {
//        void move(String s);
//    }
//
//    public static void callMove(Movable m) {
//        m.move("I am move!");
//    }
//
//
//    public static void main(String[] args) {
//        callMove(s -> System.out.println(s));
//    }
//
//}



















//public class LambdaExpressions {
//
//    public interface Movable {
//        void move(String s);
//    }
//
//    public static void callMove(Movable m) {
//        m.move("I am move!");
//    }
//
//
//    public static void main(String[] args) {
//        callMove(System.out::println);
//    }
//
//}







































//import java.util.HashMap;
//import java.util.Map;
//
//public class LambdaExpressions {
//
//    interface Command {
//        void doAction(String s);
//    }
//
//    public static void main(String[] args) {
//        Map<Integer, Command> commands = new HashMap<>();
//        Command saveToFile = (s) -> {
//            System.out.println("Create new file: " + s);
//            System.out.println("Open file");
//            System.out.println("Safe to file");
//            System.out.println("Close file");
//        };
//
//        Command readFromFile = (s) -> {
//            System.out.println("Open file: " + s);
//            System.out.println("Read from file");
//            System.out.println("Close file");
//        };
//        commands.put(1, saveToFile);
//        commands.put(2, readFromFile);
//
//
//        performAction(commands, 1, "test");
//        System.out.println();
//        performAction(commands, 1, "test1");
//        System.out.println();
//        performAction(commands, 2, "test3");
//    }
//
//    public static void performAction(Map<Integer, Command> actions, int id, String fileName) {
//        actions.get(id).doAction(fileName);
//    }
//
//}
