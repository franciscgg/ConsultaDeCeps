import com.google.gson.Gson;
import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeCeps {

    public static void main(String[] args) {
        JOptionPane.showOptionDialog(null, "Para acessar o Webservice, um CEP no formato de 8 dígitos deve ser fornecido, exemplo: \"01001000\".", "Consulta de CEPs", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Continuar"}, "Continuar");

        JTextField textField = new JTextField(10);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite um CEP válido para consulta:"));
        panel.add(textField);

        Object[] options = {"Consultar", "Cancelar"};
        JOptionPane optionPane = new JOptionPane(panel, JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION, null, options, options[0]);
        JDialog dialog = optionPane.createDialog("Consulta de CEPs");
        dialog.setVisible(true);

        Object selectedValue = optionPane.getValue();
        if (selectedValue != null && selectedValue.equals(options[0])) {
            String cep = textField.getText();
            try {
                Endereco endereco = consultaCep(cep);
                if (endereco != null) {
                    JOptionPane.showMessageDialog(null, "Endereço encontrado: " + endereco);
                    GeradorDeArquivo gerador = new GeradorDeArquivo();
                    gerador.salvaJson(endereco);
                } else {
                    JOptionPane.showMessageDialog(null, "CEP inválido ou não encontrado.");
                }
            } catch (IOException | InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar o CEP: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado.");
        }
    }

    private static Endereco consultaCep(String cep) throws IOException, InterruptedException {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return new Gson().fromJson(response.body(), Endereco.class);
        } else {
            throw new RuntimeException("Falha na consulta do CEP: " + response.statusCode());
        }
    }
}
