@FunctionalInterface
interface MyFunction {
    void myMethod(); //public abstract void myMethod();
}

public class Exercise {

    public static void main(String args[]) {
        MyFunction f = () -> {
        };    //MyFunction f = (MyFunction)(() -> {});
        Object obj = (MyFunction) (() -> {
        });
        String str = ((Object) (MyFunction) (() -> {
        })).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction) (() -> {
        }));
        System.out.println(((Object) (MyFunction) (() -> {
        })).toString());
    }
}
