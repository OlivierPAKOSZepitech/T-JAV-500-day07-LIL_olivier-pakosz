public class Solo<T> {
    private T value;

    public Solo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

public static void main(String[] args) {
        // Créer une instance de Solo pour String
        Solo<String> strSolo = new Solo<>("toto");
        String strValue = strSolo.getValue();
        System.out.println("String Value: " + strValue);

        // Modifier la valeur dans l'instance Solo<String>
        strSolo.setValue("tata");
        String updatedStrValue = strSolo.getValue();
        System.out.println("Updated String Value: " + updatedStrValue);

        // Créer une instance de Solo pour Integer
        Solo<Integer> intSolo = new Solo<>(Integer.valueOf(42));
        Integer intValue = intSolo.getValue();
        System.out.println("Integer Value: " + intValue);

        // Modifier la valeur dans l'instance Solo<Integer>
        intSolo.setValue(Integer.valueOf(1337));
        Integer updatedIntValue = intSolo.getValue();
        System.out.println("Updated Integer Value: " + updatedIntValue);
    }
}
