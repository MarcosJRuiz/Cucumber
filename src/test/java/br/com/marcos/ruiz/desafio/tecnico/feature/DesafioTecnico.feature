# language: pt
# Autor: Marcos Ruiz
# Data: 26/10/2021

# DESAFIO TÉCNICO – TESTE SELENIUM
# Ø Criar um projeto em selenium webdrive(java) e cucumber usando Page objects (precisamos executar o script através da feature);
# Ø Passo a passo para o teste automático (colocar algum verificador do objeto antes de fazer as ações):
#
# Ø Disponibilizar o projeto no repositório GIT e enviar o caminho para thiago.o.massaneiro@accenture.com
# Obs: Minha necessidade é importar no Eclipse e colocar para rodar. Obs: Todo o código será analis



Funcionalidade: Desafio tecnico em java com cucumber e selenium web driver
  Como usuário desejo realizar as etapas abaixo:

  1- Entrar no site http://sampleapp.tricentis.com/101/app.php

  2- Preencher o formulário, aba “Enter Vehicle Data” e pressione next

  3- Preencher o formulário, aba “Enter Insurant Data” e pressione next

  4- Preencher o formulário, aba “Enter Product Data” e pressione next

  5- Preencher o formulário, aba “Select Price Option” e pressione next

  6- Preencher o formulário, aba “Send Quote” e pressione Send

  7- Verificar a mensagem “Sending e-mail success!” na tela

  @Desafio
  Cenario: cenario com estrutura Page objects
    Quando Entrar no site "http://sampleapp.tricentis.com/101/app.php"
    E Preencher o formulario, aba "Enter Vehicle Data" e pressione next
    E Preencher o formulario, aba "Enter Insurant Data" e pressione next
    E Preencher o formulario, aba "Enter Product Data" e pressione next
    E Preencher o formulario, aba "Select Price Option" e pressione next
    E Preencher o formulario, aba "Send Quote" e pressione Send
    Entao Verificar a mensagem "Sending e-mail success!" na tela
