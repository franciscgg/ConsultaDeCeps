## 📝 Sobre

## 🖥️ ConsultaDeCeps

Este programa Java permite aos usuários consultar o endereço correspondente a um CEP (Código de Endereçamento Postal) fornecido, utilizando um serviço web e salvando a resposta em um arquivo JSON.

- **Funcionalidade:** Solicita ao usuário um CEP no formato de 8 dígitos, consulta o endereço correspondente utilizando a API ViaCEP e salva o resultado em um arquivo JSON.
- **Recursos Utilizados:** Utiliza `JOptionPane` para entrada do usuário e exibição de mensagens, `HttpClient` para fazer a requisição HTTP à API ViaCEP e `Gson` para processar a resposta JSON.
- **Como Usar:** Execute o programa e insira um CEP quando solicitado.

---

## 🔍 ConsultaDeCeps

### Classe Principal: `ConsultaDeCeps`

Esta classe lida com a interface gráfica e a lógica da consulta.

#### Descrição:
- **JOptionPane:** Utilizado para criar a interface gráfica que solicita ao usuário que insira um CEP.
- **JTextField e JPanel:** Utilizados para criar o campo de entrada de texto onde o usuário digita o CEP.
- **HttpClient e HttpRequest:** Utilizados para fazer uma requisição HTTP ao serviço ViaCEP.
- **Gson:** Utilizado para converter a resposta JSON da API ViaCEP em um objeto Java (`Endereco`).

### Classe `Endereco`

Esta classe representa o endereço retornado pela consulta.

#### Atributos:
- **cep:** O CEP consultado.
- **logradouro:** O logradouro (rua/avenida) correspondente ao CEP.
- **complemento:** Qualquer informação adicional sobre o endereço.
- **bairro:** O bairro correspondente ao CEP.
- **localidade:** A cidade correspondente ao CEP.
- **uf:** A unidade federativa (estado) correspondente ao CEP.

#### Métodos:
- **getters:** Métodos para acessar os atributos do endereço.
- **toString:** Método que retorna uma string formatada com os dados do endereço.

### Classe `GeradorDeArquivo`

Esta classe lida com a geração do arquivo JSON para salvar o endereço.

#### Descrição:
- **Gson:** Utilizado para converter o objeto `Endereco` em JSON.
- **FileWriter:** Utilizado para escrever o JSON em um arquivo, cujo nome é baseado no CEP.

---

## 📸 Captura de Tela

### ConsultaDeCeps 🖥️

![image](https://github.com/franciscgg/ConsultaDeCeps/assets/113110382/cb286a41-47ef-4e3a-a169-d8bdbf8c535f)
![image](https://github.com/franciscgg/ConsultaDeCeps/assets/113110382/fa87ef1a-efd6-48d2-8d6c-9dfc5508a3ef)
![image](https://github.com/franciscgg/ConsultaDeCeps/assets/113110382/992192d2-e8cb-43b5-808e-8f9859a93976)
![image](https://github.com/franciscgg/ConsultaDeCeps/assets/113110382/81bcc86b-bfb3-4266-bdb8-e6196237f332)





---

### 🚀 Tecnologias

<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" title="Java" width="40" height="40"/>
</div>

---

## 💼 Linkedin

### link: [Francisco Hélio](https://www.linkedin.com/in/francisco-helio/)
