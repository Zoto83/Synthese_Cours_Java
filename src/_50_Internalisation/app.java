package _50_Internalisation;

import java.util.Locale;
import java.util.ResourceBundle;

public class app {
    public static void main(String[] args) {
        ResourceBundle i18nAchat = ResourceBundle.getBundle("_50_Internalisation.i18n.achat", Locale.US);
        ResourceBundle i18nIndex = ResourceBundle.getBundle("_50_Internalisation.i18n.index", Locale.CANADA_FRENCH);
        System.out.println(i18nIndex.getString("bonjour"));
        System.out.println(i18nAchat.getString("acheter"));
    }
}
