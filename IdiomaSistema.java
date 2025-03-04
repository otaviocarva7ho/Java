import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault(); // Obtém as configurações regionais do sistema
        String idioma = locale.getLanguage(); // Obtém o código do idioma (exemplo: "pt" para português)
        String pais = locale.getCountry(); // Obtém o código do país (exemplo: "BR" para Brasil)

        System.out.println("Idioma do sistema: " + idioma);
        System.out.println("País do Sistema: " + pais);
        System.out.println("Idioma completo: " + locale.getDisplayLanguage());
        System.out.println("País completo: " + locale.getDisplayCountry());
    }
}
