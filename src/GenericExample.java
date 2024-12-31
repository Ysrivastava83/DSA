public class GenericExample<T> {
    T value;

    GenericExample(T value) {
        this.value = value;
    }

    public void display()
        {
            System.out.println(this.value);
        }
}
class Main
{
    public static void main(String[] args) {
        GenericExample<Integer> generic1 = new GenericExample<>(5);
        generic1.display();
        GenericExample<String> generic2 = new GenericExample<>("Hello");
        generic2.display();
    }
}
