package model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Tradutor {
    private Properties traducoes;

    public Tradutor() {
        traducoes = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("traducoes.properties")) {
            traducoes.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String traduzir(String palavra) {
        String traducao = traducoes.getProperty(palavra);
       
        return traducao != null ? traducao : palavra;
    }
}
