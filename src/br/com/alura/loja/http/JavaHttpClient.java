package br.com.alura.loja.http;

import br.com.alura.loja.DomainException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            var urlDaApi = new URL(url);
            var connection = urlDaApi.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP", e);
        }
    }
}
