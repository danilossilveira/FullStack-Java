package br.com.deezer.daniloAPI.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
